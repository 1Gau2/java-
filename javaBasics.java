                         // VARIABLES AND DATA TYPES

/*In a program, input 3 numbers: A, B andC. Youhave to output the average of
these 3 numbers.*/

 import java.util.*;
public class javaBasics{
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
int A= sc.nextInt();
int B= sc.nextInt();
int C= sc.nextInt();

int Average = (A+B+C)/3;
System.out.print("Average of three numbers is:"+ Average);
    }
    }


    /* In a program, input the side of a square. You have to output the area of the
 square */

 import java.util.*;
 public class javaBasics{   
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("side of square:");
        int s1= sc.nextInt();
        System.out.println("side of sqaure:");
        int s2 = sc.nextInt();
        
        int area= s1*s2;
        System.out.print("Area of square is:"+ area);
    }
 }
   

 /*Enter cost of 3 items from the user (using float data type)- a pencil, a pen and
 an eraser. You have to output the total cost of the items back to the user as their bill.
 (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem */

 import java.util.*;
 public class javaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the cost of pencil:");
        float pencil=sc.nextFloat();
        System.out.println("Enter the cost of pen:");
        float pen = sc.nextFloat();
        System.out.println("Enter the cost of eraser:");
        float eraser = sc.nextFloat();
         
        float toatalbill= (pencil+pen+eraser);
        System.out.println("Your total bill is:"+toatalbill);

        float gst= toatalbill + (0.18f* toatalbill);
        System.out.println("Your total bill after 18% gst is:" +gst);
    }
 }

                       // CONDITIONAL STATEMENT PROBLEMS



     /*    Write  a Javaprogram to get a number from the user and print whether it is
 positive or negative.*/                  

 import java.util.*;
 public class javaBasics{
    public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.print("Enter number:");
int n = sc.nextInt();

if (n>=0){
    System.out.println("number is positive ");
}else{
    System.out.println("number is negative");
}
    }
 }


/* You have a fever if your temperature
 is above 100 and otherwise prints You don't have a fever.*/
 
public class javaBasics{
public static void main(String args[]){
int temperature= 110;
if( temperature > 100){
    System.out.println("you have a fever");
}else{
    System.out.println("you don't have fever");
}
}
}


/* Write a Java program to input week number(1-7) and print day of week name
 using switch case. */
 
 import java.util.*;
 public class javaBasics{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter week number(1-7):");
        int week = sc.nextInt();

        switch(week){
case 1:
System.out.println("Monday");
       break;
case 2:
System.out.println("Tuesday");
        break;
case 3:
System.out.println("Wednesday");
          break;
case 4: 
System.out.println("Thursday");
          break;
case 5: 
System.out.println("Friday");
            break;
case 6:
System.out.println("Saturday");
         break;
case 7:
System.out.println("Sunday");
          break;
default:
System.out.println("INVALID Input");
        }
    }
 } 





               // LOOPS

// write a program to print HELL0 World 10 times

import java.util.*;
public class javaBasics{
    public static void main (String args[]){
        for (int i =1; i<=10; i++){
            System.out.println("Hello World");
        }
    }
}


   
   
  