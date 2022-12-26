package com.pangan.kissanime.anime;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AnimeRepository extends JpaRepository<Anime, Integer> {
    List<Anime> searchAnimeByName(String searchAnimeName);
}
