package org.loukili.securespring.controller;


import lombok.RequiredArgsConstructor;
import org.loukili.securespring.auth.AuthenticationRequest;
import org.loukili.securespring.auth.AuthenticationService;
import org.loukili.securespring.auth.RegisterRequest;
import org.loukili.securespring.auth.AuthenticationResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
  private final AuthenticationService authenticationService;


  @PostMapping("/register")
  public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
    return ResponseEntity.ok(authenticationService.register(request));
  }

  @PostMapping("/login")
  public ResponseEntity<AuthenticationResponse> login(@RequestBody AuthenticationRequest request){
    return ResponseEntity.ok(authenticationService.login(request));

  }
}
