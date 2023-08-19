
import java.io.*;
import java.util.StringTokenizer;


public class Main {
    static int[][] sudoku;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        sudoku = new int[9][9];
        for(int i=0; i<9; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            for(int j=0; j<9; j++){
                sudoku[i][j] = Integer.parseInt(st.nextToken());
            }
        }


        solve(0, 0);
    }

    private static void solve(int row, int column) {

        if(column == 9){
            solve(row+1, 0);
            return;
        }

        if(row == 9){
            for(int i=0; i<9; i++){
                for(int j=0; j<9; j++){
                    System.out.print(sudoku[i][j]+" ");
                }
                System.out.println();
            }
            System.exit(0);
        }

        if(sudoku[row][column] == 0){
            for(int i=1; i<=9; i++){
                if(search(row,column,i)){
                    sudoku[row][column] = i;
                    solve(row, column+1);
                };
            }
            sudoku[row][column] = 0;
            return;
        }
        solve(row, column+1);
    }

    private static boolean search(int row,int column, int value) {
        for(int i=0; i<9; i++){
            if(sudoku[row][i] == value){
                return false;
            }
        }

        for(int i=0; i<9; i++){
            if(sudoku[i][column] == value){
                return false;
            }
        }

        int r = (row / 3) * 3;
        int c = (column / 3) * 3;
        for(int i=r; i<r+3; i++){
            for(int j=c; j<c+3; j++){
                if(sudoku[i][j] == value){
                    return false;
                }
            }
        }
        return true;
    }
}