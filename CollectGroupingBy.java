package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;  // Import Collectors class

public class CollectGroupingBy {
    public static void main(String[] args) {
        Student arr[] = new Student[]{new Student(110,"abc",70),new Student(101,"bcd",80),new Student(120,"xyz",60)};
        Map<Integer,List<Student>> m = Arrays.stream(arr).collect(Collectors.groupingBy(Student::getMarks));
        System.out.println(m);
    }
}
