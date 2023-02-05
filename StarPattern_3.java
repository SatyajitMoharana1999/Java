
import java.util.Scanner; 
class StarPattern_3{
  public static void main(String arg[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter any number");
    int n=s.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n-i;j++){
        System.out.print(" ");
        //loop for creating spaces
      }
      for(int k=1;k<=2*i-1;k++){
        System.out.print("*");
        //loop for creating odd number of stars in each line in increasing order
      }
      System.out.println();
    }
  }
}
