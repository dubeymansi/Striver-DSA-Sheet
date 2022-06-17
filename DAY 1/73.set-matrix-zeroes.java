import java.util.ArrayList;

/*
 * @lc app=leetcode id=73 lang=java
 *
 * [73] Set Matrix Zeroes
 */

// @lc code=start
// class Pair{
//     int i,j;
//     Pair(int i, int j)
//     {
//         this.i=i;
//         this.j=j;

//     }
// }
// class Solution {
//     public void setZeroes(int[][] matrix) {
//         ArrayList<Pair> a=new ArrayList<>();
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j=0;j<matrix[0].length;j++)
//             {
//                 if(matrix[i][j]==0)
//                 {
//                    a.add(new Pair(i,j));
//                 }
//             }
//         }
//         for(Pair one:a)
//         {
//             for(int i=0;i<matrix.length;i++)
//             {
//                 matrix[i][one.j]=0;
//             }
//             for(int j=0;j<matrix[0].length;j++)
//             {
//                 matrix[one.i][j]=0;
//             }
//         }
//     }
// }

// class Solution {
//     public void setZeroes(int[][] matrix) {
//         int m = matrix.length;
//         int n = matrix[0].length;
//         boolean[][] arr = new boolean[m][n];
        
//         for(int i = 0 ; i < m ; i++){
//             for(int j = 0 ; j < n ; j++){
//                 if(matrix[i][j] == 0){
//                     arr[i][j] = true;
//                 }
//             }
//         }
//         for(int i = 0 ; i < m ; i++){
//             for(int j = 0 ; j < n ; j++){
//                 if(arr[i][j] == true){
//                     helperRow(matrix , i , n);
//                     helperColumn(matrix , j, m);
//                 }
//             }
//         }
//     }
//     public static void helperRow(int[][] matrix, int row, int n){
//             for(int i = 0; i < n ; i++){
//                 matrix[row][i] = 0;
//             }
//         }
//     public static void helperColumn(int[][] matrix, int column, int m){
//             for(int i = 0; i < m ; i++){
//                 matrix[i][column] = 0;
//             }
//         } 
// }

class Solution {
    public void setZeroes(int[][] matrix) {
//         int checkrows[]=new int[matrix.length];
//         int checkcols[]=new int[matrix[0].length];
//         Arrays.fill(checkrows,1);
//         Arrays.fill(checkcols,1);
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j=0;j<matrix[0].length;j++)
//             {
//                 if(matrix[i][j]==0)
//                 {
//                     checkrows[i]=0;
//                     checkcols[j]=0;
//                 }
//             }
//         }
//         for(int i=0;i<matrix.length;i++)
//         {
//             for(int j=0;j<matrix[0].length;j++)
//             {
//                 if(checkrows[i]==0 || checkcols[j]==0)
//                     matrix[i][j]=0;
//             }
//         }
        
//     }
// }


boolean zerorow=false;
        boolean zerocol=false;
        for(int i=0;i<matrix.length;i++)
        {
            if(matrix[i][0]==0)
            {
            zerocol=true;
                break;
            }
            
        }
        for(int j=0;j<matrix[0].length;j++)
        {
            if(matrix[0][j]==0)
            {
                zerorow=true;
                break;
            }
        }
        for(int i=1;i<matrix.length;i++)
        {
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[i][0]=0;
                    matrix[0][j]=0;
                }
            }
        }
        for(int i=1;i<matrix.length;i++){
            for(int j=1;j<matrix[0].length;j++)
            {
                if(matrix[i][0]==0 || matrix[0][j]==0)
                    matrix[i][j]=0;
            }
        }
        if(zerorow)
        {
            for(int j=0;j<matrix[0].length;j++)
                matrix[0][j]=0;
        }
        if(zerocol)
        {
            for(int i=0;i<matrix.length;i++)
                matrix[i][0]=0;
        }}
        
        }
        



// // @lc code=end

