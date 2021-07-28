package cpu.dev.academy.exercises.task2.model;

import java.util.Objects;

public class Customer {
    private String name;
    private String contact;

    public Customer(String name, String contact) {
        this.name = name;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(contact, customer.contact);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, contact);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }
}
