package com.joker.oa.dao;

import com.joker.oa.entity.Employee;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("employeeDao")
public interface EmployeeDao {
    void insert(Employee employee);
    void delete(String sn);
    void update(Employee employee);
    Employee select(String sn);
    List<Employee> selectAll();
}