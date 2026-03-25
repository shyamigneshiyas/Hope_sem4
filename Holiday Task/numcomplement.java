import java.util.*;
public class numcomplement {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int length=Integer.toBinaryString(n).length();
        int mask=(1<<length)-1;
        System.out.print(n^mask);


    }
    
}
