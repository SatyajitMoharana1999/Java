import java.util.Scanner;
public class FindGretterNumber{
  public static void main(String args[]){
    int input;
    int sum;
    int smaller;
    int gretter;
    System.out.println("Enter how numbers you want to input");
    Scanner sc = new Scanner(System.in);
    input=sc.nextInt();
    System.out.println("you have to enter "+input+" numbers");
    gretter=0;
    for(int i=1;i<=input;i++){
      System.out.println("Enter number "+i+":");
      smaller=sc.nextInt();
      gretter=(smaller>gretter)?smaller:gretter;
      
    }
    System.out.println("Greatest number "+gretter); 
  }
}
