

public class P9SudokuSolver {

    public static boolean isSafe(int sudoku[][],int row, int col,int digit){
        //col
        for(int i=0;i<=8;i++){
            if(sudoku[i][col]==digit){
                return false;
            }
        }

        //row
        for(int i=0;i<=8;i++){
            if(sudoku[row][i]==digit){
                return false;
            }
        }

        //grid
        int sr=(row/3)*3;
        int sc=(col/3)*3;

        for(int i=sr;i<sr+3;i++){
            for(int j=sc;j<sc+3;j++){
                if(sudoku[i][j]==digit){
                    return false;
                }
            }
        }

        return true;
    }
    
    public static boolean sudokuSolver(int sudoku[][],int row,int col){
        //base case
        if(row==9 ){
            return true;
        }

        //recursion
        int nextRow=row;
        int nextCol=col+1;
        if(col+1==9){
            nextRow=row+1;
            nextCol=0;
        }
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        for(int digit=1 ; digit<=9 ; digit++){
            
            if(isSafe(sudoku, row, col, digit)){
                sudoku[row][col]=digit;
                if(sudokuSolver(sudoku, nextRow, nextCol)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }

        return false;
    }

    public static void printSudoku(int sudoku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int sudoku[][]={  {7, 0, 0, 0, 0, 0, 2, 0, 0},   
        {4, 0, 2, 0, 0, 0, 0, 0, 3},   
        {0, 0, 0, 2, 0, 1, 0, 0, 0},   
        {3, 0, 0, 1, 8, 0, 0, 9, 7},   
        {0, 0, 9, 0, 7, 0, 6, 0, 0},   
        {6, 5, 0, 0, 3, 2, 0, 0, 1},   
        {0, 0, 0, 4, 0, 9, 0, 0, 0},   
        {5, 0, 0, 0, 0, 0, 1, 0, 6},   
        {0, 0, 6, 0, 0, 0, 0, 0, 8}   };


        System.out.println("Given Sudoku is");
        printSudoku(sudoku);

        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists for the given sudoku");
            printSudoku(sudoku);
        }else{
            System.out.println("Soln does not exist");
        }
    }
}
