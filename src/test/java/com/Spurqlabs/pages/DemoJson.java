package com.Spurqlabs.pages;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.source.tree.WhileLoopTree;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;

public class DemoJson {
    public static void main(String[] args) throws IOException {

            ObjectMapper objectMapper = new ObjectMapper();
            JsonNode rootNode =objectMapper.readTree(new File("src/test/resources/DemoJSON.json"));

            JsonNode quizNode =rootNode.get("quiz");
           // String Q1 =rootNode.get("q1").asText();

            JsonNode q1Node =quizNode.get("q1");
            String element1=q1Node.get("question").asText();
            System.out.println(element1);

            JsonNode optionsNode= q1Node.get("options");
            Iterator<JsonNode> iterator= optionsNode.elements();

            while(iterator.hasNext()){
                String element = iterator.next().asText();
                System.out.println("options: " +element);
            }

            JsonNode subjectNode3 =quizNode.get("q1");
             String answer=subjectNode3.get("answer").asText();
             System.out.println("Answer is:- " +answer);

        }
    }

