Program eater;

uses crt, dos;
{$I a:\eatmer.eat}

var key : char;
eat : string;

begin
     clrscr;
     textcolor (15);
     begi;
     textcolor (20);
     burns;
     textcolor (17);
     sides1;
     textcolor (18);
     sides2;

     delay(450);
     readln;
     clrscr;
     textcolor(15);
     writeln( 'Please type in your nickname:' );
     read(eat);
     clrscr;
     readln;
     gotoxy(35,10);
     write( 'welcome ',eat );
     gotoxy(35,11);
     textcolor (18);
     write( 'ARE YOU READY?' );
     delay(300);
     gotoxy(35,12);
     write( 'FOR DANGER....' );
     readln;
     textcolor (2);
     clrscr;
     writeln( '                                 Here is your task ',eat );
     writeln;
     writeln( 'you are MR. MoMo and you have to save the Earth' );
     writeln( 'you must break through the "aliens"' );
     writeln( 'with any weapons you can think of but in the beginning you only have' );
     writeln( 'a laser gun.' );
     writeln( 'This is you:  These are the aliens:  ç í ' );
     writeln( '        LET''S GO!!!!!!!!!!!!!!!!!!' );
     readln;
     clrscr;
     gotoxy(5,2);
     write( '========================================================================' );
     gotoxy(5,25);
     write( '========================================================================' );
     readln;
end.