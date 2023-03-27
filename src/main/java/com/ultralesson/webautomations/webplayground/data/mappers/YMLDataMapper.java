package com.ultralesson.webautomations.webplayground.data.mappers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.google.gson.Gson;
import com.google.gson.internal.LinkedTreeMap;
import com.ultralesson.webautomations.webplayground.e2e.Customer;
import lombok.Value;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class YMLDataMapper implements DataMapper {
    @Override
    public <T> T map(String file, String key, Class<T> tClass) throws FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {
            String content= Files.readString(Path.of("C:/Users/Eswari/IdeaProjects/UltaLessonWebAutomationProjects/src/main/resources/data_sets/customers/valid_customers.yml"));
//            String content = new String(Files.readAllBytes((Path) new FileReader(file)));

            // read from file
            System.out.println("Details" +mapper.readValue(content, tClass));

        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
return null;
    }
}


