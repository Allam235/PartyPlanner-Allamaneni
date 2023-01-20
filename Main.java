import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

class Main {
  public static void main(String[] args) {
    Table t1 = new Table();
    Scanner scan = new Scanner(System.in);
    Person p;
    char choice = 'y';
    t1.getCFile();
    t1.getNFile();
    choice = 'y';
    int n = 1;
    while (choice == 'y' && n != 0) {
      System.out.print("Do you want to add another person manually(type y or n)");
      choice = scan.next().charAt(0);
      if (choice == 'y') {
        n = t1.manuelEnter();
      } // close if
    }
    System.out.println();
    t1.sort();
    t1.fill();
    // System.out.println("The Tables have been finished");
    String s = "table";
    String buffer = scan.nextLine(); //need a buffer whenever you use nextLine after using nextInt
    String[] company = {"Wal-Mart", "Kroger", "Amazon", "Lowes", "Best Western", "KMart", "Fusian", "Heinz", "Gucci", "Prada", "Nike", "Dodge", "Maserati", "Razor", "AMD","Razer"};

    
    while (!s.equals("end")) {//repeatedly asks person what they want until they type end
      System.out.println("Type table if you would like to see an entire table, type person to see which table a specific person belongs to, type company to print all the people belonging to a certain company, or type end to stop program");
      s = scan.nextLine();
      System.out.println();
      
      if (s.equals("table")) {//if user wants to print by 
        int tn;
        System.out.println("What table do you want to print?");
        tn = scan.nextInt();
        buffer = scan.nextLine();
        t1.tprint(tn);
      } // close first if
        
      else if (s.equals("company")) {//if user wants to print by company
        String companyn;
        System.out.println("What is the Company Name? (Options are Wal-Mart, Kroger, Amazon, Lowes, Best Western, KMart, Fusian, Heinz, Gucci, Prada, Nike, Dodge, Maserati, Razor, AMD, Razer)");
        companyn = scan.nextLine();
        int id = -1;
        for(int i = 0; i<company.length && id == -1;i++){// identifies id of inputted company
          if(companyn.equals(company[i])){
            id = i + 1;
            System.out.println(id);
          }//close if          
        }//close for i loop
        if(id == -1){// checks if company exists
          System.out.println("Company not found");
        }
        else{
        t1.cprint(id);
        } 
      }// close second if
        
      else if (s.equals("person")) {//if user wants info on specific person
        String name;
        System.out.println("What is the first and last name of the person?");
        name = scan.nextLine();
        t1.pprint(name);

      } // close third if
    } // close while

  }//close main method
}// close main
/*
 * order list
 * 0
 * 8
 * 1
 * 7
 * 2
 * 3
 * 4
 * 12
 * 5
 * 6
 * 10
 * 14
 * 9
 * 13
 * 15
 * 11
 */