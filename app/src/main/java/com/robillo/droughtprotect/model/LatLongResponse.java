package com.robillo.droughtprotect.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class LatLongResponse {

    /**
     * coord : {"lon":139,"lat":35}
     * sys : {"country":"JP","sunrise":1369769524,"sunset":1369821049}
     * weather : [{"id":804,"main":"clouds","description":"overcast clouds","icon":"04n"}]
     * main : {"temp":289.5,"humidity":89,"pressure":1013,"temp_min":287.04,"temp_max":292.04}
     * wind : {"speed":7.31,"deg":187.002}
     * rain : {"3h":0}
     * clouds : {"all":92}
     * dt : 1369824698
     * id : 1851632
     * name : Shuzenji
     * cod : 200
     */

    private CoordBean coord;
    private SysBean sys;
    private MainBean main;
    private WindBean wind;
    private RainBean rain;
    private CloudsBean clouds;
    private int dt;
    private int id;
    private String name;
    private int cod;
    private List<WeatherBean> weather;

    public CoordBean getCoord() {
        return coord;
    }

    public void setCoord(CoordBean coord) {
        this.coord = coord;
    }

    public SysBean getSys() {
        return sys;
    }

    public void setSys(SysBean sys) {
        this.sys = sys;
    }

    public MainBean getMain() {
        return main;
    }

    public void setMain(MainBean main) {
        this.main = main;
    }

    public WindBean getWind() {
        return wind;
    }

    public void setWind(WindBean wind) {
        this.wind = wind;
    }

    public RainBean getRain() {
        return rain;
    }

    public void setRain(RainBean rain) {
        this.rain = rain;
    }

    public CloudsBean getClouds() {
        return clouds;
    }

    public void setClouds(CloudsBean clouds) {
        this.clouds = clouds;
    }

    public int getDt() {
        return dt;
    }

    public void setDt(int dt) {
        this.dt = dt;
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

    public List<WeatherBean> getWeather() {
        return weather;
    }

    public void setWeather(List<WeatherBean> weather) {
        this.weather = weather;
    }

    public static class CoordBean {
        /**
         * lon : 139
         * lat : 35
         */

        private int lon;
        private int lat;

        public int getLon() {
            return lon;
        }

        public void setLon(int lon) {
            this.lon = lon;
        }

        public int getLat() {
            return lat;
        }

        public void setLat(int lat) {
            this.lat = lat;
        }
    }

    public static class SysBean {
        /**
         * country : JP
         * sunrise : 1369769524
         * sunset : 1369821049
         */

        private String country;
        private int sunrise;
        private int sunset;

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
    }

    public static class MainBean {
        /**
         * temp : 289.5
         * humidity : 89
         * pressure : 1013
         * temp_min : 287.04
         * temp_max : 292.04
         */

        private double temp;
        private int humidity;
        private int pressure;
        private double temp_min;
        private double temp_max;

        public double getTemp() {
            return temp;
        }

        public void setTemp(double temp) {
            this.temp = temp;
        }

        public int getHumidity() {
            return humidity;
        }

        public void setHumidity(int humidity) {
            this.humidity = humidity;
        }

        public int getPressure() {
            return pressure;
        }

        public void setPressure(int pressure) {
            this.pressure = pressure;
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
    }

    public static class WindBean {
        /**
         * speed : 7.31
         * deg : 187.002
         */

        private double speed;
        private double deg;

        public double getSpeed() {
            return speed;
        }

        public void setSpeed(double speed) {
            this.speed = speed;
        }

        public double getDeg() {
            return deg;
        }

        public void setDeg(double deg) {
            this.deg = deg;
        }
    }

    public static class RainBean {
        /**
         * 3h : 0
         */

        @SerializedName("3h")
        private int _$3h;

        public int get_$3h() {
            return _$3h;
        }

        public void set_$3h(int _$3h) {
            this._$3h = _$3h;
        }
    }

    public static class CloudsBean {
        /**
         * all : 92
         */

        private int all;

        public int getAll() {
            return all;
        }

        public void setAll(int all) {
            this.all = all;
        }
    }

    public static class WeatherBean {
        /**
         * id : 804
         * main : clouds
         * description : overcast clouds
         * icon : 04n
         */

        private int id;
        private String main;
        private String description;
        private String icon;

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
    }
}
