
package com.example.weather.model;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "app_max_temp",
    "app_min_temp",
    "clouds",
    "clouds_hi",
    "clouds_low",
    "clouds_mid",
    "datetime",
    "dewpt",
    "high_temp",
    "low_temp",
    "max_dhi",
    "max_temp",
    "min_temp",
    "moon_phase",
    "moon_phase_lunation",
    "moonrise_ts",
    "moonset_ts",
    "ozone",
    "pop",
    "precip",
    "pres",
    "rh",
    "slp",
    "snow",
    "snow_depth",
    "sunrise_ts",
    "sunset_ts",
    "temp",
    "ts",
    "uv",
    "valid_date",
    "vis",
    "weather",
    "wind_cdir",
    "wind_cdir_full",
    "wind_dir",
    "wind_gust_spd",
    "wind_spd"
})
@Generated("jsonschema2pojo")
public class Data {

    @JsonProperty("app_max_temp")
    private Double appMaxTemp;
    @JsonProperty("app_min_temp")
    private Double appMinTemp;
    @JsonProperty("clouds")
    private Integer clouds;
    @JsonProperty("clouds_hi")
    private Integer cloudsHi;
    @JsonProperty("clouds_low")
    private Integer cloudsLow;
    @JsonProperty("clouds_mid")
    private Integer cloudsMid;
    @JsonProperty("datetime")
    private String datetime;
    @JsonProperty("dewpt")
    private Double dewpt;
    @JsonProperty("high_temp")
    private Double highTemp;
    @JsonProperty("low_temp")
    private Double lowTemp;
    @JsonProperty("max_dhi")
    private Object maxDhi;
    @JsonProperty("max_temp")
    private Double maxTemp;
    @JsonProperty("min_temp")
    private Double minTemp;
    @JsonProperty("moon_phase")
    private Double moonPhase;
    @JsonProperty("moon_phase_lunation")
    private Double moonPhaseLunation;
    @JsonProperty("moonrise_ts")
    private Integer moonriseTs;
    @JsonProperty("moonset_ts")
    private Integer moonsetTs;
    @JsonProperty("ozone")
    private Integer ozone;
    @JsonProperty("pop")
    private Integer pop;
    @JsonProperty("precip")
    private Integer precip;
    @JsonProperty("pres")
    private Integer pres;
    @JsonProperty("rh")
    private Integer rh;
    @JsonProperty("slp")
    private Integer slp;
    @JsonProperty("snow")
    private Integer snow;
    @JsonProperty("snow_depth")
    private Integer snowDepth;
    @JsonProperty("sunrise_ts")
    private Integer sunriseTs;
    @JsonProperty("sunset_ts")
    private Integer sunsetTs;
    @JsonProperty("temp")
    private Double temp;
    @JsonProperty("ts")
    private Integer ts;
    @JsonProperty("uv")
    private Integer uv;
    @JsonProperty("valid_date")
    private String validDate;
    @JsonProperty("vis")
    private Integer vis;
    @JsonProperty("weather")
    private Weather weather;
    @JsonProperty("wind_cdir")
    private String windCdir;
    @JsonProperty("wind_cdir_full")
    private String windCdirFull;
    @JsonProperty("wind_dir")
    private Integer windDir;
    @JsonProperty("wind_gust_spd")
    private Double windGustSpd;
    @JsonProperty("wind_spd")
    private Double windSpd;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

    @JsonProperty("app_max_temp")
    public Double getAppMaxTemp() {
        return appMaxTemp;
    }

    @JsonProperty("app_max_temp")
    public void setAppMaxTemp(Double appMaxTemp) {
        this.appMaxTemp = appMaxTemp;
    }

    @JsonProperty("app_min_temp")
    public Double getAppMinTemp() {
        return appMinTemp;
    }

    @JsonProperty("app_min_temp")
    public void setAppMinTemp(Double appMinTemp) {
        this.appMinTemp = appMinTemp;
    }

    @JsonProperty("clouds")
    public Integer getClouds() {
        return clouds;
    }

    @JsonProperty("clouds")
    public void setClouds(Integer clouds) {
        this.clouds = clouds;
    }

    @JsonProperty("clouds_hi")
    public Integer getCloudsHi() {
        return cloudsHi;
    }

    @JsonProperty("clouds_hi")
    public void setCloudsHi(Integer cloudsHi) {
        this.cloudsHi = cloudsHi;
    }

    @JsonProperty("clouds_low")
    public Integer getCloudsLow() {
        return cloudsLow;
    }

    @JsonProperty("clouds_low")
    public void setCloudsLow(Integer cloudsLow) {
        this.cloudsLow = cloudsLow;
    }

    @JsonProperty("clouds_mid")
    public Integer getCloudsMid() {
        return cloudsMid;
    }

    @JsonProperty("clouds_mid")
    public void setCloudsMid(Integer cloudsMid) {
        this.cloudsMid = cloudsMid;
    }

    @JsonProperty("datetime")
    public String getDatetime() {
        return datetime;
    }

    @JsonProperty("datetime")
    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }

    @JsonProperty("dewpt")
    public Double getDewpt() {
        return dewpt;
    }

    @JsonProperty("dewpt")
    public void setDewpt(Double dewpt) {
        this.dewpt = dewpt;
    }

    @JsonProperty("high_temp")
    public Double getHighTemp() {
        return highTemp;
    }

    @JsonProperty("high_temp")
    public void setHighTemp(Double highTemp) {
        this.highTemp = highTemp;
    }

    @JsonProperty("low_temp")
    public Double getLowTemp() {
        return lowTemp;
    }

    @JsonProperty("low_temp")
    public void setLowTemp(Double lowTemp) {
        this.lowTemp = lowTemp;
    }

    @JsonProperty("max_dhi")
    public Object getMaxDhi() {
        return maxDhi;
    }

    @JsonProperty("max_dhi")
    public void setMaxDhi(Object maxDhi) {
        this.maxDhi = maxDhi;
    }

    @JsonProperty("max_temp")
    public Double getMaxTemp() {
        return maxTemp;
    }

    @JsonProperty("max_temp")
    public void setMaxTemp(Double maxTemp) {
        this.maxTemp = maxTemp;
    }

    @JsonProperty("min_temp")
    public Double getMinTemp() {
        return minTemp;
    }

    @JsonProperty("min_temp")
    public void setMinTemp(Double minTemp) {
        this.minTemp = minTemp;
    }

    @JsonProperty("moon_phase")
    public Double getMoonPhase() {
        return moonPhase;
    }

    @JsonProperty("moon_phase")
    public void setMoonPhase(Double moonPhase) {
        this.moonPhase = moonPhase;
    }

    @JsonProperty("moon_phase_lunation")
    public Double getMoonPhaseLunation() {
        return moonPhaseLunation;
    }

    @JsonProperty("moon_phase_lunation")
    public void setMoonPhaseLunation(Double moonPhaseLunation) {
        this.moonPhaseLunation = moonPhaseLunation;
    }

    @JsonProperty("moonrise_ts")
    public Integer getMoonriseTs() {
        return moonriseTs;
    }

    @JsonProperty("moonrise_ts")
    public void setMoonriseTs(Integer moonriseTs) {
        this.moonriseTs = moonriseTs;
    }

    @JsonProperty("moonset_ts")
    public Integer getMoonsetTs() {
        return moonsetTs;
    }

    @JsonProperty("moonset_ts")
    public void setMoonsetTs(Integer moonsetTs) {
        this.moonsetTs = moonsetTs;
    }

    @JsonProperty("ozone")
    public Integer getOzone() {
        return ozone;
    }

    @JsonProperty("ozone")
    public void setOzone(Integer ozone) {
        this.ozone = ozone;
    }

    @JsonProperty("pop")
    public Integer getPop() {
        return pop;
    }

    @JsonProperty("pop")
    public void setPop(Integer pop) {
        this.pop = pop;
    }

    @JsonProperty("precip")
    public Integer getPrecip() {
        return precip;
    }

    @JsonProperty("precip")
    public void setPrecip(Integer precip) {
        this.precip = precip;
    }

    @JsonProperty("pres")
    public Integer getPres() {
        return pres;
    }

    @JsonProperty("pres")
    public void setPres(Integer pres) {
        this.pres = pres;
    }

    @JsonProperty("rh")
    public Integer getRh() {
        return rh;
    }

    @JsonProperty("rh")
    public void setRh(Integer rh) {
        this.rh = rh;
    }

    @JsonProperty("slp")
    public Integer getSlp() {
        return slp;
    }

    @JsonProperty("slp")
    public void setSlp(Integer slp) {
        this.slp = slp;
    }

    @JsonProperty("snow")
    public Integer getSnow() {
        return snow;
    }

    @JsonProperty("snow")
    public void setSnow(Integer snow) {
        this.snow = snow;
    }

    @JsonProperty("snow_depth")
    public Integer getSnowDepth() {
        return snowDepth;
    }

    @JsonProperty("snow_depth")
    public void setSnowDepth(Integer snowDepth) {
        this.snowDepth = snowDepth;
    }

    @JsonProperty("sunrise_ts")
    public Integer getSunriseTs() {
        return sunriseTs;
    }

    @JsonProperty("sunrise_ts")
    public void setSunriseTs(Integer sunriseTs) {
        this.sunriseTs = sunriseTs;
    }

    @JsonProperty("sunset_ts")
    public Integer getSunsetTs() {
        return sunsetTs;
    }

    @JsonProperty("sunset_ts")
    public void setSunsetTs(Integer sunsetTs) {
        this.sunsetTs = sunsetTs;
    }

    @JsonProperty("temp")
    public Double getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @JsonProperty("ts")
    public Integer getTs() {
        return ts;
    }

    @JsonProperty("ts")
    public void setTs(Integer ts) {
        this.ts = ts;
    }

    @JsonProperty("uv")
    public Integer getUv() {
        return uv;
    }

    @JsonProperty("uv")
    public void setUv(Integer uv) {
        this.uv = uv;
    }

    @JsonProperty("valid_date")
    public String getValidDate() {
        return validDate;
    }

    @JsonProperty("valid_date")
    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    @JsonProperty("vis")
    public Integer getVis() {
        return vis;
    }

    @JsonProperty("vis")
    public void setVis(Integer vis) {
        this.vis = vis;
    }

    @JsonProperty("weather")
    public Weather getWeather() {
        return weather;
    }

    @JsonProperty("weather")
    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    @JsonProperty("wind_cdir")
    public String getWindCdir() {
        return windCdir;
    }

    @JsonProperty("wind_cdir")
    public void setWindCdir(String windCdir) {
        this.windCdir = windCdir;
    }

    @JsonProperty("wind_cdir_full")
    public String getWindCdirFull() {
        return windCdirFull;
    }

    @JsonProperty("wind_cdir_full")
    public void setWindCdirFull(String windCdirFull) {
        this.windCdirFull = windCdirFull;
    }

    @JsonProperty("wind_dir")
    public Integer getWindDir() {
        return windDir;
    }

    @JsonProperty("wind_dir")
    public void setWindDir(Integer windDir) {
        this.windDir = windDir;
    }

    @JsonProperty("wind_gust_spd")
    public Double getWindGustSpd() {
        return windGustSpd;
    }

    @JsonProperty("wind_gust_spd")
    public void setWindGustSpd(Double windGustSpd) {
        this.windGustSpd = windGustSpd;
    }

    @JsonProperty("wind_spd")
    public Double getWindSpd() {
        return windSpd;
    }

    @JsonProperty("wind_spd")
    public void setWindSpd(Double windSpd) {
        this.windSpd = windSpd;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
