class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        List<Integer> list=new LinkedList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list.get(k-1);
    }
}