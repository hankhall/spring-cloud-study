package com.wicre.cloud.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wicre.cloud.study.entity.User;

/**
 * @author zhouli
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
