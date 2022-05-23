package com.phone.book.repo;

import com.phone.book.entity.Contacts;
import com.phone.book.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ContactsRepo extends JpaRepository<Contacts, Integer> {

    User findByName(String name);

    void save(User user);

    void save(int id);

    boolean existsByphoneNumber(String phoneNumber);

    boolean existsByEmail(String email);


    boolean existsByStatus(int status);

    ArrayList<Contacts> findByUserAndStatusOrderByIdDesc(User user, int status);

    Contacts findByIdAndUser(int id, User user);


}
