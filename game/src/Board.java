public class Board {
    public String[][] board = new String[10][10];

    public Board() {
        // Llenamos la primera fila con los números del 0 al 9
        for (int i = 0; i < 10; i++) {
            board[0][i] = String.valueOf(i);  // Llenar la fila 0
        }

        // Llenamos la primera columna con los números del 0 al 9
        for (int i = 0; i < 10; i++) {
            board[i][0] = String.valueOf(i);  // Llenar la columna 0
        }

        // Llenamos el resto del tablero con ceros (opcional)
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                board[i][j] = "O";
            }
        }
    }

    public void placeShip(int row, int col, int inclination, String ship) {
        if (inclination==1){
            // Llenamos el tablero con los barcos de forma Horizontal
            for (int i = 0; i < 3; i++) {
                board[row][col + i] = ship;  // Llenar la fila 0
            }
        }
        if (inclination==2){
            // Llenamos el tablero con los barcos de forma vertical
            for (int i = 0; i < 3; i++) {
                board[row + i][col] = ship;
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();  // Salto de línea después de cada fila
        }
    }

}
