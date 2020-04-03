package item;

import org.springframework.stereotype.Repository;
import user.exception.InputCanNotBeNullException;

import java.util.concurrent.ConcurrentHashMap;

@Repository
public class ItemRepository {

    private final ConcurrentHashMap<String, Item> itemDatabase;

    public ItemRepository(ConcurrentHashMap<String, Item> itemDatabase) {
        this.itemDatabase = new ConcurrentHashMap<>();
    }

    public Item addItem(Item item) {
        checkIfInputNull(item);

        return item;
    }

    public static <T> void checkIfInputNull(T input) {
        if (input == null) {
            throw new InputCanNotBeNullException();
        }
    }

}
