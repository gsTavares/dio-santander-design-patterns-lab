package one.digitialinnovation.gof.facade;

import subsystemone.crm.CrmService;
import subsystemtwo.postalcode.PostalCodeApi;

public class Facade {
    
    public void migrateCustomer(String name, String cep) {
        String city = PostalCodeApi.getInstance().retrieveCity(cep);
        String state = PostalCodeApi.getInstance().retrieveState(cep);
        CrmService.createCustomer(name, cep, city, state);   
    }

}
