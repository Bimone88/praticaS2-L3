package entitites;

public class Customer {
    private Long id;
    private String name;
    private Integer tier;

    public Customer(Long id, String name, Integer tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public Integer getTier() { return tier; }

    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setTier(Integer tier) { this.tier = tier; }

    // toString, equals, hashCode
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
}
