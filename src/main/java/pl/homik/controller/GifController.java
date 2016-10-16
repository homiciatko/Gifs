package pl.homik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.homik.data.GifRepository;
import pl.homik.data.CategoryRepository;
import pl.homik.model.Category;
import pl.homik.model.Gif;

import java.util.List;

/**
 * Created by Pawel on 2016-10-15.
 */

// controlery sa odpowiedzialne za dany request

@Controller
public class GifController {

//    w tym wypadku, Bin sobie konfiguruje i utworzy nam zmienna gifRepository kiedy będzie jej potrzebował
    @Autowired
    private GifRepository gifRepository;


    @RequestMapping("/")  //ustawiamy sciezke responsa, tutaj jest glowny 'katalog'
//    @ResponseBody   // chcemy zwrocic jako stringa a nie jako stronę internetową
    public String listGifts(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.getAllGifs();
        modelMap.put("gifs", gifs);

        return "home";
    }

    @RequestMapping("/gif")
    public String gifDetails(ModelMap modelMap) {

//        wzorzec MVC
//        Gif gif = new Gif("compiler-bot", "gifHomika", true);
        Gif gif = gifRepository.findByName("compiler-bot");
        modelMap.put("gif", gif);

        return "gif-details";
    }

    @RequestMapping("/gif/{name}")
//    @PathVariable musi byc by name z argumentu przeniesc do findByName
    public String gifDetails2(@PathVariable String name , ModelMap modelMap) {

        Gif gif = gifRepository.findByName(name);
        Category category = CategoryRepository.findById(gif.getCategoryId());
        modelMap.put("gif", gif);
        modelMap.put("category", category);

        return "gif-details";
    }

    @RequestMapping("/favorites")
    public String getFavorites(ModelMap modelMap) {
        List<Gif> gifs = gifRepository.getFavorites();
        modelMap.put("gifs", gifs);

        return "favorites";
    }

    @RequestMapping("/category/{id}")
    public String getByCategories(ModelMap modelMap,@PathVariable int id) {
        List<Gif> gifs = gifRepository.getGifsByCategoryId(id);
        Category category = CategoryRepository.findById(id);  // <- dlaczego tutaj nie mogę użyc categoryRepository?

        modelMap.put("gifs", gifs);
        modelMap.put("category", category);

        return "category";
    }
}
