package spring.cloud.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.cloud.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
