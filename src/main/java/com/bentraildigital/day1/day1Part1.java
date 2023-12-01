package com.bentraildigital.day1;

import java.util.List;
import java.util.stream.Collectors;

public class day1Part1 {

    public int findFirstDigit(String input) {
        for(int i=0;i<input.length();i++){
            if(Character.isDigit(input.charAt(i))){
                return(Integer.valueOf(input.substring(i,i+1)));
            }
        }
        return -1;
    }

    public int findLastDigit(String input) {
        for(int i=input.length()-1;i>=0;i--){
            if(Character.isDigit(input.charAt(i))){
                return(Integer.valueOf(input.substring(i,i+1)));
            }
        }
        return -1;
    }

    public int getLineTotal(String input) {
        return findFirstDigit(input) *10 + findLastDigit(input);
    }

    public Long getLinesSum(List<String> lineList) {
        //return lineList.stream().mapToLong(this::getLineTotal).sum();
        return lineList.stream().mapToLong(this::getLineTotal).reduce(0,Long::sum);
        //return lineList.stream().mapToLong(this::getLineTotal).collect(Collectors.summingLong(Long::longValue));
    }

    public void printLinesSum(List<String> lineList) {
        lineList.stream().mapToLong(this::getLineTotal).forEach(i -> System.out.println(i));
    }
}
