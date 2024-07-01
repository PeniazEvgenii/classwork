package leetCode;

public class IslandPerimeter {
    public static void main(String[] args) {
    int[][] ar = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
        System.out.println(islandPerimeter(ar));
    }
    public static int islandPerimeter(int[][] grid) {
        int countSquare = 0;
        int cross = 0;
        int[] dx = {0,  1, 0, -1};
        int[] dy = {-1, 0, 1, 0};
        int[][] grid2 = new int[grid.length + 2][grid[0].length + 2];
        for (int i = 0; i < grid2.length; i++) {
            for (int j = 0; j < grid2[i].length; j++) {
                if(i == 0 || j == 0  || i == grid2.length - 1 || j==grid2[i].length-1) {
                    grid2[i][j] = -1;
                    continue;
                }

                grid2[i][j] = grid[i - 1][j - 1];
            }
        }
        for (int[] ints : grid2) {
            for (int anInt : ints) {
                System.out.print(anInt);
            }
            System.out.println();
        }

        for (int i = 1; i < grid2.length - 1; i++) {
            for (int j = 1; j < grid2[i].length - 1; j++) {
                if(grid2[i][j] == 1) {
                    countSquare++;
                    for (int k = 0; k < 4; k++) {
                        if(grid2[i +dx[k]] [j + dy[k]] == 1) {
                            cross++;
                        }
                    }
                }
            }
        }
        System.out.println(countSquare);
        System.out.println(cross);

return countSquare * 4 - cross;

//        int count = 0;
//        int cross = 0;
//        int vertCross = 0;
//
//        for (int i = 0; i < grid.length; i++) {
//           int current = -1;
//           int previous = -1;
//            for (int j = 0; j < grid[i].length; j++) {
//                current = grid[i][j];
//                if(current == 1) {
//                    count++;
//                    if(current == previous){
//                        cross++;
//                    }
//                }
//                previous = current;
//
//            }
//        }
//        System.out.println(cross);
//        System.out.println(count);
//        return 0;
    }
}
