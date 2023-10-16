package com.promotional.service;

import com.promotional.service.dto.OfferDTO;
import java.util.Optional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * Service Interface for managing {@link com.promotional.domain.Offer}.
 */
public interface OfferService {
    /**
     * Save a offer.
     *
     * @param offerDTO the entity to save.
     * @return the persisted entity.
     */
    OfferDTO save(OfferDTO offerDTO);

    /**
     * Updates a offer.
     *
     * @param offerDTO the entity to update.
     * @return the persisted entity.
     */
    OfferDTO update(OfferDTO offerDTO);

    /**
     * Partially updates a offer.
     *
     * @param offerDTO the entity to update partially.
     * @return the persisted entity.
     */
    Optional<OfferDTO> partialUpdate(OfferDTO offerDTO);

    /**
     * Get all the offers.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    Page<OfferDTO> findAll(Pageable pageable);

    /**
     * Get the "id" offer.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    Optional<OfferDTO> findOne(Long id);

    /**
     * Delete the "id" offer.
     *
     * @param id the id of the entity.
     */
    void delete(Long id);
}
