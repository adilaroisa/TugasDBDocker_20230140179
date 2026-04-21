package com.tugas.praktikum7.repository;

import com.tugas.praktikum7.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository <User, String> {

}
