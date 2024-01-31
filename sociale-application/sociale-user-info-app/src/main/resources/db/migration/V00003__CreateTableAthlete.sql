CREATE TABLE athlete (
    lng_id_athlete INT8 PRIMARY KEY,
    str_nickname_athlete VARCHAR (50) NOT NULL,
    lng_id_physical_person INT8,
    CONSTRAINT fk_physical_person
        FOREIGN KEY(lng_id_physical_person)
            REFERENCES physical_person(lng_id_physical_person)
);