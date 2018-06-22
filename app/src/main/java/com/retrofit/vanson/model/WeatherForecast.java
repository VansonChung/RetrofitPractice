package com.retrofit.vanson.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class WeatherForecast {

    /**
     * cod : 200
     * message : 0.0102
     * cnt : 37
     * list : [{"dt":1529053200,"main":{"temp":298.39,"temp_min":298.39,"temp_max":298.624,
     * "pressure":1007.98,"sea_level":1016.67,"grnd_level":1007.98,"humidity":100,
     * "temp_kf":-0.24},"weather":[{"id":500,"main":"Rain","description":"light rain",
     * "icon":"10d"}],"clouds":{"all":92},"wind":{"speed":5.86,"deg":38.0007},
     * "rain":{"3h":0.125},"sys":{"pod":"d"},"dt_txt":"2018-06-15 09:00:00"},{"dt":1529064000,
     * "main":{"temp":298.12,"temp_min":298.12,"temp_max":298.297,"pressure":1009.12,
     * "sea_level":1017.88,"grnd_level":1009.12,"humidity":100,"temp_kf":-0.18},
     * "weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],
     * "clouds":{"all":92},"wind":{"speed":5.46,"deg":48.5091},"rain":{"3h":0.044999999999998},
     * "sys":{"pod":"n"},"dt_txt":"2018-06-15 12:00:00"},{"dt":1529074800,"main":{"temp":297.85,
     * "temp_min":297.85,"temp_max":297.964,"pressure":1010.06,"sea_level":1018.72,
     * "grnd_level":1010.06,"humidity":100,"temp_kf":-0.12},"weather":[{"id":500,"main":"Rain",
     * "description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":5.21,
     * "deg":92.0013},"rain":{"3h":0.805},"sys":{"pod":"n"},"dt_txt":"2018-06-15 15:00:00"},
     * {"dt":1529085600,"main":{"temp":297.8,"temp_min":297.8,"temp_max":297.86,
     * "pressure":1009.11,"sea_level":1017.79,"grnd_level":1009.11,"humidity":100,
     * "temp_kf":-0.06},"weather":[{"id":500,"main":"Rain","description":"light rain",
     * "icon":"10n"}],"clouds":{"all":44},"wind":{"speed":4.31,"deg":98.0033},
     * "rain":{"3h":0.195},"sys":{"pod":"n"},"dt_txt":"2018-06-15 18:00:00"},{"dt":1529096400,
     * "main":{"temp":298.025,"temp_min":298.025,"temp_max":298.025,"pressure":1009.42,
     * "sea_level":1018.17,"grnd_level":1009.42,"humidity":100,"temp_kf":0},"weather":[{"id":500,
     * "main":"Rain","description":"light rain","icon":"10n"}],"clouds":{"all":80},
     * "wind":{"speed":4.36,"deg":83.0006},"rain":{"3h":0.025000000000002},"sys":{"pod":"n"},
     * "dt_txt":"2018-06-15 21:00:00"},{"dt":1529107200,"main":{"temp":298.006,
     * "temp_min":298.006,"temp_max":298.006,"pressure":1010.9,"sea_level":1019.61,
     * "grnd_level":1010.9,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain",
     * "description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":4.01,
     * "deg":61.5005},"rain":{"3h":0.605},"sys":{"pod":"d"},"dt_txt":"2018-06-16 00:00:00"},
     * {"dt":1529118000,"main":{"temp":298.732,"temp_min":298.732,"temp_max":298.732,
     * "pressure":1011.12,"sea_level":1019.83,"grnd_level":1011.12,"humidity":100,"temp_kf":0},
     * "weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],
     * "clouds":{"all":92},"wind":{"speed":4.46,"deg":53.501},"rain":{"3h":0.37},
     * "sys":{"pod":"d"},"dt_txt":"2018-06-16 03:00:00"},{"dt":1529128800,"main":{"temp":298.704,
     * "temp_min":298.704,"temp_max":298.704,"pressure":1010.24,"sea_level":1018.9,
     * "grnd_level":1010.24,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain",
     * "description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":6.16,
     * "deg":53.0001},"rain":{"3h":0.33},"sys":{"pod":"d"},"dt_txt":"2018-06-16 06:00:00"},
     * {"dt":1529139600,"main":{"temp":299.222,"temp_min":299.222,"temp_max":299.222,
     * "pressure":1009.62,"sea_level":1018.28,"grnd_level":1009.62,"humidity":100,"temp_kf":0},
     * "weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],
     * "clouds":{"all":100},"wind":{"speed":6.32,"deg":51.0005},"rain":{"3h":0.13},
     * "sys":{"pod":"d"},"dt_txt":"2018-06-16 09:00:00"},{"dt":1529150400,"main":{"temp":298.278,
     * "temp_min":298.278,"temp_max":298.278,"pressure":1010.22,"sea_level":1018.94,
     * "grnd_level":1010.22,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain",
     * "description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":5.72,
     * "deg":56.5032},"rain":{"3h":0.44},"sys":{"pod":"n"},"dt_txt":"2018-06-16 12:00:00"},
     * {"dt":1529161200,"main":{"temp":298.753,"temp_min":298.753,"temp_max":298.753,
     * "pressure":1010.66,"sea_level":1019.35,"grnd_level":1010.66,"humidity":100,"temp_kf":0},
     * "weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],
     * "clouds":{"all":80},"wind":{"speed":5.11,"deg":63.0001},"rain":{"3h":0.52},
     * "sys":{"pod":"n"},"dt_txt":"2018-06-16 15:00:00"},{"dt":1529172000,"main":{"temp":298.782,
     * "temp_min":298.782,"temp_max":298.782,"pressure":1009.32,"sea_level":1018.01,
     * "grnd_level":1009.32,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain",
     * "description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":5.01,
     * "deg":57.0024},"rain":{"3h":0.02},"sys":{"pod":"n"},"dt_txt":"2018-06-16 18:00:00"},
     * {"dt":1529182800,"main":{"temp":298.636,"temp_min":298.636,"temp_max":298.636,
     * "pressure":1009.37,"sea_level":1018.07,"grnd_level":1009.37,"humidity":100,"temp_kf":0},
     * "weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],
     * "clouds":{"all":92},"wind":{"speed":5,"deg":53.002},"rain":{"3h":0.09},"sys":{"pod":"n"},
     * "dt_txt":"2018-06-16 21:00:00"},{"dt":1529193600,"main":{"temp":298.979,
     * "temp_min":298.979,"temp_max":298.979,"pressure":1010.65,"sea_level":1019.32,
     * "grnd_level":1010.65,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain",
     * "description":"light rain","icon":"10d"}],"clouds":{"all":92},"wind":{"speed":4.78,
     * "deg":56.0008},"rain":{"3h":0.14},"sys":{"pod":"d"},"dt_txt":"2018-06-17 00:00:00"},
     * {"dt":1529204400,"main":{"temp":298.592,"temp_min":298.592,"temp_max":298.592,
     * "pressure":1010.74,"sea_level":1019.4,"grnd_level":1010.74,"humidity":100,"temp_kf":0},
     * "weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],
     * "clouds":{"all":92},"wind":{"speed":4.55,"deg":66.5099},"rain":{"3h":1.36},
     * "sys":{"pod":"d"},"dt_txt":"2018-06-17 03:00:00"},{"dt":1529215200,"main":{"temp":299.07,
     * "temp_min":299.07,"temp_max":299.07,"pressure":1008.99,"sea_level":1017.66,
     * "grnd_level":1008.99,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain",
     * "description":"light rain","icon":"10d"}],"clouds":{"all":88},"wind":{"speed":5.47,
     * "deg":80.0013},"rain":{"3h":0.46},"sys":{"pod":"d"},"dt_txt":"2018-06-17 06:00:00"},
     * {"dt":1529226000,"main":{"temp":299.104,"temp_min":299.104,"temp_max":299.104,
     * "pressure":1008.12,"sea_level":1016.88,"grnd_level":1008.12,"humidity":100,"temp_kf":0},
     * "weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],
     * "clouds":{"all":92},"wind":{"speed":5.56,"deg":89.5096},"rain":{"3h":0.24},
     * "sys":{"pod":"d"},"dt_txt":"2018-06-17 09:00:00"},{"dt":1529236800,"main":{"temp":298.743,
     * "temp_min":298.743,"temp_max":298.743,"pressure":1008.83,"sea_level":1017.5,
     * "grnd_level":1008.83,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain",
     * "description":"light rain","icon":"10n"}],"clouds":{"all":92},"wind":{"speed":5.41,
     * "deg":100.001},"rain":{"3h":0.8},"sys":{"pod":"n"},"dt_txt":"2018-06-17 12:00:00"},
     * {"dt":1529247600,"main":{"temp":298.823,"temp_min":298.823,"temp_max":298.823,
     * "pressure":1008.33,"sea_level":1017.12,"grnd_level":1008.33,"humidity":100,"temp_kf":0},
     * "weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],
     * "clouds":{"all":76},"wind":{"speed":5.81,"deg":114.004},"rain":{"3h":0.68},
     * "sys":{"pod":"n"},"dt_txt":"2018-06-17 15:00:00"},{"dt":1529258400,"main":{"temp":299.187,
     * "temp_min":299.187,"temp_max":299.187,"pressure":1006.53,"sea_level":1015.36,
     * "grnd_level":1006.53,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain",
     * "description":"light rain","icon":"10n"}],"clouds":{"all":88},"wind":{"speed":6.38,
     * "deg":120.5},"rain":{"3h":0.12},"sys":{"pod":"n"},"dt_txt":"2018-06-17 18:00:00"},
     * {"dt":1529269200,"main":{"temp":298.827,"temp_min":298.827,"temp_max":298.827,
     * "pressure":1006.37,"sea_level":1015.27,"grnd_level":1006.37,"humidity":100,"temp_kf":0},
     * "weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],
     * "clouds":{"all":88},"wind":{"speed":5.07,"deg":118.005},"rain":{"3h":0.71},
     * "sys":{"pod":"n"},"dt_txt":"2018-06-17 21:00:00"},{"dt":1529280000,"main":{"temp":300.105,
     * "temp_min":300.105,"temp_max":300.105,"pressure":1006.88,"sea_level":1015.69,
     * "grnd_level":1006.88,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain",
     * "description":"light rain","icon":"10d"}],"clouds":{"all":64},"wind":{"speed":4.11,
     * "deg":104.501},"rain":{"3h":1.96},"sys":{"pod":"d"},"dt_txt":"2018-06-18 00:00:00"},
     * {"dt":1529290800,"main":{"temp":301.318,"temp_min":301.318,"temp_max":301.318,
     * "pressure":1005.88,"sea_level":1014.63,"grnd_level":1005.88,"humidity":95,"temp_kf":0},
     * "weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],
     * "clouds":{"all":68},"wind":{"speed":4.52,"deg":108.006},"rain":{"3h":0.07},
     * "sys":{"pod":"d"},"dt_txt":"2018-06-18 03:00:00"},{"dt":1529301600,"main":{"temp":302.129,
     * "temp_min":302.129,"temp_max":302.129,"pressure":1004.61,"sea_level":1013.43,
     * "grnd_level":1004.61,"humidity":90,"temp_kf":0},"weather":[{"id":500,"main":"Rain",
     * "description":"light rain","icon":"10d"}],"clouds":{"all":20},"wind":{"speed":3.47,
     * "deg":134.003},"rain":{"3h":0.030000000000001},"sys":{"pod":"d"},"dt_txt":"2018-06-18
     * 06:00:00"},{"dt":1529312400,"main":{"temp":301.292,"temp_min":301.292,"temp_max":301.292,
     * "pressure":1003.82,"sea_level":1012.65,"grnd_level":1003.82,"humidity":96,"temp_kf":0},
     * "weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10d"}],
     * "clouds":{"all":64},"wind":{"speed":4.56,"deg":145.5},"rain":{"3h":2},"sys":{"pod":"d"},
     * "dt_txt":"2018-06-18 09:00:00"},{"dt":1529323200,"main":{"temp":300.676,
     * "temp_min":300.676,"temp_max":300.676,"pressure":1004.68,"sea_level":1013.45,
     * "grnd_level":1004.68,"humidity":97,"temp_kf":0},"weather":[{"id":803,"main":"Clouds",
     * "description":"broken clouds","icon":"04n"}],"clouds":{"all":68},"wind":{"speed":3.16,
     * "deg":157.002},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-06-18 12:00:00"},
     * {"dt":1529334000,"main":{"temp":300.157,"temp_min":300.157,"temp_max":300.157,
     * "pressure":1005.46,"sea_level":1014.06,"grnd_level":1005.46,"humidity":99,"temp_kf":0},
     * "weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],
     * "clouds":{"all":56},"wind":{"speed":1.42,"deg":295.501},"rain":{},"sys":{"pod":"n"},
     * "dt_txt":"2018-06-18 15:00:00"},{"dt":1529344800,"main":{"temp":300.009,
     * "temp_min":300.009,"temp_max":300.009,"pressure":1004.29,"sea_level":1013.05,
     * "grnd_level":1004.29,"humidity":99,"temp_kf":0},"weather":[{"id":500,"main":"Rain",
     * "description":"light rain","icon":"10n"}],"clouds":{"all":68},"wind":{"speed":3.22,
     * "deg":286.504},"rain":{"3h":0.020000000000003},"sys":{"pod":"n"},"dt_txt":"2018-06-18
     * 18:00:00"},{"dt":1529355600,"main":{"temp":299.57,"temp_min":299.57,"temp_max":299.57,
     * "pressure":1004.78,"sea_level":1013.46,"grnd_level":1004.78,"humidity":100,"temp_kf":0},
     * "weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],
     * "clouds":{"all":76},"wind":{"speed":7.37,"deg":247.5},"rain":{},"sys":{"pod":"n"},
     * "dt_txt":"2018-06-18 21:00:00"},{"dt":1529366400,"main":{"temp":300.413,
     * "temp_min":300.413,"temp_max":300.413,"pressure":1006.51,"sea_level":1015.34,
     * "grnd_level":1006.51,"humidity":95,"temp_kf":0},"weather":[{"id":801,"main":"Clouds",
     * "description":"few clouds","icon":"02d"}],"clouds":{"all":12},"wind":{"speed":9.32,
     * "deg":258.003},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-06-19 00:00:00"},
     * {"dt":1529377200,"main":{"temp":301.325,"temp_min":301.325,"temp_max":301.325,
     * "pressure":1007.06,"sea_level":1015.72,"grnd_level":1007.06,"humidity":90,"temp_kf":0},
     * "weather":[{"id":800,"main":"Clear","description":"clear sky","icon":"01d"}],
     * "clouds":{"all":0},"wind":{"speed":10.51,"deg":273.501},"rain":{},"sys":{"pod":"d"},
     * "dt_txt":"2018-06-19 03:00:00"},{"dt":1529388000,"main":{"temp":301.784,
     * "temp_min":301.784,"temp_max":301.784,"pressure":1006.46,"sea_level":1015.21,
     * "grnd_level":1006.46,"humidity":85,"temp_kf":0},"weather":[{"id":800,"main":"Clear",
     * "description":"clear sky","icon":"01d"}],"clouds":{"all":0},"wind":{"speed":9.96,
     * "deg":283.503},"rain":{},"sys":{"pod":"d"},"dt_txt":"2018-06-19 06:00:00"},
     * {"dt":1529398800,"main":{"temp":301.543,"temp_min":301.543,"temp_max":301.543,
     * "pressure":1006.21,"sea_level":1014.86,"grnd_level":1006.21,"humidity":85,"temp_kf":0},
     * "weather":[{"id":801,"main":"Clouds","description":"few clouds","icon":"02d"}],
     * "clouds":{"all":20},"wind":{"speed":7.16,"deg":295.502},"rain":{},"sys":{"pod":"d"},
     * "dt_txt":"2018-06-19 09:00:00"},{"dt":1529409600,"main":{"temp":300.358,
     * "temp_min":300.358,"temp_max":300.358,"pressure":1007.13,"sea_level":1015.94,
     * "grnd_level":1007.13,"humidity":92,"temp_kf":0},"weather":[{"id":802,"main":"Clouds",
     * "description":"scattered clouds","icon":"03n"}],"clouds":{"all":44},"wind":{"speed":3.82,
     * "deg":312.002},"rain":{},"sys":{"pod":"n"},"dt_txt":"2018-06-19 12:00:00"},
     * {"dt":1529420400,"main":{"temp":299.375,"temp_min":299.375,"temp_max":299.375,
     * "pressure":1008.24,"sea_level":1017.05,"grnd_level":1008.24,"humidity":99,"temp_kf":0},
     * "weather":[{"id":803,"main":"Clouds","description":"broken clouds","icon":"04n"}],
     * "clouds":{"all":68},"wind":{"speed":3.46,"deg":290.503},"rain":{},"sys":{"pod":"n"},
     * "dt_txt":"2018-06-19 15:00:00"},{"dt":1529431200,"main":{"temp":299.171,
     * "temp_min":299.171,"temp_max":299.171,"pressure":1007.08,"sea_level":1015.83,
     * "grnd_level":1007.08,"humidity":100,"temp_kf":0},"weather":[{"id":500,"main":"Rain",
     * "description":"light rain","icon":"10n"}],"clouds":{"all":76},"wind":{"speed":3.11,
     * "deg":272.003},"rain":{"3h":0.009999999999998},"sys":{"pod":"n"},"dt_txt":"2018-06-19
     * 18:00:00"},{"dt":1529442000,"main":{"temp":299.084,"temp_min":299.084,"temp_max":299.084,
     * "pressure":1007.17,"sea_level":1016.03,"grnd_level":1007.17,"humidity":100,"temp_kf":0},
     * "weather":[{"id":500,"main":"Rain","description":"light rain","icon":"10n"}],
     * "clouds":{"all":80},"wind":{"speed":3.31,"deg":289.001},"rain":{"3h":0.13},
     * "sys":{"pod":"n"},"dt_txt":"2018-06-19 21:00:00"}]
     * city : {"id":1668341,"name":"Taipei","coord":{"lat":25.0375,"lon":121.5637},
     * "country":"TW","population":7871900}
     */

    private String cod;
    private double message;
    private int cnt;
    private CityBean city;
    private List<ListBean> list;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public double getMessage() {
        return message;
    }

    public void setMessage(double message) {
        this.message = message;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public CityBean getCity() {
        return city;
    }

    public void setCity(CityBean city) {
        this.city = city;
    }

    public List<ListBean> getList() {
        return list;
    }

    public void setList(List<ListBean> list) {
        this.list = list;
    }

    public static class CityBean {
        /**
         * id : 1668341
         * name : Taipei
         * coord : {"lat":25.0375,"lon":121.5637}
         * country : TW
         * population : 7871900
         */

        private int id;
        private String name;
        private CoordBean coord;
        private String country;
        private int population;

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

        public CoordBean getCoord() {
            return coord;
        }

        public void setCoord(CoordBean coord) {
            this.coord = coord;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }

        public static class CoordBean {
            /**
             * lat : 25.0375
             * lon : 121.5637
             */

            private double lat;
            private double lon;

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLon() {
                return lon;
            }

            public void setLon(double lon) {
                this.lon = lon;
            }
        }
    }

    public static class ListBean {
        /**
         * dt : 1529053200
         * main : {"temp":298.39,"temp_min":298.39,"temp_max":298.624,"pressure":1007.98,
         * "sea_level":1016.67,"grnd_level":1007.98,"humidity":100,"temp_kf":-0.24}
         * weather : [{"id":500,"main":"Rain","description":"light rain","icon":"10d"}]
         * clouds : {"all":92}
         * wind : {"speed":5.86,"deg":38.0007}
         * rain : {"3h":0.125}
         * sys : {"pod":"d"}
         * dt_txt : 2018-06-15 09:00:00
         */

        private int dt;
        private MainBean main;
        private CloudsBean clouds;
        private WindBean wind;
        private RainBean rain;
        private SysBean sys;
        private String dt_txt;
        private List<WeatherBean> weather;

        public int getDt() {
            return dt;
        }

        public void setDt(int dt) {
            this.dt = dt;
        }

        public MainBean getMain() {
            return main;
        }

        public void setMain(MainBean main) {
            this.main = main;
        }

        public CloudsBean getClouds() {
            return clouds;
        }

        public void setClouds(CloudsBean clouds) {
            this.clouds = clouds;
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

        public SysBean getSys() {
            return sys;
        }

        public void setSys(SysBean sys) {
            this.sys = sys;
        }

        public String getDt_txt() {
            return dt_txt;
        }

        public void setDt_txt(String dt_txt) {
            this.dt_txt = dt_txt;
        }

        public List<WeatherBean> getWeather() {
            return weather;
        }

        public void setWeather(List<WeatherBean> weather) {
            this.weather = weather;
        }

        public static class MainBean {
            /**
             * temp : 298.39
             * temp_min : 298.39
             * temp_max : 298.624
             * pressure : 1007.98
             * sea_level : 1016.67
             * grnd_level : 1007.98
             * humidity : 100
             * temp_kf : -0.24
             */

            private double temp;
            private double temp_min;
            private double temp_max;
            private double pressure;
            private double sea_level;
            private double grnd_level;
            private int humidity;
            private double temp_kf;

            public double getTemp() {
                return temp;
            }

            public void setTemp(double temp) {
                this.temp = temp;
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

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getSea_level() {
                return sea_level;
            }

            public void setSea_level(double sea_level) {
                this.sea_level = sea_level;
            }

            public double getGrnd_level() {
                return grnd_level;
            }

            public void setGrnd_level(double grnd_level) {
                this.grnd_level = grnd_level;
            }

            public int getHumidity() {
                return humidity;
            }

            public void setHumidity(int humidity) {
                this.humidity = humidity;
            }

            public double getTemp_kf() {
                return temp_kf;
            }

            public void setTemp_kf(double temp_kf) {
                this.temp_kf = temp_kf;
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

        public static class WindBean {
            /**
             * speed : 5.86
             * deg : 38.0007
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
             * 3h : 0.125
             */

            @SerializedName("3h")
            private double _$3h;

            public double get_$3h() {
                return _$3h;
            }

            public void set_$3h(double _$3h) {
                this._$3h = _$3h;
            }
        }

        public static class SysBean {
            /**
             * pod : d
             */

            private String pod;

            public String getPod() {
                return pod;
            }

            public void setPod(String pod) {
                this.pod = pod;
            }
        }

        public static class WeatherBean {
            /**
             * id : 500
             * main : Rain
             * description : light rain
             * icon : 10d
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
}
