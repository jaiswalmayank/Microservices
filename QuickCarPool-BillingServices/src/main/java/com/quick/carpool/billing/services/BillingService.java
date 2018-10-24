package com.quick.carpool.billing.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quick.carpool.billing.model.Invoice;
import com.quick.carpool.billing.repository.BillingRepository;

@Service
public class BillingService {
	
	@Autowired
	private BillingRepository billingRepository;

	public List<Invoice> getAllInvoices() {
		
		return billingRepository.findAll();
	}

	public Invoice getInvoiceById(Long id) {
		
		return billingRepository.findById(id).get();
	}

	public Invoice save(Invoice invoice) {
		return billingRepository.save(invoice);
	}

	public Invoice update(Invoice invoice) {
		return billingRepository.save(invoice);
	}
	
	public void delete(Long id) {
		billingRepository.deleteById(id);
	}
}
