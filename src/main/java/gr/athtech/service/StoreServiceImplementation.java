package gr.athtech.service;

import gr.athtech.domain.Store;
import gr.athtech.repository.StoreRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StoreServiceImplementation extends BaseServiceImplementation<Store> implements StoreService {
    private final StoreRepository storeRepository;

    @Override
    protected JpaRepository<Store, Long> getRepository() {
        return storeRepository;
    }

    @Override
    public Store findById(long Id) {
        return storeRepository.findById(Id);
    }
}
