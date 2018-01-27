package ru.mai.learning.telegram;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import static java.util.stream.Collectors.toMap;

public class FxRateService {
    private final ObjectMapper mapper = new ObjectMapper();
    private final AsyncHttpClient client = new DefaultAsyncHttpClient();

    public CompletableFuture<Map<String, Double>> load() {
        return client.prepareGet("https://www.cbr-xml-daily.ru/daily_json.js")
                .execute().toCompletableFuture()
                .thenApply(response -> parse(response.getResponseBody()));
    }

    private Map<String, Double> parse(String text) {
        try {
            return mapper.readValue(text, Daily.class).valute.entrySet().stream()
                    .collect(toMap(
                            e -> e.getKey().toLowerCase(),
                            e -> e.getValue().value
                    ));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class Daily {
        final Map<String, Cur> valute;

        @JsonCreator
        private Daily(@JsonProperty("Valute") Map<String, Cur> valute) {
            this.valute = valute;
        }
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    private static class Cur {
        final double value;

        @JsonCreator
        private Cur(@JsonProperty("Value") double value) {
            this.value = value;
        }
    }


}
