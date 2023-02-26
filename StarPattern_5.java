import java.util.Scanner;
class StarPattern_5 {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any nuymber");
        int input=sc.nextInt();
        int ptn=1;
        for(int row=1;row<=input;row++){
            if(row%2==0){
                System.out.print("  ");
            }
            for(int j=1;j<=input;j++){
                System.out.print("  *");
            }
            System.out.println();
        }
    }
}