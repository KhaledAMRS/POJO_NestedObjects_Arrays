package org.example.Array.testCases;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.Array.pojo.WishlistRequestBody;

public class sendRequest {


    public static void main(String[] args) {

        WishlistRequestBody wishlistrequestbody = new WishlistRequestBody();
        String items [] = new String[]{"SRS-XP700"};
        wishlistrequestbody.setItems(items);

        ObjectMapper objectMapper =new ObjectMapper();
        String requestBody;
        try {
        requestBody = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(wishlistrequestbody);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("requestBody        " + requestBody);

    }

}
