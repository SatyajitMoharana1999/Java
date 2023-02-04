import java.util.Scanner;
class GreaterAmong4Number{
  public static void main(String ar[]){
    int larger=0;
    Scanner s=new Scanner(System.in);
    System.out.println("Enter 4 numbers");
    for(int i=0;i<4;i++){
      System.out.println("Enter : ");
      int num=s.nextInt();
      larger=larger<num?num:larger;
    }
    System.out.println("Larger number is "+larger);
  }
}
