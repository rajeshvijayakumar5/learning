package com.rk.functional.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOperations {
    public static void main(String[] args) {
        // Creating immutable fixed size list
        List<Integer> immutableList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // immutableList.add(100); // UnsupportedOperationException
        // immutableList.set(1,2); // UnsupportedOperationException

        // Creating mutable fixed size list
        List<Integer> mutableList1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        // mutableList.add(100);  // throws UnsupportedOperationException
        mutableList1.set(0, 100); // works

        // Creating mutable variable size list
        List<Integer> mutableList2 = new ArrayList<>(immutableList);
        mutableList2.addAll(immutableList); // works
        mutableList2.set(0, 100); // works
        mutableList1.forEach(System.out::println);
        mutableList2.forEach(System.out::println);
    }
}
