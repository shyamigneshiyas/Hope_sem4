import java.util.*;
public class two_Sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int target=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] num=new int[2];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j && (arr[i]+arr[j])==target){
                    num[0]=i;
                    num[1]=j;
                    System.out.print(Arrays.toString(num));
                    return;
                }
            }
        }
       
    }
}
