package lesson2

fun main ()
{
   val workersQuan = 50; val workersSalary = 30000
   val mainWorkersFullSalary = workersSalary*workersQuan


   val internQuan = 30 ; val interSalary = 20000
   val internFullSalary = internQuan*interSalary

   val allmoney = internFullSalary+mainWorkersFullSalary


   val averageSalaryOfAll = allmoney/(workersQuan+internQuan)

   println( "Расходы на ЗП постоянных работников = $mainWorkersFullSalary")
   println ( "Расходы на ЗП стажеров = $allmoney" )
   println( "Расходы на ЗП после прихода стажеров = $averageSalaryOfAll")




}