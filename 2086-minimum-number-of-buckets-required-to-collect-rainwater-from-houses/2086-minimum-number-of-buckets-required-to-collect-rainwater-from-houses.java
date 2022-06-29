class Solution {
    public int minimumBuckets(String street) {
        StringBuilder str=new StringBuilder(street);
       str.append('p');
        
        str.toString();
        char[] ch = street.toCharArray();
        char[] copy= new char[ch.length];
        for(int i=0;i<ch.length;i++){
            copy[i]=ch[i];
        }
       int count=0;
        if(street.equals("H"))return -1;
          if(ch.length>=2&&ch[0]=='H'&&ch[1]=='H'||ch.length>=2&&ch[ch.length-1]=='H'&&ch[ch.length-2]=='H'){
                    return -1;

      }
for(int i=0;i<ch.length;i++){
  if(ch[i]=='H'){
      count++;
      if(i>0&&copy[i-1]=='H')
      {       if(i==1||i==ch.length-1){
                    return -1;

      }
       if(i+1<ch.length&&ch[i+1]=='H'){
           return -1;
       }
          
      }
      if(i>1&&ch[i]=='H'&&ch[i-1]=='.'&&ch[i-2]=='H'){
         count--;
          ch[i]='k';
      }}
      
  }
    

         System.out.println(Arrays.toString(ch));
return count;
    }
}