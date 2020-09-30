package com.wallet.userwalletsystem.repository;

import com.wallet.userwalletsystem.model.dao.UserDao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserDao,String> {
}
