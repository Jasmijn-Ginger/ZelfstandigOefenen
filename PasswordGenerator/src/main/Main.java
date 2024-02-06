
public class Main {
    public static void main(String[] args) {
       Lists lists = new Lists();
        Loopdieloop loopdieloop = new Loopdieloop();
        lists.addAlleLijsten();

        loopdieloop.generatePassword(12, loopdieloop.randomMethod(lists.getAlleLijsten()), loopdieloop.randomMethod() );

    }
}
