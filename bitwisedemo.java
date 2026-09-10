import java.util.*;
import java.io.*;


public class bitwisedemo {
    public static void main(String[] args) {
        int a = 10;     
        int b = 5;      

        System.out.println("Bitwise Logical Operators");
        System.out.println("a & b  = " + (a & b)); 
        System.out.println("a | b  = " + (a | b));  
        System.out.println("a ^ b  = " + (a ^ b));  
        System.out.println("~a     = " + (~a));     

        System.out.println(" Shift Operators");
        System.out.println("a << 1 = " + (a << 1)); // Left shift (multiply by 2)
        System.out.println("a >> 1 = " + (a >> 1)); // Right shift (divide by 2)
    }
}
