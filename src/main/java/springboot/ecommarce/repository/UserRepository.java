package springboot.ecommarce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import springboot.ecommarce.model.User;


public interface UserRepository extends JpaRepository<User, Long>{

}
