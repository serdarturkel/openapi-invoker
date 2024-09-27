package com.beassolution.openapi.invoker.auth;


import com.beassolution.openapi.invoker.Pair;

import java.util.List;
import java.util.Map;

public class HttpBearerAuth implements Authentication {
    private final String scheme;
    private String bearerToken;

    public HttpBearerAuth(String scheme) {
        this.scheme = scheme;
    }

    public String getBearerToken() {
        return this.bearerToken;
    }

    public void setBearerToken(String bearerToken) {
        this.bearerToken = bearerToken;
    }

    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
        if (this.bearerToken != null) {
            headerParams.put("Authorization", (this.scheme != null ? upperCaseBearer(this.scheme) + " " : "") + this.bearerToken);
        }
    }

    private static String upperCaseBearer(String scheme) {
        return "bearer".equalsIgnoreCase(scheme) ? "Bearer" : scheme;
    }
}
