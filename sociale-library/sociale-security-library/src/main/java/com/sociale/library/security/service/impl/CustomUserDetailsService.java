package com.sociale.library.security.service.impl;

import com.sociale.library.core.model.entity.ApplicationUser;
import com.sociale.library.core.repository.ApplicationUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static com.sociale.library.core.constants.ErrorMessagesConstants.APPLICATION_USER_NOT_FOUND_MESSAGE;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private static final String ROLE_PREFIX = "ROLE_";

    private final ApplicationUserRepository applicationUserRepository;

    @Autowired public CustomUserDetailsService(ApplicationUserRepository applicationUserRepository) {
        this.applicationUserRepository = applicationUserRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        ApplicationUser applicationUser = loadApplicationUserByEmail(email);

        return new CustomUserDetails(applicationUser);

    }

    private ApplicationUser loadApplicationUserByEmail(String email) {
        return Optional.ofNullable(applicationUserRepository.findByEmail(email))
                .orElseThrow(() -> new UsernameNotFoundException(APPLICATION_USER_NOT_FOUND_MESSAGE));
    }

    private final static class CustomUserDetails extends ApplicationUser implements UserDetails {

        CustomUserDetails(ApplicationUser applicationUser) {
            super(applicationUser);
        }

        @Override
        public Collection<? extends GrantedAuthority> getAuthorities() {

            List<SimpleGrantedAuthority> roles = new ArrayList<>();

            getRoles().forEach(role ->
                    roles.add(new SimpleGrantedAuthority(ROLE_PREFIX + role.getName()))
            );

            return roles;

        }

        @Override
        public String getUsername() {
            return null;
        }

        @Override
        public boolean isAccountNonExpired() {
            return true;
        }

        @Override
        public boolean isAccountNonLocked() {
            return true;
        }

        @Override
        public boolean isCredentialsNonExpired() {
            return true;
        }

        @Override
        public boolean isEnabled() {
            return true;
        }

    }

}
