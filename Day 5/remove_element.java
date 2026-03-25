import java.util.*;
public class remove_element {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int val=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=val){
                arr[index++]=arr[i];
            }
        }
        System.out.print(index);
    }
}
