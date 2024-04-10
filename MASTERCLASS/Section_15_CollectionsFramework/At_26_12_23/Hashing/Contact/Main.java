package MASTERCLASS.Section_15_CollectionsFramework.At_26_12_23.Hashing.Contact;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println("Hash code for " + s + " = " + s.hashCode());

        List<Contact> emails = ContactData.getData("email");
        List<Contact> phones = ContactData.getData("phone");
        printData("Phone List", phones);
        printData("Email List", emails);

        Set<Contact> emailContacts = new HashSet<>(emails);
        Set<Contact> phoneContacts = new HashSet<>(phones);

        printData("Phone List", phoneContacts);
        printData("Email List", emailContacts);

        int idx = emails.indexOf(new Contact("Robin Hood"));
        Contact robin = emails.get(idx);
        robin.addEmail("Sherwood Forest");
        System.out.println(robin);robin.addEmail("Sherwood Forest");
        System.out.println(robin);
    }

    public static void printData(String header, Collection<Contact> contacts) {
        System.out.println("-".repeat(30));
        System.out.println(header);
        System.out.println("-".repeat(30));
        contacts.forEach(System.out::println);
    }
}
