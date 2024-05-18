package dev.iamtj.photogramusermanagementservice.repositories;

import dev.iamtj.photogramusermanagementservice.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
