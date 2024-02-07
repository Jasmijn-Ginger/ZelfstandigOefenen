import java.util.ArrayList;
import java.util.List;

public class Lists {
//lijsten van de verschillende getallen, symbolen en letters + hun getters
    private final char[] listTinyLetters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private final char[] listBigLetters = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
    private final char[] listNumbers = "0123456789".toCharArray();
    private final char[] listSymbols = "-_*%$#@!&".toCharArray();

    public static List<char[]> alleLijsten = new ArrayList<>();


    public char[] getListTinyLetters(){
        return listTinyLetters;
    }

    public char[] getListBigLetters(){
        return listBigLetters;
    }

    public char[] getListNumbers() {
        return listNumbers;
    }

    public char[] getListSymbols() {
        return listSymbols;
    }

    //voegt alle 4 bestaande lijsten toe aan de hoofdlijst
    public void addAlleLijsten(){
        alleLijsten.add(getListTinyLetters());
        alleLijsten.add(getListBigLetters());
        alleLijsten.add(getListNumbers());
        alleLijsten.add(getListSymbols());
    }

    public List getAlleLijsten(){
        return alleLijsten;
    }


}
