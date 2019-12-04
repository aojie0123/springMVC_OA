package com.joker.oa.biz;

import com.joker.oa.entity.ClaimVoucher;
import com.joker.oa.entity.ClaimVoucherItem;
import com.joker.oa.entity.DealRecord;

import java.util.List;

public interface ClaimVoucherBiz {
    void save(ClaimVoucher claimVoucher, List<ClaimVoucherItem> items);
    ClaimVoucher get(int id);
    List<ClaimVoucherItem> getItems(int cvid);
    List<DealRecord> getRecords(int cvid);
}
