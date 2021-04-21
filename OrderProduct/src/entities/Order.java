package entities;

import entitites.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;

    List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public String getClient() {
        return client.toString();
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void addItem(OrderItem OrderItem) {
        items.add(OrderItem);
    }

    public void removeItem(OrderItem OrderItem) {
        items.remove(OrderItem);
    }

    public Double total() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " + sdf.format(moment) + "\n");
        sb.append("Order Status: " + getStatus() + "\n");
        sb.append("Client: " + getClient() + "\n\n");
        sb.append("Order items: \n");
        for (OrderItem item : items) {
            sb.append(item + "\n");
        }
        sb.append("\nTotal price: $" + total());
        return sb.toString();
    }

}


