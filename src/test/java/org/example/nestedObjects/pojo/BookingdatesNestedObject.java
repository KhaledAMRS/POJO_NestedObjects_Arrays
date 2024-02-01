package org.example.nestedObjects.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookingdatesNestedObject {
       /*
          {
          "firstname" : "Jim", "lastname" : "Brown", "totalprice" : 111, "depositpaid" : true,
          "bookingdates" : { "checkin" : "2018-01-01", "checkout" : "2019-01-01" }, "additionalneeds" : "Breakfast"
          }
          */

    private String checkin;
    private String checkout;


}
