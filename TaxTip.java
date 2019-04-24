import java.util.*;
/* Tipping Calculator
 * Anthony Truong
 * Mr.Reid
 * ICS4UC
 * 2/5/2019
 **/
public class TaxTip
{
  public static void main (String[] args)
  {
    
    // Relevant Variables Needed
    Scanner sc = new Scanner(System.in);
    double tax1 = 1.13;
    double cost1 = 0;
    double tip1 = 1.15;
    double cost2 = 0;
    double total1 = 0;
    double endcost2 = 0;
    double endcost1 = 0;
    int numpeople = 0;
    
    // Introduction
    
    System.out.println("What is your name?");
    String name1 = sc.next();
    System.out.println("Hello "+name1+"!");
    
    // Cost and Tip
    
    System.out.println("How much was the bill?");
    cost1 = sc.nextDouble();
    cost2 = ((cost1*tip1)*tax1);
    endcost1 = Math.round(cost2*100.0)/100.0;
    System.out.println("The total amount comes out to "+endcost1);
    
    // Dividing Amongst 'x' Amount of People
      
    System.out.println("How many people are you splitting with?");
    numpeople = sc.nextInt();
    total1 = ((endcost1) /(numpeople));
    endcost2 = Math.round(total1*100.0)/100.0;
    System.out.println("Each of you will be paying $"+endcost2);
  }
}