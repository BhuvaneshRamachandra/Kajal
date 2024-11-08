package com.ingenity.topspins;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class Errors {

    private Errors() {}


    public static List<String> getCommandErrors(List<Integer> errors, Map<Integer, String> CHECK) {
        return CHECK.entrySet().stream()
                .filter(entry -> errors.contains(entry.getKey())).map(Entry::getValue).toList();
    }

}

