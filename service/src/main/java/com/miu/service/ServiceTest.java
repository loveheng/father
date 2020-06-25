package com.miu.service;

import com.miu.dao.DaoTest;

public class ServiceTest {

    public String showService() {

        DaoTest daoTest = new DaoTest();
        return daoTest.showDao()+":我是Service!";
    }
}
