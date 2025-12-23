package LearnBackTracking;

import java.util.ArrayList;

public class Maze {
    public static void main(String[] args) {

        //System.out.println(countPath(3,3));

      /*  printPath("",3,3);
        System.out.println(path("",3,3));*/

       /* System.out.println(countDiagonalPaths(3,3));
        printDiagonalPaths("",3,3);*/

        boolean[][] board =  {
            {true, true, true},
            {true, false, true},
            {true, true, true}
        };
       pathRestrictions("",board,0,0);
    }

    public static int countPath(int row, int col){
        if (row==1 || col ==1){
            return 1;
        }


        int left = countPath(row,col-1);
        int right = countPath(row-1,col);

        return left+right;
    }

    public static void printPath(String str, int row , int col){
        if (row==1 && col==1){
            System.out.println(str);
            return;
        }

        if (row >1){
            printPath(str +"D",row-1,col);
        }

        if (col >1){
            printPath(str +"R",row,col-1);
        }
    }

    public static ArrayList<String> path(String str, int row, int col){
        if (row==1 && col==1){
            ArrayList<String> list = new ArrayList<>();
            list.add(str);
            return list;
        }

        ArrayList<String> list = new ArrayList<>();

        if (row >1){
            list.addAll(path(str + 'D',row-1,col ));
        }

        if (col >1){
            list.addAll(path(str +"R",row,col-1));
        }

        return list;
    }

    public static int countDiagonalPaths(int row, int col){
        if (row==1 || col ==1){
            return 1;
        }

        int left =countDiagonalPaths(row-1,col);
        int right = countDiagonalPaths(row,col-1);
        int dia = countDiagonalPaths(row-1,col-1);
        return  left+right+dia;

    }

    public static void printDiagonalPaths(String str,int row, int col){
        if (row==1 && col==1){
            System.out.println(str);
            return;
        }

        if (row >1 && col >1){
            printDiagonalPaths(str + "Dia",row-1,col-1);
        }

        if (row >1 ){
            printDiagonalPaths(str + "Down",row-1,col);
        }
        if (col >1){
            printDiagonalPaths(str + "RIGHT",row,col-1);
        }
    }

    public static void  pathRestrictions(String p,boolean[][] maze, int row, int col){
        if (row== maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }

        if (!maze[row][col]){
            return;
        }

        if (row < maze.length-1){
            pathRestrictions(p + "D",maze,row+1,col);

        }

        if (col < maze[0].length-1){
            pathRestrictions(p + "L",maze,row,col+1);

        }
    }

}
