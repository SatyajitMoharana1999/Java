import java.util.Scanner;
public class ReverseNumber{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter any number);
    int input=sc.nextInt();
    int reminder;
    int reverse=0;
    
    while(input>0){
      reminder=input/10;
      reverse=reverse*10+reminder;
      input=input/10;
    }
    System.out.println("Reverse :"+reverse);
  }
}
