import java.util.*;
public class pattern_2_singleloop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n*n;i++){
            int row=i/n;
            int col=i%n;
                if(row==0||row==n-1||col==0||col==n-1){
                    System.out.print("* ");
                }else System.out.print("  ");
            if((i+1)%n==0){
            System.out.println();
            }
        }
    }
}

