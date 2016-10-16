package pl.homik.data;

import org.springframework.stereotype.Component;
import pl.homik.model.Category;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Pawel on 2016-10-15.
 */

@Component
public class CategoryRepository {

    public static final List<Category> ALL_CATEGORIES = Arrays.asList(
            new Category(1, "funny"),
            new Category(2, "sport"),
            new Category(3, "it")
    );

    public static List<Category> getAllCategories() {
        return ALL_CATEGORIES;
    }
//    Spring Data moze to nam wygenerować za darmo

    public static Category findById(int id) {
        for (Category category : ALL_CATEGORIES) {
            if ( category.getId() == id)
                return category;
        }
        return null;
    }
}
