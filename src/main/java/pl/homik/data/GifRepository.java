package pl.homik.data;

import org.springframework.stereotype.Component;
import pl.homik.model.Gif;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Pawel on 2016-10-15.
 */


@Component
public class GifRepository {
    private static final List<Gif> ALL_GIFS = Arrays.asList(
            new Gif("android-explosion", "pawel", false),
            new Gif("ben-and-mike", "ola", false),
            new Gif("book-dominos", "ania", false),
            new Gif("compiler-bot", "monika", false),
            new Gif("cowboy-coder", "paulina", false),
            new Gif("infinite-andrew", "justyna", false),
            new Gif("ludzik", "wojtek", false)

    );

    public Gif findByName(String name) {
        for (Gif gif : ALL_GIFS) {
            if ( gif.getName().equals(name))
                return gif;
        }
//        prawidlowo by bylo wyrzucic wyjatek
        return null;
    }


}