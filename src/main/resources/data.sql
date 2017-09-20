insert into passenger(id, firstname, lastname, frequent_flyer_miles) values(1000, 'Natasha', 'Johanson', 1574);
insert into passenger(id, firstname, lastname, frequent_flyer_miles) values(2000, 'Jon', 'Snow', 4654);
insert into passenger(id, firstname, lastname, frequent_flyer_miles) values(3000, 'Eddard', 'Stark', 498746);
insert into passenger(id, firstname, lastname, frequent_flyer_miles) values(4000, 'Jimi', 'Joplin', 2654);
insert into passenger(id, firstname, lastname, frequent_flyer_miles) values(5000, 'Steven', 'Segal', 15874);

insert into flight(id, number, departure, destination) values(1000, 'FL3.74B', 'Brussels Airport', 'JFK');
insert into flight(id, number, departure, destination) values(2000, 'FL8.97C', 'Kinshasa', 'Hong Kong Int.');
insert into flight(id, number, departure, destination) values(3000, 'FL7.68Z', 'Heathrow', 'Paris Orly');

insert into ticket(id, price, passenger_id, flight_id) values(1000, 147.65, 1000, 2000);
insert into ticket(id, price, passenger_id, flight_id) values(2000, 988, 2000, 3000);
insert into ticket(id, price, passenger_id, flight_id) values(3000, 499.95, 5000, 2000);