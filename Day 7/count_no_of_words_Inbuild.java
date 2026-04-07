import java.util.*;
public class count_no_of_words_Inbuild {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int count=0;
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch!=' '){
                if(flag){
                    count++;
                    flag=!flag;
                }
            }else flag=true;
        }
        System.out.print(count);
    }
}
