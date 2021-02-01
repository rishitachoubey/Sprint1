//package com.cg.onlinegrocery.domain;
//
//import java.io.Serializable;
//import javax.persistence.*;
//
///**
// * Hello world!
// *
// */
//@Entity
//@Table(name = "Order_Details")
//public class OrderDetail implements Serializable {
//
//    private static final long serialVersionUID = 7550745928843183535L;
//
//    private String id;
//    private Order order;
//
//    /**
//     * merge them inside product class and use product class object inside the order class
//     * 
//     * inside order we have product and customer
//     * use getter setter to access the data fields
//     * 
//     * make a service for delivery tracking module : use the order dao crud methods and implement
//     * 
//     * for access restriction: 
//     * create admin service module and make data member for product dao and using the object do the crud operation
//     * for implementing restriction , create methods inside class (update , delete), inside make methods only which the user can do
//     * make the product dao as pvt member, so that it cannot be accessed outside the class. 
//     */
//    private Product product;
//    private int quanity;
//    private double price;
//    private double amount;
//
//    @Id
//    @Column(name = "ID", length = 50, nullable = false)
//    public String getId() {
//        return id;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "ORDER_ID", nullable = false, //
//    foreignKey = @ForeignKey(name = "ORDER_DETAIL_ORD_FK") )
//    public Order getOrder() {
//        return order;
//    }
//
//    public void setOrder(Order order) {
//        this.order = order;
//    }
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "PRODUCT_ID", nullable = false, //
//    foreignKey = @ForeignKey(name = "ORDER_DETAIL_PROD_FK") )
//    public Product getProduct() {
//        return product;
//    }
//
//    public void setProduct(Product product) {
//        this.product = product;
//    }
//
//    @Column(name = "Quanity", nullable = false)
//    public int getQuanity() {
//        return quanity;
//    }
//
//    public void setQuanity(int quanity) {
//        this.quanity = quanity;
//    }
//
//    @Column(name = "Price", nullable = false)
//    public double getPrice() {
//        return price;
//    }
//
//    public void setPrice(double price) {
//        this.price = price;
//    }
//
//    @Column(name = "Amount", nullable = false)
//    public double getAmount() {
//        return amount;
//    }
//
//    public void setAmount(double amount) {
//        this.amount = amount;
//    }
//   
//}