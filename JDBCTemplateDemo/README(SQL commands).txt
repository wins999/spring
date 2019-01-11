Create Table Employeee(
  id number,
  name varchar2(50),
  age  number,
  salary number
);

select * from Employeee


alter table Employeee add constraint pk_id primary key(id);

create sequence emp_Seq
start with 1
increment by 1
nocache

create or replace trigger emp_trigger
before insert
on Employeee
for each row
begin
select emp_Seq.nextVal into :new.id from dual;
end;

desc employeee