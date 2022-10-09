import java.util.Scanner;

public interface Player {
    Value getValue();

    Square chooseSquare(Value[][] board);

}
