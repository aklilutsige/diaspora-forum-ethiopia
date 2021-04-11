CREATE DATABASE IF NOT EXISTS "ethiopia_api";
USE "ethiopia_api";

--
-- Table structure for table "regions"
--
DROP TABLE IF EXISTS public.regions;

CREATE TABLE public.regions
(
    "regionId" bigint NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 9223372036854775807 CACHE 1 ),
    "regionName" VARCHAR(45) DEFAULT NULL,
    "capitalCity" VARCHAR(45) DEFAULT NULL,
    "areaKm2" double precision DEFAULT 0.00,
    PRIMARY KEY("regionId")
);