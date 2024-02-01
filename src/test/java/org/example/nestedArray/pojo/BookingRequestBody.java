package org.example.nestedArray.pojo;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class BookingRequestBody {
         /*
        {
        "firstname" : "Jim", "lastname" : "Brown", "totalprice" : 111, "depositpaid" : true,
        "bookingdates" : { "checkin" : "2018-01-01", "checkout" : "2019-01-01" }, "additionalneeds" : "Breakfast"
        }
        */

    private String firstname;
    private String lastname;
    private int totalprice;
    private boolean depositpaid;
    private String additionalneeds;
    private List<BookingdatesNestedArray> bookingdates;

}
