import java.util.Random;
import java.util.Scanner;
public class Stone_Paper_Scizzor
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
            System.out.println("enter the number...0 for rock or 1 for paper or and 2 for scizzor :- " );
            int a = sc.nextInt();
            Random rr = new Random();
            int computerinput = rr.nextInt(3);
if(computerinput == 0 ){
    System.out.println(" computer drop :- rock");
 }else if(computerinput == 1)
 {
    System.out.println(" computer drop :- paper");
 }else 
 {
    System.out.println(" computer drop :- scizzor");
 }
 System.out.println("game result is :- ");
            if( a == computerinput)
            {
                     System.out.println("try again");
            }else if(a == 0 && computerinput == 2 || a == 1 && computerinput == 0 || a == 2 && computerinput== 1)
            {
                System.out.println("you Win!!");
             } else {
                System.out.println("computer win");
            }
    }  
}