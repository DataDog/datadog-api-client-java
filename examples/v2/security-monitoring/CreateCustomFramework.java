// Create a custom framework returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CreateCustomFrameworkResponse;
import com.datadog.api.client.v2.model.CreateCustomFrameworkRequest;
import com.datadog.api.client.v2.model.CustomFrameworkControl;
import com.datadog.api.client.v2.model.CustomFrameworkData;
import com.datadog.api.client.v2.model.CustomFrameworkDataAttributes;
import com.datadog.api.client.v2.model.CustomFrameworkRequirement;
import com.datadog.api.client.v2.model.CustomFrameworkType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    CreateCustomFrameworkRequest body = new CreateCustomFrameworkRequest()
.data(new CustomFrameworkData()
.type(CustomFrameworkType.CUSTOM_FRAMEWORK)
.attributes(new CustomFrameworkDataAttributes()
.name("name")
.handle("create-framework-new")
.version("10")
.iconUrl("test-url")
.requirements(Collections.singletonList(new CustomFrameworkRequirement()
.name("requirement")
.controls(Collections.singletonList(new CustomFrameworkControl()
.name("control")
.rulesId(Collections.singletonList("def-000-be9"))))))));

    try {
      CreateCustomFrameworkResponse result = apiInstance.createCustomFramework(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createCustomFramework");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}