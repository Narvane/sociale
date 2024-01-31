-- ==============[Hibernate Sequence]==============

CREATE SEQUENCE public.hibernate_sequence
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    START 11834992
    CACHE 1
    NO CYCLE;

ALTER SEQUENCE public.hibernate_sequence OWNER TO postgres;
GRANT ALL ON SEQUENCE public.hibernate_sequence to postgres;

-- ==============[Application User Sequence]==============

CREATE SEQUENCE public.application_user_pk_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1
    NO CYCLE;

ALTER SEQUENCE public.application_user_pk_seq OWNER TO postgres;
GRANT ALL ON SEQUENCE public.application_user_pk_seq to postgres;

-- ==============[Athlete Sequence]==============

CREATE SEQUENCE public.athlete_pk_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1
    NO CYCLE;

ALTER SEQUENCE public.athlete_pk_seq OWNER TO postgres;
GRANT ALL ON SEQUENCE public.athlete_pk_seq to postgres;

-- ==============[Physical Person Sequence]==============

CREATE SEQUENCE public.physical_person_pk_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1
    NO CYCLE;

ALTER SEQUENCE public.physical_person_pk_seq OWNER TO postgres;
GRANT ALL ON SEQUENCE public.physical_person_pk_seq to postgres;

-- ==============[Role Sequence]==============

CREATE SEQUENCE public.role_pk_seq
    INCREMENT BY 1
    MINVALUE 1
    MAXVALUE 9223372036854775807
    CACHE 1
    NO CYCLE;

ALTER SEQUENCE public.role_pk_seq OWNER TO postgres;
GRANT ALL ON SEQUENCE public.role_pk_seq to postgres;
