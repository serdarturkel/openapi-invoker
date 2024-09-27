package com.beassolution.openapi.invoker;


import java.util.List;
import java.util.Map;

public interface ApiCallback<T> {
    void onFailure(ApiException var1, int var2, Map<String, List<String>> var3);

    void onSuccess(T var1, int var2, Map<String, List<String>> var3);

    void onUploadProgress(long var1, long var3, boolean var5);

    void onDownloadProgress(long var1, long var3, boolean var5);
}
