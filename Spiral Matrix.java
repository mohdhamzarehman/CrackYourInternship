class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow=0;
        int endRow=matrix.length-1;
        int startColumn=0;
        int endColumn=matrix[0].length-1;
        List<Integer> list=new ArrayList<>();
        while(startRow<=endRow&&startColumn<=endColumn){
            //first row
            for(int i=startColumn;i<=endColumn;i++){
                list.add(matrix[startRow][i]);
            }++startRow;
            //last column
            for(int i=startRow;i<=endRow;i++){
                list.add(matrix[i][endColumn]);
            }--endColumn;
            //last row
            if(startRow<=endRow){
                for(int i=endColumn;i>=startColumn;i--){
                list.add(matrix[endRow][i]);
                }--endRow;
            }
            //first column
            if(startColumn<=endColumn){
                for(int i=endRow;i>=startRow;i--){
                list.add(matrix[i][startColumn]);
                }++startColumn;
            }   
        }
        return list;
    }
}
