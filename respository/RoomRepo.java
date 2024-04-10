package com.example.BetaModel.respository;

import com.example.BetaModel.model.Cinema;
import com.example.BetaModel.model.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepo extends JpaRepository<Room, Long> {
    List<Room> findByCinema(Cinema cinema);

}
