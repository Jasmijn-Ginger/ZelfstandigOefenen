import java.util.List;

public interface DAO <T>{

    void save(T t);
    void update(T t, String[] param);
    void delete(T t);

    List<T> getAll();
}
