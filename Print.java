package Streams;

import java.util.stream.Stream;

public class Print {
    public static void main(String[] args) {
        Stream.iterate(1,x->x+1).filter(x->x.toString().contains("5")).limit(10).forEach(System.out::println);
    }
}
