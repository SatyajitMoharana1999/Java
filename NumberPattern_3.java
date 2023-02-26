import java.util.Scanner;

class NumberPattern_3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter any nuymber");
        int input=sc.nextInt();
        int ptn=1;
        for(int row=1;row<=input;row++){
            for(int col=1;col<=input;col++){
                int x=ptn==1?1:0;
                System.out.print(" "+x);
                ptn*=-1;
            }
            System.out.println();
            if(input%2==0){
                ptn*=-1;
            }
        }
    }
}


/*
            Enter any nuymber
            5
                    1 0 1 0 1
                    0 1 0 1 0
                    1 0 1 0 1
                    0 1 0 1 0
                    1 0 1 0 1
                                            */