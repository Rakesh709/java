package org.rakesh;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {

    private String brand;
    private String name;
    private int ram;

    @Override
    public String toString() {
        return "Laptop{" +
                "brand='" + brand + '\'' +
                ", name='" + name + '\'' +
                ", ram=" + ram +
                '}';
    }




    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }


}
