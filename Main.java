      package com.company;

      import org.w3c.dom.ls.LSOutput;

      import java.util.Scanner;

        public class Main {

            public static  int rectangle(int width , int height ) {
                return width * height ;
            } /* สร้าง ฟังก์ชั่น การคํษนวณ หา พื้นที่ */

            public static void main(String[] args) {
                System.out.println("time walker");
                System.out.println(27);
                System.out.println("----------------------------------------------------------------");

                Scanner in = new Scanner(System.in);

                System.out.print("width equal to : ");
                int width = in.nextInt();
                System.out.println("width คือ " + width);
                System.out.print("height equal to : ");

                int height = in.nextInt();
                System.out.println("height คือ " + height);
                //int area = width * height;
                int area = rectangle(width,height) ;
                System.out.println("area คือ " + area);  }

                

        }



