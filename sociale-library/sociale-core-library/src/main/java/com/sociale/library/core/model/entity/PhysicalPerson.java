package com.sociale.library.core.model.entity;

import com.sociale.library.core.model.interfaces.AbstractEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@Entity
@Table(name = "physical_person")
public class PhysicalPerson implements AbstractEntity {

    @Id
    @Column(name = "lng_id_physical_person")
    @GeneratedValue(generator = "GENERATE_PhysicalPerson", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "GENERATE_PhysicalPerson", sequenceName = "PhysicalPerson_pk_seq", allocationSize = 1)
    private Long id;

    @Column(name = "str_cpf_physical_person")
    private String cpf;

    @Column(name = "str_first_name_physical_person")
    private String firstName;

    @Column(name = "str_last_name_physical_person")
    private String lastName;

    @Column(name = "dat_birth_date_physical_person")
    private LocalDate birthDate;

    //@MapsId
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "lng_id_application_user")
    private ApplicationUser applicationUser;

}
