import java.util.*;
public class digit_game_can_be_won_leetcode_3232 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]<10) sum+=arr[i];
            else sum-=arr[i];
        }
        if(sum==0) System.out.print(false);
        else System.out.print(true);
    }
}
