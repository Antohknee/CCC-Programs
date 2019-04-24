import java.util.Scanner;

public class IconScaling2 
{

 public static void main(String[] args) 
 {
  Scanner sc = new Scanner(System.in);
  
  //Declare all the variables needed
  int scale = 0;
  String x = "x";
  String space = " ";
  String asterisk = "*";
  
  //User input for scale
  System.out.println("Please enter a scale: ");
  scale = sc.nextInt();
  
  //Duplicating the image
  
  //Line 1
  for(int i=0; i < scale; i++)
  {
   for(int a=0; a < scale; a++)
   {
    System.out.print(asterisk);
   }
   
   for(int a=0; a < scale; a++)
   {
    System.out.print(x);
   }
   
   for(int a=0; a < scale; a++)
   {
    System.out.println(asterisk);
   }
  }
  
  //Line 2
  for(int z=0; z < scale; z++)
  {
   for(int i=0; i < scale; i++)
   {
    System.out.print(x);
   }
   
   for(int i=0; i < scale; i++)
   {
    System.out.print(x);
   }
   
   for(int i=0; i < scale; i++)
   {
    System.out.print(x);
   }
  }
  /*
  //Line 3
  for(int y=0; y < scale; y++)
  {
   for(int i=0; i < scale; i++)
   {
    System.out.println(asterisk);
   }
   
   for(int i=0; i < scale; i++)
   {
    System.out.print(space);
   }
   
   for(int i=0; i < scale; i++)
   {
    System.out.print(asterisk);
   }
  }
  */
 }

}
