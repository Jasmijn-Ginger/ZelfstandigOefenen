import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class BiebLidDao implements Dao<BiebLid> {

    private List<BiebLid> biebLeden = new ArrayList<>();

    public BiebLidDao() {
        biebLeden.add(new BiebLid("John", "john@domain.com"));
        biebLeden.add(new BiebLid("Susan", "susan@domain.com"));
    }

    @Override
    public Optional<BiebLid> get(long id) {
        return Optional.ofNullable(biebLeden.get((int) id));
    }

    @Override
    public List<BiebLid> getAll() {
        return biebLeden;
    }

    @Override
    public void save(BiebLid biebLid) {
        biebLeden.add(biebLid);
    }

    @Override
    public void update(BiebLid biebLid, String[] params) {
        biebLid.setName(Objects.requireNonNull(
                params[0], "Name cannot be null"));
        biebLid.setEmail(Objects.requireNonNull(
                params[1], "Email cannot be null"));

        biebLeden.add(biebLid);
    }

    @Override
    public void delete(BiebLid biebLid) {
        biebLeden.remove(biebLid);
    }
}