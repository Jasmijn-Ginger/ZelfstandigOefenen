import java.util.ArrayList;
import java.util.List;

public class Lists {
//lijsten van de verschillende getallen, symbolen en letters + hun getters
    private final char[] listTinyLetters = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    private final char[] listBigLetters = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
    private final char[] listNumbers = "123456789".toCharArray();
    private final char[] listSymbols = "-_*%$#@!&".toCharArray();

    private List alleLijsten = new ArrayList<>();


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
