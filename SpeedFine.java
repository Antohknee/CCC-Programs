import java.util.*;
/* Problem J2: RSA Numbers
 * Anthony Truong
 * Mr.Reid
 * ICS4UC
 * 2/11/2019
 **/

public class SpeedFine
{
  public static void main (String[] args)
  {
  
  //Relevant Variables
  Scanner sc = new Scanner(System.in);
  int speedinitial = 0;
  int difference = 0;
  int speedlimit = 0;
  
  //User Input
  System.out.println("Enter the speed limit:");
  speedlimit = sc.nextInt();
  System.out.println("Enter the recorded speed of the car:");
  speedinitial = sc.nextInt();
  
  //Calculate the fine
  difference = (speedinitial - speedlimit);

  if(difference > 0 & difference < 21)
  {
    System.out.println("You are speeding and your fine is $100");
  }
  else if(difference > 20 & difference < 31)
  {
    System.out.println("You are speeding and your fine is $270");
  }
  else if(difference > 30) 
  {
    System.out.println("You are speeding and your fine is $500");
  }
  else
  {
    System.out.println("Congratuations you are within the speed limit!");
  }

 }
}