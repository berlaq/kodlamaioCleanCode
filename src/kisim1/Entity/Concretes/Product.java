package kisim1.Entity.Concretes;

import kisim1.Entity.Abstracts.Entity;

public class Product implements Entity {

    private String name;

    public Product(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
