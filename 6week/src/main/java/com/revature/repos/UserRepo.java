package com.revature.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.revature.model.AppUser;

@Repository
public interface UserRepo extends JpaRepository<AppUser, Integer> {

}
