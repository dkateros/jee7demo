--sample data. also fix sequences
insert into demo (id, localdate, string, localdatetime, bdvalue) values (1, current date, 'string', current timestamp, 12345678901234567.89);
select next value for demo_seq;