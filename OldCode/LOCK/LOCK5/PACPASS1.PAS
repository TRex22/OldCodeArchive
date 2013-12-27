Program lock;

uses crt, dos;
{$I c:\filer.lok}

var key : char;
eat : string;
nam : string;
nan : string;

begin
textcolor (2);
      repeat
      nammm;
      read(nan);
      read(nam);
      until (nam = '' );
      repeat
      pass;
      read(eat);


if (eat = 'JayLog' ) then
      writeln( 'Access Accepted ',nam )
         Else
         begin
       writeln( 'Access Denied ',nan );
       delay(550);
       clrscr;
       readln;
end;

if (eat = 'forgot' ) then
   by;
   delay(550);


until (eat = 'JayLog' ) or (eat = 'forgot' );
clrscr;
end.