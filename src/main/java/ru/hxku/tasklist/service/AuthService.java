package ru.hxku.tasklist.service;

import ru.hxku.tasklist.web.dto.auth.JwtResponse;
import ru.hxku.tasklist.web.dto.auth.JwtRequest;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);

}
