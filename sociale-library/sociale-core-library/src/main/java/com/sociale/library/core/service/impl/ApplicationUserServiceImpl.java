package com.sociale.library.core.service.impl;

import com.sociale.library.core.model.entity.ApplicationUser;
import com.sociale.library.core.repository.ApplicationUserRepository;
import com.sociale.library.core.service.ApplicationUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ApplicationUserServiceImpl extends GenericServiceImpl<ApplicationUser> implements ApplicationUserService {

    @Autowired
    protected ApplicationUserServiceImpl(ApplicationUserRepository applicationUserRepository) {
        super(applicationUserRepository);
    }

    @Override
    public ApplicationUserRepository getRepository() {
        return (ApplicationUserRepository) super.getRepository();
    }

}
