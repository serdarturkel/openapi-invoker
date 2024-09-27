# ProjectApi

All URIs are relative to *https://beassolution.com/billFormatter/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProject**](ProjectApi.md#createProject) | **POST** /create | Create a project (Project) to receive Events |


<a id="createProject"></a>
# **createProject**
> Project createProject(project, fields, offset, limit)

Create a project (Project) to receive Events

create a new Project.

### Example
```java
// Import classes:
import com.pia.openapi.invoker.ApiClient;
import com.pia.openapi.invoker.ApiException;
import com.pia.openapi.invoker.Configuration;
import com.pia.openapi.invoker.models.*;
import com.pia.sample.api.ProjectApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://beassolution.com/billFormatter/v1");

    ProjectApi apiInstance = new ProjectApi(defaultClient);
    Project project = new Project(); // Project | The Project to be created
    String fields = "fields_example"; // String | Comma-separated properties to be provided in response
    Integer offset = 56; // Integer | Requested index for start of resources to be provided in response
    Integer limit = 56; // Integer | Requested number of resources to be provided in response
    try {
      Project result = apiInstance.createProject(project, fields, offset, limit);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectApi#createProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **project** | [**Project**](Project.md)| The Project to be created | |
| **fields** | **String**| Comma-separated properties to be provided in response | [optional] |
| **offset** | **Integer**| Requested index for start of resources to be provided in response | [optional] |
| **limit** | **Integer**| Requested number of resources to be provided in response | [optional] |

### Return type

[**Project**](Project.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Notified |  -  |
| **0** | Error |  -  |

