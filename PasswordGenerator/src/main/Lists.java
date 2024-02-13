import java.util.ArrayList;
import java.util.List;

public class Lists {
//lijsten van de verschillende getallen, symbolen en letters + hun getters
    private static final char[] LIST_TINY_LETTERS = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private static final char[] LIST_BIG_LETTERS = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
    private static final char[] LIST_NUMBERS = "0123456789".toCharArray();
    private static final char[] LIST_SYMBOLS = "-_*%$#@!&".toCharArray();

    public static final List<char[]> ALLE_LIJSTEN = List.of(LIST_TINY_LETTERS, LIST_BIG_LETTERS, LIST_NUMBERS, LIST_SYMBOLS);


    public char[] getListTinyLetters(){
        return LIST_TINY_LETTERS;
    }

    public char[] getListBigLetters(){
        return LIST_BIG_LETTERS;
    }

    public char[] getListNumbers() {
        return LIST_NUMBERS;
    }

    public char[] getListSymbols() {
        return LIST_SYMBOLS;
    }


}
