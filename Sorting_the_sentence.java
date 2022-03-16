public class Sorting_the_sentence {
    

    public String sortSentence(String s) {
       
String[] splited = s.split("\\s+");
            int greater=0;
        String[] sort=new String[10];
        
           for (String a : splited){
           char ch  =    a.charAt(a.length()-1);
               if(greater<Integer.parseInt(String.valueOf(ch))){
                greater =Integer.parseInt(String.valueOf(ch));}
               else{
                   greater=greater;
               }
        sort[Character.getNumericValue(ch)]=a.substring(0, a.length()-1);
           
           }
         StringBuffer sb = new StringBuffer();
           for(int i = 1; i <=greater; i++) {
         sb.append(sort[i]+" ");
      }
      String str = sb.toString().substring(0,sb.length()-1);
    
        
        
               
    
     return str;   
    }
}