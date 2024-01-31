package com.sociale.library.core.model.entity;

import com.sociale.library.core.model.interfaces.AbstractEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "role")
public class Role implements AbstractEntity {

    @Id
    @Column(name = "lng_id_role")
    @GeneratedValue(generator = "GENERATE_Role", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "GENERATE_Role", sequenceName = "Role_pk_seq", allocationSize = 1)
    private Long id;

    @Column(name = "str_name_role") //TODO Trocar pra RoleEnum
    private String name;

    public Role(Long id) {
        this.id = id;
    }

}
