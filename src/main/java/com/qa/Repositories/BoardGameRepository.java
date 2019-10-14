package com.qa.Repositories;

import com.qa.Models.BoardGame;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardGameRepository extends JpaRepository<BoardGame, String> {

}
