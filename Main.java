package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Scanner;



public class Main {
    public static int KMTIL(int GPA, int Onet, int Gat, int pat2, int pat3) {
        return GPA * 20 + Onet * 30 + Gat * 15 + pat2 * 15 + pat3 * 20;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your GPA : ");
        int GPA = in.nextInt();

        System.out.print("Enter your Onet : ");
        int Onet = in.nextInt();

        System.out.print("Enter your Gat: ");
        int Gat = in.nextInt();

        System.out.print("Enter your PAT2 : ");
        int pat2 = in.nextInt();

        System.out.print("Enter your PAT3 : ");
        int pat3 = in.nextInt();

        if (KMTIL(GPA, Onet, Gat, pat2, pat3) >= 19900) {
            System.out.println(
                    "Congrats !!! you can study engineering in KMTIL university" +
                            "with your TCAS score :" + KMTIL(GPA, Onet, Gat, pat2, pat3));
        } else {
            System.out.println("Your TCAS score is " + KMTIL(GPA, Onet, Gat, pat2, pat3) +
                    " is'nt reached to minimum score...." + "so keep trying !!!");

        }
    }
}

