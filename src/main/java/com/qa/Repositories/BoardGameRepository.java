package com.qa.Repositories;

import com.qa.Models.BoardGame;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardGameRepository extends JpaRepository<BoardGame, String> {

    //returns all that has a player min equal or less than the value.
    List<BoardGame> findByPlayerMinLessThanEqual(int playerNum);
    //returns all that has a player max equal or greater than the value.
    List<BoardGame> findByPlayerMaxGreaterThanEqual(int playerNum);
    //returns all by price less than or equal to the value.
    List<BoardGame> findAllByPriceLessThanEqual(float price);
    //returns all by time less than or equal to the value.
    List<BoardGame> findAllByTimeLessThanEqual(int time);

}
