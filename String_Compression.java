public class String_Compression {

    public int compress(char[] chars) {
              int count=1;
               int i=0;
        int k=0;
        int j=1;
        if(chars.length==1){
            return 1;
        }
        while(j<chars.length){
          
            if(chars[i]!=chars[j]&&k<j){
                if(count==1){
                                  chars[k]=chars[j-1];
k++;  
                    i=j;
                
                j++;
                }else{
                chars[k]=chars[j-1];
                 int z=0;
                 if(count!=1){
                 while( z<Integer.toString(count).length()){
                chars[k+1+z]=Integer.toString(count).charAt(z);
                 z++;}
                 count=1;}
                 k=k+z+1;
                
                i=j;
                
                j++;}
            }
            else{
                count++;
                
                j++;
            }
             if(j==chars.length&&k<j){
                chars[k]=chars[i];
                 int z=0;
                 if(count!=1){
                 while( z<Integer.toString(count).length()){
                chars[k+1+z]=Integer.toString(count).charAt(z);
                 z++;}
                 count=1;}
                 k=k+z+1;
 
            }
        }
        
      return k;    
    }
}