package ru.mai.learning.kotlin;

import java.util.Optional;

public class JavaOptionalChainExample {

    static class Recipient {
        Optional<Address> address;
    }

    static class Address {
        Optional<Street> street;
    }

    static class Street {
        Optional<String> name;
    }

    static String getStreetNameOrDefault(Optional<Recipient> recipient) {
        return recipient
                .flatMap(r -> r.address)
                .flatMap(a -> a.street)
                .flatMap(s -> s.name)
                .orElse("undefined");
    }

}
