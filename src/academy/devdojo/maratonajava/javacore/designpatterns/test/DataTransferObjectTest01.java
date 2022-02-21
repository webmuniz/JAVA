package academy.devdojo.maratonajava.javacore.designpatterns.test;

import academy.devdojo.maratonajava.javacore.designpatterns.domain.*;

public class DataTransferObjectTest01 {
    public static void main(String[] args) {
        Aircraft aircraft = new Aircraft("777");
        Country country = Country.BRAZIL;
        Currency currency = CurrencyFactory.newCurrency(country);
        final Person person = Person.PersonBuilder.builder()
                .firstName("Web")
                .lastName("Muniz")
                .build();

        final ReportDto reportDto = ReportDto.ReportDtoBuilder.builder()
                .aircraftName(aircraft.getName())
                .personName(person.getFirstName())
                .country(country)
                .currency(currency)
                .build();

        System.out.println(reportDto);
    }
}
