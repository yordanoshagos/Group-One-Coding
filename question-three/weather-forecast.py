weather_data = {}

def add_city(city, temperature, humidity, wind_speed):
    weather_data[city] = {
        "temperature": temperature,
        "humidity": humidity,
        "wind_speed": wind_speed
    }
    return weather_data


add_city("Nairobi", 25, 60, 15)
add_city("Mombasa", 30, 70, 20)
print(weather_data)