/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Troy Baggs
 */

package org.example;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.lang.Math;

class Calc
{
    double p;
    double r;
    double t;
    double n;
}

public class exercise13
{
    public static void main(String[] args)
    {
        Calc c = new Calc();
        c = inputs(c);
        DecimalFormat df = new DecimalFormat("#.##");
        DecimalFormat rf = new DecimalFormat("#.#");
        System.out.println("$" + df.format(c.p) + " invested at " + rf.format(c.r*100) + "% for " + c.t + " years compounded " + c.t + " times per year is $" + df.format(c.p*(Math.pow((1+(c.r/c.n)),(c.n*c.t)))));
    }

    public static Calc inputs(Calc c)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the principal amount? ");
        c.p = sc.nextFloat();
        System.out.println("What is the rate? ");
        c.r = (sc.nextFloat() / 100);
        System.out.println("What is the number of years? ");
        c.t = sc.nextFloat();
        System.out.println("What is the number of times the interest is compounded per year? ");
        c.n = sc.nextFloat();
        return c;
    }
}
