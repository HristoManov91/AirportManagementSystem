/* --- Airlines --- */

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
VALUES (4, null, null , 'TK', 'THY',
        'https://i.hurimg.com/i/hdn/75/0x0/5d70f33267b0a92d5c67f6b9.jpg',
        'TURKISH AIRLINES', '0850 333 0 849', 'https://www.turkishairlines.com/');

INSERT INTO airlines (id, description, email, iata_code, icao_code, image_url, name, phone, website)
VALUES (5, null, null , 'W6', 'WZZ',
        'https://www.fly4free.com/wp-content/uploads/2020/05/A321neo_WIZZ_AIR-800x537.jpg',
        'WIZZ AIR', '+90 063 949', 'https://wizzair.com/');

INSERT INTO airlines (id, description, email, iata_code, icao_code, image_url, name, phone, website)
VALUES (6, null, 'qinfo@qatarairways.com.qa', 'QR', 'QTR',
        'https://airlines-airports.com/wp-content/uploads/2019/01/Qatar-Airways-Interesting-Facts-1170x500.jpg',
        'QATAR AIRWAYS', '+97 444 237 999', 'https://www.qatarairways.com/en-bg/homepage.html');

/* --- Airports --- */

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (1 , 'Sofia' , 'Bulgaria' , 'SOF' , 'LBSF' , 'Sofia Airport' , 'https://sofia-airport.eu/');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (2 , 'Madrid' , 'Spain' , 'MAD' , 'LEMD' , 'MADRID-BARAJAS AIRPORT' , 'https://www.aeropuertomadrid-barajas.com/');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (3 , 'Bucharest' , 'Romania' , 'OTP' , 'LROP' , 'Bucharest Henri Coanda' , 'https://www.bucharestairports.ro/en');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (4 , 'Rome' , 'Italy' , 'FCO' , 'LIRF' , 'Aeroporto di Roma Fiumicino Leonardo da Vinci' , 'https://www.adr.it/fiumicino');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (5 , 'Paris' , 'France' , 'CDG' , 'LFPG' , 'Paris Charles de Gaulle Airport' , 'https://www.parisaeroport.fr/en');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (6 , 'Athens' , 'Greece' , 'ATH' , 'LGAV' , 'Athens International Airport Eleftherios Venizelos' , 'https://aia.gr/traveler/');

INSERT INTO airports(id, city, country, iata_code, icao_code, name, website)
VALUES (7 , 'Munich' , 'German' , 'MUC' , 'EDDM' , 'Munich Airport' , 'https://www.munich-airport.com/');

/* --- Airplanes --- */

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model , typical_range, airline_id, airport_id)
VALUES (1 , 'FB1000' , 2 , '2005-8-11' , null , 26730 , 26730 , 'Airbus' , 800 , 75000 , 'a320' , 6300 , 1 , 1);

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model , typical_range, airline_id, airport_id)
VALUES (2 , 'FB2000' , 2 , '2005-8-11' , null , 26730 , 26730 , 'Airbus' , 800 , 75000 , 'a320' , 6300 , 1 , 1);

INSERT INTO airplanes(id, arn, cockpit_crew, date_of_manufacture, description, fuel_capacity, fuel_consumption,
                      manufacture, max_speed, max_takeoff_weight, model , typical_range, airline_id, airport_id)
VALUES (2 , 'FB2000' , 2 , '2005-8-11' , null , 26730 , 26730 , 'Airbus' , 800 , 75000 , 'a320' , 6300 , 1 , 1);

