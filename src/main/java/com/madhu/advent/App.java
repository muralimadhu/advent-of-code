package com.madhu.advent;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            System.out.println(Day1.getTotalCalories("src/main/resources/day1", 1));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
