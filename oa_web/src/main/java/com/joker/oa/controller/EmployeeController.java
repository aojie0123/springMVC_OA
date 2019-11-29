package com.joker.oa.controller;

import com.joker.oa.biz.DepartmentBiz;
import com.joker.oa.biz.EmployeeBiz;
import com.joker.oa.entity.Employee;
import com.joker.oa.global.Contant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller("employeeController")
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private EmployeeBiz employeeBiz;
    @Autowired
    private DepartmentBiz departmentBiz;

    @RequestMapping("/list")
    public String list(Map<String, Object> map) {
        map.put("elist", employeeBiz.getAll());
        return "employee_list";
    }

    @RequestMapping("/remove")
    public String remove(String sn) {
        employeeBiz.remove(sn);
        return "redirect:list";
    }

    @RequestMapping("/to_add")
    public String toAdd(Map<String, Object> map) {
        map.put("employee", new Employee());
        map.put("dList", departmentBiz.getAll());
        map.put("pList", Contant.getPost());
        return "employee_add";
    }

    @RequestMapping("/add")
    public String add(Employee employee) {
        employeeBiz.add(employee);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update", params = "sn")
    public String toUpdate(Map<String, Object> map, String sn) {
        map.put("employee", employeeBiz.get(sn));
        map.put("dList", departmentBiz.getAll());
        map.put("pList", Contant.getPost());
        return "employee_update";
    }

    @RequestMapping("/update")
    public String update(Employee employee) {
        employeeBiz.update(employee);
        return "redirect:list";
    }
}
