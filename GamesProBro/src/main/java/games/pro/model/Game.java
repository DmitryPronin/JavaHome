package games.pro.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Game {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Long id;
    String articleGame;
    String codeGame;

    public Game() {
    }

    public Game(String articleGame, String codeGame) {
        this.articleGame = articleGame;
        this.codeGame = codeGame;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArticleGame() {
        return articleGame;
    }

    public void setArticleGame(String articleGame) {
        this.articleGame = articleGame;
    }

    public String getCodeGame() {
        return codeGame;
    }

    public void setCodeGame(String codeGame) {
        this.codeGame = codeGame;
    }
}
