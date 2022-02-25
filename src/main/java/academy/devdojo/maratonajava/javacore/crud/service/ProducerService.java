package academy.devdojo.maratonajava.javacore.crud.service;

import academy.devdojo.maratonajava.javacore.crud.domain.Producer;
import academy.devdojo.maratonajava.javacore.crud.repository.ProducerRepository;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class ProducerService {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void menu(int op) {
        switch (op) {
            case 1 -> findByName();
            case 2 -> delete();
            case 3 -> save();
            case 4 -> update();
            default -> throw new IllegalArgumentException("Not a valid option");
        }
    }

    private static void findByName() {
        System.out.println("Type the name or empty to all:");
        String name = SCANNER.nextLine();
        List<Producer> producers = ProducerRepository.findByName(name);
        producers.forEach(p -> System.out.printf(" %d | %s%n", p.getId(), p.getName()));
    }

    private static void delete() {
        findByName();
        System.out.println("Type one of the IDs below to delete");
        final int id = Integer.parseInt(SCANNER.nextLine());
        ProducerRepository.delete(id);
        System.out.println("Are you sure? [Y/N]");
        String choice = SCANNER.nextLine();
        if ("y".equalsIgnoreCase(choice)) {
            ProducerRepository.delete(id);
        }
    }

    private static void save() {

        System.out.println("Type the name of producer");
        String name = SCANNER.nextLine();
        Producer producer = Producer.builder().name(name).build();
        ProducerRepository.save(producer);
    }

    private static void update() {
        System.out.println("Type the id of the object you want to update");
        final Optional<Producer> producerOptional = ProducerRepository.findById(Integer.parseInt(SCANNER.nextLine()));
        if (producerOptional.isEmpty()) {
            System.out.println("Producer not found");
        }
        Producer producerFromDb = producerOptional.get();
        System.out.println("Type the new name or enter to keep the same");
        String name = SCANNER.nextLine();
        name = name.isEmpty() ? producerFromDb.getName() : name;
        final Producer producerToUpdate = Producer.builder()
                .id(producerFromDb.getId())
                .name(name)
                .build();
        ProducerRepository.update(producerToUpdate);
    }
}
