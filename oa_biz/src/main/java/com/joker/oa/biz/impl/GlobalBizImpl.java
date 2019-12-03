package com.joker.oa.biz.impl;

import com.joker.oa.biz.GlobalBiz;
import com.joker.oa.dao.EmployeeDao;
import com.joker.oa.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("globalBiz")
public class GlobalBizImpl implements GlobalBiz {

    @Autowired
    private EmployeeDao employeeDao;

    @Override
    public Employee login(String sn, String password) {
        Employee employee = employeeDao.select(sn);
        if (employee.getPassword().equals(password) && employee != null) {
            return employee;
        }
        return null;
    }

    @Override
    public void changePassword(Employee employee) {
        employeeDao.update(employee);
    }
}
