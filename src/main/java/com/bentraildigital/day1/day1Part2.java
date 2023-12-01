package com.bentraildigital.day1;

import java.util.List;

public class day1Part2 {

    public int findFirstDigit(String input) {
        String s = replaceNumberWords(input);
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                return(Integer.valueOf(s.substring(i,i+1)));
            }
        }
        return -1;
    }

    public int findLastDigit(String input) {
        String s = replaceNumberWords(input);
        for(int i=s.length()-1;i>=0;i--){
            if(Character.isDigit(s.charAt(i))){
                return(Integer.valueOf(s.substring(i,i+1)));
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

    public String replaceNumberWords(String input) {
        String output = new String(input);
        output=output.replaceAll("one","one1one");
        output=output.replaceAll("two","two2two");
        output=output.replaceAll("three","three3three");
        output=output.replaceAll("four","four4four");
        output=output.replaceAll("five","five5five");
        output=output.replaceAll("six","six6six");
        output=output.replaceAll("seven","seven7seven");
        output=output.replaceAll("eight","eight8eight");
        output=output.replaceAll("nine","nine9nine");
        return output;
    }
}
