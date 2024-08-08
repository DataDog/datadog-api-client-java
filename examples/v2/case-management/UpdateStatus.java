// Update case status returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.CaseStatus;
import com.datadog.api.client.v2.model.CaseUpdateStatus;
import com.datadog.api.client.v2.model.CaseUpdateStatusAttributes;
import com.datadog.api.client.v2.model.CaseUpdateStatusRequest;
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

    CaseUpdateStatusRequest body = new CaseUpdateStatusRequest()
.data(new CaseUpdateStatus()
.attributes(new CaseUpdateStatusAttributes()
.status(CaseStatus.IN_PROGRESS))
.type(CaseResourceType.CASE));

    try {
      CaseResponse result = apiInstance.updateStatus(CASE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}