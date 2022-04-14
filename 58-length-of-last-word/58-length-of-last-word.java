class Solution {
    public int lengthOfLastWord(String s) {
        String[] sArr=s.split(" ");
        List<String> list=new ArrayList<>();
        for(int i=0;i<sArr.length;i++){
            if(!sArr[i].equals(" ")){
                list.add(sArr[i]);
            }
        }
        
        return list.get(list.size()-1).length();
    }
}