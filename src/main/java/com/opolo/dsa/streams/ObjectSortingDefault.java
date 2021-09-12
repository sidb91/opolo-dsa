package com.opolo.dsa.streams;

import java.util.ArrayList;
import java.util.List;
//import java.util.stream.Collectors;

class Product1 {

    String name;
    Integer price;

    public Product1(String name, Integer price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product1 [name=" + name + ", price=" + price + "]";
    }

}

public class ObjectSortingDefault {

    public static void main(String[] args) {

        List<Product1> plist = new ArrayList<>();
        plist.add(new Product1("Adam", 10));
        plist.add(new Product1("Byran", 20));
        plist.add(new Product1("Camy", 40));
        plist.add(new Product1("Dag", 35));
        plist.add(new Product1("Eli", 20));

        plist.stream().sorted((p1, p2) -> p1.getPrice().compareTo(p2.getPrice())).forEach(System.out::println);

        /*
         * List<Product1> flist = plist.stream() .filter(p -> p.price > 20)
         * .collect(Collectors.toList());
         * 
         * flist.stream().forEach(System.out::println);
         */

    }

}
