package org.example.spotifyapi.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

@FeignClient(
  name= "AuthSpotifyClient",
  url = "https://accounts.spotify.com"
)
public interface AuthSpotifyClient {

  @PostMapping(value = "/api/token", consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE)
  LoginResponse login(LoginRequest loginRequest);

}
