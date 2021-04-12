package HW_09042021.Enum;

public class LetterPositionPrinter {
    public static void main(String[] args) {
        new Scan().readLetterAndPrintItsPosition();
        new Position().getLetterPosition(Alphabet.D);
        new Position().getLetterPosition(Alphabet.L);
        new Position().getLetterPosition(Alphabet.J);
    }
}
