// Delete custom attribute from case returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseResponse;
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
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    // there is a valid "case" with a custom "case_type" in the system
    String CASE_WITH_TYPE_ID = System.getenv("CASE_WITH_TYPE_ID");

    // there is a valid "custom_attribute" in the system
    String CUSTOM_ATTRIBUTE_ATTRIBUTES_KEY = System.getenv("CUSTOM_ATTRIBUTE_ATTRIBUTES_KEY");

    try {
      CaseResponse result = apiInstance.deleteCaseCustomAttribute(CASE_WITH_TYPE_ID, CUSTOM_ATTRIBUTE_ATTRIBUTES_KEY);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#deleteCaseCustomAttribute");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}