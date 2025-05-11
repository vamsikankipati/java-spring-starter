package com.org.list;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortArray {

    private static final Logger logger = LoggerFactory.getLogger(SortArray.class);

    public List<Integer> sort(List<Integer> numbers) {
        Collections.sort(numbers);
        return numbers;
    }

    public List<Integer> parallelSort(int[] numbers) {
        Arrays.parallelSort(numbers);
        return Arrays.stream(numbers).boxed().toList();
    }

    public List<Integer> streamSort(List<Integer> numbers) {
        return numbers.parallelStream().sorted().toList();
    }

    public List<Integer> parallelStreamSort(List<Integer> numbers) {
        return numbers.parallelStream().sorted().toList();
    }
}
