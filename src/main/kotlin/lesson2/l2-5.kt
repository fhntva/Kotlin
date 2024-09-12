package lesson2

fun main ()
{
   var sum  = 70000.00  ; val percentPerYear = 1.167

   for (i in 0 ..19)

   {
      sum *= percentPerYear

   }
   println( String.format("%.3f", sum) )
}