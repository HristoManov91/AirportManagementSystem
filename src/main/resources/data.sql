/* --- Airlines --- */
USE airports;

INSERT INTO airlines (id, description, email, iata_code, icao_code, image_url, name, phone, website)
VALUES (1, null, 'callfb@air.bg', 'FB', 'LZB',
        'https://images.ctfassets.net/biom0eqyyi6b/1b8ztEoWXkaKkcuK2YmyuK/7edb43de24bf245749cf3c910a1802b1/BulgariaAir.png',
        'BULGARIA AIR', '+363 2 945 90 27', 'https://www.air.bg/bg');

INSERT INTO airlines (id, description, email, iata_code, icao_code, image_url, name, phone, website)
VALUES (2, null, null, 'LH', 'DLH',
        'https://www.schengenvisainfo.com/news/wp-content/uploads/2021/03/lufthansa.jpg',
        'DEUTSCHE LUFTHANSA AG', '+496986799799', 'https://www.lufthansa.com/bg/en/homepage');

INSERT INTO airlines (id, description, email, iata_code, icao_code, image_url, name, phone, website)
VALUES (3, null, 'customerqueries@ryanair.com', 'FR', 'RYR',
        'https://wallpaperaccess.com/full/4456022.jpg',
        'RYANAIR', '+44 871 246 0002', 'https://www.ryanair.com/gb/en');

INSERT INTO airlines (id, description, email, iata_code, icao_code, image_url, name, phone, website)
VALUES (4, null, null, 'TK', 'THY',
        'https://i.hurimg.com/i/hdn/75/0x0/5d70f33267b0a92d5c67f6b9.jpg',
        'TURKISH AIRLINES', '0850 333 0 849', 'https://www.turkishairlines.com/');

INSERT INTO airlines (id, description, email, iata_code, icao_code, image_url, name, phone, website)
VALUES (5, null, null, 'W6', 'WZZ',
        'https://www.fly4free.com/wp-content/uploads/2020/05/A321neo_WIZZ_AIR-800x537.jpg',
        'WIZZ AIR', '+90 063 949', 'https://wizzair.com/');

INSERT INTO airlines (id, description, email, iata_code, icao_code, image_url, name, phone, website)
VALUES (6, null, 'qinfo@qatarairways.com.qa', 'QR', 'QTR',
        'https://airlines-airports.com/wp-content/uploads/2019/01/Qatar-Airways-Interesting-Facts-1170x500.jpg',
        'QATAR AIRWAYS', '+97 444 237 999', 'https://www.qatarairways.com/en-bg/homepage.html');

/* --- Airports --- */

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (1, 'Sofia', 'Bulgaria', 'SOF', 'LBSF', 'Sofia Airport', 'https://sofia-airport.eu/');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (2, 'Madrid', 'Spain', 'MAD', 'LEMD', 'MADRID-BARAJAS AIRPORT', 'https://www.aeropuertomadrid-barajas.com/');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (3, 'Bucharest', 'Romania', 'OTP', 'LROP', 'Bucharest Henri Coanda', 'https://www.bucharestairports.ro/en');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (4, 'Rome', 'Italy', 'FCO', 'LIRF', 'Aeroporto di Roma Fiumicino Leonardo da Vinci',
        'https://www.adr.it/fiumicino');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (5, 'Paris', 'France', 'CDG', 'LFPG', 'Paris Charles de Gaulle Airport', 'https://www.parisaeroport.fr/en');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (6, 'Athens', 'Greece', 'ATH', 'LGAV', 'Athens International Airport Eleftherios Venizelos',
        'https://aia.gr/traveler/');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (7, 'Munich', 'German', 'MUC', 'EDDM', 'Munich Airport', 'https://www.munich-airport.com/');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (8, 'Istanbul', 'Turkey', 'IST', 'LTFM', 'Istanbul Airport', 'https://www.istairport.com/en');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (9, 'Doha', 'Qatar', 'DIA', 'OTBD', 'Doha International Airport', 'https://dohahamadairport.com/');

/* --- Airplanes --- */

/* Bulgaria Air */
INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (1, 'FB1000', 2, '2005-8-11', null, 'READY', 26730, 2700, 'Airbus', 800, 75000, 'a320', 6300, 1, 1);

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (2, 'FB2000', 2, '2005-8-11', null, 'READY', 26730, 2730, 'Airbus', 800, 75000, 'a320', 6300, 1, 1);

/* Lufthansa */
INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (3, 'LH1000', 3, '2006-6-21', null, 'READY', 27730, 2600, 'Airbus', 850, 80000, 'a321', 6800, 2, 7);

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (4, 'LH2000', 3, '2006-6-21', null, 'READY', 27730, 2600, 'Airbus', 850, 80000, 'a321', 6800, 2, 7);

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (5, 'LH3000', 3, '2006-6-21', null, 'READY', 27730, 2600, 'Airbus', 850, 80000, 'a321', 6800, 2, 7);

/* RYANAIR */
INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (6, 'FR1000', 2, '2009-1-25', null, 'READY', 25730, 2750, 'Airbus', 750, 70100, 'a319', 6000, 3, 6);

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (7, 'FR2000', 2, '2009-1-25', null, 'READY', 25730, 2750, 'Airbus', 750, 70100, 'a319', 6000, 3, 6);

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (8, 'FR3000', 2, '2009-1-25', null, 'READY', 25730, 2750, 'Airbus', 750, 70100, 'a319', 6000, 3, 6);

/* TURKISH AIRLINES */
INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (9, 'TK1000', 2, '2003-2-12', null, 'READY', 28730, 2850, 'Boeing', 830, 65100, '737', 6900, 4, 8);

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (10, 'TK2000', 2, '2003-2-12', null, 'READY', 28730, 2850, 'Boeing', 830, 65100, '737', 6900, 4, 8);

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (11, 'TK3000', 2, '2003-2-12', null, 'READY', 28730, 2850, 'Boeing', 830, 65100, '737', 6900, 4, 8);

/* WIZZ AIR */
INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (12, 'W61000', 2, '2004-4-24', null, 'READY', 32730, 3050, 'Boeing', 900, 95100, '777', 7500, 5, 3);

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (13, 'W62000', 2, '2004-4-24', null, 'READY', 32730, 3050, 'Boeing', 900, 95100, '777', 7500, 5, 3);

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (14, 'W63000', 2, '2004-4-24', null, 'READY', 32730, 3050, 'Boeing', 900, 95100, '777', 7500, 5, 3);

/* QATAR AIRWAYS */
INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (15, 'QR1000', 3, '2008-11-10', null, 'READY', 33730, 2950, 'Boeing', 910, 97100, '777', 7800, 6, 9);

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (16, 'QR2000', 3, '2008-11-10', null, 'READY', 33730, 2950, 'Boeing', 910, 97100, '777', 7800, 6, 9);

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, status, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model, typical_range, airline_id, airport_id)
VALUES (17, 'QR3000', 3, '2008-11-10', null, 'READY', 33730, 2950, 'Boeing', 910, 97100, '777', 7800, 6, 9);

/* --- Routes --- */
/* routes on Bulgaria Аir from Sofia and back */
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (1, 'FB100', true, 1, 1, 2);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (2, 'FB101', true, 1, 2, 1);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (3, 'FB200', true, 1, 1, 3);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (4, 'FB201', true, 1, 3, 1);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (5, 'FB300', true, 1, 1, 4);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (6, 'FB301', true, 1, 4, 1);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (7, 'FB400', true, 1, 1, 5);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (8, 'FB401', true, 1, 5, 1);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (9, 'FB500', true, 1, 1, 6);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (10, 'FB501', true, 1, 6, 1);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (11, 'FB600', true, 1, 1, 7);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (12, 'FB601', true, 1, 7, 1);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (13, 'FB700', true, 1, 1, 8);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (14, 'FB701', true, 1, 8, 1);

/* routes on DEUTSCHE LUFTHANSA AG from Munich and back */
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (15, 'LH1100', true, 2, 7, 1);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (16, 'LH1101', true, 2, 1, 7);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (17, 'LH1200', true, 2, 7, 2);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (18, 'LH1201', true, 2, 2, 7);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (19, 'LH1300', true, 2, 7, 3);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (20, 'LH1301', true, 2, 3, 7);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (21, 'LH1400', true, 2, 7, 4);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (22, 'LH1401', true, 2, 4, 7);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (23, 'LH1500', true, 2, 7, 5);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (24, 'LH1501', true, 2, 5, 7);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (25, 'LH1600', true, 2, 7, 6);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (26, 'LH1601', true, 2, 6, 7);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (27, 'LH1700', true, 2, 7, 8);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (28, 'LH1701', true, 2, 8, 7);

/* routes on RYANAIR from Athens and back */
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (29, 'FR5100', true, 3, 6, 1);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (30, 'FR5101', true, 3, 1, 6);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (31, 'FR5200', true, 3, 6, 2);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (32, 'FR5201', true, 3, 2, 6);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (33, 'FR5300', true, 3, 6, 3);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (34, 'FR5301', true, 3, 3, 6);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (35, 'FR5400', true, 3, 6, 4);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (36, 'FR5401', true, 3, 4, 6);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (37, 'FR5500', true, 3, 6, 5);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (38, 'FR5501', true, 3, 5, 6);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (39, 'FR5600', true, 3, 6, 7);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (40, 'FR5601', true, 3, 7, 6);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (41, 'FR5700', true, 3, 6, 8);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (42, 'FR5701', true, 3, 8, 6);

/* routes on TURKISH AIRLINES from Istanbul and back */
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (43, 'TK100', true, 4, 8, 1);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (44, 'TK101', true, 4, 1, 8);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (45, 'TK200', true, 4, 8, 2);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (46, 'TK201', true, 4, 2, 8);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (47, 'TK300', true, 4, 8, 3);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (48, 'TK301', true, 4, 3, 8);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (49, 'TK400', true, 4, 8, 4);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (50, 'TK401', true, 4, 4, 8);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (51, 'TK500', true, 4, 8, 5);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (52, 'TK501', true, 4, 5, 8);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (53, 'TK701', true, 4, 8, 6);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (54, 'TK700', true, 4, 6, 8);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (55, 'TK600', true, 4, 8, 7);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (56, 'TK601', true, 4, 7, 8);

/* routes on WIZZ AIR from Bucharest and back */
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (57, 'W66100', true, 5, 3, 1);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (58, 'W66101', true, 5, 1, 3);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (59, 'W66200', true, 5, 3, 2);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (60, 'W66201', true, 5, 2, 3);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (61, 'W66300', true, 5, 3, 4);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (62, 'W66301', true, 5, 4, 3);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (63, 'W66400', true, 5, 3, 5);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (64, 'W66401', true, 5, 5, 3);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (65, 'W66500', true, 5, 3, 6);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (66, 'W66501', true, 5, 6, 3);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (67, 'W66701', true, 5, 3, 7);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (68, 'W66700', true, 5, 7, 3);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (69, 'W66600', true, 5, 3, 8);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (70, 'W66601', true, 5, 8, 3);

/* routes on QATAR AIRWAYS from Doha and back */
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (71, 'QR7100', true, 6, 9, 1);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (72, 'QR7101', true, 6, 1, 9);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (73, 'QR7200', true, 6, 9, 2);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (74, 'QR7201', true, 6, 2, 9);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (75, 'QR7300', true, 6, 9, 3);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (76, 'QR7301', true, 6, 3, 9);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (77, 'QR7800', true, 6, 9, 4);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (78, 'QR7801', true, 6, 4, 9);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (79, 'QR7400', true, 6, 9, 5);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (80, 'QR7401', true, 6, 5, 9);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (81, 'QR7500', true, 6, 9, 6);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (82, 'QR7501', true, 6, 6, 9);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (83, 'QR7701', true, 6, 9, 7);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (84, 'QR7700', true, 6, 7, 9);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (85, 'QR7600', true, 6, 9, 8);
INSERT INTO routes(id, route_num, status, airline_id, from_airport_id, to_airport_id)
VALUES (86, 'QR7601', true, 6, 8, 9);

/* --- Airlines_routes --- */

INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 1);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 2);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 3);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 4);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 5);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 6);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 7);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 8);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 9);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 10);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 11);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 12);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 13);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (1, 14);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 15);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 16);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 17);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 18);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 19);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 20);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 21);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 22);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 23);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 24);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 25);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 26);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 27);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (2, 28);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 29);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 30);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 31);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 32);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 33);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 34);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 35);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 36);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 37);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 38);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 39);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 40);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 41);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (3, 42);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 43);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 44);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 45);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 46);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 47);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 48);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 49);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 50);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 51);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 52);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 53);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 54);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 55);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (4, 56);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 57);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 58);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 59);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 60);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 61);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 62);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 63);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 64);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 65);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 66);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 67);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 68);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 69);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (5, 70);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 71);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 72);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 73);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 74);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 75);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 76);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 77);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 78);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 79);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 80);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 81);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 82);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 83);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 84);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 85);
INSERT INTO airlines_routes(airline_id, routes_id)
VALUES (6, 86);


/* --- Flights --- */

/* From Sofia to Madrid and back */
INSERT INTO flights(id, arrival, boarding, departure, flight_duration, full, status, airplane_id, destination_id)
VALUES (1, '2022-01-03T10:15:00', '2022-01-03T9:15:00', '2022-01-03T12:15:00', '3:00:00', false, 'ON_TIME', 1, 1);

INSERT INTO flights(id, arrival, boarding, departure, flight_duration, full, status, airplane_id, destination_id)
VALUES (2, '2022-01-03T14:15:00', '2022-01-03T13:15:00', '2022-01-03T18:15:00', '3:00:00', false, 'ON_TIME', 1, 2);

/* From Sofia to Paris and back */
INSERT INTO flights(id, arrival, boarding, departure, flight_duration, full, status, airplane_id, destination_id)
VALUES (3, '2022-01-03T11:15:00', '2022-01-03T10:15:00', '2022-01-03T13:45:00', '3:30:00', false, 'ON_TIME', 2, 7);

INSERT INTO flights(id, arrival, boarding, departure, flight_duration, full, status, airplane_id, destination_id)
VALUES (4, '2022-01-03T14:30:00', '2022-01-03T13:30:00', '2022-01-03T19:00:00', '3:30:00', false, 'ON_TIME', 2, 8);

/* From Sofia to Bucharest and back */

INSERT INTO flights(id, arrival, boarding, departure, flight_duration, full, status, airplane_id, destination_id)
VALUES (5, '2022-01-03T7:00:00', '2022-01-03T6:15:00', '2022-01-03T7:45:00', '0:45:00', false, 'ON_TIME', 1, 3);

INSERT INTO flights(id, arrival, boarding, departure, flight_duration, full, status, airplane_id, destination_id)
VALUES (6, '2022-01-03T8:45:00', '2022-01-03T8:00:00', '2022-01-03T09:30:00', '0:45:00', false, 'ON_TIME', 1, 4);

/* --- Airlines_Flights --- */

INSERT INTO airlines_flights(airline_id, flights_id)
VALUES (1, 1);
INSERT INTO airlines_flights(airline_id, flights_id)
VALUES (1, 2);
INSERT INTO airlines_flights(airline_id, flights_id)
VALUES (1, 3);
INSERT INTO airlines_flights(airline_id, flights_id)
VALUES (1, 4);
INSERT INTO airlines_flights(airline_id, flights_id)
VALUES (1, 5);
INSERT INTO airlines_flights(airline_id, flights_id)
VALUES (1, 6);

/* --- Airports_flights --- */
INSERT INTO airports_flights(airport_id, flights_id)
VALUES (1, 1);
INSERT INTO airports_flights(airport_id, flights_id)
VALUES (2, 2);
INSERT INTO airports_flights(airport_id, flights_id)
VALUES (1, 3);
INSERT INTO airports_flights(airport_id, flights_id)
VALUES (5, 4);
INSERT INTO airports_flights(airport_id, flights_id)
VALUES (1, 5);
INSERT INTO airports_flights(airport_id, flights_id)
VALUES (3, 6);

/* --- Passports --- */

INSERT INTO passports(id, birthday, doc_number, document_type, expiration, gender, nationality, owner_full_name)
VALUES (1, '1991-08-26', 'BG605958123', 'National ID Card', '2025-12-31', 'MALE', 'BULGARIA', 'Hristo Georgiev Manov');

INSERT INTO passports(id, birthday, doc_number, document_type, expiration, gender, nationality, owner_full_name)
VALUES (2, '1981-07-31', 'BG605758123', 'Travel Visa', '2024-10-15', 'MALE', 'ROMANIA', 'Ianis Hagi');

INSERT INTO passports(id, birthday, doc_number, document_type, expiration, gender, nationality, owner_full_name)
VALUES (3, '1973-05-01', 'BG605958423', 'Passport', '2030-03-10', 'MALE', 'SPAIN', 'Unai Simón Mendibil');

INSERT INTO passports(id, birthday, doc_number, document_type, expiration, gender, nationality, owner_full_name)
VALUES (4, '2001-06-22', 'BG601958123', 'National ID Card', '2023-1-31', 'FEMALE', 'ITALY', 'Chiara Marchitelli');

INSERT INTO passports(id, birthday, doc_number, document_type, expiration, gender, nationality, owner_full_name)
VALUES (5, '1998-11-11', 'BG605951123', 'National ID Card', '2027-9-21', 'FEMALE', 'FRANCE', 'Sonia Bompastor');

INSERT INTO passports(id, birthday, doc_number, document_type, expiration, gender, nationality, owner_full_name)
VALUES (6, '1993-1-21', 'BG605951125', 'Passport', '2028-9-21', 'MALE', 'GERMANY', 'Joshua Walter Kimmich');

INSERT INTO passports(id, birthday, doc_number, document_type, expiration, gender, nationality, owner_full_name)
VALUES (7, '1966-10-11', 'BG105951123', 'Travel Visa', '2029-9-21', 'FEMALE', 'GREECE', 'Eleni Markou');

/* --- Tickets --- */

# INSERT INTO tickets(id, count_suitcases, status, ticket_clazz, flight_id, seat_id)
# VALUES (1 , 1 , 'CHECKED_IN' , 'BUSINESS' , 1 , 1);
#
# INSERT INTO tickets(id, count_suitcases, status, ticket_clazz, flight_id, seat_id)
# VALUES (2 , 2 , 'CHECKED_IN' , 'BUSINESS' , 1 , 13);
#
# INSERT INTO tickets(id, count_suitcases, status, ticket_clazz, flight_id, seat_id)
# VALUES (3 , 1 , 'CHECKED_IN' , 'BUSINESS' , 1 , 52);
#
# INSERT INTO tickets(id, count_suitcases, status, ticket_clazz, flight_id, seat_id)
# VALUES (4 , 1 , 'CHECKED_IN' , 'BUSINESS' , 1 , 77);
#
# INSERT INTO tickets(id, count_suitcases, status, ticket_clazz, flight_id, seat_id)
# VALUES (5 , 3 , 'CHECKED_IN' , 'BUSINESS' , 1 , 111);
#
# INSERT INTO tickets(id, count_suitcases, seat_id, status, ticket_clazz, flight_id)
# VALUES(6 , 1 , 'CHECKED_IN' , 'ECONOMY' , 1 , 112);
#
# INSERT INTO tickets(id, count_suitcases, seat_id, status, ticket_clazz, flight_id)
# VALUES(7 , 2 , 'CHECKED_IN' , 'ECONOMY' , 1 , 151);

/* --- Passengers --- */

# INSERT INTO passengers(id, description, passport_id, ticket_id) VALUES (1 , 'VIP' , 1 , 1);
# INSERT INTO passengers(id, description, passport_id, ticket_id) VALUES (2 , null , 2 , 2);
# INSERT INTO passengers(id, description, passport_id, ticket_id) VALUES (3 , null , 3 , 3);
# INSERT INTO passengers(id, description, passport_id, ticket_id) VALUES (4 , null , 4 , 4);
# INSERT INTO passengers(id, description, passport_id, ticket_id) VALUES (5 , null , 5 , 5);
# INSERT INTO passengers(id, description, passport_id, ticket_id) VALUES (6 , null , 6 , 6);
# INSERT INTO passengers(id, description, passport_id, ticket_id) VALUES (7 , 'Old lady with dog' , 7 , 7);

