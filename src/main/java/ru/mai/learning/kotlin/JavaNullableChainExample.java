package ru.mai.learning.kotlin;

public class JavaNullableChainExample {

    static class Recipient {
        Address address;
    }

    static class Address {
        Street street;
    }

    static class Street {
        String name;
    }

    static String getStreetNameOrDefault(Recipient recipient) {
        String def = "undefined";
        if (recipient == null) {
            return def;
        }
        Address address = recipient.address;
        if (address == null) {
            return def;
        }
        Street street = address.street;
        if (street == null) {
            return def;
        }
        String name = street.name;
        if (name == null) {
            return def;
        }
        return name;
    }

    public static void main(String[] args) {

    }

}
