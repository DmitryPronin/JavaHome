package games.pro.controller;

import games.pro.model.Game;
import games.pro.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class MainController {
    @Autowired
    private GameRepository gameRepository;


    @GetMapping(value = "/all")
    public String allGames(Map <String, Object> model){
        Iterable <Game> games = gameRepository.findAll();
        model.put("games", games);
        return "games";
    }
    @PostMapping(value = "/all")
    public String addGame(@RequestParam String articleGame,
            @RequestParam String codeGame,
            Map <String, Object> model){
        Game game = new Game(articleGame,codeGame);
//        game.setArticleGame();
//        game.setCodeGame(codeGame);
        gameRepository.save(game);
        Iterable <Game> games = gameRepository.findAll();
        model.put("games", games);
        return "games";
    }



}
