package pro.games.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.games.Model.Game;

public interface GameRepository extends JpaRepository<Game,Long>{
}
