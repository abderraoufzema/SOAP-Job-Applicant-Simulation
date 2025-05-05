package com.example.client;

import com.example.job.JobApplicationService;
import com.example.job.JobApplicationServiceImplService;

public class JobApplicationClient {
    public static void main(String[] args) {
        JobApplicationServiceImplService service = new JobApplicationServiceImplService();
        JobApplicationService port = service.getJobApplicationServiceImplPort();

        String response = port.submitApplication("Rauf", "rauf@example.com", "Java SOAP Developer.");
        System.out.println("Response from service: " + response);
    }
}
