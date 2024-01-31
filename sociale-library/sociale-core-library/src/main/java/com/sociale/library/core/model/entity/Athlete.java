package com.sociale.library.core.model.entity;

import com.sociale.library.core.model.interfaces.AbstractEntity;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "athlete")
public class Athlete implements AbstractEntity {

    @Id
    @Column(name = "lng_id_athlete")
    @GeneratedValue(generator = "GENERATE_Athlete", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "GENERATE_Athlete", sequenceName = "Athlete_pk_seq", allocationSize = 1)
    private Long id;

    @Column(name = "str_nickname_athlete")
    private String nickname;

    //@MapsId
    @OneToOne(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "lng_id_physical_person")
    private PhysicalPerson physicalPerson;

}
