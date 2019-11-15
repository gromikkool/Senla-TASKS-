package com.senla.task.sixth;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class BackpackCollector {

    public Backpack getBestSet(List<Item> items) {
        Backpack backpack = new Backpack();
        Map<Item, Double> sortedCoefficientsMap = getItemsCoefficientsDesc(items);

        for (Item item : sortedCoefficientsMap.keySet()) {
            double availableWeight = Backpack.MAX_WEIGHT - backpack.getWeight();
            if (item.getWeight() <= availableWeight)
                backpack.addItem(item);
        }

        return backpack;
    }


    private Map<Item, Double> getItemsCoefficientsDesc(List<Item> items) {
        Map<Item, Double> coefficientsMap = new HashMap<>();
        for (Item item : items) {
            coefficientsMap.put(item, item.getPrice() / item.getWeight());
        }

        return MapSortUtil.sortByValue(coefficientsMap);
    }


}
