package com.joker.oa.controller;

import com.joker.oa.biz.DepartmentBiz;
import com.joker.oa.entity.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller("departmentController")
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentBiz departmentBiz;

    @RequestMapping("/list")
    public String list(Map<String, Object> map) {
        List<Department> list = departmentBiz.getAll();
        map.put("list", list);
        return "department_list";
    }

    @RequestMapping("/to_add")
    public String toAdd(Map<String, Object> map) {
        map.put("department", new Department());
        return "department_add";
    }

    @RequestMapping("/add")
    public String add(Department department) {
        departmentBiz.add(department);
        return "redirect:list";
    }

    @RequestMapping(value = "/to_update", params = "sn")
    public String toUpdate(Map<String, Object> map, String sn) {
        map.put("department", departmentBiz.get(sn));
        return "department_update";
    }

    @RequestMapping("/update")
    public String update(Department department) {
        departmentBiz.update(department);
        return "redirect:list";
    }

    @RequestMapping("/remove")
    public String delete(String sn) {
        departmentBiz.remove(sn);
        return "redirect:list";
    }

    @RequestMapping("/batchRemove")
    @ResponseBody
    public String batchDelete(@RequestBody String sn) {
        System.out.println(sn);
        return "fail";
    }
}
