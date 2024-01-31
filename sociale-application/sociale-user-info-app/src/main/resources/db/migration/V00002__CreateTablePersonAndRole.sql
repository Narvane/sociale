CREATE TABLE role (
    lng_id_role INT8 PRIMARY KEY,
    str_name_role VARCHAR (50) NOT NULL
);

CREATE TABLE physical_person (
    lng_id_physical_person INT8 PRIMARY KEY,
    str_cpf_physical_person VARCHAR (14) NULL,
    str_first_name_physical_person VARCHAR (50) NOT NULL,
    str_last_name_physical_person VARCHAR (70) NOT NULL,
    dat_birth_date_physical_person DATE NOT NULL,
    lng_id_application_user INT8,
    CONSTRAINT fk_application_user
        FOREIGN KEY(lng_id_application_user)
            REFERENCES application_user(lng_id_application_user)
);

CREATE TABLE application_user_role (
    lng_id_application_user INT8,
    lng_id_role INT8,
    CONSTRAINT fk_application_user
        FOREIGN KEY(lng_id_application_user)
            REFERENCES application_user(lng_id_application_user),
    CONSTRAINT fk_role
        FOREIGN KEY(lng_id_role)
            REFERENCES role(lng_id_role)
);
