package com.joker.oa.controller;

import com.joker.oa.biz.ClaimVoucherBiz;
import com.joker.oa.dto.ClaimVoucherInfo;
import com.joker.oa.entity.Employee;
import com.joker.oa.global.Contant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller("claimVoucherController")
@RequestMapping("claim_voucher")
public class ClaimVoucherController {

    @Autowired
    private ClaimVoucherBiz claimVoucherBiz;
    @RequestMapping("/to_add")
    public String toAdd(Map<String, Object> map) {
        map.put("items", Contant.getItems());
        map.put("info", new ClaimVoucherInfo());
        return "claim_voucher_add";
    }
    @RequestMapping("/add")
    public String add(HttpSession session, ClaimVoucherInfo claimVoucherInfo) {
        Employee employee = (Employee) session.getAttribute("employee");
        claimVoucherInfo.getClaimVoucher().setCreateSn(employee.getSn());
        claimVoucherBiz.save(claimVoucherInfo.getClaimVoucher(), claimVoucherInfo.getItems());
        return "redirect:detail?id=" + claimVoucherInfo.getClaimVoucher().getId();
    }
    @RequestMapping("/detail")
    public String detail(Map<String, Object> map, @RequestParam int id) {
        map.put("claimVoucher", claimVoucherBiz.get(id));
        map.put("items", claimVoucherBiz.getItems(id));
        map.put("records", claimVoucherBiz.getRecords(id));
        return "claim_voucher_detail";
    }
}
