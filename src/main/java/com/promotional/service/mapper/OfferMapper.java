package com.promotional.service.mapper;

import com.promotional.domain.Offer;
import com.promotional.service.dto.OfferDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Offer} and its DTO {@link OfferDTO}.
 */
@Mapper(componentModel = "spring")
public interface OfferMapper extends EntityMapper<OfferDTO, Offer> {}
