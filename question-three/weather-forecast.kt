fun main() {
    addCity("Nairobi", 25.0, 60.0, 15.0)
    addCity("Mombasa", 30.0, 70.0, 20.0)
    println(weatherData)
}

val weatherData = mutableMapOf<String, Map<String, Any>>()
fun addCity(city: String, temperature: Double, humidity: Double, windSpeed: Double): Map<String, Map<String, Any>> {
    weatherData[city] = mapOf(
        "temperature" to temperature,
        "humidity" to humidity,
        "wind_speed" to windSpeed
    )
    return weatherData
}
