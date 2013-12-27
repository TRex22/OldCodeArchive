program ram;
 uses Crt;

 begin
   Randomize;
   repeat
     { Write random numbers }
   Write (Random(9000));
   until KeyPressed;
 end.


