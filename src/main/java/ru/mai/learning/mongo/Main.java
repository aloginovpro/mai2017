package ru.mai.learning.mongo;

import com.mongodb.MongoClient;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.BsonDocument;
import org.bson.BsonString;
import org.bson.Document;

public class Main {

    public static void main(String[] args) {
        MongoClient mongoClient = new MongoClient("localhost" , 27017);
        MongoDatabase db = mongoClient.getDatabase("retargeting_service");
        MongoCollection<Document> collection = db.getCollection("alex");
        /*
        collection.insertOne(
                new Document()
                    .append("name", "bob")
                    .append("age", 99)
        );
        */
        FindIterable<Document> documents = collection.find(
                new BsonDocument()
                    .append("name", new BsonString("vasya"))
        );
        for (Document document : documents) {
            String text = document.get("name") + ": " + document.get("age");
            System.out.println(text);
        }
    }

}
