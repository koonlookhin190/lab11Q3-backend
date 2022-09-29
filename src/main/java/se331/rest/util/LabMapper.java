package se331.rest.util;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import se331.rest.entity.AuctionItem;
import se331.rest.entity.AuctionItemDTO;

import java.util.List;

@Mapper
public interface LabMapper {
    LabMapper INSTANCE = Mappers.getMapper(LabMapper.class);

    AuctionItemDTO getAuctionDto(AuctionItem auctionItem);

    List<AuctionItemDTO> getAuctionDto(List<AuctionItem> auctionItems);
}
