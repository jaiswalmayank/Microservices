package com.quick.carpool.notification.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@RequestMapping("/notification")
public class NotificationController {

	private static final Logger Log = LoggerFactory.getLogger(NotificationController.class);
	
	
	@RequestMapping("/android")
	public void sendNotificationToAndroid(@RequestBody String notification) {
		Log.info("Notifications sent for android");
	}
	
	@RequestMapping("/ios")
	public void sendNotificationToIos(@RequestBody String notification) {
		Log.info("Notifications sent for ios");
	}
}
