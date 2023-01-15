import java.util.Scanner;
class SwappingNumber{
  public static void main(String args[]){
    int a,b,c;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter value for a");
    a=sc.nextInt();
    System.out.println("Enter value for b");
    b=sc.nextInt();
    System.out.println("Before swapping a = "+a+"  b = "+b);
    c=a;
    a=b;
    b=c;
    System.out.println("After swapping a = "+a+" b = "+b);
  }
}
