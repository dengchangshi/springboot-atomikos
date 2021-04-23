package com.gitee.taven.service;

import com.gitee.taven.entity.business.UserInformations;
import com.gitee.taven.entity.system.Users;
import com.gitee.taven.mapper.business.UserInformationsMapper;
import com.gitee.taven.mapper.system.UsersMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * ClassName: 类名
 * Description: 描述信息
 *
 * @Author: dengchangshi
 * @Date: 2021/4/23 11:55
 */
@Service
public class TestService {

    @Resource
    private UsersMapper usersMapper;

    @Resource
    private UserInformationsMapper userInformationsMapper;


    @Transactional
    public void testJTA(){
        saveUserInfo();
        saveUsers();
        //throw new RuntimeException("故意抛出异常，检查事务是否回滚");
    }

    private void saveUserInfo() {

        UserInformations ui = new UserInformations();
        ui.setUserid(666l);
        ui.setEmail("dsb");
        userInformationsMapper.insertSelective(ui);

    }

    private void saveUsers() {
        Users u = new Users();
        u.setUsername("hmj");
        u.setPassword("hmjbest");
        usersMapper.insertSelective(u);
    }
}
