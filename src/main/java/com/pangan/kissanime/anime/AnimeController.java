package com.pangan.kissanime.anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AnimeController {

    @Autowired
    private AnimeService animeService;

    @GetMapping("/anime")
    public List<Anime> getAllAnime() {
        return animeService.getAllAnime();
    }

    @PostMapping("/anime")
    public void addNewAnime(@RequestBody Anime newAnime) {
        animeService.addNewAnime(newAnime);
    }

    @PutMapping("/anime/{id}")
    public void updateAnimeById(@PathVariable int id, @RequestBody Anime updatedAnime) {
        animeService.updateAnimeById(id, updatedAnime);
    }

    @DeleteMapping("/anime/{id}")
    public void deleteAnimeById(@PathVariable int id) {
        animeService.deleteAnimeById(id);
    }

}
