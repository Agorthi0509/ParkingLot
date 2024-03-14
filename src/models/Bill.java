package models;

import strategies.BillingStrategy;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class Bill extends BaseModel{
    private LocalDateTime exitTime;
    private Ticket ticket;
    private Float billAmount;
    private List<Payment> payments;
    private Gate exitgGate;
    private Operator operator;
    private BillingStatus billingStatus;
    private BillingStrategy billingStrategy;

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Float getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Float billAmount) {
        this.billAmount = billAmount;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }

    public Gate getExitgGate() {
        return exitgGate;
    }

    public void setExitgGate(Gate exitgGate) {
        this.exitgGate = exitgGate;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public BillingStatus getBillingStatus() {
        return billingStatus;
    }

    public void setBillingStatus(BillingStatus billingStatus) {
        this.billingStatus = billingStatus;
    }

    public BillingStrategy getBillingStrategy() {
        return billingStrategy;
    }

    public void setBillingStrategy(BillingStrategy billingStrategy) {
        this.billingStrategy = billingStrategy;
    }
}
