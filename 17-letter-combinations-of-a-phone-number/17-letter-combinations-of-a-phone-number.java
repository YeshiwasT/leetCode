class Solution {
           List<String> list=new ArrayList<>();
          Map<Integer,String> map=new HashMap<>();
        String kk="";

    public List<String> letterCombinations(String digits) {
        if(digits=="")return list;
      //  int num=Integer.parseInt(digits);
        char[] charDigits=digits.toCharArray();
        map.put(2,"abc");
        map.put(3,"def");
        map.put(4,"ghi");
        map.put(5,"jkl");
        map.put(6,"mno");
        map.put(7,"pqrs");
        map.put(8,"tuv");
        map.put(9,"wxyz");
           int[] nums=new int[charDigits.length];
        for(int i=0;i<charDigits.length;i++){
            nums[i]=Character.getNumericValue(charDigits[i]);
           // System.out.println(nums);
        }
        StringBuilder sb=new StringBuilder("");
        helper(nums,sb,nums.length-1,0);
        
        
        return list;
    }
    public void helper(int[] num,StringBuilder sb,int n,int len){
      //  if(len<0)return "";
        if(len>n){
           // n=len;
            return ;
        }
        
        String current=map.get(num[len]);
               System.out.println(current);

      //  int len=current.length();
        for(int i=0;i<current.length();i++){
                    
                        sb.append(current.charAt(i));
                                      //       System.out.println(sb.toString());
 if(sb.length()==num.length){
                         String str=sb.toString();
                         list.add(str);
                        sb. deleteCharAt(num.length-1);
                         

                     }
          //  if(sb.length()>num.length){return ;}
                          helper(num,sb,n,len+1);
            
            
                    
//            if(i==current.length()-1&&sb.length()>0){
//            sb.deleteCharAt(sb.length()-1);}
//return kk;

                       // sb. setLength(0);
 
                        
             
                        

  
        }
        System.out.println();
            if(sb.length()>0){                                                  sb.deleteCharAt(sb.length()-1);
  
                              }
        else{
            sb.setLength(0);
        }
            
        //System.out.println(sb.toString());
               //  helper(num,sb,n,len-1);

      //  helper(num,sb,n-1);
       // System.out.print(sb[n]);
                //System.out.print(num[n]);

    }
} 