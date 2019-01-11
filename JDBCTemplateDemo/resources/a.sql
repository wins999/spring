create or replace procedure GET_SUM(in first_num int, in second_num in, out result int)
begin atomic
	set result = first_num + second_num;
end 
/;