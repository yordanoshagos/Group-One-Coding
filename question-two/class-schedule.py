classes = [
    {"name": "Math", "facility": "Lab", "duration": 2, "students": ["Alice", "Bob"]},
    {"name": "English", "facility": "Classroom", "duration": 1, "students": ["Charlie", "Alice"]}
]
teachers = [
    {"name": "Mr. Abel", "available": [9, 10, 11], "max_hours": 2},
    {"name": "Ms. Liya", "available": [10, 11, 12], "max_hours": 2}
]
facilities = [
    {"name": "Lab", "available": [9, 10, 11]},
    {"name": "Classroom", "available": [10, 11, 12]}
]

def schedule_classes(classes, teachers, facilities):
    schedule = []
    for cl in classes:

        for fac in facilities:
            if fac["name"] == cl["facility"]:
                for time in fac["available"]:

                    for t in teachers:
                        if time in t["available"] and t.get("assigned_hours", 0) + cl["duration"] <= t["max_hours"]:

                            schedule.append({"class": cl["name"], "teacher": t["name"], "facility": fac["name"], "time": time})
                            t["assigned_hours"] = t.get("assigned_hours", 0) + cl["duration"]
                            fac["available"].remove(time)
                            break
                    else:
                        continue
                    break
                break
    return schedule

result = schedule_classes(classes, teachers, facilities)
for item in result:
    print(item)