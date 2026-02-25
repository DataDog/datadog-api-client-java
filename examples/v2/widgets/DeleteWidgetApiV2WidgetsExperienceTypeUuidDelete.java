// Delete a widget returns "Successful Response" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.WidgetsApi;
import com.datadog.api.client.v2.model.WidgetExperienceType;
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
    WidgetsApi apiInstance = new WidgetsApi(defaultClient);

    try {
      apiInstance.deleteWidgetApiV2WidgetsExperienceTypeUuidDelete(UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"), WidgetExperienceType.CCM_REPORTS);
    } catch (ApiException e) {
      System.err.println("Exception when calling WidgetsApi#deleteWidgetApiV2WidgetsExperienceTypeUuidDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}