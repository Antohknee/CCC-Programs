import java.util.*;
/* The Cell Sell
 * Anthony Truong
 * Mr.Reid
 * ICS4UC
 * 2/11/2019
 **/

public class CellSell
{
  public static void main (String[] args)
  {
    
    //Relevant Variables
    
    Scanner sc = new Scanner(System.in);
    int dminutes = 0;
    int eminutes = 0 ;
    int wminutes = 0;
    
    //Plan A Variables
    double dcost1 = 0;
    double ecost1 = 0;
    double wcost1 = 0;
    double plana = 0;
    double planacost = 0;
    
    //Plan B Variables
    double dcost2 = 0;
    double ecost2 = 0;
    double wcost2 = 0;
    double planb = 0;
    double planbcost = 0;
    
    //Getting input from user
    
    System.out.println("Hi! To find out which cell plan is better entering the minutes used at each of the following times");
    System.out.print("Enter the amount of minutes used during the daytime:");
    dminutes = sc.nextInt();
    System.out.print("Enter the amount of minutes used during the evening:");
    eminutes = sc.nextInt();
    System.out.print("Enter the amount of minutes used during the weekend:");
    wminutes = sc.nextInt();
    
    //Calculate the total cost for Plan A
    
    //Daytime
    if (dminutes > 100)
    {
      dminutes = (dminutes - 100);
      dcost1 = (dminutes*0.25);
    }
    else
    {
      dcost1 = 0;
    }
    
    //Evening
    ecost1 = (eminutes*0.15);
    
    //Weekend
    wcost1 = (wminutes*0.20);
    
    //Total Plan A cost
    plana = (dcost1+ecost1+wcost1);
    planacost = Math.round(plana*100.0)/100.0;
    System.out.println("Plan A will cost $"+planacost);
    
    
    
    
    
    //Calculate the total cost for Plan B
    
    if (dminutes > 250)
    {
      dminutes = (dminutes - 250);
      dcost2 = (dminutes*0.45);
    }
    else
    {
      dcost2 = 0;
    }
    
    //Evening
    ecost2 = (eminutes*0.35);
    
    //Weekend
    wcost2 = (wminutes*0.25);
    
    //Total Plan A cost
    planb = (dcost2+ecost2+wcost2);
    planbcost = Math.round(planb*100.0)/100.0;
    System.out.println("Plan B will cost $"+planbcost);
    
    
    //Comparing between Plan A and Plan B
    
    if(planacost > planbcost)
    {
      System.out.println("Plan B is the cheapest.");
    }
    else if(planbcost == planacost)
    {
      System.out.println("Plan A and B are the same price.");
    }
    else
    {
      System.out.println("Plan A is the cheapest.");
    }
    
  }
}