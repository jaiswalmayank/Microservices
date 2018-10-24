package com.quick.carpool.billing.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quick.carpool.billing.model.Invoice;

public interface BillingRepository extends JpaRepository<Invoice, Long>{

}
