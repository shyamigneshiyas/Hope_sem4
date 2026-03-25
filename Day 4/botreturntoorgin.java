import java.util.*;
public class botreturntoorgin {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int org1=0;
        int org2=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='U'){
                org1++;
            }
            else if(s.charAt(i)=='D') org1--;
            if(s.charAt(i)=='R') org2++;
            else if(s.charAt(i)=='L') org2--;
        }
        if(org1==0 && org2==0) System.out.print(true);
        else System.out.print(false);
    }
}
