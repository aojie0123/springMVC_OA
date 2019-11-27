package com.joker.oa.entity;

import java.util.Date;

public class ClaimVoucher {
    private int id;
    private String cause;
    private String createSn;
    private Date createTime;
    private String nextDealSn;
    private double totalAmount;
    private String status;

    public ClaimVoucher() {
    }

    public ClaimVoucher(int id, String cause, String createSn, Date createTime, String nextDealSn, double totalAmount, String status) {
        this.id = id;
        this.cause = cause;
        this.createSn = createSn;
        this.createTime = createTime;
        this.nextDealSn = nextDealSn;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCause() {
        return cause;
    }

    public void setCause(String cause) {
        this.cause = cause;
    }

    public String getCreateSn() {
        return createSn;
    }

    public void setCreateSn(String createSn) {
        this.createSn = createSn;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNextDealSn() {
        return nextDealSn;
    }

    public void setNextDealSn(String nextDealSn) {
        this.nextDealSn = nextDealSn;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ClaimVoucher{" +
                "id=" + id +
                ", cause='" + cause + '\'' +
                ", createSn='" + createSn + '\'' +
                ", createTime=" + createTime +
                ", nextDealSn='" + nextDealSn + '\'' +
                ", totalAmount=" + totalAmount +
                ", status='" + status + '\'' +
                '}';
    }
}
