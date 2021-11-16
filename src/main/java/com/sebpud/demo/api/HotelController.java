package com.sebpud.demo.api;

import com.sebpud.demo.enitity.Hotel;
import com.sebpud.demo.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("addHotel")
    public ResponseEntity<Hotel> addHotel(@RequestBody Hotel hotel){
        return new ResponseEntity<>(hotelService.addHotel(hotel), HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<Hotel> getHotel(@PathVariable Long id){
        return new ResponseEntity<>(hotelService.getHotel(id), HttpStatus.OK);
    }

    @GetMapping({"hotels"})
    public ResponseEntity<List<Hotel>> getAllHotels(){
        return new ResponseEntity<>(hotelService.getAllHotels(), HttpStatus.OK);
    }

    @GetMapping({"hotels_sorted"})
    public ResponseEntity<List<Hotel>> getAllHotelsByRating(){
        return new ResponseEntity<>(hotelService.getAllHotelsByRating(), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Long> deleteHotel(@PathVariable Long id){
        return new ResponseEntity<>(hotelService.deleteHotel(id),HttpStatus.OK);
    }

}
