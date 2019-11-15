package com.senla.task.sixth;

import java.util.ArrayList;
import java.util.List;

public class SixthMain {

    public static void main(String[] args) {

        List<Item> items = new ArrayList<Item>();
        Backpack backpack = new Backpack();
        items.add(new Item("Тетрадь", 1, 600));
        items.add(new Item("Тарелка", 2, 5000));
        items.add(new Item("Фонарик", 4, 1500));
        items.add(new Item("Ноутбук", 2, 40000));
        items.add(new Item("Кружка", 1, 500));
        backpack.makeAllSets(items);
        List<Item> solve = backpack.getBestSet();
        if(solve == null)
        {
            System.out.println("Нет решения!");
        }
        else
        {
               for(Item item : solve)
               {
                   System.out.println(item.getName());
               }

        }


    }

}
