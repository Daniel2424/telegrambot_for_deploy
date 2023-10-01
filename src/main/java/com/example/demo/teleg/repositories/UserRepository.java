package com.example.demo.teleg.repositories;

import com.example.demo.teleg.entity.User;
import com.example.demo.teleg.entity.UserId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, UserId> {

}
