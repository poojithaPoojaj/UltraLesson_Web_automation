package com.ultralesson.webautomations.webplayground.data.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.ultralesson.webautomations.webplayground.Recipe;
import com.ultralesson.webautomations.webplayground.e2e.Customer;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.yaml.snakeyaml.Yaml;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class DataMapperTests {
//    @Test
//    public void verifyThatCustomerWithActiveItemsInCartIsSourcedCorrectly() throws IOException {
//        CustomerDataClient customerDataClient = new CustomerDataClient("json");
//        Customer customerWithActiveItemsInCart = customerDataClient
//                .getValidCustomerOfType("customerWithActiveItemsInCart","json");
//
//        Assert.assertEquals(customerWithActiveItemsInCart.getEmail(), "abc@xyz.com");
//        Assert.assertEquals(customerWithActiveItemsInCart.getPassword(), "abc1234");
//    }
//
//    @Test
//    public void verifyThatCustomerWithSpringSaleCouponIsSourcedCorrectly() throws IOException {
//        CustomerDataClient customerDataClient = new CustomerDataClient("json");
//        Customer customerWithSpringSaleCoupon = customerDataClient
//                .getValidCustomerOfType("customerWithSpringSaleCoupon","json");
//
//        Assert.assertEquals(customerWithSpringSaleCoupon.getEmail(), "def@ijk.com");
//        Assert.assertEquals(customerWithSpringSaleCoupon.getPassword(), "def1234");
//    }
//    @Test
//    public void test() throws FileNotFoundException {
////        CustomerDataClient customerDataClient = new CustomerDataClient("yml");
////        Customer customerWithSpringSaleCoupon = customerDataClient
////                .getValidCustomerOfType("customerWithSpringSaleCoupon","yml");
////        System.out.println(customerWithSpringSaleCoupon);
//        Yaml yaml = new Yaml();
//        InputStream inputStream =
//                new FileInputStream("C:/Users/Eswari/IdeaProjects/UltaLessonWebAutomationProjects/src/main/resources/data_sets/customers/valid_customers.yml");
//
//
//
//        Map<String, Object> data = yaml.load(inputStream);
//
//        System.out.println("recipe = " + data);
//    }


}

