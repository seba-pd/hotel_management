package com.sebpud.demo.service;

import com.sebpud.demo.exception.HotelNotFoundException;
import com.sebpud.demo.repository.HotelRepository;
import com.sebpud.demo.enitity.Hotel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    private HotelRepository hotelRepository;

    public Hotel addHotel(Hotel hotel){
        return hotelRepository.save(hotel);
    }

    public Long deleteHotel(Long id){
        hotelRepository.deleteById(id);
        return id;
    }

    public Hotel getHotel(Long id){

        Optional<Hotel> hotel =  hotelRepository.findById(id);

        if(hotel.isEmpty())
            throw new HotelNotFoundException();

        return hotel.get();
    }

    public List<Hotel> getAllHotels(){
       return hotelRepository.findAll();
    }


}
