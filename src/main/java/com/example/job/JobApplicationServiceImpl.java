package com.example.job;

import jakarta.jws.WebService;

@WebService(endpointInterface = "com.example.job.JobApplicationService")
public class JobApplicationServiceImpl implements JobApplicationService {
    @Override
    public String submitApplication(String name, String email, String resumeText) {
        System.out.println("Received application from: " + name);
        return "Application received for " + name + " (" + email + ")";
    }
}
