import java.util.Scanner;

public class pattern_3_singleloop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n*n;i++){
            int row=i/n;
            int col=i%n;
                if(row==col||row+col==n-1){
                    System.out.print("* ");
                }else System.out.print("  ");
            if((i+1)%n==0){
            System.out.println();
            }
        }
    }
}
