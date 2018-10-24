package com.quick.carpool.billing.controller;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quick.carpool.billing.model.Invoice;
import com.quick.carpool.billing.proxy.NotificationProxy;
import com.quick.carpool.billing.services.BillingService;

@RestController
@RequestMapping("/billing")
public class BillingController {

	@Autowired
	private BillingService billingService;
	
	@Autowired
	private NotificationProxy notificationProxy;

	@GetMapping("/")
	public List<Invoice> doGetAll() {
		List<Invoice> invoices = billingService.getAllInvoices();
		notificationProxy.sendNotificationToAndroid("Android Notification");
		notificationProxy.sendNotificationToIos("Ios Notification");
		return invoices;
	}

	@GetMapping("/{id}")
	public Invoice doGet(@PathParam(value = "id") Long id) {
		Invoice invoice = billingService.getInvoiceById(id);

		return invoice;
	}

	@PostMapping("/")
	public Invoice doPost(@RequestBody Invoice invoice) {
		Invoice savedInvoice = billingService.save(invoice);
		return savedInvoice;
	}
	
	@PutMapping("/")
	public Invoice doPut(@RequestBody Invoice invoice) {
		Invoice updateInvoice = billingService.update(invoice);
		
		return updateInvoice;
	}
	
	
	@DeleteMapping("/{id}")
	public Long doDelete(@PathParam(value = "id") Long id) {
		billingService.delete(id);
		
		return id;
	}
}
