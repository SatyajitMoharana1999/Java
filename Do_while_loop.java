import java.util.Scanner;
class Do_while_loop{
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter how many times you want to print 'hi'");
    int n=sc.nextInt();
    int i=1;
    do{
      System.out.println("Hi");
      i++;
    }while(i<=n);
  }
}
