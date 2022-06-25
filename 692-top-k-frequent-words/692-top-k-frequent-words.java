class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
               map.replace(words[i],map.get(words[i])+1);
            }else{
                map.put(words[i],1);
            }
        }
             List<String> list = new ArrayList(map.keySet());
       
        Collections.sort(list, (w1, w2) -> map.get(w1).equals(map.get(w2)) ?
                w1.compareTo(w2) : map.get(w2) - map.get(w1));

        int i=0;
                     List<String> ans = new ArrayList<>();

      while(i<k){
                    ans.add(list.get(i));
          i++;
  
      }
        

        return ans;
    }
}