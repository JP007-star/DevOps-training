drop table employee;
alter table department add depthead varchar(60);
desc department;
select * from department;
alter table department modify column depthead varchar(50);
alter table department drop column depthead;

update department set deptname="D3" where deptid=3;

delete from department where deptid=1;
insert into department values(6,'D6','Pune');
insert into department values(7,'D7','Chennai');
insert into department values(8,'D8','Delhi');
insert into department values(9,'D9','Bangalore');


select * from department order by deptid ;
select * from department order by deptid desc;
select location from department order by deptid desc ;

select max(deptid) from department; 
select sum(deptid) from department where location="Lucknow"; 

select count(deptname),location from department group by location;

select count(deptname), location from department group by location having count(deptname)=1;
select count(deptname), location from department group by location having count(deptname)>1