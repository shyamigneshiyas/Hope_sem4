import java.util.*;
public class ifelseprob {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sal=sc.nextInt();
        if(sal<20000) sal+=4000;
        else sal+=2000;
        System.out.print(sal);

    }
}
