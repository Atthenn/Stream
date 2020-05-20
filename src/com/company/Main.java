package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        // write your code here
        List<String> someBingoNumbers = Arrays.asList(
                "N40", "N36",
                "B12", "B6",
                "G53", "G40", "G60", "G50", "G64", "g56",
                "I26", "I17", "I29"
                , "071");

//        List<String> gNumbers = new ArrayList<>();
//        someBingoNumbers.forEach(number -> {
//            if (number.toUpperCase().startsWith("G")) {
//                gNumbers.add(number.toUpperCase());
//
//            }
//        });

        //Stream Way

        someBingoNumbers
                .stream()
                .map(String::toUpperCase)
                .filter(s->s.startsWith("G"))
                .sorted()
                .forEach(System.out::println);


        Stream<String> ioNumberStream = Stream.of("I26", "I17", "I29", "071");
        Stream<String> inNumberStream = Stream.of("N40","N36","I26", "I17", "I29", "071");
        Stream<String> concatStream = Stream.concat(ioNumberStream,inNumberStream);
        System.out.println(concatStream.distinct().peek(System.out::println).count());

        //First way
        // Collections.sort(gNumbers);

        // Second way
//        gNumbers.sort(new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareTo(o2);
//
//            }
//        });

//Thied Way
   //     gNumbers.sort((String s1, String s2) -> s1.compareTo(s2));

 //       gNumbers.forEach(s -> System.out.println(s));

    }
}
