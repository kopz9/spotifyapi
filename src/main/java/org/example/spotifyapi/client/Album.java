package org.example.spotifyapi.client;

import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class Album {

  private String id;
  private String name;
  private String releaseDate;

  public Album (String id , String name , String releaseDate) {
    this.id = id;
    this.name = name;
    this.releaseDate = releaseDate;
  }

  public Album () {
  }

  public String getId () {
    return id;
  }

  public String getName () {
    return name;
  }

  public String getReleaseDate () {
    return releaseDate;
  }

  public void setId (String id) {
    this.id = id;
  }

  public void setName (String name) {
    this.name = name;
  }

  public void setReleaseDate (String releaseDate) {
    this.releaseDate = releaseDate;
  }
}
