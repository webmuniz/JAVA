package academy.devdojo.maratonajava.javacore.enumeration.domain;

public enum TypeClient {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALUE;
    private final String typeReport;

    TypeClient(int value, String typeReport) {
        this.VALUE = value;
        this.typeReport = typeReport;
    }

    public static TypeClient typeClientToNameReport(String nameReport) {
        for (TypeClient typeClient : values()) {
            if (typeClient.getTypeReport().equals(nameReport)) {
                return typeClient;
            }
        }
        return null;

    }

    public int getVALUE() {
        return VALUE;
    }

    public String getTypeReport() {
        return typeReport;
    }
}
