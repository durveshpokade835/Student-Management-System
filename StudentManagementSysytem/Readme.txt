Install Mysql Database In your system and mysql database connector;

Open MySql Command line client and

Follow The Following Steps;

1)to Create A Data Database 
	Command-
		Create Database projectsms;
2)to show All database;
	Command-
		show databases;
3)Now select your database which you have created
	command-
		use projectsms;
4)To create tables (You have to create 2 tables for admin and student)

	A)	-------FOR STUDENTS DATA -----

		i) table for students data;-
	command-
		CREATE TABLE alldata(username varchar(255),password varchar(255), id INT,fullname VARCHAR(255),contact VARCHAR(255),semester VARCHAR(255),branch VARCHAR(255), fee Decimal(10,2));

		ii)To insert student sample entry
	command-
		INSERT INTO alldata (username, password, id, fullname, contact, semester, branch, fee) VALUES ('johnsmith', 'mypassword', 1, 'John Smith', '1234567890', 'IV', 'Computer Science', 2500.00);

	A)	-------FOR ADMIN DATA -----

		i) table for ADMIN data;-
	command-
		CREATE TABLE alladmindata(username varchar(255),password varchar(255), id INT,fullname VARCHAR(255),contact VARCHAR(255));

		ii)To insert ADMIN sample entry
	command-
		INSERT INTO alladmindata (username, password, id, fullname, contact) VALUES ('ABC', 'abc', 1, 'ABC Smith', '9123456780');


6)to show all the tables-
	command- 
		show tables;
7)to select your table which u have created -
	command-
		select * from alldata;
		select * from alladmindata;


Now you are ready to go


		
