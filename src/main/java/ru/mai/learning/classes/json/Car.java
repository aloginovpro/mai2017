package ru.mai.learning.classes.json;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import java.io.IOException;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {

    static ObjectMapper mapper = new ObjectMapper()
            .enable(SerializationFeature.INDENT_OUTPUT)
            .setSerializationInclusion(JsonInclude.Include.NON_NULL);

    @JsonProperty("price")
    public final int price;
    @JsonProperty("max_speed")
    public final int maxSpeed;
    @JsonProperty("brand")
    public final String brand;

    @JsonCreator
    public Car(
            @JsonProperty("price") int price,
            @JsonProperty("max_speed") int maxSpeed,
            @JsonProperty("brand") String brand
    ) {
        this.price = price;
        this.maxSpeed = maxSpeed;
        this.brand = brand;
    }


    public static void main(String[] args) throws IOException {
        String input = "{\n" +
                "  \"price\" : 500,\n" +
                "  \"max_speed\" : 120,\n" +
                "  \"brand\" : \"Lada\"\n" +
                "}";

        Car car = mapper.readValue(input, Car.class);
    }

    public static void main2(String[] args) throws JsonProcessingException {
        Car car = new Car(500, 120, "Lada");

        String sCar = mapper.writeValueAsString(car);
        System.out.println(sCar);

    }

}
