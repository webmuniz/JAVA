package academy.devdojo.maratonajava.javacore.jdbc.test;

import academy.devdojo.maratonajava.javacore.jdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.jdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer studioDeen = Producer.builder().name("Studio Deen").build();
        Producer studioUpdate = Producer.builder().id(3).name("Akira").build();

        //ProducerService.insert(studioDeen);
        //ProducerService.delete(4);
        //ProducerService.update(studioUpdate);
        //ProducerService.findAll();
        //ProducerService.findByName("Kon");
        //ProducerService.showProducerMetadata();
        //ProducerService.showDriverMetadata();
        //ProducerService.showTypeScrollWroking();
        ProducerService.findByNameAndUpdateToUpperCase("konami");

//        log.info("INFO");
//        log.debug("DEBUG");
//        log.warn("WARN");
//        log.error("ERROR");
//        log.trace("TRACE");
    }
}
