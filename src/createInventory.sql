CREATE DATABASE mydatabase;
CREATE TABLE Inventory (
                           buildingLocation varchar(7),
                           heci varchar(255),
                           description varchar(255),
                           cost Double,
                           bayLocation Double,
                           status varchar(20),
                           quantity int

);

INSERT INTO Inventory (buildingLocation, heci, description, cost, bayLocation, status, quantity) VALUES ( 'NE9253','WPQSS1245', 'POWER PACK', 123.24,102.35, 'SPARE', 5);
INSERT INTO Inventory (buildingLocation, heci, description, cost, bayLocation, status, quantity) VALUES ('NE9253','WPSVSS1265', 'SONET PACK', 555.99,102.35, 'INSERVICE', 5);
INSERT INTO Inventory (buildingLocation, heci, description, cost, bayLocation, status, quantity) VALUES ('NE9253','STPQSS14545', 'REPEATER PACK', 423.99,102.35, 'INSERVICE', 5);

