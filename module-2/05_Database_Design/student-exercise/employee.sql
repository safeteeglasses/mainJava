drop table employee   cascade;
drop table department cascade;
drop table project    cascade;

Begin Transaction;

Create table employee
(
	employee_id		serial			not null,
	job_title		varchar(50)		not null,
	first_name              varchar(20)             not null,
	last_name               varchar(20)             not null,
	gender                  varchar(20)             not null,
	birthday                date                    not null,
	hire_date               date                    not null,
	department_id           serial                  not null,
	project_id              serial                  not null,
	
	constraint pk_employee_id primary key (employee_id),
	constraint chk_gender check (gender in ('male', 'female'))
);

Create table department
(
        department_id           serial                  not null,
        name                    varchar(50)             not null,
        number_of_employees     int                     not null,
        
        constraint pk_department_id primary key (department_id)

);

Create table project
(
        project_id              serial                            not null,
        name                    varchar(50) default 'Unassigned'  not null,
        start_date              varchar(50) default 'Not Started' not null,
        number_of_employees     int         default '000'         not null,
        
        constraint pk_project_id primary key (project_id)
        
);

Insert Into employee (employee_id, job_title, first_name, last_name, gender, birthday, hire_date, department_id, project_id) 
Values (1, 'Software Developer', 'Thomas', 'Richards', 'male', '05/04/1989', '05/01/2019', 1, 4);

Insert Into employee (employee_id, job_title, first_name, last_name, gender, birthday, hire_date, department_id, project_id)
Values (2, 'Software Developer', 'Cyrus', 'Fiete', 'male', '10/06/1991', '5/01/2019', 1, 4);

Insert Into employee (employee_id, job_title, first_name, last_name, gender, birthday, hire_date, department_id, project_id)
Values (3, 'Talent Aquisition', 'Laura', 'Richards', 'female', '02/26/1993', '3/01/2016', 4, 4);

Insert Into employee (employee_id, job_title, first_name, last_name, gender, birthday, hire_date, department_id, project_id)
Values (4, 'Sales Representative', 'Sean', 'Jaroch', 'male', '08/11/1991', '12/28/2008', 2, 1);

Insert Into employee (employee_id, job_title, first_name, last_name, gender, birthday, hire_date, department_id, project_id)
Values (5, 'Sales Representative', 'Mike', 'Tortora', 'male', '12/13/1991', '07/14/2012', 2, 1);

Insert Into employee (employee_id, job_title, first_name, last_name, gender, birthday, hire_date, department_id, project_id)
Values (6, 'Web Designer', 'Jack', 'Kenyon', 'male', '12/18/1993', '06/01/2015', 1, 3);

Insert Into employee (employee_id, job_title, first_name, last_name, gender, birthday, hire_date, department_id, project_id)
Values (7, 'auditor', 'Nathan', 'Tucker', 'male', '08/12/1989', '05/01/2014', 3, 2);

Insert Into employee (employee_id, job_title, first_name, last_name, gender, birthday, hire_date, department_id, project_id)
Values (8, 'Project Manager', 'Donald', 'Trump', 'male', '06/14/1946', '03/01/2024', 5, 1);

Insert Into employee (employee_id, job_title, first_name, last_name, gender, birthday, hire_date, department_id, project_id)
Values (9, 'Accountant', 'Ben', 'Wyatt', 'male', '03/12/1979', '08/01/2014', 3, 3);

Insert Into employee (employee_id, job_title, first_name, last_name, gender, birthday, hire_date, department_id, project_id)
Values (10, 'Project Manager', 'Ron', 'Swanson', 'male', '06/26/1970', '05/02/2019', 5, 1);

Insert Into employee (employee_id, job_title, first_name, last_name, gender, birthday, hire_date, department_id, project_id)
Values (11, 'Recruiting Assistant', 'Gina', 'Linetti', 'female', '02/24/1981', '04/21/2021', 4, 1);

 



Insert Into department (department_id, name, number_of_employees)
Values (1, 'Software Developement', 3);

Insert Into department (department_id, name, number_of_employees)
Values (2, 'Customer Service', 2);

Insert Into department (department_id, name, number_of_employees)
Values (3, 'Accounting', 2);

Insert Into department (department_id, name, number_of_employees)
Values (4, 'Human Resources', 2);

Insert Into department (department_id, name, number_of_employees)
Values (5, 'Project Manager', 2);



Insert Into project (project_id, name, start_date, number_of_employees)
Values (1, default, default , default);

Insert Into project (project_id, name, start_date, number_of_employees)
Values (2, 'Finish desk', (date '2018-06-08'), 1);

Insert Into project (project_id, name, start_date, number_of_employees)
Values (3, 'Weather app', (date '2019-01-14'), 2);

Insert Into project (project_id, name, start_date, number_of_employees)
Values (4, 'Update Resume', (date '2019-02-14'), 3);



ALTER TABLE employee
ADD FOREIGN KEY(department_id)
REFERENCES department(department_id);

ALTER TABLE employee
ADD FOREIGN KEY(project_id)
REFERENCES project(project_id);

Commit Transaction
;

Update employee
Set job_title = 'Talent Acquisition'
Where job_title = 'Talent Aquisition'
;
commit
;
