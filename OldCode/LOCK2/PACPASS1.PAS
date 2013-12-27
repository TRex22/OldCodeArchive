Program lock;

uses crt, dos;

var key : char;
eat : string;

begin

repeat
      textcolor (2);
      clrscr;
      writeln( '                      Lock 2.0 copyright Jason Chalom 2006' );
      delay(555);
      writeln;
      writeln ( 'Password:' );
      read(eat);


if (eat = 'JayLog' ) then
       writeln( 'Access Accepted' )
         Else
         begin
       writeln( 'Access Denied' );
       Delay(999);
       clrscr;
       readln;
end;

if (eat = 'forgot' ) then
   begin
   writeln( 'Bypassed Password' );
   delay(555);
end;

until (eat = 'JayLog' ) or (eat = 'forgot' );
clrscr;
end.