package subsystemtwo.postalcode;

public class PostalCodeApi {
    
    private static PostalCodeApi instance = new PostalCodeApi();

    private PostalCodeApi() {
        super();
    }

    public static PostalCodeApi getInstance() {
        return instance;
    }

    public String retrieveCity(String postalCode) {
        return "Fernandópolis";
    }

    public String retrieveState(String postalCode) {
        return "SP";
    }

}
