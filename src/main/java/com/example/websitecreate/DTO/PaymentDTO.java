package com.example.websitecreate.DTO;

public class PaymentDTO {
    private String email;
    private int amount;
    private String uid;

    public PaymentDTO() {
    }

    public PaymentDTO(String email, int amount, String uid) {
        this.email = email;
        this.amount = amount;
        this.uid = uid;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }
}
