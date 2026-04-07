public class frequency_of_each_character {
     public static void main(String[] args) {
       String s="hello world";
       int[] freq=new int[256];
       for(int i=0;i<s.length();i++){
           char ch=s.charAt(i);
           if(ch==' ') continue;
             
           freq[ch]++;
       }
       for(int i=0;i<256;i++){
        if(freq[i]>0){
        System.out.println((char) i +"->"+freq[i]);
        }
       }
        

     }
    }
