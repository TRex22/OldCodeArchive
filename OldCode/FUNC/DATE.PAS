program dart;
 uses Dos;

 const
   days : array [0..6] of String[9] =
     ('Sunday','Monday','Tuesday',
      'Wednesday','Thursday','Friday',
      'Saturday');
 var
   y, m, d, dow : Word;
 begin
   GetDate(y,m,d,dow);
   Writeln('Today is ', days[dow],', ',
           m:0, '/', d:0, '/', y:0);
 readln;
 end.


