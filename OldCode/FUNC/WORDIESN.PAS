Program letters;

uses crt, dos;

{$I a:\func\words.jay}


var eat : string;

begin
     clrscr;
     begi;
     repeat
     textcolor (1);
     clrscr;
     write( '                             WORDIES COPYRIGHT JASON CHALOM' );
     writeln;
     writeln;
     textcolor (14);
     writeln( '1. copy the words' );
     writeln( '2. delete the words' );
     writeln( '3. change the words to numbers' );
     writeln( '4. Lets see if your code has and I or an O' );
     writeln( 'q. exit' );
     writeln;
     read(eat);


if (eat = '1' ) then
   begin
   clrscr;
   readln;
   copyme;
   readln;
end;

if (eat = '2' ) then
   begin
   clrscr;
   readln;
   deleteme;
   readln;
end;

if (eat = '3' ) then
   begin
   clrscr;
   readln;
   change_2_num;
   readln;
end;

if (eat = '4' ) then
   begin
   clrscr;
   readln;
   invalid_characters;
   readln;
   end;

until (eat = 'q' );
end.
