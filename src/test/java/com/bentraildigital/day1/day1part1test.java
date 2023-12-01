package com.bentraildigital.day1;

import org.junit.Test;

import java.io.*;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class day1part1test {

    private String testString = "1abc2";

    @Test
    public void findFirstTest(){
        day1Part1 e = new day1Part1();
        assertThat(e.findFirstDigit(testString)).isEqualTo(1);
    }

    @Test
    public void findLastTest(){
        day1Part1 e = new day1Part1();
        assertThat(e.findLastDigit(testString)).isEqualTo(2);
    }

    @Test
    public void getLineTotalTest(){
        day1Part1 e = new day1Part1();
        assertThat(e.getLineTotal(testString)).isEqualTo(12);
    }

    @Test
    public void poroblemLineTest(){
        day1Part1 e = new day1Part1();
        assertThat(e.getLineTotal("4ninemzqkldqrcnmcvjjxtzgbrp")).isEqualTo(44);
    }

    @Test
    public void findLinesSumFromSampleFile() throws IOException, URISyntaxException {
        String dataFileName = this.getClass().getResource("sampleInput").getFile();
        List<String> lineList = new ArrayList<>();
        lineList = Files.readAllLines(Path.of(dataFileName));
        day1Part1 e = new day1Part1();
        e.printLinesSum(lineList);
        assertThat(e.getLinesSum(lineList)).isEqualTo(142);
    }

    @Test
    public void findSolution() throws IOException, URISyntaxException {
        String dataFileName = this.getClass().getResource("input.txt").getFile();
        List<String> lineList = new ArrayList<>();
        lineList = Files.readAllLines(Path.of(dataFileName));
        day1Part1 e = new day1Part1();
        e.printLinesSum(lineList);
        assertThat(e.getLinesSum(lineList)).isEqualTo(55123);
    }

}
