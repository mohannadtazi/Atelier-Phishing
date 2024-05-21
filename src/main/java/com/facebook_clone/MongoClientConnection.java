package com.facebook_clone;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;

public class MongoClientConnection{
        static String connectionString = "mongodb+srv://mohannadtazi:5CK62i678vBJsLlL@datasecuritydemo.iutuk8q.mongodb.net/?retryWrites=true&w=majority&appName=DataSecurityDemo";
       static MongoClient mongoClient = null;

        public static MongoDatabase getDB() {
            ServerApi serverApi = ServerApi.builder()
                    .version(ServerApiVersion.V1)
                    .build();
            MongoClientSettings settings = MongoClientSettings.builder()
                    .applyConnectionString(new ConnectionString(connectionString))
                    .serverApi(serverApi)
                    .build();
            mongoClient = MongoClients.create(settings);
            MongoDatabase database = mongoClient.getDatabase("credentials");
            return database;
        }



}