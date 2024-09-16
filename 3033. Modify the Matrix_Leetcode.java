/*
Given a 0-indexed m x n integer matrix matrix, create a new 0-indexed matrix called answer. Make answer equal to matrix, then replace each element with the value -1 with the maximum element in its respective column.

Return the matrix answer.

 

Example 1:


Input: matrix = [[1,2,-1],[4,-1,6],[7,8,9]]
Output: [[1,2,9],[4,8,6],[7,8,9]]
Explanation: The diagram above shows the elements that are changed (in blue).
- We replace the value in the cell [1][1] with the maximum value in the column 1, that is 8.
- We replace the value in the cell [0][2] with the maximum value in the column 2, that is 9.
Example 2:


Input: matrix = [[3,-1],[5,2]]
Output: [[3,2],[5,2]]
Explanation: The diagram above shows the elements that are changed (in blue).
*/

class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int answer[][]=new int[matrix.length][matrix[0].length];
        int i=0,j=0,max=0;
        while(i<matrix.length){
            if(matrix[i][j]>0){
                answer[i][j]=matrix[i][j];
            }

            if(matrix[i][j]== -1){
                for(int k=0;k<matrix.length;k++){
                    if(matrix[k][j]>max){
                        max=matrix[k][j];
                    }
                }
                answer[i][j]=max;
                max=0;
            }

            j++;
            if(j==matrix[0].length){
                j=0;
                i++;
            }
        }


        return answer;
    }
}
