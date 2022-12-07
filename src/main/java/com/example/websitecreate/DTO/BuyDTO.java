package com.example.websitecreate.DTO;

public class BuyDTO {
    private String email;
    private String coinId;
    private String name;
    private int price;
    private int amount;
    private int total;

    public BuyDTO() {
    }

    public BuyDTO(String email, String coinId, String name, int price, int amount, int total) {
        this.email = email;
        this.coinId = coinId;
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.total = total;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCoinId() {
        return coinId;
    }

    public void setCoinId(String coinId) {
        this.coinId = coinId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
