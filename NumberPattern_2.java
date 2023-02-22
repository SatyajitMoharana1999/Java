import java.util.Scanner;

class NumberPattern_2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int input=sc.nextInt();
        for(int row=1;row<=input;row++){
            for(int col=1;col<=row;col++){
                System.out.print(row);
            }
            System.out.println();
        }
    }
}


            // Enter a number 5
            
            // 1
            // 22
            // 333
            // 4444
            // 55555