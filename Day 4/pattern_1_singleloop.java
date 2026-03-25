import java.util.*;
public class pattern_1_singleloop {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n*n;i++){
            System.out.print("* ");
            if((i+1)%n==0) System.out.println();
        }
    }
}
