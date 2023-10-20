package subsystemone.crm;

public class CrmService {
    
    private CrmService() {
        super();
    }

    public static void createCustomer(String name, String postalCode, String city, String state) {
        System.out.println("Customer created on CRM system!");
        System.out.println(name);
        System.out.println(postalCode);
        System.out.println(city);
        System.out.println(state);
    }

}
