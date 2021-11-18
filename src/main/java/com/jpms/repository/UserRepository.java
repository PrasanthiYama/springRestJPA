/**
 * 
 */
package com.jpms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpms.model.User;

/**
 * @author Administrator
 *
 */
public interface UserRepository  extends JpaRepository<User, Integer>{

}
