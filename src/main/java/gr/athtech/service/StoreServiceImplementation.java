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

    @Override
    public Store findByStoreName(String storeName) {
        return storeRepository.findByStoreName(storeName);
    }

//    @Override
//    public Store findByStoreCategoryStoreCategoryName(String storeCategoryName) {
//        System.out.println("----------------------------------------------------------------\n"+storeRepository.findByStoreName(storeCategoryName));
//        return storeRepository.findByStoreName(storeCategoryName);
//    }
}
