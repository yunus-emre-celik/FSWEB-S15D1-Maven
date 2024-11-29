package org.example;

import org.example.mobile.Contact;
import org.example.mobile.MobilePhone;
import org.example.models.Grocery;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MobilePhone mobilePhone = new MobilePhone("33333",new ArrayList<>());
        mobilePhone.addNewContact(new Contact("yunus","12213123"));
    }
}
