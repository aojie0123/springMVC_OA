package com.joker.oa.biz;

import com.joker.oa.entity.Department;

import java.util.List;

public interface DepartmentBiz {
    void add(Department department);
    void remove(String sn);
    void update(Department department);
    Department get(String sn);
    List<Department> getAll();
}
