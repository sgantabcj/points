package com.fetchrewards.points.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fetchrewards.points.dto.request.AddPoints;
import com.fetchrewards.points.dto.request.SpendPoints;
import com.fetchrewards.points.dto.response.PointBalances;
import com.fetchrewards.points.dto.response.PointsSpent;
import com.fetchrewards.points.entity.PayerPointsEntity;
import com.fetchrewards.points.entity.PointBalancesEntity;
import com.fetchrewards.points.repository.PayerPointsRepository;
import com.fetchrewards.points.repository.PointBalancesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.transaction.Transactional;

@Service
public class PointsService{

	@Autowired
	private PayerPointsRepository payerPointsRepository;

	@Autowired
	private PointBalancesRepository pointBalancesRepository;

	@Transactional
	public void addPoints(AddPoints addPoints){
		PayerPointsEntity payerPointsEntity = new PayerPointsEntity();
		payerPointsEntity.setPoints(addPoints.getPoints());
		payerPointsEntity.setPayer(addPoints.getPayer());
		//TODO - transaction date is expected to be in UTC but while setting, getting converted to local
		payerPointsEntity.setTransactionDate(addPoints.getTransactionDate());
		payerPointsEntity.setCreatedDate(new Date());
		payerPointsEntity.setModifiedDate(new Date());

		payerPointsRepository.save(payerPointsEntity);
		PointBalancesEntity pointBalancesEntity = pointBalancesRepository.findByPayer(addPoints.getPayer());

		if(ObjectUtils.isEmpty(pointBalancesEntity)) {
			pointBalancesEntity = new PointBalancesEntity();
			pointBalancesEntity.setPayer(addPoints.getPayer());
			pointBalancesEntity.setBalance(0L);
			pointBalancesEntity.setCreatedDate(new Date());
		}

		pointBalancesEntity.setBalance(pointBalancesEntity.getBalance() + addPoints.getPoints());
		pointBalancesEntity.setModifiedDate(new Date());

		//TODO - check to see if the effective balance is negative, if yes throw error

		pointBalancesRepository.save(pointBalancesEntity);
	}
	
	public PointBalances getBalancePoints(){
		
		return new PointBalances();
	}
	
	public List<PointsSpent> spendPoints(SpendPoints spendPoints){
		
		return new ArrayList();
	}
}
