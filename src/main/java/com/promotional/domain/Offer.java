package com.promotional.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.io.Serializable;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A Offer.
 */
@Entity
@Table(name = "offer")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class Offer implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @NotNull
    @Size(min = 6)
    @Column(name = "offer_name", nullable = false)
    private String offerName;

    @NotNull
    @Min(value = 1)
    @Column(name = "orders_for_offer", nullable = false)
    private Integer ordersForOffer;

    @NotNull
    @Column(name = "complementary", nullable = false)
    private Integer complementary;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Offer id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOfferName() {
        return this.offerName;
    }

    public Offer offerName(String offerName) {
        this.setOfferName(offerName);
        return this;
    }

    public void setOfferName(String offerName) {
        this.offerName = offerName;
    }

    public Integer getOrdersForOffer() {
        return this.ordersForOffer;
    }

    public Offer ordersForOffer(Integer ordersForOffer) {
        this.setOrdersForOffer(ordersForOffer);
        return this;
    }

    public void setOrdersForOffer(Integer ordersForOffer) {
        this.ordersForOffer = ordersForOffer;
    }

    public Integer getComplementary() {
        return this.complementary;
    }

    public Offer complementary(Integer complementary) {
        this.setComplementary(complementary);
        return this;
    }

    public void setComplementary(Integer complementary) {
        this.complementary = complementary;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Offer)) {
            return false;
        }
        return getId() != null && getId().equals(((Offer) o).getId());
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Offer{" +
            "id=" + getId() +
            ", offerName='" + getOfferName() + "'" +
            ", ordersForOffer=" + getOrdersForOffer() +
            ", complementary=" + getComplementary() +
            "}";
    }
}
