package com.beassolution.openapi.invoker.auth;
import com.beassolution.openapi.invoker.Pair;

import java.util.List;
import java.util.Map;

public interface Authentication {
    void applyToParams(List<Pair> var1, Map<String, String> var2);
}
