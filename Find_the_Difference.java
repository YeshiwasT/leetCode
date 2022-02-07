import java.util.Hashtable;


public class Find_the_Difference {
    public static char findTheDifference(String s, String t) {
        char charactor='n';
        Hashtable<Character,Integer> counter= new Hashtable<Character,Integer>();
        for(int i=0;i<s.length();i++){
            if(counter.containsKey(s.charAt(i))){
                int val=counter.get(s.charAt(i))+1;
            counter.put(s.charAt(i),val);
 
            }
            else{
            counter.put(s.charAt(i),1);
        }   }
                            
        for(int j=0;j<t.length();j++){
         if(counter.containsKey(t.charAt(j))){
               int value=counter.get(t.charAt(j))-1;
                   counter.replace(t.charAt(j),value);

                if(counter.get(t.charAt(j))<0){


                                     charactor=t.charAt(j);
               break;
                   
               }
}else{ 
            charactor=t.charAt(j);
        }}
      return charactor;  
    }
    public static void main(String[] args) {
        // finding the differ character from the given two strings
        String orginal="abcd";
        String newer="abcde";// e is the differ character
        System.out.println(findTheDifference(orginal, newer));// it returns the  the differ character
    }
    
}
