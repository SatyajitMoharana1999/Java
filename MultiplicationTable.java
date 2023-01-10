import java.util.Scanner;
public class MultiplicationTable{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int input;
    int i=1;
    System.out.println("Enter the number whose multiplication table you want to see");
    input=sc.nextInt();
    while(i<=10){
      System.out.println(input+" * "+i+" = "+input*i);
      i++;
    }
  }
}
