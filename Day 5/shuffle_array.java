import java.util.*;
public class shuffle_array {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[2*n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int[] ans=new int[2*n];
        for(int i=0;i<n;i++){
            ans[2*i]=arr[i];
            ans[2*i+1]=arr[n+i];
        }
        System.out.print(Arrays.toString(ans));

    }
}
