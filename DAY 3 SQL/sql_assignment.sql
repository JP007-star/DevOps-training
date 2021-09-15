create table regions(
region_id int unsigned NOT NULL primary key,
region_name varchar(255) NOT NULL);

create table countries(
country_id char(255) NOT NULL primary key,
country_name varchar(255) NOT NULL,
region_id int unsigned NOT NULL);

create table locations(
location_id int unsigned NOT NULL primary key auto_increment,
street_address varchar(255) NOT NULL,
postal_code varchar(11) NOT NULL,
city varchar(255) NOT NULL,
state_province varchar(255) NOT NULL,
country_id char(255) NOT NULL);

create table departments(
department_id int unsigned NOT NULL primary key auto_increment,
department_name varchar(255) NOT NULL,
manager_id int unsigned NOT NULL,
location_id int unsigned NOT NULL);

create table jobs(
job_id varchar(100) NOT NULL primary key,
job_title varchar(255) NOT NULL,
min_salary decimal unsigned,
max_salary decimal unsigned);

create table employees(
employee_id int unsigned NOT NULL primary key,
first_name varchar(255) NOT NULL,
last_name varchar(255) NOT NULL,
email varchar(255) NOT NULL,
phone_number varchar(255) NOT NULL,
hire_date  date NOT NULL,
job_id varchar(100) NOT NULL,
salary decimal NOT NULL,
commission_pct decimal,
manager_id int unsigned,
department_id int unsigned);

create table job_history(
employee_id int unsigned NOT NULL,
start_date date NOT NULL,
end_date date NOT NULL,
job_id varchar(255) NOT NULL,
department_id int unsigned NOT NULL);


alter table job_history add primary key (employee_id ,start_date);

alter table countries add constraint countries  foreign key  (region_id) references regions (region_id) ;
alter table locations add constraint locations  foreign key  (country_id) references countries (country_id) ;
alter table departments add constraint departments  foreign key  (location_id) references locations (location_id);

alter table employees add constraint employee_job  foreign key  (job_id) references jobs (job_id) ;
alter table employees add constraint employee_department  foreign key  (department_id) references departments (department_id) ;
alter table employees add constraint employee_manager  foreign key  (manager_id) references employees (employee_id) ;
alter table departments add constraint department_manager  foreign key  (manager_id) references employees (manager_id) ;
alter table job_history add constraint job_history_emp_id  foreign key  (employee_id) references employees (employee_id) ;
alter table job_history add constraint job_history_job  foreign key  (job_id) references jobs (job_id) ;
alter table job_history add constraint job_history_department  foreign key  (department_id) references departments (department_id);
set foreign_key_checks=0;

INSERT INTO regions
	VALUES (
		1,
		'Europe'
		);
        
insert into countries
  values (
      1,
      'JP',
       1);
INSERT INTO locations
	VALUES (
		1200,
		'2017 Shinjuku-ku',
		'1689',
		'Tokyo',
		'Tokyo Prefecture',
		'JP'
		);
INSERT INTO departments
	VALUES (
		10,
		'Administration',
		200,
		1700
		);
INSERT INTO locations
	VALUES (
		1200,
		'2017 Shinjuku-ku',
		'1689',
		'Tokyo',
		'Tokyo Prefecture',
		'JP'
		);
INSERT INTO jobs
	VALUES (
		'AD_VP',
		'Administration Vice President',
		15000,
		30000
		);
INSERT INTO employees
	VALUES (
		100,
		'Steven',
		'King',
		'SKING',
		'515.123.4567',
		STR_TO_DATE('17-JUN-1987', '%d-%M-%Y'),
		'AD_PRES',
		24000,
		NULL,
		NULL,
		90
		);
INSERT INTO job_history
	VALUES (
		200,
		STR_TO_DATE('17-Sep-1987','%d-%M-%Y'),
		STR_TO_DATE('17-Jun-1993','%d-%M-%Y'),
		'AD_ASST',
		90
		);
desc job_history;














