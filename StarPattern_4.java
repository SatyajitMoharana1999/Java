import java.util.Scanner;

class StarPattern_4{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number");
        int input=s.nextInt();
        for(int row=1;row<=2*input-1;row++){
            int for_space=row>input?row-input:input-row;
            for(int space=1;space<=for_space;space++){
                System.out.print(" ");
            }

            int for_star=row>input?2*input-row:row;
            for(int star=1;star<=2*for_star-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
Enter a number
            5
                *
               ***
              *****
             *******
            *********
             *******
              *****
               ***
                *
                         */