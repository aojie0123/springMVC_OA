package com.joker.oa.biz;

import com.joker.oa.entity.Employee;

public interface GlobalBiz {
    Employee login(String sn, String password);
    void changePassword(Employee employee);
}
