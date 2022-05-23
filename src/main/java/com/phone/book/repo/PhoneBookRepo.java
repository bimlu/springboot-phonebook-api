package com.phone.book.repo;

import com.phone.book.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhoneBookRepo extends JpaRepository<User, Integer> {
    User findByName(String name);

    User findByPassCode(String passCode);

    User findByPhoneNumber(String phoneNumber);

    boolean existsByName(String name);

    boolean existsByPassCode(String passCode);

    boolean existsById(int id);

    boolean existsByphoneNumber(String phoneNumber);

    boolean existsByCountryCode(String countryCode);

    boolean existsByEmail(String b);

    User findByPhoneNumberAndCountryCode(String phoneNo, String CountryCode);


}
