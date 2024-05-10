package Streams;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        Student arr[] = new Student[]{new Student(110,"abc",70),new Student(101,"bcd",80),new Student(120,"xyz",60)};
        Map<Integer, String> m = Arrays.stream(arr).collect(Collectors.toMap(Student::getRoll,Student::getName));
        System.out.println(m);
    }
}

