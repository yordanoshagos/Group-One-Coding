const classes = [
    { name: "Math", facility: "Lab", duration: 2, students: ["Alice", "Bob"] },
    { name: "English", facility: "Classroom", duration: 1, students: ["Charlie", "Alice"] }
];
const teachers = [
    { name: "Mr. Abel", available: [9, 10, 11], maxHours: 2, assignedHours: 0 },
    { name: "Ms. Liya", available: [10, 11, 12], maxHours: 2, assignedHours: 0 }
];
const facilities = [
    { name: "Lab", available: [9, 10, 11] },
    { name: "Classroom", available: [10, 11, 12] }
];
function scheduleClasses(classes, teachers, facilities) {
    const schedule = [];
    for (let cl of classes) {
        const fac = facilities.find(f => f.name === cl.facility);
        if (fac) {
            for (let time of [...fac.available]) {
                let t = teachers.find(
                    t => t.available.includes(time) && (t.assignedHours + cl.duration <= t.maxHours)
                );
                if (t) {
                    schedule.push({ class: cl.name, teacher: t.name, facility: fac.name, time });
                    t.assignedHours += cl.duration;
                    fac.available = fac.available.filter(x => x !== time);
                    break;
                }
            }
        }
    }
    return schedule;
}
const result = scheduleClasses(classes, teachers, facilities);
console.log(result);