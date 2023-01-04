import java.util.Scanner;
public class For_loop{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter how many times the loop run");
    int n=sc.nextInt;
    for(int i=1;i<=n;i++){
      System.out.print(i + " ");
    }  
  }
}
