package com.schedule.proj.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CouponDTO {


    private Integer couponId;

    public Integer getCouponId() {
        return couponId;
    }

    public Integer getPrice() {
        return price;
    }

    private Integer price;



}
