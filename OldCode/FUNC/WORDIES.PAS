Program letters;

uses crt, dos;

{$I a:\func\words.jay}


var eat : string;

begin
     repeat
     textcolor (1);
     clrscr;
     write( '                             WORDIES COPYRIGHT JASON CHALOM' );
     writeln;
     writeln;
     sound;
     readln;
     textcolor (2);
     writeln( '1. copy the words' );
     writeln;
     writeln( '2. delete the words' );
     writeln;
     writeln( '3. change the words to numbers' );
     writeln;
     writeln( 'q. exit' );
     writeln;
     read(eat);


if (eat = '1' ) then
   begin
   clrscr;
   textcolor (1);
   readln;
   copyme;
   readln;
end;

if (eat = '2' ) then
   begin
   clrscr;
   textcolor (3);
   readln;
   deleteme;
   readln;
end;

if (eat = '3' ) then
   begin
   clrscr;
   textcolor (4);
   readln;
   change_2_num;
   readln;
end;

until (eat = 'q' );
end.
