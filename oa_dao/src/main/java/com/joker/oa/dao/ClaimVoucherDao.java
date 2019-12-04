package com.joker.oa.dao;

import com.joker.oa.entity.ClaimVoucher;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("claimVoucherDao")
public interface ClaimVoucherDao {
    void insert(ClaimVoucher claimVoucher);
    void update(ClaimVoucher claimVoucher);
    void delete(int id);
    ClaimVoucher select(int id);
    //  查询创建人
    List<ClaimVoucher> selectByCreateSn(String csn);
    //  查询待处理人
    List<ClaimVoucher> selectByNextDealSn(String ndsn);
}
