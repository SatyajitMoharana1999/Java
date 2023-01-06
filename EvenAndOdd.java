import java.util.Scanner;
public class EvenAndOdd{
  public static void main(String args[]){
  int user_input;
  int even;
  int odd;
  Scanner sc=new Scanner(System.in);
  System.out.printf("enter range");
  user_input=sc.nextInt();
  System.out.printf("Even numbers :");
  for(int i=2;i<=user_input;i=i+2){
     System.out.printf("%d ",i);
  }
  System.out.printf("\nOdd numbers :");
  for(int i=1;i<=user_input;i=i+2){
     System.out.printf("%d ",i);
  }
  }
}
