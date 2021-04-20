CREATE TABLE regions (
    region_id SERIAL,
    region_name CHARACTER VARYING(100) DEFAULT NULL,
    capital_city CHARACTER VARYING(100) DEFAULT NULL,
    area_km2 double precision,
    PRIMARY KEY(region_id)
) ;