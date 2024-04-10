package MASTERCLASS.Section_15_CollectionsFramework.At_26_12_23.Hashing.Contact;

import java.util.HashSet;
import java.util.Set;

public class Contact {
    private String name;
    private Set<String> emails = new HashSet<>();
    private Set<String> phones = new HashSet<>();

    public Contact(String name) {
        this(name, null);
    }

    public Contact(String name, String email) {
        this(name, email, 0);
    }

    public Contact(String name, long phone) {
        this(name, null, phone);
    }

    public Contact (String name, String email, long phone) {
        this.name = name;
        if (email != null) emails.add(email);
        if (phone > 0) phones.add("+91 " + String.valueOf(phone));
    }

    public String getName() {
        return name;
    }

    public Contact mergeContactData(Contact contact) {
        this.emails.addAll(contact.emails);
        this.phones.addAll(contact.phones);
        return this;
    }

    @Override
    public String toString() {
        return "%s: %s %s".formatted(name, emails, phones);
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contact contact = (Contact) obj;
        return getName().equals(contact.getName());
    }

    public void addEmail(String companyName) {
        String[] names = name.split(" ");
        String email = "%c%s@%s.com".formatted(name.charAt(0), names[names.length - 1], companyName.replaceAll(" ", "").toLowerCase());
        if(!emails.add(email)) {
            System.out.println("Email already present");
        } else {
            System.out.println("Email added successfully");
        }
    }
}
