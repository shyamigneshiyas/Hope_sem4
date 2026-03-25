import java.util.*;
public class best_time_to_buyand_sell_stock {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]<min) min=arr[i];
            else max=Math.max(max,arr[i]-min);
        }
        System.out.print(max);
    }
}
