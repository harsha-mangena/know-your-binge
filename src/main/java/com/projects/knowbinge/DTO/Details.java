package com.projects.knowbinge.DTO;


import java.util.HashMap;
import java.util.Map;

//JSON
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;



@JsonIgnoreProperties(ignoreUnknown = true)
public class Details {
@JsonProperty("Title")
private String title;
@JsonProperty("Year")
private String year;
@JsonProperty("Rated")
private String rated;
@JsonProperty("Released")
private String released;
@JsonProperty("Runtime")
private String runtime;
@JsonProperty("Genre")
private String genre;
@JsonProperty("Director")
private String director;
@JsonProperty("Writer")
private String writer;
@JsonProperty("Actors")
private String actors;
@JsonProperty("Plot")
private String plot;
@JsonProperty("Language")
private String language;
@JsonProperty("Country")
private String country;
@JsonProperty("Awards")
private String awards;
@JsonProperty("Poster")
private String poster;
@JsonProperty("Metascore")
private String metascore;
@JsonProperty("imdbRating")
private String imdbRating;
public String getTitle() {
    return title;
}

public void setTitle(String title) {
    this.title = title;
}

public String getYear() {
    return year;
}

public void setYear(String year) {
    this.year = year;
}

public String getRated() {
    return rated;
}

public void setRated(String rated) {
    this.rated = rated;
}

public String getReleased() {
    return released;
}

public void setReleased(String released) {
    this.released = released;
}

public String getRuntime() {
    return runtime;
}

public void setRuntime(String runtime) {
    this.runtime = runtime;
}

public String getGenre() {
    return genre;
}

public void setGenre(String genre) {
    this.genre = genre;
}

public String getDirector() {
    return director;
}

public void setDirector(String director) {
    this.director = director;
}

public String getWriter() {
    return writer;
}

public void setWriter(String writer) {
    this.writer = writer;
}

public String getActors() {
    return actors;
}

public void setActors(String actors) {
    this.actors = actors;
}

public String getPlot() {
    return plot;
}

public void setPlot(String plot) {
    this.plot = plot;
}

public String getLanguage() {
    return language;
}

public void setLanguage(String language) {
    this.language = language;
}

public String getCountry() {
    return country;
}

public void setCountry(String country) {
    this.country = country;
}

public String getAwards() {
    return awards;
}

public void setAwards(String awards) {
    this.awards = awards;
}

public String getPoster() {
    return poster;
}

public void setPoster(String poster) {
    this.poster = poster;
}

public String getMetascore() {
    return metascore;
}

public void setMetascore(String metascore) {
    this.metascore = metascore;
}

public String getImdbRating() {
    return imdbRating;
}

public void setImdbRating(String imdbRating) {
    this.imdbRating = imdbRating;
}

public String getImdbVotes() {
    return imdbVotes;
}

public void setImdbVotes(String imdbVotes) {
    this.imdbVotes = imdbVotes;
}

public String getImdbID() {
    return imdbID;
}

public void setImdbID(String imdbID) {
    this.imdbID = imdbID;
}

public String getType() {
    return type;
}

public void setType(String type) {
    this.type = type;
}

public String getDvd() {
    return dvd;
}

public void setDvd(String dvd) {
    this.dvd = dvd;
}

public String getBoxOffice() {
    return boxOffice;
}

public void setBoxOffice(String boxOffice) {
    this.boxOffice = boxOffice;
}

public String getProduction() {
    return production;
}

public void setProduction(String production) {
    this.production = production;
}

public String getWebsite() {
    return website;
}

public void setWebsite(String website) {
    this.website = website;
}

public String getResponse() {
    return response;
}

public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
}

public void setAdditionalProperties(Map<String, Object> additionalProperties) {
    this.additionalProperties = additionalProperties;
}

public String getTotalSeasons() {
    return totalSeasons;
}

public void setTotalSeasons(String totalSeasons) {
    this.totalSeasons = totalSeasons;
}

@JsonProperty("imdbVotes")
private String imdbVotes;
@JsonProperty("imdbID")
private String imdbID;
@JsonProperty("Type")
private String type;
@JsonProperty("DVD")
private String dvd;
@JsonProperty("BoxOffice")
private String boxOffice;
@JsonProperty("Production")
private String production;
@JsonProperty("Website")
private String website;
@JsonProperty("Response")
private String response;
@JsonIgnore
private Map<String, Object> additionalProperties = new HashMap<String, Object>();
@JsonProperty("totalSeasons")
private String totalSeasons;


//Get Response 
@JsonProperty("Response")
public void setResponse(String response) {
this.response = response;
}

public String getMovies() {
    // TODO Auto-generated method stub
    return "\n"+"Movie : "+getTitle()+"\n"
               +"Release : "+getReleased()+"\n"+
               "Plot : "+getPlot()+"\n"+
               "Awards : " +getAwards()+"\n"+
               "Rated : "+getRated()+"\n"+
               "Genre : "+getGenre()+"\n"+
               "Director : "+getDirector()+"\n"+
               "Available in : "+getLanguage()+"\n"+
               "IMDB Rating's : "+getImdbRating()+"\n"+
               "Box Office(WorldWide Collections) : "+getBoxOffice()+"\n";
}

public String getSeries() {
    // TODO Auto-generated method stub
    return "\n"+"Series : "+getTitle()+"\n"+
                "Year(s): "+getYear()+"\n"+
                 "Season(s) : "+getTotalSeasons()+"\n"+
                 "Awards : " +getAwards()+"\n"+
                 "Actors : "+getActors()+"\n"+
                 "Rated : "+getRated()+"\n"+
                 "Genre : "+getGenre()+"\n"+
                 "Director : "+getDirector()+"\n"+
                 "Available in : "+getLanguage()+"\n"+
                 "IMDB Rating's : "+getImdbRating()+"\n";
}

    
}