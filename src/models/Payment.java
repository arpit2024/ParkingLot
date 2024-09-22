package models;

import java.util.Date;

public class Payment {
    private int id;
    private int amount;
    private Date time;
    private PaymentStatus status;
    private PaymentMode paymentMode;
    private String RefNumber;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public String getRefNumber() {
        return RefNumber;
    }

    public void setRefNumber(String refNumber) {
        RefNumber = refNumber;
    }
}
