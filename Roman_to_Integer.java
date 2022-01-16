import java.util.HashMap;

public class Roman_to_Integer {
    
        public static int romanToInt(String s) {
           
            
            HashMap<Character,Integer> rInt = new HashMap<Character,Integer>();
            rInt.put('I',1);
            rInt.put('V',5);
            rInt.put('X',10);
            rInt.put('L',50);       
            rInt.put('C',100);
            rInt.put('D',500);
            rInt.put('M',1000);
            
    
            
            if(s.length()==1){
                return rInt.get(s.charAt(0));
            }else {
                int result=0;
    
            for(int i=0;i<s.length()-1;i++){
                     
                if(rInt.get(s.charAt(i))>=rInt.get(s.charAt(i+1))){
                    //compare adjecent charactors from string if the first one is greater or equal add it to result integer
                  result+= rInt.get(s.charAt(i)) ;
                }
                else if(rInt.get(s.charAt(i))<rInt.get(s.charAt(i+1))){
                      //if it is less substract the smaller one from the larger and add it to result 
                    result+=rInt.get(s.charAt(i+1))-rInt.get(s.charAt(i)) ;
                    i++;
                                                
    
                }
                else{
                     break;
                }
                
                
            }
            if(rInt.get(s.charAt(s.length()-2))>=rInt.get(s.charAt(s.length()-1))){
                
                 result+= rInt.get(s.charAt(s.length()-1));//adding last elements
    
                
            }
           
            
            return result;}
            
        }
        public static void main(String[] args) {
            //enter any roman number in string 
            //Roman_to_Integer method convert it to Integer corespondance
            String romanNumber="MMMCMXCIX";
           System.out.println("Roman number equvalence is: "+romanToInt(romanNumber));//
            
            
        }
        
    }
    

