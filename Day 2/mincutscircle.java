import java.util.*;//Leetcode problem no:2481
public class mincutscircle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1) System.out.print(0);
        if(n%2!=0) System.out.print(n);
        else System.out.print(n/2);


    }
}
