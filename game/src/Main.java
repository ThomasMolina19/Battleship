import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Board board1 = new Board();
        Board board2 = new Board();
        Placement placement = new Placement(board1);
        int contador = 0;

        while (true) {
            placement.placeShips();
            contador++;
            if (contador == 5) {
                break;
            }
        }



    }
}