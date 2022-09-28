package com.iacsd.demo.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.Instant;

@Getter @Setter
@Entity
@Table(name = "CHECK_IN")
public class CheckIn extends BaseEntity {
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;
    @Column(name = "QUANTITY")
    private Long quantity;
    @Column(name = "UNIT")
    @Enumerated(EnumType.STRING)
    private Unit unit;
    @Column(name = "RATE")
    private Double rate;
    @Column(name = "RATE_UNIT")
    @Enumerated(EnumType.STRING)
    private Unit rateUnit;
    @Column(name = "CHECKED_IN_ON")
    private Instant checkedInOn;
    @Column(name = "EXP_ON")
    private Instant expireOn;
    @Column(name = "REMIND_BEFORE")
    private Integer remindBefore; //days
    @Column(name = "REPEAT_REMINDER")
    private Integer repeatReminder; //repeat in a day;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "ACCOUNT_ID")
    private Account account;
    
    @Column(name="remaining_qty")
    private Long remainingQuantity;
    
//    @Column(name="sent_count")
    @Column(name="sent_count",columnDefinition = "integer default 0")
    private Integer sentCount;



//    public String getExpireOn() {
////        Instant instant = Instant.now();
////        System.out.println(instant);
//        ZonedDateTime zonedDateTime = checkedInOn.atZone(ZoneId.of("Asia/Kolkata"));
//        System.out.println("ZonedDateTime : " + zonedDateTime);
////		DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
////		  .format(zoneDateTime));
////		System.out.println(
////				  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
////				  .format(zonedDateTime));
//
//        String dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
//                .format(zonedDateTime);
//        //System.out.println(dateTimeFormatter);
//        return dateTimeFormatter;
//    }

//    public String getCheckedInOn() {
////        Instant instant = Instant.now();
////        System.out.println(instant);
//        ZonedDateTime zonedDateTime = checkedInOn.atZone(ZoneId.of("Asia/Kolkata"));
//        System.out.println("ZonedDateTime : " + zonedDateTime);
////		DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
////		  .format(zoneDateTime));
////		System.out.println(
////				  DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
////				  .format(zonedDateTime));
//
//        String dateTimeFormatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
//                .format(zonedDateTime);
//        //System.out.println(dateTimeFormatter);
//        return dateTimeFormatter;
//    }

    //getCheckedInOn()


}
