def busy_periods(employees, locations, capacity):
  
    for location in locations:
        count = 0
        for employee in employees:
            if employee[1] == location:
                count += 1
        if count < capacity:
            print(f"We need more employees at {location}")
        else:
            print(f"Employees are enough at {location}")

def labour(hoursWorked, salary, lawLabourHours):
    if hoursWorked > lawLabourHours:
        exceedingHours = hoursWorked - lawLabourHours
        newSalary = (exceedingHours * salary/100) + salary
        print(f"Your new salary is {newSalary}")
    else:
        print(f"Your salary is {salary}")



busy_periods([("Ruby", "Karen"), ("Yordanos", "Karen"), ("Joy", "Korongo"), ("Dana", "Korongo"), ("Eleni", "Korongo")], ["Karen", "Korongo", "Kisumu"], 2)
labour(50, 1000, 40)
