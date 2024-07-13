package org.example.sem6.hw;

import java.util.Objects;

/**
 *  Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
 */
public class Laptop {
    int id;
    String brand;
    String color;
    int year;
    int price;
    int ramSize;
    int ssdSize;
    String displaySize;

    @Override
    public String toString() {
        return String.format("%s\"Laptop %s %d %s. RAM: %d, SSD: %d. Price: %d ", displaySize, brand, year, color, ramSize, ssdSize, price);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return id == laptop.id && price == laptop.price && ramSize == laptop.ramSize && ssdSize == laptop.ssdSize && Objects.equals(displaySize, laptop.displaySize) && Objects.equals(brand, laptop.brand) && Objects.equals(color, laptop.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, brand, color, price, ramSize, ssdSize, displaySize);
    }
}
