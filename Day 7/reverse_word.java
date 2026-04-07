import java.util.*;
public class reverse_word {
    public static void main(String[] args){
        String s="asalamwalaikum lehari";
        int end=0;
        int flag=0;
        StringBuilder sb=new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            if(i==0 || s.charAt(i)==' '){
                if(i==0){
                  sb.append(s.substring(i,end+1)+" ");  
                }else{
                    sb.append(s.substring(i+1,end+1)+" ");
                }
                flag=0;
            }
            
            else{
                if(flag==0){
                    end=i;
                    flag=1;
                }
            }
        }
        System.out.print(sb.toString());
    }
}
