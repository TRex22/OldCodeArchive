program maths;

uses crt, dos, printer;

var key : char;
eat : string;
math1 : integer;
math2 : real;
menu : string;
r : string;

begin
textcolor (4);
writeln( 'p. print' );
writeln( 'n. no printing' );
read(menu);

if (r = 'n' ) then begin
textcolor (15);
writeln( 'm.maths' );
