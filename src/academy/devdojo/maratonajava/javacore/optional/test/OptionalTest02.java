package academy.devdojo.maratonajava.javacore.optional.test;

import academy.devdojo.maratonajava.javacore.optional.domain.Manga;
import academy.devdojo.maratonajava.javacore.optional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);

        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Drifters").orElse(new Manga(3, "Drifters", 20));
        Manga newManga2 = MangaRepository.findByTitle("DBZ").orElseGet(() -> new Manga(4, "DBZ", 800));

        System.out.println(newManga);
        System.out.println(newManga2);
    }
}
