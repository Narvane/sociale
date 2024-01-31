DROP TABLE application_user_role;

CREATE TABLE application_user_role (
    lng_id_application_user INT8,
    enm_role VARCHAR(30),
    CONSTRAINT fk_application_user
        FOREIGN KEY(lng_id_application_user)
            REFERENCES application_user(lng_id_application_user)
);