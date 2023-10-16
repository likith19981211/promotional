package com.promotional.service.dto;

import jakarta.validation.constraints.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * A DTO for the {@link com.promotional.domain.Offer} entity.
 */
@SuppressWarnings("common-java:DuplicatedBlocks")
public class OfferDTO implements Serializable {

    private Long id;

    @NotNull
    @Size(min = 6)
    private String offerName;

    @NotNull
    @Min(value = 1)
    private Integer ordersForOffer;

    @NotNull
    private Integer complementary;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOfferName() {
        return offerName;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public Integer getOrdersForOffer() {
        return ordersForOffer;
    }

    public void setOrdersForOffer(Integer ordersForOffer) {
        this.ordersForOffer = ordersForOffer;
    }

    public Integer getComplementary() {
        return complementary;
    }

    public void setComplementary(Integer complementary) {
        this.complementary = complementary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OfferDTO)) {
            return false;
        }

        OfferDTO offerDTO = (OfferDTO) o;
        if (this.id == null) {
            return false;
        }
        return Objects.equals(this.id, offerDTO.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "OfferDTO{" +
            "id=" + getId() +
            ", offerName='" + getOfferName() + "'" +
            ", ordersForOffer=" + getOrdersForOffer() +
            ", complementary=" + getComplementary() +
            "}";
    }
}
