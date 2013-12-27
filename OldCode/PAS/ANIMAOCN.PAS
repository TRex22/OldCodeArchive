program animcion;

uses crt;

FUNCTION move_4:
begin
textcolor (1);
gotoxy (40,10);
write( '' );
textcolor (2);
gotoxy (40,13);
write( '-------' );
gotoxy (40,13);
write( '-' );
gotoxy (39,13);
write( '-' );
gotoxy (38, 13);
write( '-' );
gotoxy (37,13);
write( '-' );
gotoxy (36,13);
write( '-' );
gotoxy (35,13);
write( '-' );
gotoxy (34,13);
write( '-' );
textcolor (6);
gotoxy (40,11);
write( '|' );
gotoxy (40,14);
write( '|' );
textcolor (14);
gotoxy (41,15);
write( '\' );
gotoxy (41,16);
write( '\' );
gotoxy (39,15);
write( '/' );
gotoxy (39,16);
write( '/' );
end;




FUNCTION  move1;
gotoxy (40,10);
textcolor (1);
write( '' );
textcolor (6);
gotoxy (40,11);
write( '|' );
gotoxy (40,15);
write( '|' );
gotoxy (40,16);
write( '|' );
gotoxy (40,17);
write( '|' );
textcolor (2);
gotoxy (40,13);
write( '-' );
gotoxy (42,12);
write( '|' );
gotoxy (42,15);
write( '|' );
gotoxy (38,12);
write( '|' );
gotoxy (38,15);
write( '|' );
end;
var eat : char;
begin
textcolor (4);
writeln( 'press any key to end this program' );
delay(1000);
repeat
clrscr;
move_4;
delay(500);
clrscr;
move1;
delay(500);
until (eat = 'q' ) or (eat = 'Q' );
end.

