package pro.games.Model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "games")
@Getter
@Setter
@EqualsAndHashCode
@Builder
public class Game {
    private long id;
    private String articleGame;
    private double sizeGame;
    private int countFiles;
    private List<Folder> folders;

    public Game() {
    }

    public Game(long id, String articleGame, double sizeGame, int countFiles, List<Folder> folders) {
        this.id = id;
        this.articleGame = articleGame;
        this.sizeGame = sizeGame;
        this.countFiles = countFiles;
        this.folders = folders;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArticleGame() {
        return articleGame;
    }

    public void setArticleGame(String articleGame) {
        this.articleGame = articleGame;
    }

    public double getSizeGame() {
        return sizeGame;
    }

    public void setSizeGame(double sizeGame) {
        this.sizeGame = sizeGame;
    }

    public int getCountFiles() {
        return countFiles;
    }

    public void setCountFiles(int countFiles) {
        this.countFiles = countFiles;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }
}
