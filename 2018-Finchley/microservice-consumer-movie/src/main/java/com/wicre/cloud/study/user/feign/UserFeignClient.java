package com.wicre.cloud.study.user.feign;

import java.math.BigDecimal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.wicre.cloud.study.user.entity.User;

@FeignClient(name = "microservice-provider-user", fallback = UserFeignClientFallback.class)
public interface UserFeignClient {
	@GetMapping("/users/{id}")
	User findById(@PathVariable("id") Long id);
}

@Component
class UserFeignClientFallback implements UserFeignClient {
	@Override
	public User findById(Long id) {
		return new User(id, "默认用户", "默认用户", 0, new BigDecimal(1));
	}
}