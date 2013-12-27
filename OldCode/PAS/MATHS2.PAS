program jasson;

uses crt;
var
        i_num : integer;
        r_num, sum : real;
        ln : string;
begin
{clrscr;
repeat
clrscr;
textcolor (9);
sound (90);
delay (400);
sound (1000);
delay (400);
NOsound;



writeln( '1.+' );
writeln( '2.-' );
writeln( '3.*' );

writeln( 'q.exit ' );
read(ln);
if (ln = '1' ) then}
begin
clrscr;


clrscr;
textcolor (4);
sound (500);
delay (400);
sound (600);
delay (400);
nosound;
write( 'enter an integer .. ' );
readln ( i_num );
write( 'enter a real number ' );
read ( r_num );
sum := i_num + r_num;
writeln;
writeln( 'the sum of ',i_num ,'+ ',r_num:0:2,' = ', sum:0:2 );
readln;
read (ln);
end;
if (ln = '2' ) then
begin
clrscr;


{clrscr;
textcolor (4);
sound (500);
delay (400);
sound (600);
delay (400);
nosound;
write( 'enter an integer .. ' );
readln ( i_num );
write( 'enter a real number ' );
read ( r_num );
sum := i_num - r_num;
writeln;
writeln( 'the sum of ',i_num ,'- ',r_num:0:2,' = ', sum:0:2 );
readln;
read (ln);

end.

if (ln = '3' ) then
begin
clrscr;}


{clrscr;
textcolor (4);
sound (500);
delay (400);
sound (600);
delay (400);
nosound;
write( 'enter an integer .. ' );
readln ( i_num );
write( 'enter a real number ' );
read ( r_num );
sum := i_num * r_num;
writeln;
writeln( 'the sum of ',i_num ,'* ',r_num:0:2,' = ', sum:0:2 );
readln;
read (ln);}

end;
end.
end.