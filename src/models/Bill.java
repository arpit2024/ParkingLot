package models;

import java.util.Date;
import java.util.List;

public class Bill extends  BaseModel{

    private Date exitDate;

    private int amount;
    private Gate gate;//this is the gate from which the user is exiting/entering
    private Operator operator;//this is the operator who is managing the gate
    private Ticket ticket;
    private List<Payment> payments;//here instead of using single payment we can use list of payments



    public Date getExitDate() {
        return exitDate;
    }

    public void setExitDate(Date exitDate) {
        this.exitDate = exitDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
    // so that we can keep track of all the payments done by the user such as partial payments, advance payments etc.
}
