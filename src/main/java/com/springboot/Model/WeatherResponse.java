package com.springboot.Model;
import java.util.List;
public class WeatherResponse {

    private List<Weather> weather;
    private Main main;
    private int visibility;
    private Wind wind;
    private Clouds clouds;
    private int dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;

    
    // getters and setters
   
    
    

    public List<Weather> getWeather() {
		return weather;
	}

	public void setWeather(List<Weather> weather) {
		this.weather = weather;
	}

	public Main getMain() {
		return main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public int getVisibility() {
		return visibility;
	}

	public void setVisibility(int visibility) {
		this.visibility = visibility;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Clouds getClouds() {
		return clouds;
	}

	public void setClouds(Clouds clouds) {
		this.clouds = clouds;
	}

	public int getDt() {
		return dt;
	}

	public void setDt(int dt) {
		this.dt = dt;
	}

	public Sys getSys() {
		return sys;
	}

	public void setSys(Sys sys) {
		this.sys = sys;
	}

	public int getTimezone() {
		return timezone;
	}

	public void setTimezone(int timezone) {
		this.timezone = timezone;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public static class Weather {
        private int id;
        private String main;
        private String description;
        private String icon;
                
		public Weather() {
			super();
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getMain() {
			return main;
		}
		public void setMain(String main) {
			this.main = main;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getIcon() {
			return icon;
		}
		public void setIcon(String icon) {
			this.icon = icon;
		}

        
        // getters and setters
    }

    public static class Main {
        private double temp;
        private double feels_like;
        private double temp_min;
        private double temp_max;
        private int pressure;
        private int humidity;
        
        
        
        
        
        
		@Override
		public String toString() {
			return "Main [temp=" + temp + ", feels_like=" + feels_like + ", temp_min=" + temp_min + ", temp_max="
					+ temp_max + ", pressure=" + pressure + ", humidity=" + humidity + "]";
		}




		public double getTemp() {
			return temp;
		}
		
		
		
		
		public void setTemp(double temp) {
			this.temp = temp;
		}
		public double getFeels_like() {
			return feels_like;
		}
		public void setFeels_like(double feels_like) {
			this.feels_like = feels_like;
		}
		public double getTemp_min() {
			return temp_min;
		}
		public void setTemp_min(double temp_min) {
			this.temp_min = temp_min;
		}
		public double getTemp_max() {
			return temp_max;
		}
		public void setTemp_max(double temp_max) {
			this.temp_max = temp_max;
		}
		public int getPressure() {
			return pressure;
		}
		public void setPressure(int pressure) {
			this.pressure = pressure;
		}
		public int getHumidity() {
			return humidity;
		}
		public void setHumidity(int humidity) {
			this.humidity = humidity;
		}
		public Main() {
			super();
		}

        
        // getters and setters
    }

    public static class Wind {
        private double speed;
        private int deg;
		public Wind() {
			super();
		}
		public double getSpeed() {
			return speed;
		}
		public void setSpeed(double speed) {
			this.speed = speed;
		}
		public int getDeg() {
			return deg;
		}
		public void setDeg(int deg) {
			this.deg = deg;
		}

        // getters and setters
    }

    public static class Clouds {
        private int all;

		public Clouds() {
			super();
		}

		public int getAll() {
			return all;
		}

		public void setAll(int all) {
			this.all = all;
		}

        
        // getters and setters
    }

    public static class Sys {
        private int type;
        private int id;
        private double message;
        private String country;
        private int sunrise;
        private int sunset;
		public Sys(int type, int id, double message, String country, int sunrise, int sunset) {
			super();
			this.type = type;
			this.id = id;
			this.message = message;
			this.country = country;
			this.sunrise = sunrise;
			this.sunset = sunset;
		}
		public Sys() {
			super();
		}
		public int getType() {
			return type;
		}
		public void setType(int type) {
			this.type = type;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public double getMessage() {
			return message;
		}
		public void setMessage(double message) {
			this.message = message;
		}
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		public int getSunrise() {
			return sunrise;
		}
		public void setSunrise(int sunrise) {
			this.sunrise = sunrise;
		}
		public int getSunset() {
			return sunset;
		}
		public void setSunset(int sunset) {
			this.sunset = sunset;
		}
        
        
        // getters and setters
    }
    
    public WeatherResponse(WeatherResponse response) {
        setWeather(response.getWeather());
        setMain(response.getMain());
        setVisibility(response.getVisibility());
        setWind(response.getWind());
        setClouds(response.getClouds());
        setDt(response.getDt());
        setSys(response.getSys());
        setTimezone(response.getTimezone());
        setId(response.getId());
        setName(response.getName());
        setCod(response.getCod());
    }

    public WeatherResponse() {
    }

//    public WeatherResponse getWeather(WeatherResponse response) {
//        return new WeatherResponse(response.getWeather().get(0).getId(),
//                                    response.getWeather().get(0).getMain(),
//                                    response.getWeather().get(0).getDescription(),
//                                    response.getWeather().get(0).getIcon());
//    }
//
//    public WeatherResponse(int id, String main, String description, String icon) {
//        setId(id);
//        setMain(main);
//        setDescription(description);
//        setIcon(icon);
//    }
}