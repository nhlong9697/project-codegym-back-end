package com.airbnb.clone.repository;


import com.airbnb.clone.model.AppUser;
import com.airbnb.clone.validate.UniqueEmail;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import java.util.Optional;

public interface AppUserRepository extends JpaRepository<AppUser, Long> {
    Optional<AppUser> findByUsername(String username);

    Boolean existsByEmail(String email);

    Boolean existsByPhoneNumber(String phoneNumber);

    Boolean existsByUsername(String username);
    Boolean existsAppUsersByEmail(String email);
}
