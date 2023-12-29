package com.easy.learn.service.Impl;

import com.easy.learn.Enum.Role;
import com.easy.learn.dto.AuthenticationRequest;
import com.easy.learn.dto.RegisterRequest;
import com.easy.learn.entity.User;
import com.easy.learn.jwt.JwtService;
import com.easy.learn.repository.UserRepository;
import com.easy.learn.response.AuthenticationResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AuthenticationService {
    private final UserRepository repo;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request) {
        User user = User.builder()
                .firstName(request.getFirstname())
                .lastName(request.getLastname())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();
        repo.save(user);
        String jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) throws NoSuchFieldException {
        Authentication authenticate = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );

//        Optional<User> user = repo.findByEmail(request.getEmail());
//        if (!user.isPresent()) {
//            throw new NoSuchFieldException();
//        }

        String jwtToken = jwtService.generateToken((UserDetails) authenticate.getPrincipal());
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
