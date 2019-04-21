package pro.games.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pro.games.Model.Folder;

public interface FolderRepository extends JpaRepository <Folder,Long>{
}
