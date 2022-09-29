package se331.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se331.rest.entity.Bid;
@Repository
public interface BidRepository extends JpaRepository<Bid,Long> {
}
