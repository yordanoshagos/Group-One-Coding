function busyPeriods(employees, locations, capacity){
    for(let location in locations){
        for( employee in employees){
            employee == location   
        }
    }
    if(employee.length < capacity){
        console.log("We need more employees")
    }
    else{
        console.log("Employees are enough")
    }
};
function labour(hoursWorked, salary, lawLabourHours){
    if(hoursWorked > lawLabourHours){
        let exceedingHours = hoursWorked - lawLabourHours;
        let newSalary = (exceedingHours * salary/100) + salary;
        console.log(newSalary)
    }
};
console.log(busyPeriods([{name: "Yordi", age: 21, skill: "customer care"}, {name: "Joy", age: 20, skill: "manager"}], ["Karen", "Umoja", "Kahawa West"], 20));
console.log(labour(14, 7000, 12));