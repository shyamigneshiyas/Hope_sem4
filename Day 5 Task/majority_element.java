import java.util.*;
public class majority_element {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int count=0;
        int res=0;
        for(int num:arr){
            if(count==0) res=num;
            if(num==res){
                count++;
            }else count--;

        }
        System.out.print(res);
    }
}
