package com.kafein.kcinema.controller;

import com.kafein.kcinema.model.LoginRequest;
import com.kafein.kcinema.model.TokenResponse;
import com.kafein.kcinema.model.User;
import com.kafein.kcinema.repository.UserRepository;
import com.kafein.kcinema.security.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/kcinema/token")
@RestController
public class TokenController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    @Autowired
    private UserRepository userService;

    @PostMapping
    @ResponseBody
    public ResponseEntity<TokenResponse> getToken(@RequestBody LoginRequest request) throws AuthenticationServiceException{
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(request.getUsername(), request.getPassword()));
        User theUser = userService.findByUserName(request.getUsername());
        String token = jwtTokenUtil.generateToken(theUser);
        return ResponseEntity.ok(new TokenResponse(theUser.getUserName(), token));
    }

}
