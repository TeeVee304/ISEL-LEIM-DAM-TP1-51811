package dam_a51811.weatherbuddy.domain.model

data class WeatherInfo(
    val locationName: String,
    val temperatureCelsius: Double,
    val weatherCondition: String,
    val iconId: String,
    val humidityPercent: Int,
    val windSpeedKmH: Double
)
