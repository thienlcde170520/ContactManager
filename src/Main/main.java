package Main;

import controller.ContactManagement;
import model.Contact;

public class main {

    public static void main(String[] args) {
        Contact contact = new Contact();
        
        new ContactManagement(contact).run();
    }
    
}
