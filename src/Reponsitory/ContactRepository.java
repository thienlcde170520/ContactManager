/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitory;

import java.util.ArrayList;
import java.util.List;
import model.Contact;
import DataAccess.contactDao;

/**
 *
 * @author ASUS
 */
public class ContactRepository implements IcontactRepository{
    private List<Contact> contacts;
    
    public ContactRepository(){
        this.contacts = new ArrayList();
        
    }
    
    @Override
    public void createContact(ArrayList<Contact> contacts) {
        contactDao.Instance().createContact(contacts);
    }

    @Override
    public void deleteContactd(ArrayList<Contact> contacts) {
        contactDao.Instance().deleteContactd(contacts);
    }
    
  
    @Override
    public void printAllContact(ArrayList<Contact> contacts) {
        contactDao.Instance().printAllContact(contacts);
    }

    
    
}
