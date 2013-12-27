Program lock;

uses wincrt, windos;

var key : char;
eat : string;

begin

repeat
      clrscr;
      writeln( '                      Lock 2.0 copyright Jason Chalom 2006' );
      writeln;
      writeln ( 'Password:' );
      read(eat);
clrscr;

if (eat = 'JayLog' ) then
       writeln( 'Access Accepted' )
         Else
         begin
       writeln( 'Access Denied' );
       clrscr;
       readln;
end;

if (eat = 'forgot' ) then
   begin
   clrscr;
   writeln( 'Bypassed Password' );
   readln;
   end;

until (eat = 'JayLog' ) or (eat = 'forgot' );
clrscr;
end.