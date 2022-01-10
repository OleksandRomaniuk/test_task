package com.schedule.proj.repository;




import com.schedule.proj.model.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponRepository extends JpaRepository<Coupon, Integer> {
   Coupon findByCouponid(int id);
}
