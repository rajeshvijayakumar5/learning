package com.rk.functional.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {
        // 1. creating streams from collections
        List<String> alphabets = new ArrayList<>();
        alphabets.add("a");
        alphabets.add("b");
        alphabets.add("c");
        alphabets.add("d");
        alphabets.stream().forEach(System.out::println);

        // 2. creating Streams using Arrays static method
        Arrays.stream(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}).forEach(System.out::println);

        // 3. creating Streams using static method
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).forEach(System.out::println);

        // 4. building stream using Stream.Builder
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(1);
        streamBuilder.add(2);
        streamBuilder.add(3);
        streamBuilder.add(4);
        Stream<Integer> streamBuilt = streamBuilder.build();
        streamBuilt.forEach(System.out::println);

        // 5. using iterate and limit method
        Stream.iterate(0, i -> i + 1).limit(100).forEach(System.out::println);
    }
}
