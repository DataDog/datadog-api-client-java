// Update case priority returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.CasePriority;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.CaseUpdatePriority;
import com.datadog.api.client.v2.model.CaseUpdatePriorityAttributes;
import com.datadog.api.client.v2.model.CaseUpdatePriorityRequest;
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

    // there is a valid "case" in the system
    String CASE_ID = System.getenv("CASE_ID");

    CaseUpdatePriorityRequest body = new CaseUpdatePriorityRequest()
.data(new CaseUpdatePriority()
.attributes(new CaseUpdatePriorityAttributes()
.priority(CasePriority.P3))
.type(CaseResourceType.CASE));

    try {
      CaseResponse result = apiInstance.updatePriority(CASE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updatePriority");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}