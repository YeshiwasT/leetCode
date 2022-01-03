import java.util.HashMap;

public class Longest_Substring_Without_Repeating_Characters {
    public static int lengthOfLongestSubstring(String s) {
        int count=0;
                                              
  
          HashMap <Character,Integer> charactors= new HashMap<Character,Integer>();
           
            
           for (int i = 0; i < s.length(); i++) {
        //puting charactors in map       
     if(!charactors.containsKey(s.charAt(i))){
              charactors.put(s.charAt(i),i);
  
                   if(count<=charactors.size()){
                      count=charactors.size();
                   }
                  }
               for(int j=i+1;j<s.length();j++){
  
                  if(!charactors.containsKey(s.charAt(j))){
              charactors.put(s.charAt(j),j);
  
                   if(count<=charactors.size()){
                      count=charactors.size();
                   }
                  } 
               else
               {
                   
                   charactors.clear();
                   break;
          }
               }}       
          
         return count; 
      }
     public static void main(String[] args) {
         //example to return the longest number of not repeating charactors in the given string s
         String s="hello";
        lengthOfLongestSubstring(s);  
     }
}
