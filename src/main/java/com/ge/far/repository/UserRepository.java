package com.ge.far.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ge.far.entity.User;



/**
 * @author Imtiaz
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * @param userId
	 * @return
	 */
	public User findByName(String Name);
	
}
