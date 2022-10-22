package restaurant.menu;

import java.util.Scanner;


public class RestaurantMenu {

   
    public static void main(String[] args) {
        int num;
        System.out.println("                KARHAI GHAR");
        System.out.println("                   MENU");
    System.out.println("              1.CHICKEN KARHAI  ");
    System.out.println("              2.MOTTON KARHAI   ");
    System.out.println("              3.CHICKEN HANDI  ");
   System.out.println("");
    System.out.println("     ~ENTER THE NUMBER OF ITEM YOU WANT TO ORDER~");
    Scanner sc=new Scanner(System.in);
    num=sc.nextInt();
    switch(num)
    {
        case 1:
            System.out.println("price of item is 950rs");
        break;
        case 2:
            System.out.println("price of item is 1500rs");
    break;
        case 3:
            System.out.println("price of item is 900rs");
    }
    
    }
    
}