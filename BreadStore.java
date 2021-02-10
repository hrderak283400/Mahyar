/*
Prgramming for Bread Store with the Price is Const but quentity Bread Buy is diffrent.
 Input The Bread name should only English Type and First word must upper case.
 Quentity counter buy shuld only up of ziro ,If this is under or equles ziro ,This Program go to Exit.
 The Bread Class is Filal and Function is protected.
 */
/*
                      @author Mahyar Geramizdegan
 */
import java.util.*;
import static javax.swing.JOptionPane.*;
final class MyBread {
 protected static void BreadBuy() {
// Data Type for Input and Output Declares
      Scanner Input = new Scanner(System.in);
      String Bread = null
                  ,Ans;
      int Counter = 1
          ,Sum = 0
          ,Price = 0
          ,Quentity = 0
          ,Total = 0
          ,Buy = 0
          ,Line = 1 ;
// Message Hello and Start Bread Buy from Bread store
        /*System.out.println("\t\t\t\tHello, Welcome to here Program.\n");
        System.out.println("Plese Enter Quentity for Braed Buy :");
       Buy = Input.nextInt(); */
      Ans = showInputDialog("Plese Enter Quentity for Bread Buy :");
      Buy = Integer.parseInt(Ans);
          System.out.println(" Line | Bread Name  | Quentity |  Price   |   Total  ");
          System.out.println("-----------------------------------------------------");
      while ( Counter <= Buy ) {
              /*  System.out.print(" Enter Braed Name :");
                Bread = Input.next();
                System.out.print(" Enter Quentity Braed Buy :");
                Quentity = Input.nextInt(); */
                Bread = showInputDialog(" Bread Name  :") ;
                 Ans = showInputDialog(" Quentity  Bread Buy :");
                Quentity = Integer.parseInt(Ans) ;
           switch (Bread) {
               case "Sangaki" :
                   Price = 14500 ;
                   break;
               case "Taftoun"
                   ,"Sandwich"
                   ,"Humber" :
                   Price = 10000;
                   break;
               case "Barbari" :
                   Price = 7000;
                   break;
           } //end case
                Total = Quentity * Price ;
                Counter ++;
                Sum += Total;
          System.out.format(" %d  \t  %s \t   %d  \t \t  %d  \t   %d \n",Line, Bread, Quentity, Price, Total);
          System.out.println("-----------------------------------------------------");
                Line ++;
      }// end while
          System.out.print(" Sum of Bread Buy : " );
          System.out.format("%d",Sum);
          System.out.println("\n-----------------------------------------------------");
        } // end Function or Method
   }// end Brad Class
public class BreadStore {
    public static void main(String[] args) {
        MyBread BreadClass = new MyBread();
        MyBread.BreadBuy();
        System.out.println("Please Enter Key to Exit ....");
        try {
            System.in.read();
        }
        catch
            (Exception e){
        }
    }// end main function
 } //  end Programming
