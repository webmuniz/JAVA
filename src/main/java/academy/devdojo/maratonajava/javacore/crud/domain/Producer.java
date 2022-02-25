package academy.devdojo.maratonajava.javacore.crud.domain;

import lombok.Builder;
import lombok.Value;

@Value //Transform all in immutable
@Builder

public class Producer {
    Integer id;
    String name;
}
