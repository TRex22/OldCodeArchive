program endlist;

uses crt, dos, printer;

var key : char;
     eat : string;
     num1 : string;
     num2 : string;
     pro1 : string;
     pric : string;
begin

     clrscr;
     writeln( '                      Pricer copyright Jason Chalom' );
     delay(555);
     writeln;
     writeln( 'Please type in the product' );
     read(pro1);
     writeln( 'Please type in the price of the product' );
     read(pric);

begin
     clrscr;
     writeln( 'The product is ',pro1);
     readln;
end;

until (pro1 = 'quit' );
end.