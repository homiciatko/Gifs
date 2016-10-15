package pl.homik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.homik.data.CategoryRepository;
import pl.homik.model.Category;

import java.util.List;

/**
 * Created by Pawel on 2016-10-15.
 */

@Controller
public class CategoryControler {

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping("/categories")
    public String listCategories(ModelMap modelMap) {
        List<Category> categories = categoryRepository.getAllCategories();
        modelMap.put("categories", categories);

        return "categories";
    }
}
