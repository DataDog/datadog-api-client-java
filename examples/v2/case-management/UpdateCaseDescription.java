// Update case description returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.CaseUpdateDescription;
import com.datadog.api.client.v2.model.CaseUpdateDescriptionAttributes;
import com.datadog.api.client.v2.model.CaseUpdateDescriptionRequest;
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

    CaseUpdateDescriptionRequest body = new CaseUpdateDescriptionRequest()
.data(new CaseUpdateDescription()
.attributes(new CaseUpdateDescriptionAttributes()
.description("Seeing some weird memory increase... Updating the description"))
.type(CaseResourceType.CASE));

    try {
      CaseResponse result = apiInstance.updateCaseDescription(CASE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateCaseDescription");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}