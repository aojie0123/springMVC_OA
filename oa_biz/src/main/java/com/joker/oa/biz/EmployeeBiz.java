package com.joker.oa.biz;

import com.joker.oa.entity.Employee;

import java.util.List;

public interface EmployeeBiz {
    void add(Employee employee);
    void remove(String sn);
    void update(Employee employee);
    Employee get(String sn);
    List<Employee> getAll();
}
