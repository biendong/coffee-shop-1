CREATE SCHEMA shop
    AUTHORIZATION postgres;

CREATE TABLE shop.shop
(
    id integer NOT NULL,
    name character varying(255) NOT NULL,
    desscription character varying,
    email character varying(100) NOT NULL,
    "phoneNumber" character varying(20),
    website character varying,
    "addressId" integer,
    "openAt" time with time zone,
    "closeAt" time with time zone,
    "modifiedAt" timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    "createdAt" timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

ALTER TABLE shop.shop
    OWNER to postgres;

CREATE TABLE shop.shop_menu
(
    id integer NOT NULL,
    name character varying(255) NOT NULL,
    position integer NOT NULL,
    "shopId" integer NOT NULL,
    "categoryId" integer NOT NULL,
    "modifiedAt" timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    "createdAt" timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

ALTER TABLE shop.shop_menu
    OWNER to postgres;

CREATE TABLE shop.shop_time
(
    id integer NOT NULL,
    "shopId" integer NOT NULL,
    season character varying(20) NOT NULL,
    "openAt" time with time zone,
    "closeAt" time with time zone,
    "modifiedAt" timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    "createdAt" timestamp with time zone DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
);

ALTER TABLE shop.shop_time
    OWNER to postgres;
    