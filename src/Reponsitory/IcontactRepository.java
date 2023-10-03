/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reponsitory;

import java.util.ArrayList;
import java.util.List;
import model.Contact;

/**
 *
 * @author ASUS
 */
public interface IcontactRepository {
    void createContact(ArrayList<Contact> contacts);
    void deleteContactd(ArrayList<Contact> contacts); 
    void printAllContact(ArrayList<Contact> contacts);
}
