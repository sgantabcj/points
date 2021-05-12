package com.fetchrewards.points.repository;

import org.springframework.data.repository.CrudRepository;

import com.fetchrewards.points.entity.PayerPointsEntity;

public interface PayerPointsRepository extends CrudRepository<PayerPointsEntity, Long> {

}
