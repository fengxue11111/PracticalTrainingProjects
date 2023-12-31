package com.freecoder.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Integer orderID;
    private String restID;
    private Integer tableID;
    private String costumerID;
//    private LocalDateTime orderTime;
    private String orderTime;
    private Integer orderUse;
    private double orderPrice;
    private Integer isVIP;
    private Integer orderStatus;
    private String orderRemark;

}
