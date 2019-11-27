package com.joker.oa.controller;

import com.joker.oa.biz.DepartmentBiz;
import com.joker.oa.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller("departmentController")
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentBiz departmentBiz;

    @RequestMapping("/list")
    public String list(Map<String, Object> map) {
        map.put("list", departmentBiz.getAll());
        return "department_list";
    }
}
