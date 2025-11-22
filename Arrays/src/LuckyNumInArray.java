import java.util.ArrayList;
import java.util.List;

//lucky num = min in row and max in that col
public class LuckyNumInArray {
    public static void main(String[] args) {
        int[][] matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(FindLuckyNum(matrix));
    }
    static List<Integer> FindLuckyNum(int[][] matrix){
        List<Integer> list = new ArrayList<>();
        for(int row = 0; row< matrix.length ; row++){
            int minVal = matrix[row][0];
            int colIndex = 0;

            //finding the min element in each row first
            for(int col=1 ; col<matrix[0].length ; col++){
                if(matrix[row][col] < minVal){
                    minVal = matrix[row][col];
                    colIndex = col;
                }
            }

            //check in the col of the min val obtained from each row-> whether it is the max value or not
            boolean isLucky = true;
            for(int i=0 ; i< matrix.length ; i++){
                if(matrix[i][colIndex] > minVal) {
                    isLucky = false;
                    break;
                }
            }
            if(isLucky){list.add(minVal);}
        }
        return list;
    }
}
