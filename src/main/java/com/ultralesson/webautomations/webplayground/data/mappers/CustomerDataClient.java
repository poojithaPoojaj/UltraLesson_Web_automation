package com.ultralesson.webautomations.webplayground.data.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.ultralesson.webautomations.webplayground.e2e.Customer;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class CustomerDataClient extends DataClient{


    public CustomerDataClient(String formatType) {
        super(formatType);
    }

    public Customer getValidCustomerOfType(String key, String formatType) throws IOException {
//        if(formatType.equalsIgnoreCase("json")) {
//            String filePath = getFilePath("customers/valid_customers.json");
//            return dataMapper.map(filePath, key, Customer.class);
//        }
        String filePath = "C:/Users/Eswari/IdeaProjects/UltaLessonWebAutomationProjects/src/main/resources/data_sets/customers/valid_customers.yml";
        Yaml yaml = new Yaml();
        InputStream inputStream =
                new FileInputStream(filePath);
        System.out.println(yaml.loadAs(inputStream,key.getClass()));
//        Customer customer = yaml.loadAs(inputStream,Customer.class);
//        System.out.println("recipe = " + customer.getEmail()+" "+customer.getPassword());
        return null;
    }
}
