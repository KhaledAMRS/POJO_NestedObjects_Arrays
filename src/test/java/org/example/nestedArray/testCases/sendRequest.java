package org.example.nestedArray.testCases;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.nestedArray.pojo.BookingRequestBody;
import org.example.nestedArray.pojo.BookingdatesNestedArray;

import java.util.ArrayList;
import java.util.List;

public class sendRequest {

    public static void main(String[] args) {
        //request body
        /*
        {
        "firstname" : "Jim", "lastname" : "Brown", "totalprice" : 111, "depositpaid" : true,
        "bookingdates" : [ { "checkin" : "2023-01-01", "checkout" : "2024-01-01" },{ "checkin" : "2023-02-01", "checkout" : "2024-02-01" }], "additionalneeds" : "Breakfast"
        }
        */

        BookingRequestBody bookingBody = new BookingRequestBody();
        bookingBody.setFirstname("khaled");
        bookingBody.setLastname("ashraf");
        bookingBody.setTotalprice(111);
        bookingBody.setDepositpaid(true);
        bookingBody.setAdditionalneeds("breakfast");

        BookingdatesNestedArray bookingdates1 = new BookingdatesNestedArray();
        bookingdates1.setCheckin("2023-01-01");
        bookingdates1.setCheckout("2024-01-01");

        BookingdatesNestedArray bookingdates2 = new BookingdatesNestedArray();
        bookingdates2.setCheckin("2023-02-01");
        bookingdates2.setCheckout("2024-02-01");

        List<BookingdatesNestedArray> allbookingdates = new ArrayList<>();
        allbookingdates.add(bookingdates1);
        allbookingdates.add(bookingdates2);

        bookingBody.setBookingdates(allbookingdates);

        ObjectMapper objectMapper =new ObjectMapper();
        String requestBody;
        try {
            requestBody = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(bookingBody);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        System.out.println("requestBody" + requestBody);

//        Map requestHeaders = new HashMap<>();
//        requestHeaders.put("Content-Type", "application/json");
//
//
//Response response = RestAssured
//        .given()
//        .log()
//        .all()
//        .baseUri("https://restful-booker.herokuapp.com/booking")
//        .headers(requestHeaders)
//        .body(requestBody)
//                .when()
//                .post();
//
//        System.out.println(response.getStatusCode());
//        response.getBody().prettyPrint();
    }

}
