package pl.trawa.currency.currency.dtos;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRawValue;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

//json w postaci obiektu


@Data
public class CourseDto {

    private String currency;
    private String code;
    private List<MidDto> rates;

//    @Data
//    public static class RateDto {
//        private  MidDto rate;

//    }

    @Data
    public static class MidDto {
        //@JsonProperty(value ="0")
        private String effectiveDate;
        private String no;
        private double mid;


    }

    List<MidDto> midDtos = new ArrayList<>();


}
