package com.senla.task.sixth;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private List<Item> bestItems = null;
    private final double maxW = 8;
    private double bestPrice;


    private double calculateWeight(List<Item> items)
    {
        double sumW = 0;
        for (int i=0; i<items.size();i++)
            sumW += items.get(i).getWeight();
        return sumW;
    }

    private double calcPrice(List<Item> items)
    {
        double sumPrice = 0;

        for (Item i : items)
        {
            sumPrice += i.getPrice();
        }

        return sumPrice;
    }
    private void checkSet(List<Item> items)
    {
        if (bestItems == null)
        {
            if (calculateWeight(items) <= maxW)
            {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        }
        else
        {
            if(calculateWeight(items) <= maxW && calcPrice(items) > bestPrice)
            {
                bestItems = items;
                bestPrice = calcPrice(items);
            }
        }
    }

    public void makeAllSets(List<Item> items)
    {
        if (items.size() > 0)
            checkSet(items);

        for (int i = 0; i < items.size(); i++)
        {
            List<Item> newSet = new ArrayList<>(items);

            newSet.remove(i);
            makeAllSets(newSet);
        }


    }

    public List<Item> getBestSet()
    {
        return bestItems;
    }


}
