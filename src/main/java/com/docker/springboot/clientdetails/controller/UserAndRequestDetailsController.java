package com.docker.springboot.clientdetails.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/api")
@Tag(name = "Request Details", description = "Fetch client request information")

public class UserAndRequestDetailsController {
    private static final Logger logger = LoggerFactory.getLogger(UserAndRequestDetailsController.class);
		 
		
	    @GetMapping("/request-info")
	    @Operation(summary = "Get request details", description = "Returns IP address, headers, and other request details")
	    public Map<String, String> getRequestDetails(HttpServletRequest request) {
	        Map<String, String> details = new HashMap<>();

	        details.put("IP Address", request.getRemoteAddr());
	        details.put("User-Agent", request.getHeader("User-Agent"));
	        details.put("Host", request.getHeader("Host"));
	        details.put("Referer", request.getHeader("Referer"));
	        details.put("Accept-Language", request.getHeader("Accept-Language"));
	        int iterate = 299;
	        for(int i=0;i<iterate;i++) {
	        	logger.info("addin log with number"+i);
	        }
	        return details;
	    }

}
