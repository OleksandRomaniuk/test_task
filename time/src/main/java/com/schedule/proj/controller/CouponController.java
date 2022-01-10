package com.schedule.proj.controller;



import com.schedule.proj.model.CheckDTO;
import com.schedule.proj.model.CouponDTO;
import com.schedule.proj.service.Check_inService;
import com.schedule.proj.service.CouponService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/Coupon")
public class CouponController {

    @Autowired
    CouponService couponService;

    @PostMapping("/ticket")
    public double saveticket(@RequestBody CouponDTO cuoDto) {
        try {
            return  couponService.coupondiscount(cuoDto);
        } catch (RuntimeException e) {
           return -1;
        }
    }
}


