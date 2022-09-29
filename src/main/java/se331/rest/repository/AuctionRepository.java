package se331.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se331.rest.entity.AuctionItem;

import java.util.List;
@Repository
public interface AuctionRepository extends JpaRepository<AuctionItem,Long> {
    List<AuctionItem> findAll();

    Page<AuctionItem> findBySuccessfulBidAmountLessThan(Integer successfulBid, Pageable pageRequest);

    Page<AuctionItem> findByDescriptionContainingIgnoreCase(String description ,Pageable pageRequest);
}
