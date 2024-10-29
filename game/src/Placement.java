import java.util.Scanner;
import battleship.user.validation.ShipPlacementValidator;

public class Placement {
    private Board board;
        ShipPlacementValidator shipPlacementValidator = new ShipPlacementValidator();

    public Placement(Board board) {
        this.board = board;
    }

    public void placeShips(){
        Scanner input = new Scanner(System.in);
        System.out.println("JUGADOR 1\nDigite el numero de la fila y la comuna de la posicion inicial del barco");
        board.printBoard();

        // the input of the row
        int fila1 = shipPlacementValidator.getRow();

        // the input of the column
        int column1 = shipPlacementValidator.getColumn();

        System.out.println("Ingrese 1 si desea el barco de forma horizontal\nIngrese 2 si desea el barco de forma vertical");
        int inclination1 = input.nextInt();
        input.nextLine();

        System.out.println("Ingrese A si desea el barco A\nIngrese B si desea el barco B\nIngrese C si desea el barco C\nIngrese D si desea el barco D\nIngrese E si desea el barco E");
        String ship1 = input.nextLine();

        board.placeShip(fila1,column1,inclination1,ship1);
        System.out.println("--------------------------------------------------");
        System.out.println("--------------------------------------------------");
        board.printBoard();
    }
}
