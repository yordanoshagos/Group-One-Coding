fun main() {
    val classes = listOf(
        Class("Math", "Lab", 2, listOf("Alice", "Bob")),
        Class("English", "Classroom", 1, listOf("Charlie", "Alice"))
    )
    val teachers = mutableListOf(
        Teacher("Mr. Kim", mutableListOf(9, 10, 11), maxHours = 2),
        Teacher("Ms. Lee", mutableListOf(10, 11, 12), maxHours = 2)
    )
    val facilities = mutableListOf(
        Facility("Lab", mutableListOf(9, 10, 11)),
        Facility("Classroom", mutableListOf(10, 11, 12))
    )
    val result = scheduleClasses(classes, teachers, facilities)
    result.forEach { println(it) }
}
data class Class(val name: String, val facility: String, val duration: Int, val students: List<String>)
data class Teacher(val name: String, val available: MutableList<Int>, var assignedHours: Int = 0, val maxHours: Int)
data class Facility(val name: String, val available: MutableList<Int>)
fun scheduleClasses(
    classes: List<Class>,
    teachers: MutableList<Teacher>,
    facilities: MutableList<Facility>
): List<Map<String, Any>> {
    val schedule = mutableListOf<Map<String, Any>>()
    for (cl in classes) {
        val fac = facilities.find { it.name == cl.facility }
        if (fac != null) {
            val times = fac.available.toList()
            for (time in times) {
                val teacher = teachers.find { time in it.available && it.assignedHours + cl.duration <= it.maxHours }
                if (teacher != null) {
                    schedule.add(mapOf("class" to cl.name, "teacher" to teacher.name, "facility" to fac.name, "time" to time))
                    teacher.assignedHours += cl.duration
                    fac.available.remove(time)
                    break
                }
            }
        }
    }
    return schedule
}