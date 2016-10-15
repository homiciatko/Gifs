package pl.homik.data;

import org.springframework.stereotype.Component;
import pl.homik.model.Gif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Pawel on 2016-10-15.
 */


@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "pawel", false,1),
            new Gif("ben-and-mike", "ola", true, 2),
            new Gif("book-dominos", "ania", false, 3),
            new Gif("compiler-bot", "monika", true, 1),
            new Gif("cowboy-coder", "paulina", false, 2),
            new Gif("infinite-andrew", "justyna", true, 3),
            new Gif("ludzik", "wojtek", false, 1)

    );

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if ( gif.getName().equals(name))
                return gif;
        }
//        prawidlowo by bylo wyrzucic wyjatek
        return null;
    }

    public List<Gif> getAllGifs() {
        return ALL_GIFS;
    }

    public List<Gif> getFavorites() {
        List<Gif> gifs = new ArrayList<Gif>();
        for (Gif gif : ALL_GIFS) {
            if(gif.isFavorite())
                gifs.add(gif);
        }

        return gifs;
    }

}
