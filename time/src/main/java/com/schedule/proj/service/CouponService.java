package com.schedule.proj.service;


import com.schedule.proj.model.CheckDTO;
import com.schedule.proj.model.Check_in;
import com.schedule.proj.model.Coupon;
import com.schedule.proj.model.CouponDTO;
import com.schedule.proj.repository.Check_inRepository;
import com.schedule.proj.repository.CouponRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
@RequiredArgsConstructor
public class CouponService {

    private final CouponRepository  couponRepository;


    public void deleteCoupon(Integer id) {
        couponRepository.deleteById(id);
    }


    public double coupondiscount(CouponDTO dto) {
        Integer price = dto.getPrice();
        Integer disc = dto.getCouponId();
          if(couponRepository.findByCouponid(disc)==null)
              return -1;
          else{
              int arr[] ={10,50,60};
              int a = (int) ( Math.random() * 3 );
              int sale = arr[a];
              double finalprize = price * sale/100;
              return finalprize;
          }


    }
}