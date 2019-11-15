package com.senla.task.sixth;

import java.util.ArrayList;
import java.util.List;

public class SixthMain {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<Item>();
        BackpackCollector backpackCollector = new BackpackCollector();

        items.add(new Item("Тетрадь", 1, 600));
        items.add(new Item("Тарелка", 2, 5000));
        items.add(new Item("Фонарик", 4, 1500));
        items.add(new Item("Ноутбук", 2, 40000));
        items.add(new Item("Кружка", 1, 500));

        Backpack bestBackpack = backpackCollector.getBestSet(items);
        bestBackpack.getItems().forEach(System.out::println);

    }

}
