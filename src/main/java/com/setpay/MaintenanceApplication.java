package com.setpay;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@EnableAutoConfiguration
@RestController
public class MaintenanceApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MaintenanceApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(MaintenanceApplication.class, args);
    }


    @Value("#{systemEnvironment['MAINTENANCE_CODE']}")
    private String MAINTENANCE_CODE="503";

    @Value("#{systemEnvironment['MAINTENANCE_MESSAGE']}")
    private String MAINTENANCE_MESSAGE="We are in maintenance mode, please give us some time and try again later";

    @CrossOrigin
    @RequestMapping(value = "/**", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public MaintenanceMessage handleGetRequest(){
        MaintenanceMessage response= new MaintenanceMessage(MAINTENANCE_MESSAGE,MAINTENANCE_CODE);
        return response;

    }

    @CrossOrigin
    @RequestMapping(value = "/**", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public MaintenanceMessage handlePostRequest(){
        MaintenanceMessage response= new MaintenanceMessage(MAINTENANCE_MESSAGE,MAINTENANCE_CODE);
        return response;

    }
    @CrossOrigin
    @RequestMapping(value = "/**", method = RequestMethod.PUT)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public MaintenanceMessage handlePutRequest(){
        MaintenanceMessage response= new MaintenanceMessage(MAINTENANCE_MESSAGE,MAINTENANCE_CODE);
        return response;

    }

    @CrossOrigin
    @RequestMapping(value = "/**", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.SERVICE_UNAVAILABLE)
    public MaintenanceMessage handleDeleteRequest(){
        MaintenanceMessage response= new MaintenanceMessage(MAINTENANCE_MESSAGE,MAINTENANCE_CODE);
        return response;

    }


    public String getMAINTENANCE_MESSAGE() {
        return MAINTENANCE_MESSAGE;
    }

    public void setMAINTENANCE_MESSAGE(String MAINTENANCE_MESSAGE) {
        this.MAINTENANCE_MESSAGE = MAINTENANCE_MESSAGE;
    }

    public String getMAINTENANCE_CODE() {
        return MAINTENANCE_CODE;
    }

    public void setMAINTENANCE_CODE(String MAINTENANCE_CODE) {
        this.MAINTENANCE_CODE = MAINTENANCE_CODE;
    }


}
