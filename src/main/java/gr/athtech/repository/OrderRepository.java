package gr.athtech.repository;

import gr.athtech.domain.Order;
import gr.athtech.transfer.KeyValue;
import gr.athtech.transfer.PurchasesAndCostPerCustomer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
//    @Query
//    Optional<Order> findWithAccount(Long id);
//
////    @Query
////    Optional<Order> findWithAllAssociations(Long id);
//
//    @Query
//    List<KeyValue<String, BigDecimal>> findAverageOrderCostPerCustomer();
//
//    @Query(value = "${}", nativeQuery = true)
//    List<PurchasesAndCostPerCustomer> findTotalNumberAndCostOfPurchasesPerCustomerCategory();
}
