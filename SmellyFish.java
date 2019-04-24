import java.util.*;
/* Sounds Fishy
 * Anthony Truong
 * Mr.Reid
 * ICS4UC
 * 2/11/2019
 **/

public class SmellyFish
{
  public static void main (String[] args)
  {
    
    //Relevant Variables
    
    Scanner sc = new Scanner(System.in);
    int distance1 = 0;
    int distance2= 0;
    int distance3 = 0;
    int distance4 = 0;
    
    //Asking User Input for Depths
    System.out.println("Please enter the different depths recorded in succession:");
    distance1 = sc.nextInt();
    distance2 = sc.nextInt();
    distance3 = sc.nextInt();
    distance4 = sc.nextInt();
    
    //Determine which case it is
    
    //Fish Rising
    if(distance2 > distance1 && distance3 > distanc2 && distance4 > distance3)
    {
      System.out.print("Fish Rising");
    }
    
    //Fish Diving
    else if(distance2 < distance1 && distance3 < distance2 && distance4 < distance3)
    {
      System.out.print("Fish Diving");
    }
    
    //Fish at Constant
    else if(distance2 == distance1 && distance2 == distance3 && distance3 == distance4)
    {
      System.out.print("Fish at Constant");
    }
    
    //No Fish
    else
    {
      System.out.println("No Fish");
    }
    
  }
}
    