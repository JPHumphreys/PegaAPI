package com.qa.Controllers;


import com.qa.Repositories.BoardGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.qa.Models.BoardGame;

import javax.persistence.ElementCollection;
import javax.persistence.FetchType;
import java.util.List;

@CrossOrigin
@RestController

public class BoardGameController {

    @Autowired
    @ElementCollection(fetch = FetchType.LAZY)
    private BoardGameRepository repository;

    @RequestMapping(value = "get/boardgame/all", method = RequestMethod.GET)
    public List<BoardGame> listAllBoardGames(){
        return repository.findAll();
    }

    @RequestMapping(value = "get/boardgame/byPlayerMin/{playerMin}", method = RequestMethod.GET)
    public List<BoardGame> getBoardGamesByPlayerMin(@PathVariable int playerMin ){
        return repository.findByPlayerMinLessThanEqual(playerMin);
    }

    @RequestMapping(value = "get/boardgame/byPlayerMax/{playerMax}", method = RequestMethod.GET)
    public List<BoardGame> getBoardGamesByPlayerMax(@PathVariable int playerMax){
        return repository.findByPlayerMaxGreaterThanEqual(playerMax);
    }

    @RequestMapping(value = "get/boardgame/byPrice/{price}", method = RequestMethod.GET)
    public List<BoardGame> getBoardGamesByPrice(@PathVariable float price){
        return repository.findAllByPriceLessThanEqual(price);
    }

    @RequestMapping(value = "get/boardgame/byTime/{time}", method = RequestMethod.GET)
    public List<BoardGame> getBoardGamesByTime(@PathVariable int time){
        return repository.findAllByTimeLessThanEqual(time);
    }

    @RequestMapping(value = "update/boardgame/{name}", method = RequestMethod.PUT)
    public BoardGame updateBoardGame(@PathVariable String name){
        BoardGame existing = repository.findOne(name);
        return repository.saveAndFlush(existing);
    }


}
