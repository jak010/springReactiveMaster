package com.example.demo.reactive;

import org.springframework.data.annotation.Id;

import java.util.Objects;


public class Item {
    /* 판매상품 데이터 */


    public @Id String id; /* public 처리 안해주면 thymeleaf 에서 표출 안됨 */
    private String name;
    private double price;

    private Item() {
    }

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return Double.compare(item.price, price) == 0 && Objects.equals(id, item.id) && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, price);
    }

    @Override
    public String toString() {
        return "Item{" + " id=" + id + "," + " name='" + name + "\'" + ", price=" + price + "}";
    }
}

