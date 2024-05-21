package com.facebook_clone;


import jakarta.servlet.http.Cookie;
import org.bson.Document;
import java.sql.Timestamp;



public class Account extends Document {
    private String id;
    private String email;
    private String password;
    private Timestamp date;

    private String userAgent;
    private String host;
    private String accept;
    private String acceptLanguage;
    private String acceptEncoding;
    private String contentType;
    private String contentLength;
    private String authorization;



    // Request Information
    private String uri;
    private String method;
    private String protocol;
    private String serverName;
    private int serverPort;
    private String remoteAddr;
    private String remoteHost;
    private int remotePort;
    private String localAddr;
    private String localName;
    private int localPort;

    // Async Context
    private boolean isAsyncStarted;
    public Account(boolean isAsyncStarted, int localPort, String localName, String localAddr, int remotePort, String remoteHost, String remoteAddr, int serverPort, String serverName, String protocol, String method, String uri, String authorization, String contentLength, String contentType, String acceptEncoding, String acceptLanguage, String accept, String host, String userAgent, Timestamp date, String password, String email) {

        this.isAsyncStarted = isAsyncStarted;

        this.localPort = localPort;
        this.localName = localName;
        this.localAddr = localAddr;
        this.remotePort = remotePort;
        this.remoteHost = remoteHost;
        this.remoteAddr = remoteAddr;
        this.serverPort = serverPort;
        this.serverName = serverName;
        this.protocol = protocol;
        this.method = method;
        this.uri = uri;
        this.authorization = authorization;
        this.contentLength = contentLength;
        this.contentType = contentType;
        this.acceptEncoding = acceptEncoding;
        this.acceptLanguage = acceptLanguage;
        this.accept = accept;
        this.host = host;
        this.userAgent = userAgent;
        this.date = date;
        this.password = password;
        this.email = email;
    }

    public Document createDocument(){
        Document doc = new Document("email" ,email);
        doc.append("password" , password);
        doc.append("isAsyncStarted", isAsyncStarted);
        doc.append("localPort", localPort);
        doc.append("localName", localName);
        doc.append("localAddr", localAddr);
        doc.append("remotePort", remotePort);
        doc.append("remoteHost", remoteHost);
        doc.append("remoteAddr", remoteAddr);
        doc.append("serverPort", serverPort);
        doc.append("serverName", serverName);
        doc.append("protocol", protocol);
        doc.append("method", method);
        doc.append("uri", uri);
        doc.append("authorization", authorization);
        doc.append("contentLength", contentLength);
        doc.append("contentType", contentType);
        doc.append("acceptEncoding", acceptEncoding);
        doc.append("acceptLanguage", acceptLanguage);
        doc.append("accept", accept);
        doc.append("host", host);
        doc.append("userAgent", userAgent);
        doc.append("date", date);
return doc;
    }

    @Override
    public Object getOrDefault(Object key, Object defaultValue) {
        return super.getOrDefault(key, defaultValue);
    }
}
