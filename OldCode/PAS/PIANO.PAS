program noisy;

uses crt, dos;

var key : char;

begin
clrscr;
repeat
clrscr;
textcolor (2);
textbackground (1);
writeln ( 'a tip the sounds go from a to z and then 0 to 9 and *, -, +, /, ?, \ and so on' );
{ writeln ( 'for hz click hz' );}
writeln (  'q.Exit' );
read (key);

{if (key = 'hz' ) then
begin
textcolor (2);
textbackground (1);
{textunderline (5); }
{ writeln ( 'a for 500 hz' );
writeln ( 'b for 95 hz ' );
end; }

if ( key = 'a' ) then
begin
TEXTCOLOR (1);
sound (90);
delay (400);
nosound;

end;

if (key = 'b' ) then
begin
sound (92);
delay (400);
nosound;

end;

if (key = 'c' ) then
begin
sound (202);
delay (400);
nosound;

end;
if (key = 'd' ) then
begin
sound (93);
delay (400);
nosound;

end;
if (key = 'e' ) then
begin
sound (203);
delay (400);
nosound;

end;
if (key = 'f' ) then
begin
sound (204);
delay (400);
nosound;

end;
if (key = 'g' ) then
begin
sound (96);
delay (400);
nosound;

end;
if (key = 'h' ) then
begin
sound (97);
delay (400);
nosound;

end;
if (key = 'i' ) then
begin
sound (98);
delay (400);
nosound;

end;
if (key = 'j' ) then
begin
sound (99);
delay (400);
nosound;

end;
if (key = 'k' ) then
begin
sound (100);
delay (400);
nosound;

end;
if (key = 'l' ) then
begin
sound (101);
delay (400);
nosound;

end;
if (key = 'o' ) then
begin
sound (102);
delay (400);
nosound;

end;
if (key = 'm' ) then
begin
delay (103);
delay (400);
nosound;

end;
if (key = 'n' ) then
begin
sound (103);
delay (400);
nosound;

end;
if (key = 'p' ) then
begin
sound (104);
delay (400);
nosound;

end;
if (key = 'q' ) then
begin
sound (105);
delay (400);
nosound;

end;
if (key = 'r' ) then
begin
sound (106);
delay (400);
nosound;

end;
if (key = 's' ) then
begin
sound (107);
delay (400);
nosound;

end;
if (key = 't' ) then
begin
sound (108);
delay (400);
nosound;

end;
if (key = 'u' ) then
begin
sound (109);
delay (400);
nosound;

end;
if (key = 'v' ) then
begin
sound (110);
delay (400);
nosound;

end;
if (key = 'w' ) then
begin
sound (111);
delay (400);
nosound;

end;
if (key = 'x' ) then
begin
sound (112);
delay (400);
nosound;

end;
if (key = 'y' ) then
begin
sound (113);
delay (400);
nosound;

end;
if (key = 'z' ) then
begin
sound (114);
delay (400);
nosound;

end;
if (key = '0' ) then
begin
sound (115);
delay (400);
nosound;

end;
if (key = '1' ) then
begin
sound (116);
delay (400);
nosound;

end;
if (key = '2' ) then
begin
sound (117);
delay (400);
nosound;

end;
if (key = '3' ) then
begin
sound (118);
delay (400);
nosound;

end;
if (key = '4' ) then
begin
sound (119);
delay (400);
nosound;

end;
if (key = '5' ) then
begin
sound (120);
delay (400);
nosound;

end;
if (key = '6' ) then
begin
sound (121);
delay (400);
nosound;

end;
if (key = '7' ) then
begin
sound (122);
delay (400);
nosound;

end;
if (key = '8' ) then
begin
sound (123);
delay (400);
nosound;

end;
if (key = '9' ) then
begin
sound (124);
delay (400);
nosound;

end;
if (key = '*' ) then
begin
sound (125);
delay (400);
nosound;

end;
if (key = '-' ) then
begin
sound (126);
delay (400);
nosound;

end;
if (key = '+' ) then
begin
sound (127);
delay (400);
nosound;

end;
if (key = '/' ) then
begin
sound (128);
delay (400);
nosound;

end;
if (key = '?' ) then
begin
sound (129);
delay (400);
nosound;

end;
if (key = '\' ) then
begin
sound (130);
delay (400);
nosound;

end;
if (key = '=' ) then
begin
sound (440);
delay (400);
nosound;
end;
if (key = 'A' ) then
begin
sound (466);
delay (400);
nosound;
end;
if (key = 'B' ) then
begin
sound (493);
delay (400);
nosound;
end;
if (key = 'C' ) then
begin
sound (523);
delay (400);
nosound;
end;
if (key = 'D' ) then
begin
sound (555);
delay (400);
end;
if (key = 'E' ) then
begin
sound (587);
delay (400);
nosound;
end;
if (key = 'F' ) then
begin
sound (623);
delay (400);
nosound;
end;
if (key = 'G' ) then
begin
sound (659);
delay (400);
nosound;
end;
if (key = 'H' ) then
begin
sound (698);
delay (400);
nosound;
end;
if (key = 'I' ) then
begin
sound (698);
delay (400);
nosound;
end;
if (key = 'J' ) then
begin
sound (740);
delay (400);
nosound;
end;
if (key = 'K' ) then
begin
sound (783);
delay (400);
nosound;
end;
if (key = 'L' ) then
begin
sound (831);
delay (400);
nosound;
end;
if (key = 'O' ) then
begin
sound (880);
delay (400);
nosound;
end;
if (key = 'M' ) then
begin
sound (600);
delay (400);
nosound;
end;
if (key = 'N' ) then
begin
sound (500);
delay (400);
nosound;
end;
if (key = 'P' ) then
begin
sound (400);
delay (400);
nosound;
end;
if (key = 'Q' ) then
begin
sound (300);
delay (400);
nosound;
end;
if (key = 'R' ) then
begin
sound (200);
delay (400);
nosound;
end;
if (key = 'S' ) then
begin
sound (1);
delay (400);
nosound;
end;
if (key = 'T' ) then
begin
sound (2);
delay (400);
NOSOUND;
end;
if (key = 'U' ) then
begin
sound (3);
delay (400);
NOSOUND;
end;
if (key = 'V' ) then
begin
sound (4);
delay (400);
NOSOUND;
end;
if (key = 'W' ) then
begin
sound (5);
delay (400);
NOSOUND;
end;
if (key = 'X' ) then
begin
sound (6);
delay (400);
NOSOUND;
end;
if (key = 'Y' ) then
begin
sound (7);
delay (400);
NOSOUND;
end;
if (key = 'Z' ) then
begin
sound (8);
delay (400);
NOSOUND;
end;
if (key = '_' ) then
begin
sound (201);
delay (400);
NOSOUND;
 end;
if (key = '/' ) then
begin
sound (202);
delay (400);
NOSOUND;
 end;
if (key = '}' ) then
begin
sound (203);
delay (400);
NOSOUND;
 if (key = '{' ) then
begin
sound (204);
delay (400);
NOSOUND;
 end;
 if (key = ']' ) then
begin
sound (205);
delay (400);
NOSOUND;
 end;
 if (key = '[' ) then
begin
sound (206);
delay (400);
NOSOUND;
 end;
 if (key = '|' ) then
begin
sound (207);
delay (400);
NOSOUND;
 end;
 if (key = '"' ) then
begin
sound (208);
delay (400);
NOSOUND;
 end;
 if (key = ';' ) then
begin
sound (209);
delay (400);
NOSOUND;
 end;
 if (key = ':' ) then
begin
sound (210);
delay (400);
NOSOUND;
 end;
 if (key = '.' ) then
begin
sound (211);
delay (400);
NOSOUND;
 if (key = ',' ) then
begin
sound (212);
delay (400);
NOSOUND;
 end;
 if (key = '>' ) then
begin
sound (213);
delay (400);
NOSOUND;
 end;
 if (key = '<' ) then
begin
sound (214);
delay (400);
NOSOUND;
 end;
end;
 end;
clrscr;
until (key = 'q' ) or (key = 'Q' ) or (key = 'Exit');
clrscr;

end.
{end.}