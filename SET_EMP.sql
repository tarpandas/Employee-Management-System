create or replace procedure "SET_EMP"
(empno_ IN OUT NUMBER,
name_ IN OUT VARCHAR2,
dept_ IN OUT VARCHAR2,
sal_ IN OUT NUMBER,
address_ IN OUT VARCHAR2,
phoneno_ IN OUT VARCHAR2,
emailid_ IN OUT VARCHAR2)
is
begin
 INSERT ALL
    into Employees (empno, name, dept, sal) values (empno_, name_, dept_, sal_)
    into EmployeeDetails (empno, address, phoneno, emailid) values (empno_, address_, phoneno_, emailid_)
 SELECT * from dual;
end;
