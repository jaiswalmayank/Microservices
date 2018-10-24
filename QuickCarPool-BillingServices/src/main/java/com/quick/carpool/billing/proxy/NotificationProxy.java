package com.quick.carpool.billing.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RibbonClient(name="QuickCarPool-NotificationsServices")
@FeignClient(name="QuickCarPool-NotificationsServices")
public interface NotificationProxy {
	
	@PostMapping("/notification/android")
	public void sendNotificationToAndroid(@RequestBody String notification);
	
	@PostMapping("/notification/ios")
	public void sendNotificationToIos(@RequestBody String notification);

}
