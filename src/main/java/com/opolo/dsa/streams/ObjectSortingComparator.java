package com.opolo.dsa.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
//import java.util.stream.Collectors;

class Product {

    String name;
    Integer price;

    public Product(String name, Integer price) {
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
        return "Product [name=" + name + ", price=" + price + "]";
    }

}

public class ObjectSortingComparator {

    public static void main(String[] args) {

        List<Product> plist = new ArrayList<>();
        plist.add(new Product("Adam", 10));
        plist.add(new Product("Byran", 20));
        plist.add(new Product("Dag", 35));
        plist.add(new Product("Eli", 20));
        plist.add(new Product("Camy", 40));

        // plist.stream().sorted((p1, p2) ->
        // p1.getPrice().compareTo(p2.getPrice())).forEach(System.out::println);

        // List<Product> flist = plist.stream().filter(p -> p.price >
        // 20).collect(Collectors.toList());
        // flist.stream().forEach(System.out::println);

        /* Using comparator in streams */

        System.out.println("----Sorted by name----");
        plist.sort(Comparator.comparing(p -> p.getName()));
        System.out.println(plist);

        System.out.println("----Sorted by name in reverse order----");
        Comparator<Product> comparator = Comparator.comparing(p -> p.getName());
        plist.sort(comparator.reversed());
        System.out.println(plist);

    }

}
