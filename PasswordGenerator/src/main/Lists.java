import java.util.List;

public class Lists {
//lijsten van de verschillende getallen, symbolen en letters + hun getters
    public static final char[] LIST_TINY_LETTERS = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    public static final char[] LIST_BIG_LETTERS = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
    public static final char[] LIST_NUMBERS = "0123456789".toCharArray();
    public static final char[] LIST_SYMBOLS = "-_*%$#@!&".toCharArray();

    public static final List<char[]> ALLE_LIJSTEN = List.of(LIST_TINY_LETTERS, LIST_BIG_LETTERS, LIST_NUMBERS, LIST_SYMBOLS);



}
