import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    private List<Customer> customers = new ArrayList<>();




    // neu Kunde anlegen (Name, Adresse, telefonnummer)

    public void addCustomer(Customer customer){

    }


    // Alle Kunden anzeigen ( alle gespeicherten Kunden in einer Liste ausgeben)

    public List<Customer> getAllCustomers(){
        return customers;
    }
}
