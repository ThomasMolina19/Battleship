public class Main {
    public static void main(String[] args) {

        Board board1 = new Board();
        Board board2 = new Board();



        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board1.board[i][j] + " ");
            }
            System.out.println();  // Salto de línea después de cada fila
        }

        board1.placeShip(6,3,1,"A");
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(board1.board[i][j] + " ");
            }
            System.out.println();  // Salto de línea después de cada fila
        }

    }
}