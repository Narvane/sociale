package com.sociale.library.core.model.entity;

import com.sociale.library.core.enumeration.RoleEnum;
import com.sociale.library.core.model.interfaces.AbstractEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "application_user")
public class ApplicationUser implements AbstractEntity {

    @Id
    @Column(name = "lng_id_application_user")
    @GeneratedValue(generator = "GENERATE_ApplicationUser", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "GENERATE_ApplicationUser", sequenceName = "ApplicationUser_pk_seq", allocationSize = 1)
    protected Long id;

    @Column(name = "str_email_application_user", unique = true)
    protected String email;

    @Column(name = "str_password_application_user")
    protected String password;

    @ElementCollection(fetch = FetchType.LAZY, targetClass = RoleEnum.class)
    @Enumerated(EnumType.STRING)
    @Column(name = "enm_role", length = 30)
    @JoinTable(
            name = "application_user_role",
            joinColumns = { @JoinColumn(name = "lng_id_application_user") }
    )
    private Set<RoleEnum> roles;

    public ApplicationUser(ApplicationUser applicationUser) {
        this.email = applicationUser.email;
        this.password = applicationUser.password;
        this.roles = applicationUser.roles;
    }

}
