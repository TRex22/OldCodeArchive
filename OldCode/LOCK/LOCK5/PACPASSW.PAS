Program lock;

uses wincrt, windos;
{$I c:\filerw.lok}

var key : char;
eat : string;
nam : string;
nan : string;

begin
      repeat
      nammm;
      read(nan);
      read(nam);
      until (nam = '' );
      repeat
      pass;
      read(eat);


if (eat = 'JayLog' ) then
          begin
      readln;
      writeln( 'Access Accepted ',nan );
      readln;
      end
               else
               begin
      readln;
      writeln( 'Access Denied ',nan );
      readln;
      clrscr;
end;

if (eat = 'forgot' ) then
   begin
   readln;
   by;
end;

until (eat = 'JayLog' ) or (eat = 'forgot' );
clrscr;
end.