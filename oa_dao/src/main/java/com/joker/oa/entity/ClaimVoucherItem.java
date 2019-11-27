package com.joker.oa.entity;

public class ClaimVoucherItem {
    private int id;
    private int claimVoucherId;
    private String item;
    private double amount;
    private String comment;

    public ClaimVoucherItem() {
    }

    public ClaimVoucherItem(int id, int claimVoucherId, String item, double amount, String comment) {
        this.id = id;
        this.claimVoucherId = claimVoucherId;
        this.item = item;
        this.amount = amount;
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

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public String toString() {
        return "ClaimVoucherItem{" +
                "id=" + id +
                ", claimVoucherId=" + claimVoucherId +
                ", item='" + item + '\'' +
                ", amount=" + amount +
                ", comment='" + comment + '\'' +
                '}';
    }
}
