package gr.athtech.service;

import gr.athtech.domain.Store;
import gr.athtech.repository.StoreRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreServiceImplementation extends BaseServiceImplementation<Store> implements StoreService {
    private final StoreRepository storeRepository;


    public StoreServiceImplementation(StoreRepository storeRepository) {
        this.storeRepository = storeRepository;
    }

    @Override
    protected JpaRepository<Store, Long> getRepository() {
        return null;
    }

    @Override
    public Store findById(long Id) {
        return storeRepository.findById(Id);    }
}
