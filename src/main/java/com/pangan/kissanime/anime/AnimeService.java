package com.pangan.kissanime.anime;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimeService {

    private List<Anime> animeList = new ArrayList<Anime>();

    public List<Anime> getAllAnime() {
        if (animeList.isEmpty()) {
            Anime tempAnime = new Anime();
            tempAnime.setName("Temp Anime");
            tempAnime.setDescription("Description");

            String[] genre = new String[] {
                    "Temporary Genre"
            };
            tempAnime.setGenre(genre);

            animeList.add(tempAnime);
        }
        return animeList;
    }

    public void addNewAnime(Anime newAnime) {
        if (newAnime == null)
            throw new NullPointerException();

        animeList.add(newAnime);
    }

    public void updateAnimeById(int id, Anime updatedAnime) {
        if (updatedAnime == null)
            throw new NullPointerException();

        animeList.set(id, updatedAnime);
    }

    public void updateAnimeName(int id, String animeName) {
        animeList.get(id).setName(animeName);
    }

    public void deleteAnimeById(int id) {
        Anime deleteAnime = animeList.get(id);
        if (deleteAnime == null)
            throw new NullPointerException();

        animeList.remove(deleteAnime);
    }

}
