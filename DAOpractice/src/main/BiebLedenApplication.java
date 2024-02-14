import java.util.Optional;

public class BiebLedenApplication {

    private static Dao<BiebLid> biebLidDao;

    public static void main(String[] args) {
        biebLidDao = new BiebLidDao();

        biebLidDao.getAll().forEach(biebLid -> System.out.println("lid: " + biebLid.getName()));


        BiebLid biebLid1 = getUser(0);
        System.out.println("simple printstatement: " + biebLid1);
        biebLidDao.update(biebLid1, new String[]{"Jake", "jake@domain.com"});

        biebLidDao.getAll().forEach(biebLid -> System.out.println("lid: " + biebLid.getName()));

        BiebLid biebLid2 = getUser(1);
        biebLidDao.delete(biebLid2);
        biebLidDao.save(new BiebLid("Julie", "julie@domain.com"));

        biebLidDao.getAll().forEach(biebLid -> System.out.println("bieblid: " + biebLid.getName()));

        //Todo waarom 2x Jake in terminal?
    }

    private static BiebLid getUser(long id) {
        Optional<BiebLid> user = biebLidDao.get(id);

        return user.orElseGet(
                () -> new BiebLid("non-existing user", "no-email"));
    }
}