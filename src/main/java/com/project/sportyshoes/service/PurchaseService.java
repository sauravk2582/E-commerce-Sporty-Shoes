package com.project.sportyshoes.service;

import com.project.sportyshoes.model.Purchase;
import com.project.sportyshoes.repository.PurchaseRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PurchaseService {

	public List<Purchase> getAllPurchases(){
		
		return purchaseRepository.findAll();
		
	}

@Autowired
PurchaseRepository purchaseRepository;

}
