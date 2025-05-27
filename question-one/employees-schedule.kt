fun main(){ 
    busyPeriod(arrayOf("Joy","Ruby"),arrayOf("kakamoga", "kitoko"),10)
    labour(12,5000,9)
}
fun busyPeriod ( employees: Array<String>,  locations: Array<String>, capacity: Int,){
    for (location in locations){
        for ( employee in employees){
            employee == location
        }
    }
    if (employees.size < capacity){
        println("we need more employees")

    }
    else{
        println("employees are enough")
    }
}
fun labour(hoursWorked: Int, salary: Int, lawLabourHours: Int ){
    if (hoursWorked > lawLabourHours){
        var exceedingHours = hoursWorked - lawLabourHours
        var newSalary = (exceedingHours*salary)/100 + salary
        println(newSalary)
    }
    else{
        println(salary)
    }
}