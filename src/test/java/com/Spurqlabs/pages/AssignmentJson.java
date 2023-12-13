package com.Spurqlabs.pages;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class AssignmentJson {
    public static void main(String[] args) throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode rootNode = objectMapper.readTree(new File("src/test/resources/Assignment.json"));

        String firstname = rootNode.get("firstName").asText();
        System.out.println("Firstname is : " + firstname);

        String lastName = rootNode.get("lastName").asText();
        System.out.println("lastName is : " + lastName);

        String gender = rootNode.get("gender").asText();
        System.out.println("gender is : " + gender);

        String age = rootNode.get("age").asText();
        System.out.println("age is : " + age);

        JsonNode addressNode = rootNode.get("address");
        String streetAddressddr = addressNode.get("streetAddress").asText();
        System.out.println("Address details are: \n    streetAddress is: " + streetAddressddr);

        String city = addressNode.get("city").asText();
        System.out.println("    city is: " + city);

        String state = addressNode.get("state").asText();
        System.out.println("    state is: " + state);

        String postalCode = addressNode.get("postalCode").asText();
        System.out.println("    postalCode is: " + postalCode);

        JsonNode phoneNumberNode = rootNode.get("phoneNumbers");
        Iterator<JsonNode> element = phoneNumberNode.elements();

        while (element.hasNext()) {
            System.out.println("Type: " + element.next().get("type").asText());
        }
        Iterator<JsonNode> element1 = phoneNumberNode.elements();
        while(element1.hasNext()){
            System.out.println("Number: "+element1.next().get("number").asText());
        }


    }

}