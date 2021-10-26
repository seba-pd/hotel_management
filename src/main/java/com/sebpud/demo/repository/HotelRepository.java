package com.sebpud.demo.repository;

import com.sebpud.demo.enitity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {

    void deleteById(Long id);
}
