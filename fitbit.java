import java.util.*;
import java.util.Scanner;
import java.util.concurrent.Semaphore;

class fitbit{
   
public static void main(String[] args){
    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.print("Enter your stride length (feet only): ");
    float feet = reader.nextFloat(); // Scans the next token of the input as an int.
    System.out.print("Enter your stride length (inches only): ");
    float inches = reader.nextFloat(); // Scans the next token of the input as an int.
    System.out.print("Enter the number of steps you walked: ");
    float steps = reader.nextFloat(); // Scans the next token of the input as an int.
   
    float length = (feet + (inches/12)) * steps;
   
    double miles = Math.floor(length/5280);
    double x = length/5280 - Math.floor(length/5280);
    double newFeet = x * 5280;
    double y = newFeet - Math.floor(newFeet);
    double newInches = y *12;
   
    System.out.print("You walked " + (int)miles + " miles, " + (int)newFeet + " feet, and " + (int)newInches + " inches.");

reader.close();
}  
}
