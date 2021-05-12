package com.fetchrewards.points.repository;

import org.springframework.data.repository.CrudRepository;

import com.fetchrewards.points.entity.PointBalancesEntity;

public interface PointBalancesRepository extends CrudRepository<PointBalancesEntity, Long>{
      public PointBalancesEntity findByPayer(String payerName);
}
