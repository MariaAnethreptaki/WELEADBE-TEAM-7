package gr.athtech.repository;


import gr.athtech.domain.Account;


import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends BaseRepository<Account, Long> {

}
