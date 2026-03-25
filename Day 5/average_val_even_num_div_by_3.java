import java.util.*;
public class average_val_even_num_div_by_3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int count=0;
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]%6==0){
                sum+=arr[i];
                count++;
            }
        }
        System.out.print(sum/count);
    }
}
