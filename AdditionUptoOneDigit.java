import java.util.Scanner;
public class AdditionUptoOneDigit{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter a number");
    int number=s.nextInt();
    int sum;
    for(int i=1;number>=10;i++){
      sum=0;
      for(int j=number;j>0;j=j/10){
        sum=sum+j%10;
      }
      number=sum;
    }
    System.out.println("Addition up to one digit : "+number);
  }
}
