import React, { useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import { Button, Row, Col } from 'reactstrap';
import { Translate } from 'react-jhipster';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import { useAppDispatch, useAppSelector } from 'app/config/store';

import { getEntity } from './offer.reducer';

export const OfferDetail = () => {
  const dispatch = useAppDispatch();

  const { id } = useParams<'id'>();

  useEffect(() => {
    dispatch(getEntity(id));
  }, []);

  const offerEntity = useAppSelector(state => state.offer.entity);
  return (
    <Row>
      <Col md="8">
        <h2 data-cy="offerDetailsHeading">
          <Translate contentKey="promotionalAppApp.offer.detail.title">Offer</Translate>
        </h2>
        <dl className="jh-entity-details">
          <dt>
            <span id="id">
              <Translate contentKey="global.field.id">ID</Translate>
            </span>
          </dt>
          <dd>{offerEntity.id}</dd>
          <dt>
            <span id="offerName">
              <Translate contentKey="promotionalAppApp.offer.offerName">Offer Name</Translate>
            </span>
          </dt>
          <dd>{offerEntity.offerName}</dd>
          <dt>
            <span id="ordersForOffer">
              <Translate contentKey="promotionalAppApp.offer.ordersForOffer">Orders For Offer</Translate>
            </span>
          </dt>
          <dd>{offerEntity.ordersForOffer}</dd>
          <dt>
            <span id="complementary">
              <Translate contentKey="promotionalAppApp.offer.complementary">Complementary</Translate>
            </span>
          </dt>
          <dd>{offerEntity.complementary}</dd>
        </dl>
        <Button tag={Link} to="/offer" replace color="info" data-cy="entityDetailsBackButton">
          <FontAwesomeIcon icon="arrow-left" />{' '}
          <span className="d-none d-md-inline">
            <Translate contentKey="entity.action.back">Back</Translate>
          </span>
        </Button>
        &nbsp;
        <Button tag={Link} to={`/offer/${offerEntity.id}/edit`} replace color="primary">
          <FontAwesomeIcon icon="pencil-alt" />{' '}
          <span className="d-none d-md-inline">
            <Translate contentKey="entity.action.edit">Edit</Translate>
          </span>
        </Button>
      </Col>
    </Row>
  );
};

export default OfferDetail;
