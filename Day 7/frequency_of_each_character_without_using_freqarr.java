import java.util.*;
 public class frequency_of_each_character_without_using_freqarr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==' ') continue;

            boolean flag=false;
            for(int k=0;k<i;k++){
                if(s.charAt(k)==ch){
                    flag=true;
                    break;
                }
            }
            if(flag) continue;

            int count=1;
            for(int j=i+1;j<s.length();j++){
                if(ch==s.charAt(j)){
                    count++;

                }
            }
            System.out.println(ch+"-->"+count);
        }
    }
}
