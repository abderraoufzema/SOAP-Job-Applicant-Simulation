package com.example.job;

import jakarta.xml.ws.Endpoint;

public class JobApplicationPublisher {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/jobapp", new JobApplicationServiceImpl());
        System.out.println("SOAP Web Service running at http://localhost:8080/jobapp?wsdl");
    }
}
