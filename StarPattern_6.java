import java.util.Scanner;
class StarPattern_6{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int input=sc.nextInt();
        for(int row=1;row<=2*input-1;row++){
            int for_star=row>input?row-input:input-row;
            for(int star=1;star<=for_star;star++){
                System.out.print(" *");
            }
            int for_space=row>input?(2*input-row)*2-1:row*2-1;
            for(int space=1;space<=for_space;space++){
                if(space==1||space==for_space){
                    System.out.print(" *");
                }else{
                    System.out.print("  ");
                }
            }
            for(int star=1;star<=for_star;star++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
