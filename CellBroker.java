import java.util.*;
import java.io.*;
/**
 * Cell Broker Problem
 * @course ICS4U1
 * @date 2019/02/11
 * @author Abhishek Roy
 **/
public class CellBroker
{
  public static void main(String args[]) throws Exception
  {
    Scanner sc = new Scanner(System.in);
    boolean prev = false;
    boolean ofAge = false;
    boolean firstPhone = false;
    
    //Attaining Phone Usuage from 
    System.out.println("Please enter how many minutes you have used: ");
    int userMin = sc.nextInt();
    
    System.out.println("Please enter how many texts you have sent ");
    int userText = sc.nextInt();
    
    System.out.println("Please enter how much data you have used (nearest whole number):");
    int userData = sc.nextInt();
    
    System.out.println("Please enter how many long distance minutes you have used:");
    int userLD = sc.nextInt();
    
    System.out.println("Do you have any appliances with Bell already?: ");
    String none1= sc.next();
    
    
    if (none1.toLowerCase() = "yes")
    {
      prev = true;
    }
    else
    {
      prev = false;
    }
    
    System.out.println("Are you a minor?");
    String none2 = sc.next();
    if (none2.toLowerCase() = "yes")
    {
      ofAge = true;
    }
    else
    {
      ofAge = false;
    }
    
    System.out.println("Is this your first phone with Wind?");
    String firstPhone = sc.next();
    String none3 = sc.next();
    if (none3.toLowerCase() = "yes")
    {
      firstPhone = true;
    }
    else
    {
      firstPhone = false;
    }
    
    boolean firstphone = sc.nextBoolean();
    
    CellPlan [] plans = new CellPlan[3];
    plans [0] = new Wind(userMin,userText,userData,userLD,4,200,500,10,1,0.20,30,2,firstphone);
    plans [1] = new Koodo(userMin,userText,userData,userLD,5,400,1000,10,0.50,0.75,50,2.75,ofAge);
    plans [2] = new Bell(userMin,userText,userData,userLD,8,600,1200,7.50,2.00,0.50,70,3,prev);
  
  
  float [] costs = new float [3];
  
  for (int i = 0; i < 3; i++)
  {
    costs[i] = plans[i].ckeckCost();
  }
  
  if ((costs[0] > costs[1]) && (costs[0] > costs[2]))
  {
    System.out.println("Wind is the best fit for this user");
  }
  
  else if ((costs[1] > costs[0]) && (costs[1] > costs[2]))
  {
    System.out.println("Koodo is the best fit for this user");
  }
  
  else if ((costs[2] > costs[0]) && (costs[2] > costs[1]))
  {
    System.out.println("Bell is the best fit for this user");
  }
  }
}