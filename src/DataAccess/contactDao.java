/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataAccess;

/**
 *
 * @author ASUS
 */
import model.Contact;
import common.Library;
import java.util.ArrayList;

public class contactDao {
    private Library libray;
    public contactDao(){
    libray = new Library();
    }
    private static contactDao instance = null;
    public static contactDao Instance(){
        if(instance == null){
            synchronized (contactDao.class){
                if(instance == null){
                    instance = new  contactDao();
                }
            }
        }
        return instance;
    }
    
    
    
    public void createContact(ArrayList<Contact> contacts) {      
        int i = 1;
        
        while (true) {
            int contactId = i++;
            System.out.print("Enter first name: ");
            String firstName = libray.inputString();
            System.out.print("Enter last name: ");
            String lastName = libray.inputString();
            System.out.print("Enter group: ");
            String group = libray.inputString();
            System.out.print("Enter address: ");
            String address = libray.inputString();
            System.out.print("Enter phone: ");
            String phone = libray.inputPhone();

            Contact c = new Contact(contactId, firstName + lastName, group, address, phone, firstName, lastName);
            if (libray.checkIdExist(contacts, contactId)) {
                contacts.add(c);
            System.err.println("Create success!");
            }

                System.out.print("Do you want to create more students (Y/N): ");
            if (!libray.inputYesNo()) {
                return;
            }
            
        }
    }
    public void printAllContact(ArrayList<Contact> contacts) {
        System.out.println("------------------------------- Display all list ---------------------------------");
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        //print infomation of contact from first to last list contact
        for (Contact contact : contacts) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getContactId(), contact.getFullName(),
                    contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }
    
    //allow user delete contact
    public void deleteContactd(ArrayList<Contact> contacts) {
        System.out.print("Enter id: ");
        int idDelete = libray.inputInt();
        Contact contactDelete = getContactById(contacts, idDelete);
        if (contactDelete == null) {
            System.err.println("Not found contact.");
            return;
        } else {
            contacts.remove(contactDelete);
        }
        System.err.println("Delete successful.");
    }
    
    public Contact getContactById(ArrayList<Contact> contacts, int idDelete) {
        for (Contact contact : contacts) {
            if (contact.getContactId() == idDelete) {
                return contact;
            }
        }
        return null;
    }
    
}
