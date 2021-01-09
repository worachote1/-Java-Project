package com.company;

import java.util.Arrays;
import java.util.Scanner;


public class Main {
    public static int chula(int pat3,int pat1,int gat){

        return pat3 * 60 + pat1 *20 +gat *20 ;
    }
    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your pat3 score :");
        int pat3 = in.nextInt() ;

        System.out.print("Enter your pat1 score :" );
        int pat1 = in.nextInt() ;

        System.out.print("Enter your gat score :");
        int gat = in.nextInt();

        if (chula(pat3,pat1,gat)>= 20800){
            System.out.println("Congrats !!! you can study engineering in Chulalongkorn university" +
                    "with your TCAS score :"+ chula(pat3,pat1,gat));
        }




        else   {
            System.out.println( "Your TCAS score is " + chula(pat3,pat1,gat)+" is'nt reached to minimum score...." +
                    "so keep trying!!!");
        }


        
    }
}

