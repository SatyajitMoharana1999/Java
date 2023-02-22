import java.util.Scanner;
public class NumberPattern_1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        System.out.print(j);
      }
      System.out.println();
    }
  }
}


/*--
    input :5
    output: 
            1
            12
            123
            1234
            12345
      --*/
