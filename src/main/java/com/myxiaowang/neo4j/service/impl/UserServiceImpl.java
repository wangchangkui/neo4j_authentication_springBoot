package com.myxiaowang.neo4j.service.impl;

import com.myxiaowang.neo4j.entity.User;
import com.myxiaowang.neo4j.entity.requset.RequestDto;
import com.myxiaowang.neo4j.rep.UserRep;
import com.myxiaowang.neo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author wck
 * @version 1.0.0
 * @Description
 * @createTime 2022年07月12日 11:38:00
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRep rep;


    @Override
    public Page<User> userByPage(RequestDto requestDto) {
        return  rep.findAll(PageRequest.of(requestDto.page,requestDto.getSize()));
    }




    @Override
    public List<User> deleteBatchUsers() {
        List<User> users = listUser();
        try{
            rep.deleteAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return users;
    }

    /**
     * 事务会与其他数据的事务发生冲突
     * 需要自己自己去配置单独的事务管理器
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public User updateUser(User user) {
        // todo 似乎spring封装的crud功能没有支持修改？
        rep.deleteById(user.getId());
        // 亲测支持事务
        // System.out.println(10/0);
        return rep.save(user);
    }

    @Override
    public User deleteUserById(String id) {
        Optional<User> user = rep.findById(id);
        rep.deleteById(id);
        return user.orElse(null);
    }

    @Override
    public User findUserById(String id) {
        Optional<User> user = rep.findById(id);
        return user.orElse(null);
    }

    @Override
    public User insertUser(User user) {
        return rep.save(user);
    }

    @Override
    public List<User> listUser() {
        return rep.findAll();
    }
}
