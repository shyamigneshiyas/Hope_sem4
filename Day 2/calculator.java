import java.util.*;
public class calculator {
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    char c=sc.next().charAt(0);
    if(c=='+') System.out.print((int)(a+b));
    else if(c=='-') System.out.print((int)(a-b));
    else if(c=='/') System.out.print(a/b);
    else if(c=='*') System.out.print((int)(a*b));
}

}
