program supermem  ;
uses WinCrt;

 type
   memorySpace = record
                 Name: string[250];
                 Age : Byte;
                 adress : string[250];
                 more : string[250];
                 jkl : string[250];

                 Name1: string[250];
                 Age1 : Byte;
                 adress1 : string[250];
                 more1 : string[250];
                 jkl1 : string[250];

                 Name2: string[250];
                 Age2 : Byte;
                 adress2 : string[250];
                 more2 : string[250];
                 jkl2 : string[250];

                 Name3: string[250];
                 Age3 : Byte;
                 adress3 : string[250];
                 more3 : string[250];
                 jkl3 : string[250];

                 Name4: string[250];
                 Age4 : Byte;
                 adress4 : string[250];
                 more4 : string[250];
                 jkl4 : string[250];

                 Name5: string[250];
                 Age5 : Byte;
                 adress5 : string[250];
                 more5 : string[250];
                 jkl5 : string[250];

                 Name6: string[250];
                 Age6 : Byte;
                 adress6 : string[250];
                 more6 : string[250];
                 jkl6 : string[250];

                 Name7: string[250];
                 Age7 : Byte;
                 adress7 : string[250];
                 more7 : string[250];
                 jkl7 : string[250];

                 Name8: string[250];
                 Age8 : Byte;
                 adress8 : string[250];
                 more8 : string[250];
                 jkl8 : string[250];

                 Name9: string[250];
                 Age9 : Byte;
                 adress9 : string[250];
                 more9 : string[250];
                 jkl9 : string[250];

              

                 memSpace = record
                 Name: string[250];
                 Age : Byte;
                 adress : string[250];
                 more : string[250];
                 jkl : string[250];

                 Name1: string[250];
                 Age1 : Byte;
                 adress1 : string[250];
                 more1 : string[250];
                 jkl1 : string[250];

                 Name2: string[250];
                 Age2 : Byte;
                 adress2 : string[250];
                 more2 : string[250];
                 jkl2 : string[250];

                 Name3: string[250];
                 Age3 : Byte;
                 adress3 : string[250];
                 more3 : string[250];
                 jkl3 : string[250];

                 Name4: string[250];
                 Age4 : Byte;
                 adress4 : string[250];
                 more4 : string[250];
                 jkl4 : string[250];

                 Name5: string[250];
                 Age5 : Byte;
                 adress5 : string[250];
                 more5 : string[250];
                 jkl5 : string[250];

                 Name6: string[250];
                 Age6 : Byte;
                 adress6 : string[250];
                 more6 : string[250];
                 jkl6 : string[250];

                 Name7: string[250];
                 Age7 : Byte;
                 adress7 : string[250];
                 more7 : string[250];
                 jkl7 : string[250];

                 Name8: string[250];
                 Age8 : Byte;
                 adress8 : string[250];
                 more8 : string[250];
                 jkl8 : string[250];

                 Name9: string[250];
                 Age9 : Byte;
                 adress9 : string[250];
                 more9 : string[250];
                 jkl9 : string[250];
                 end;

 var            
   p: pointer;
 begin
   if MaxAvail < SizeOf(memorySpace) then
     Writeln('Not enough memory')
   else
   begin
     { Allocate memory on heap }
     GetMem(p, SizeOf(memorySpace));
     FreeMem(p, SizeOf(memorySpace));
     Getmem(p, sizeof(memspace));
     freemem(p, sizeof(memspace));

   end;
 end.


