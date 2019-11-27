package com.joker.oa.entity;

import java.util.Date;

public class DealRecord {
    private int id;
    private int claimVoucherId;
    private String dealSn;
    private Date dealTime;
    private String dealWay;
    private String dealResult;
    private String comment;

    public DealRecord() {
    }

    public DealRecord(int id, int claimVoucherId, String dealSn, Date dealTime, String dealWay, String dealResult, String comment) {
        this.id = id;
        this.claimVoucherId = claimVoucherId;
        this.dealSn = dealSn;
        this.dealTime = dealTime;
        this.dealWay = dealWay;
        this.dealResult = dealResult;
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClaimVoucherId() {
        return claimVoucherId;
    }

    public void setClaimVoucherId(int claimVoucherId) {
        this.claimVoucherId = claimVoucherId;
    }

    public String getDealSn() {
        return dealSn;
    }

    public void setDealSn(String dealSn) {
        this.dealSn = dealSn;
    }

    public Date getDealTime() {
        return dealTime;
    }

    public void setDealTime(Date dealTime) {
        this.dealTime = dealTime;
    }

    public String getDealWay() {
        return dealWay;
    }

    public void setDealWay(String dealWay) {
        this.dealWay = dealWay;
    }

    public String getDealResult() {
        return dealResult;
    }

    public void setDealResult(String dealResult) {
        this.dealResult = dealResult;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "DealRecord{" +
                "id=" + id +
                ", claimVoucherId=" + claimVoucherId +
                ", dealSn='" + dealSn + '\'' +
                ", dealTime=" + dealTime +
                ", dealWay='" + dealWay + '\'' +
                ", dealResult='" + dealResult + '\'' +
                ", comment='" + comment + '\'' +
                '}';
    }
}
