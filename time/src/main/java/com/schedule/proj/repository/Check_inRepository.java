package com.schedule.proj.repository;



import com.schedule.proj.model.Check_in;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Check_inRepository extends JpaRepository<Check_in, Integer> {
    Check_in getByBaggageId(int id);
    Check_in getByBaggageIdAndAndDestinationId(int id,int id2);
}
