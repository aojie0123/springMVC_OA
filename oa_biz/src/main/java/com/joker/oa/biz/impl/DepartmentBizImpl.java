package com.joker.oa.biz.impl;

import com.joker.oa.biz.DepartmentBiz;
import com.joker.oa.dao.DepartmentDao;
import com.joker.oa.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("departmentBiz")
public class DepartmentBizImpl implements DepartmentBiz {

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public void add(Department department) {
        departmentDao.insert(department);
    }

    @Override
    public void remove(String sn) {
        departmentDao.delete(sn);
    }

    @Override
    public void update(Department department) {
        departmentDao.update(department);
    }

    @Override
    public Department get(String sn) {
        return departmentDao.select(sn);
    }

    @Override
    public List<Department> getAll() {
        return departmentDao.selectAll();
    }
}
