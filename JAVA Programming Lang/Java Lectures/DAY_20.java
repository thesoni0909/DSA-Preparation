// Backtracking

public class DAY_20 {
    // change arrays
    static void bT_changeArr(int[] arr, int i){
        // base case
        if(i==arr.length){
            return;
        }
        // recursion work
        arr[i]=i+1;
        // recursive call
        bT_changeArr(arr, i+1);
        // backtracking
        arr[i]=arr[i]-2;
    }

    // find subsets...
    static void bT_str_SubSets(String Str, int si, StringBuilder subStr){
        // base case
        if(si>Str.length()-1){
            System.out.print(subStr+", ");
            return;
        }
        // recursion work
        // yes
        char ch = Str.charAt(si);
        subStr.append(ch);
        bT_str_SubSets(Str, si+1, subStr);
        // No
        subStr.deleteCharAt(subStr.length() - 1);
        bT_str_SubSets(Str, si+1, subStr);
    }

    // find permutations
    // using stringBuilder
    static void findPermutations(StringBuilder str, StringBuilder newStr){
    // Base Case: Agar original string empty ho gayi, matlab ek permutation mil gayi
    if (str.length() == 0) {
        System.out.println(newStr);
        return;
    }

    // Recursion Work: Har character ko ek-ek karke 'newStr' mein daalna hai
    for (int i = 0; i < str.length(); i++) {
        char currChar = str.charAt(i);

        // 1. Current char ko newStr mein add karo
        newStr.append(currChar);
        
        // 2. Us char ko original string se temporarily hata do
        str.deleteCharAt(i);

        // 3. Recursive call (baaki bache characters ke liye)
        findPermutations(str, newStr);

        // 4. Backtracking: Waapas original state mein laao
        // String mein character wapas daalo aur newStr se hatao
        str.insert(i, currChar);
        newStr.deleteCharAt(newStr.length() - 1);}
    }

    // using String
    static void findPermutations(String Str, String newStr){
        if(Str.length()==0){
            System.out.println(newStr);
            return;
        }
        for(int i=0; i<Str.length(); i++){
            char ch = Str.charAt(i);
            String newS = Str.substring(0, i)+Str.substring(i+1);
            findPermutations(newS, newStr+ch);
        }
    }

    // N Queens :
    static int count;
    static boolean nQueens(char chessBoard[][], int i){
        if(i==chessBoard.length){
            // count++;
            printBoard(chessBoard);
            return true;
        }
        // recursion work : har ek queens ko har ek column par bethana
            for(int j=0; j<chessBoard[0].length; j++){
            if(isSafe(chessBoard,i,j)){
                chessBoard[i][j]='Q';
                if(nQueens(chessBoard, i+1)){
                    return true;
                }
                // backtracking step
                chessBoard[i][j] = 'X';
            }
        }
        return false;
    }
    // checking that placing the queen into the cell is safe or not?
    static boolean isSafe(char chessBoard[][], int row, int col){
        // vertical check
        for(int i = row-1; i>=0; i--){
            if(chessBoard[i][col] == 'Q'){
                return false;
            }
        }

        // diagonal left
        for(int i = row-1, j = col-1; i>=0 && j>=0; i--,j--){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }

        // diagonal right
        for(int i = row-1, j = col+1; i>=0 && j<chessBoard.length; i--,j++){
            if(chessBoard[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    // printing chessboard
    static void printBoard(char chessBoard[][]){
        for(int i=0; i<chessBoard.length; i++){
            for(int j=0; j<chessBoard[0].length; j++){
                System.out.print(chessBoard[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------chessboard------------");
    }

    // Grid ways
    static int ways;
    static void gridWays(int grid[][], int row, int col){

        // 1st method
        // if(col == grid[0].length-1){
        //     ways++;
        //     return;
        // }
        // if(row == grid.length){
        //     return;
        // }
        // for(int i=col; i<grid[0].length; i++){
        //     col = i;
        //     gridWays(grid, row+1, col);
        // }

        // 2nd and valid method
        if(row == grid.length-1 && col == grid[0].length-1){
            ways++;
            return;
        }
        if(row == grid.length || col == grid[0].length){
            return;
        }
        gridWays(grid, row, col+1);
        gridWays(grid, row+1, col);
    }

    // 3rd and fastest method
    static void gridWays01(int n, int m){
        int total_moves = n+m-2;
        int rightTurns = m-1;
        int downTurns = n-1;
        long total_ways = calcFact(total_moves)/(calcFact(rightTurns)*calcFact(downTurns));
        System.out.println("The total ways for "+n+" x "+m+" Grid : "+total_ways);
    }

    // calculating factorial
    static long calcFact(int n){
        long fact = 1;
        for(int i=n; i>=1; i--){
            fact = fact*i;
        }
        return fact;
    }

    // sudoku
    static boolean sudokuSolver(int[][] sudoku, int row, int col){
        // jab ek row khatam ho jayega
        if(col == sudoku[0].length){
            return sudokuSolver(sudoku, row+1, 0);
        }
        // jab pura 9x9 grid khatam ho jayega
        if(row == sudoku.length){
            return true;
        }
        // jab cell fill hoga
        if(sudoku[row][col]!=0){
            return sudokuSolver(sudoku, row, col+1);
        }
        // jab cell fill nahi hoga
        for (int num = 1; num <= 9; num++) {
            if(isCorrect(num, sudoku, row, col)){
                sudoku[row][col] = num;
                if(sudokuSolver(sudoku, row, col+1)){
                    return true;
                }
                sudoku[row][col]=0;
            }
        }
        // agar kisi cell par 1 to 9 numbers fill nahi hue tho return false
        return false;
    }

    // check that a number can be placed on a specific cell?
    static boolean isCorrect(int num, int[][] sudoku, int i, int j){
        // column wise cell check
        for(int y=0; y<sudoku[0].length; y++){
            if(sudoku[i][y]==num){
                return false;
            }
        }
        // row wise cell check
        for(int x=0; x<sudoku.length; x++){
            if(sudoku[x][j]==num){
                return false;
            }
        }

        // 3x3 grid check
        int sr = (i/3)*3; int sc = (j/3)*3;
        for(int x=sr; x<sr+3; x++){
            for(int y=sc; y<sc+3; y++){
                if(sudoku[x][y]==num){
                    return false;
                }
            }
        }
        return true;
    }

    // print sudoku grid
    static void printSudokuGrid(int sudoku[][]){
        for(int i=0; i<sudoku.length; i++){
            for(int j=0; j<sudoku.length; j++){
                System.out.print(sudoku[i][j]+"  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        bT_changeArr(arr, 0);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        String Str = "abc";
        bT_str_SubSets(Str, 0, new StringBuilder(""));

        StringBuilder Str1 = new StringBuilder("abc");
        findPermutations(Str1, new StringBuilder(""));

        String Str2 = "abc";
        findPermutations(Str2, " ");

        char chessBoard[][] = new char[2][2];
        // initialize the chess board by filling 'X' into all cells of 2D array
        for(int i=0; i<chessBoard.length; i++){
            for(int j=0; j<chessBoard[0].length; j++){
                chessBoard[i][j]='X';
            }
        }
        if(nQueens(chessBoard, 0)){
            System.out.println("Solution is possible");
        }
        else{
            System.out.println("Solution is not possible");
        }
        System.out.println("No. of all possible solutions = "+count);

        int grid[][] = new int[1][5];
        gridWays(grid,0,0);
        System.out.println("Total paths : "+ways);

        gridWays01(2, 2);

        int[][] sudoku = {
                { 5, 3, 0, 0, 7, 0, 0, 1, 2 },
                { 6, 0, 2, 1, 9, 5, 3, 0, 8 },
                { 0, 9, 8, 3, 4, 2, 5, 6, 0 },
                { 8, 5, 9, 0, 6, 1, 4, 2, 3 },
                { 4, 2, 6, 8, 0, 3, 7, 9, 1 },
                { 7, 1, 3, 9, 2, 0, 8, 5, 6 },
                { 9, 6, 1, 5, 3, 7, 2, 0, 4 },
                { 2, 8, 7, 4, 1, 9, 0, 3, 5 },
                { 3, 4, 5, 2, 8, 6, 1, 7, 0 },
        };
        if(sudokuSolver(sudoku, 0, 0)){
            System.out.println("Solution exists.");
            printSudokuGrid(sudoku);
        }
        else{
            System.out.println("Solution does not exists.");
        }
    }
}
