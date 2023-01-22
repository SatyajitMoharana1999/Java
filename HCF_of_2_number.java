import java.util.Scannrr;
public class HCF_of_2_number{
  public static void main(String a[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter the first number");
    int a=s.nextInt();
    System.out.println("Enter second number");
    int b=s.nextInt();
    int hcf=0;
    int sml=a<b?a:b; //sml for storing small number 
    for(int i=sml;i>=1;i--){
      if(a%i==0&&b%i==0){
        hcf=i;
      }
    }
    System.out.println("HCF of "+a+" and "+b+" is "+hcf);
  }
}
