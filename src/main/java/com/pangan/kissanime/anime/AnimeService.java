package com.pangan.kissanime.anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimeService {

    private List<Anime> animeList = new ArrayList<Anime>();

    @Autowired
    private AnimeRepository animeRepository;

    public List<Anime> getAllAnime() {
        if (animeRepository.findAll().isEmpty()) {
            Anime tempAnime = new Anime();
            tempAnime.setName("Temp Anime");
            tempAnime.setDescription("Description");

            String[] genre = new String[] {
                    "Temporary Genre"
            };
            tempAnime.setGenre(genre);

            animeRepository.save(tempAnime);
        }
//        return animeList;
        return animeRepository.findAll();
    }

    public void addNewAnime(Anime newAnime) {
        if (newAnime == null)
            throw new NullPointerException();

//        animeList.add(newAnime);
        animeRepository.save(newAnime);
    }

    public void updateAnimeById(int id, Anime updatedAnime) {
        if (updatedAnime == null)
            throw new NullPointerException();

//        animeList.set(id, updatedAnime);
        Anime prevAnime = animeRepository.findById(id).orElseThrow(() -> new NullPointerException());
        prevAnime.setName(updatedAnime.getName());
        prevAnime.setGenre(updatedAnime.getGenre());
        prevAnime.setDescription(updatedAnime.getDescription());
        animeRepository.save(prevAnime);
    }

    public void updateAnimeName(int id, String animeName) {
//        animeList.get(id).setName(animeName);
        animeRepository
                .findById(id)
                .orElseThrow(() -> new NullPointerException())
                .setName(animeName);
    }

    public void deleteAnimeById(int id) {
        Anime deleteAnime = animeList.get(id);
        if (deleteAnime == null)
            throw new NullPointerException();

//        animeList.remove(deleteAnime);
        animeRepository.delete(deleteAnime);
    }

}
