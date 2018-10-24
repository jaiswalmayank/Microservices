package com.quick.carpool.notification.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Notification {

	@Id
	private Long id;
	
	@Column(name="device_type")
	private Long deviceType;
}
