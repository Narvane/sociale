package com.sociale.library.core.repository;

import com.sociale.library.core.model.entity.ApplicationUser;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationUserRepository extends GenericRepository<ApplicationUser> /*TODO Generic QueryDsl */{

    ApplicationUser findByEmail(String email);

    boolean existsByEmail(String email);

}
