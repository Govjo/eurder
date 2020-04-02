package endpoints;

import com.eurder.service.items.ItemService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ItemController.BOOK_RESOURCE_PATH)
public class ItemController {
    public static final String BOOK_RESOURCE_PATH = "/books";
    private final Logger logger = LoggerFactory.getLogger(ItemController.class);
    private ItemService itemService;


    @Autowired
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

}
