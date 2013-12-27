program space;

uses crt, dos;

var
eat : string;

begin
 textbackground (14);
 clrscr;
 textcolor (0);
 window (40,16 ,10,15);
 writeln ( 'space' );
 writeln ( 'type pass word to exit ' );
 repeat
 sound (150);
 delay (100);
 sound (600);
 delay (100);
 sound (450);
 delay (100);
 sound (900);
 delay (100);
 sound (750);
 delay (100);
 sound (150);
 delay (100);
 sound (550);
 delay (100);
 sound (980);
 delay (100);
 sound (100);
 delay (100);
 sound (390);
 delay (100);
 sound (150);
 delay (100);
 sound (600);
 delay (100);
 sound (450);
 delay (100);
 sound (970);
 delay (100);
 sound (750);
 delay (100);
 sound (180);
 delay (100);
 sound (260);
 delay (100);
 sound (910);
 delay (100);
 sound (999);
 delay (100);
 sound (750);
 delay (100);
 sound (150);
 delay (100);
 sound (600);
 delay (100);
 sound (450);
 delay (100);
 sound (900);
 delay (100);
 sound (750);
 delay (100);
 read(eat);

 nosound;
until (eat = 'jason');
end.