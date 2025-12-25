package com.gaurav.project.airBnbApp.service;

import com.gaurav.project.airBnbApp.dto.RoomDto;
import com.gaurav.project.airBnbApp.entity.Room;

import java.util.List;

public interface RoomService {

    RoomDto createNewRoom(Long hotelId, RoomDto roomDto);

    List<RoomDto> getAllRoomsInHotel(Long hotelId);

    RoomDto getRoomById(Long roomId);

    void deleteRoomById(Long roomId);

    RoomDto updateRoomById(Long hotelId, Long roomId, RoomDto roomDto);
}
