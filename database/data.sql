BEGIN TRANSACTION;

CREATE TABLE car_info (
	car_id SERIAL PRIMARY KEY,
	car_model VARCHAR(50) NOT NULL,
	engine_size numeric (6,2) NOT NULL, -- 6 says the # will be 6 charcters wide, and 2 decimal places to the right of the decimal point. (4 and 2)
	color VARCHAR(20),
	miles_per_gallon numeric (6,2)
	
);

INSERT INTO car_info (car_model, engine_size, color, miles_per_gallon) VALUES ('Corvette', 3.5, 'Red', 13.2);
INSERT INTO car_info (car_model, engine_size, color, miles_per_gallon) VALUES ('M3', 4.5, 'Green', 15.2);
INSERT INTO car_info (car_model, engine_size, color, miles_per_gallon) VALUES ('Escape', 3.5, 'Blue', 13.2);
INSERT INTO car_info (car_model, engine_size, color, miles_per_gallon) VALUES ('Pinto', 2.5, 'Yellow', 13.2);
INSERT INTO car_info (car_model, engine_size, color, miles_per_gallon) VALUES ('Corolla', 3.5, 'Black', 13.2);

COMMIT;