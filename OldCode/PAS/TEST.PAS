program big_1;

uses crt;

var key : char;
eat : string;

begin
clrscr;
textbackground (5);

sound ( 300 );
delay ( 400 );
nosound;
textcolor( 2 );
writeln ( 'hello' );
writeln;
textcolor (1);
writeln ( 'n. next once only' );
textcolor (4);
writeln ( 'q. exit ' );
read (key);
clrscr;

end.
end.