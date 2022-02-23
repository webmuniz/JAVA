package academy.devdojo.maratonajava.javacore.jdbc.test;

import academy.devdojo.maratonajava.javacore.jdbc.domain.Producer;
import academy.devdojo.maratonajava.javacore.jdbc.repository.ProducerRepository;
import academy.devdojo.maratonajava.javacore.jdbc.service.ProducerService;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ConnectionFactoryTest {
    public static void main(String[] args) {
        Producer studioDeen = Producer.builder().name("Studio Deen").build();
        Producer studioUpdate = Producer.builder().id(3).name("AKIRA").build();

        //ProducerService.insert(studioDeen);
        //ProducerService.delete(13);
        //ProducerService.update(studioUpdate);
        //ProducerService.updatePreparedStatement(studioUpdate);
        //ProducerService.findAll();
        //ProducerService.findByName("Kon");
        //ProducerService.findByNamePreparedStatement("Ak");
        //ProducerService.showProducerMetadata();
        //ProducerService.showDriverMetadata();
        //ProducerService.showTypeScrollWroking();
        //ProducerService.findByNameAndUpdateToUpperCase("konami");
        //ProducerService.findByNameAndInsertWhenNotFound("Bones");
        //ProducerService.findByNameAndDelete("Bones");

        ProducerService.findByNameCallableStatement("MadHouse");

//        log.info("INFO");
//        log.debug("DEBUG");
//        log.warn("WARN");
//        log.error("ERROR");
//        log.trace("TRACE");
    }
}
