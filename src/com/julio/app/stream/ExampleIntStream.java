package com.julio.app.stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExampleIntStream {

    public static void main(String[] args) {
        System.out.println("************* IntSream*************");
        IntStream intStream = IntStream.range(5,20);
        //intStream.forEach(System.out::println);
        
        //int r = intStream.reduce(0,Integer::sum);
        //System.out.println("r = " + r);
        //System.out.println("intStream.sum() = " + intStream.sum());
        IntSummaryStatistics intSummaryStatistics = intStream.summaryStatistics();
        System.out.println("intSummaryStatistics.getAverage() = " + intSummaryStatistics.getAverage());
        System.out.println("intSummaryStatistics.getMax() = " + intSummaryStatistics.getMax());
        System.out.println("intSummaryStatistics.getMin() = " + intSummaryStatistics.getMin());
        System.out.println("intSummaryStatistics.getCount() = " + intSummaryStatistics.getCount());
         
    }
    
    
    
}
