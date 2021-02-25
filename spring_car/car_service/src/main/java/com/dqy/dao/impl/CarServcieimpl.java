package com.dqy.dao.impl;

import com.dqy.dao.CarService;
import com.dqy.dao.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Deacription TODO
 * @Author 慕斯
 * @Date 2021/1/18 19:49
 * @Version 1.0
 **/
@Service
public class CarServcieimpl implements CarService {

    @Autowired
    private UsersRepository usersRepository;
}
