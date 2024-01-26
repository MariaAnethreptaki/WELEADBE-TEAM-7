package gr.athtech.repository;

import gr.athtech.domain.Store;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StoreRepository  extends JpaRepository<Store, Long> {
    Store findById(long id);
}
