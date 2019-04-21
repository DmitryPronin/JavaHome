package games.pro.repository;

import games.pro.model.Game;

import org.springframework.data.repository.CrudRepository;


public interface GameRepository extends CrudRepository <Game, Long> {
}
