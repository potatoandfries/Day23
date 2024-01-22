package Day23.Day23workshop.model;

import java.util.Date;

public class Order {
    
    private Integer order_id;
    private Date order_date;
    private int customer_Id;
    private float orderTotal;
    private float orderCost;


    @Override
    public String toString() {
        return "Order [order_id=" + order_id + ", order_date=" + order_date + ", customer_Id=" + customer_Id
                + ", orderTotal=" + orderTotal + ", orderCost=" + orderCost + "]";
    }
    public Order() {
    }
    public Integer getOrder_id() {
        return order_id;
    }
    public void setOrder_id(Integer order_id) {
        this.order_id = order_id;
    }
    public Date getOrder_date() {
        return order_date;
    }
    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }
    public int getCustomer_Id() {
        return customer_Id;
    }
    public void setCustomer_Id(Integer customer_Id) {
        this.customer_Id = customer_Id;
    }
    public float getOrderTotal() {
        return orderTotal;
    }
    public void setOrderTotal(float orderTotal) {
        this.orderTotal = orderTotal;
    }
    public float getOrderCost() {
        return orderCost;
    }
    public void setOrderCost(float orderCost) {
        this.orderCost = orderCost;
    }
}