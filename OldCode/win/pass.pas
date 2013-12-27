{From Random.PAS}


{ For Windows: }
{ uses WinCrt; }
 program j;
 uses winCrt;
  var
  eat : string;
  calc : string;
  i_num : integer;
  r_num, sum : real;

 begin
   Randomize;
   repeat




    writeln( 'password' );
     readln(eat);

   if (eat = 'password' )then
        begin
      if (eat = 'password' )then begin
    clrscr;
   write( 'enter an integer..' );
   readln(i_num);
   write( 'enter a real number' );
   readln(r_num);
   sum := i_num + r_num;
   writeln;
   writeln( ' ',i_num,' + ', r_num:0:2,' = ',sum:0:2);

    end
    else
     writeln( 'type in a password or exit!' );
     readln(eat);
     end;



until (eat = 'q') or (eat = 'Q' ) or (eat = 'exit' )or (eat = 'EXIT' );;
end.


