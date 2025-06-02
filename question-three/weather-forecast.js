const weatherData = {};
function addCity(city, temperature, humidity, windSpeed) {
    weatherData[city] = {
        temperature: temperature,
        humidity: humidity,
        wind_speed: windSpeed
    };
    return weatherData;
}

addCity("Nairobi", 25, 60, 15);
addCity("Mombasa", 30, 70, 20);
console.log(weatherData);