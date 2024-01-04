package gr.codelearn.spring.showcase.app.repository;

import gr.codelearn.spring.showcase.app.model.Category;
import main.domain.Account;
import main.repository.BaseRepository;
import  org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends BaseRepository<Account, Long> {

}
