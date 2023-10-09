-- init.sql
DO $$
BEGIN
    IF NOT EXISTS (SELECT 1 FROM pg_database WHERE datname = 'coffee_shop') THEN
        CREATE DATABASE coffee_shop;
END IF;
END $$;
