package models;

import java.util.Date;

public class Payment {
    private int id;
    private int amount;
    private Date time;// Date and Time of Payment
    private PaymentStatus status;// Status of Payment whether it is successful or not
    private PaymentMode paymentMode;// Mode of Payment whether it is by card, cash, etc.
    private String RefNumber;// Reference Number of the Payment



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
