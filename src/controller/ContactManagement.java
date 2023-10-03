package controller;

import Reponsitory.ContactRepository;
import Reponsitory.IcontactRepository;
import common.Library;
import java.util.ArrayList;
import model.Contact;

import view.Menu;

public class ContactManagement extends Menu<String>{
    static String[] mc = {"Add a contact", "Display all contacts", "Delete a contact", "Exit"};
    ArrayList<Contact> contacts = new ArrayList<>();
    
    private IcontactRepository contactRepository;
    
    public ContactManagement(Contact contact) {
        super("Contact Management Program", mc);
        contactRepository = new ContactRepository();
    }

  
    
    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                contactRepository.createContact(contacts);
                break;
            case 2:
                contactRepository.printAllContact(contacts);
                break;
            case 3:                            
                contactRepository.deleteContactd(contacts);            
                break;

            case 4:
                System.out.println("Exit the program successfully!");
                System.exit(0);
                break;
        }
    }   
    

}
