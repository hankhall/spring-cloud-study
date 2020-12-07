package com.wicre.cloud.study.user.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wicre.cloud.study.user.entity.User;
import com.wicre.cloud.study.user.feign.UserFeignClient;

/**
 * @author zhouli
 */
@RequestMapping("/movies")
@RestController
public class MovieController {
	@Autowired
	private UserFeignClient userFeignClient;

	@GetMapping("/users/{id}")
	public User findById(@PathVariable Long id) {
		return this.userFeignClient.findById(id);
	}

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
		int k = 0;
		System.out.println(sdf.format(new Date()) + "        " + k);

		for (int i = 1; i <= 8000; i++) {
			for (int j = 1; j <= 8000; j++) {
				k++;
			}
		}
		System.out.println(sdf.format(new Date()) + "        " + k);
	}
}
