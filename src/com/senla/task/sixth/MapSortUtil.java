package com.senla.task.sixth;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSortUtil {

    public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
        return map
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.<K, V>comparingByValue()))
                .collect(Collectors.toMap(Map.Entry<K, V>::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
    }

}

