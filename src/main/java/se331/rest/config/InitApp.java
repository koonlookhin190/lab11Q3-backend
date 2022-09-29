package se331.rest.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import se331.rest.entity.AuctionItem;
import se331.rest.entity.Bid;
import se331.rest.repository.AuctionRepository;
import se331.rest.repository.BidRepository;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

@Component
public class InitApp implements ApplicationListener<ApplicationReadyEvent> {
    @Autowired
    AuctionRepository auctionRepository;

    @Autowired
    BidRepository bidRepository;

    @Override
    public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
    Bid bid1,bid2,bid3,bid4,bid5;
    bid1 = bidRepository.save(Bid.builder()
            .amount(10)
            .dateTime(LocalDateTime.now())
            .build());
        bid2 = bidRepository.save(Bid.builder()
                .amount(10)
                        .dateTime(LocalDateTime.now())
                .build());
        bid3 = bidRepository.save(Bid.builder()
                .amount(10)
                .dateTime(LocalDateTime.now())
                .build());
        bid4 = bidRepository.save(Bid.builder()
                .amount(10)
                .dateTime(LocalDateTime.now())
                .build());
        bid5 = bidRepository.save(Bid.builder()
                .amount(10)
                .dateTime(LocalDateTime.now())
                .build());

        AuctionItem auctionItem;
        auctionItem = auctionRepository.save(
                AuctionItem.builder()
                        .description("Car")
                        .type("Sport")
                        .build()
        );
        auctionItem = auctionRepository.save(
                AuctionItem.builder()
                        .description("Car")
                        .type("Second hand")
                        .build()
        );
        auctionItem = auctionRepository.save(
                AuctionItem.builder()
                        .description("Car")
                        .type("Off road")
                        .build()
        );
        auctionItem = auctionRepository.save(
                AuctionItem.builder()
                        .description("Monitor")
                        .type("MSI")
                        .build()
        );
        auctionItem = auctionRepository.save(
                AuctionItem.builder()
                        .description("Monitor")
                        .type("Logitec")
                        .build()
        );
        auctionItem = auctionRepository.save(
                AuctionItem.builder()
                        .description("Toy")
                        .type("Lego")
                        .build()
        );
    }
}
