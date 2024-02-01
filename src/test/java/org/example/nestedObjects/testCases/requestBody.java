package org.example.nestedObjects.testCases;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.nestedObjects.pojo.BookingRequestBody;
import org.example.nestedObjects.pojo.BookingdatesNestedObject;

public class requestBody {

    public static void main(String[] args) {
        //request body
        /*
        {
        "firstname" : "Jim", "lastname" : "Brown", "totalprice" : 111, "depositpaid" : true,
        "bookingdates" : { "checkin" : "2018-01-01", "checkout" : "2019-01-01" }, "additionalneeds" : "Breakfast"
        }
        */

        BookingRequestBody bookingBody = new BookingRequestBody();
        bookingBody.setFirstname("khaled");
        bookingBody.setLastname("ashraf");
        bookingBody.setTotalprice(111);
        bookingBody.setDepositpaid(true);
        bookingBody.setAdditionalneeds("breakfast");

        BookingdatesNestedObject bookingdates = new BookingdatesNestedObject();
        bookingdates.setCheckin("2018-01-01");
        bookingdates.setCheckout("2019-01-01");

        bookingBody.setBookingdates(bookingdates);

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
