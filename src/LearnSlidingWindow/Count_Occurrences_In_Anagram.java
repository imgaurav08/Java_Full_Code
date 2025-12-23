package LearnSlidingWindow;

import java.util.HashMap;
import java.util.Map;

public class Count_Occurrences_In_Anagram {
    public static void main(String[] args) {
        String ip = "forxxorfxdofr";
        String op = "for";
        System.out.println(countOccurrences(ip,op));

    }

    public static int countOccurrences(String str, String ptr){
      HashMap<Character,Integer> map = new HashMap<>();
      int count =0;
      int ans=0;
      for (int i=0; i< ptr.length();i++){
          char ch =ptr.charAt(i);
          if (map.containsKey(ch)){
              int key= map.get(ch);
        map.put(ch,++key);
          }
          map.put(ch,1);
      }

      int start =0;
      int end =0;
       count = map.size();

       while (end < str.length()){
           char ch = str.charAt(end);
           if (map.containsKey(ch)){
               int key = map.get(ch);
               map.put(ch,--key);
               if (key==0){
                   count--;
               }
           }
           if (end-start+1< ptr.length()){
               end++;
               continue;
           }
           if (end-start+1== ptr.length()){
               if (count==0){
                   ans++;
               }

               if (map.containsKey(str.charAt(start))){
                   int key = map.get(str.charAt(start));
                   if (key==1){
                       count++;
                   }
                   map.put(str.charAt(start),1);
               }
               end++;
               start++;
           }
       }
       return ans;
    }
}
