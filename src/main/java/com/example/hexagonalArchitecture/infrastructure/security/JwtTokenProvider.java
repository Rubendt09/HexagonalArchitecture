package com.example.hexagonalArchitecture.infrastructure.security;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.stereotype.Service;
import com.auth0.jwt.interfaces.DecodedJWT;



import java.util.Date;

@Service
public class JwtTokenProvider {
    private final String jwtSecret = "my_secret_key";
    private final long jwtExpirationInMs = 86400000; // 24 hours

    public String generateToken(String username) {
        Date now = new Date();
        Date expiryDate = new Date(now.getTime() + jwtExpirationInMs);

        return JWT.create()
                .withSubject(username)
                .withIssuedAt(now)
                .withExpiresAt(expiryDate)
                .sign(Algorithm.HMAC256(String.valueOf(jwtSecret)));

    }
    public DecodedJWT decodeToken(String token) {// JWT codification
        return JWT.require(Algorithm.HMAC256(jwtSecret))
                .build()
                .verify(token);
    }
}
