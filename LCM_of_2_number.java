import java.util.Scanner;
public class LCM_of_2_number{

public static void main(String args[]){

  Scanner sc = new Scanner(System.in);
  System.out.println("Enter first number");
  int a=sc.nextInt();
  System.out.println("Enter the second number");
  int b=sc.nextInt();
  int lcm;
  
  for(int i=1;i<=a*b;i++){
    if(i%a==0&&i%b==0){
      lcm=i;
      break;
    }
  }
  System.out.format("%d",lcm);
 
  }
}
