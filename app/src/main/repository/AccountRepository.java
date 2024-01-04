package main.repository;


import main.domain.Account;


import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends BaseRepository<Account, Long> {

}
