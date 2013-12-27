Function Factorial (FNum:byte) :LongInt;

var Prod : Longint;
    count : byte;

begin
     prod := 1;
     for count := 1 to FNum do
         prod := Prod * count;
     Factorial := Prod;
End;