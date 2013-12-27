program fun;

uses crt;

VAR key  : char;
    ln : string;
    answer,k : integer;

  begin

    textcolor (1);
    writeln;

     writeln( 'maths time!' );
     repeat
      clrscr;
      sound (1000);
      delay (400);
      nosound;
      writeln( 'what is 2*',k,'=? ,press <9> to stop' );
      readln ( k {ln} );
      if ( answer = (2 * k) ) then
        begin

        writeln ( 'good work' );
         delay( 1000 );
         inc(k);
       end
     else if answer <> 0
      then begin
         writeln ( 'try again' );
         delay( 1000 );
         end
      until k = 9;
   end.





 







  clrscr;
end.

