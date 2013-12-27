program multiplying_numbers;

{$I a:FACT}

var num : byte;
    eat : string;

begin


     repeat
     writeln ( 'This program determines the product of consecutive ' );
     writeln ( 'natural numbers from 1 to a number input by the user.' );
     writeln ( 'This product is called Factorial - written with an !' );
     writeln ( 'eg. 5! = 5 factorial =  1 x 2 x 3 x 4 x 5 = 120 ' );
     writeln ( 'to exit type EXIT or exit or quit or QUIT' );
     writeln;
     write ( 'Enter and integer .. ' );
     readln( num );
     writeln;
     writeln ( num, '! = ', Factorial(num) );
     readln (eat);

until (eat = 'exit' ) or (eat = 'EXIT' ) or (eat = 'Quit' ) or (eat = 'QUIT' );
end.