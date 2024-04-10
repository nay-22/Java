package LeetCode.Warmup;

public class CountNegatives {
    public static void countNegatives(int[][] grid) {
        int i = 0;
        int j = grid.length - 1;
        int count = 0;
        while(i < grid.length && j >=0) {
            if(grid[i][j] < 0) {
                count += (grid.length - i);
                System.out.println("-".repeat(30));
                System.out.println("Row = " + i);
                System.out.println("Column = " + j);
                System.out.println("Element = " + grid[i][j]);
                System.out.println("Count = " + count);
                j--;
            } else if(grid[i][j] >= 0) {
                System.out.println("-".repeat(30));
                System.out.println("Row = " + i);
                System.out.println("Column = " + j);
                System.out.println("Element = " + grid[i][j]);
                System.out.println("Count = " + count);
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] grid = {{4,3,2,-1},{3,2,1,-1},{1,1,-1,-2},{-1,-1,-2,-3}};
        countNegatives(grid);

    }

}