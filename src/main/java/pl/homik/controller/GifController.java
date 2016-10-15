package pl.homik.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Pawel on 2016-10-15.
 */

// controlery sa odpowiedzialne za dany request

@Controller
public class GifController {

    @RequestMapping("/")  //ustawiamy sciezke responsa, tutaj jest glowny 'katalog'
//    @ResponseBody   // chcemy zwrocic jako stringa a nie jako stronę internetową
    public String listGifts() {
        return "home";
    }
}
