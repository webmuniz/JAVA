package academy.devdojo.maratonajava.javacore.dates.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        Map<String, String> shortIDs = ZoneId.SHORT_IDS;
        System.out.println(shortIDs);

        System.out.println("Zona do sistema: " + ZoneId.systemDefault());

        ZoneId tokioZone = ZoneId.of("Asia/Tokyo");
        System.out.println(tokioZone);

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Agora: " + now);

        ZonedDateTime zonedDateTime = now.atZone(tokioZone);
        System.out.println("Em Tokio: " + zonedDateTime);

        Instant nowInstant = Instant.now();
        System.out.println("Zulu Time: " + nowInstant);
        ZonedDateTime zonedDateTime1 = nowInstant.atZone(tokioZone);
        System.out.println("Em Tokio a partir da ZuluTime: " + zonedDateTime1);

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX);

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTime = now.atOffset(offsetManaus);
        System.out.println("Em Manaus: "+offsetDateTime);

        OffsetDateTime offsetDateTime1 = OffsetDateTime.of(now, offsetManaus);
        System.out.println("Em Manaus: "+offsetDateTime1);

        OffsetDateTime offsetDateTime2 = nowInstant.atOffset(offsetManaus);
        System.out.println("Em Manaus [Já setado]: "+offsetDateTime2);

        JapaneseDate japaneseDate = JapaneseDate.from(LocalDateTime.now());
        System.out.println(japaneseDate);
        LocalDate localDateJapan = LocalDate.of(1900, 2, 1);
        final JapaneseDate japaneseDateEra = JapaneseDate.from(localDateJapan);
        System.out.println(japaneseDateEra);
    }
}
