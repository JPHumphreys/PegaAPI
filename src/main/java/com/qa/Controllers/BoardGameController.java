package com.qa.Controllers;


import com.qa.Repositories.BoardGameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.qa.Models.BoardGame;

import javax.persistence.ElementCollection;
import javax.persistence.FetchType;

@CrossOrigin
@RestController

public class BoardGameController {

    @Autowired
    @ElementCollection(fetch = FetchType.LAZY)
    private BoardGameRepository repository;




}
