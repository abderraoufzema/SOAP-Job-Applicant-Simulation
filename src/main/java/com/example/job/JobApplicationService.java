package com.example.job;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface JobApplicationService {
    @WebMethod
    String submitApplication(String name, String email, String resumeText);
}
