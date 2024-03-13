package entitites;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private Long id;
    private String status;
    private LocalDate orderDate;
    private List<Product> products;
    private Customer customer;

    public Order(Long id, String status, LocalDate orderDate, List<Product> products, Customer customer) {
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.products = products;
        this.customer = customer;
    }

    // Getters
    public Long getId() { return id; }
    public String getStatus() { return status; }
    public LocalDate getOrderDate() { return orderDate; }
    public List<Product> getProducts() { return products; }
    public Customer getCustomer() { return customer; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setStatus(String status) { this.status = status; }
    public void setOrderDate(LocalDate orderDate) { this.orderDate = orderDate; }
    public void setProducts(List<Product> products) { this.products = products; }
    public void setCustomer(Customer customer) { this.customer = customer; }

    // toString, equals, hashCode
    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", orderDate=" + orderDate +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }
}
