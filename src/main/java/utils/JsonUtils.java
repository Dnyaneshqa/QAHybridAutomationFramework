package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonUtils {
    private static final String PATH = "src/main/resources/testdata/";

    public static JsonNode getJson(String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        try {
            return mapper.readTree(new File(PATH + fileName));
        } catch (IOException e) {
            throw new RuntimeException("Error reading JSON file: " + fileName, e);
        }
    }
}
