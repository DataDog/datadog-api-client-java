// Update status page returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.StatusPage;
import com.datadog.api.client.v2.model.PatchStatusPageRequest;
import com.datadog.api.client.v2.model.PatchStatusPageRequestData;
import com.datadog.api.client.v2.model.PatchStatusPageRequestDataAttributes;
import com.datadog.api.client.v2.model.StatusPageDataType;
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
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "status_page" in the system
    UUID STATUS_PAGE_DATA_ID = null;
    try {
      STATUS_PAGE_DATA_ID = UUID.fromString(System.getenv("STATUS_PAGE_DATA_ID"));
    } catch (IllegalArgumentException e) {
        System.err.println("Error parsing UUID: " + e.getMessage());
    }

    PatchStatusPageRequest body = new PatchStatusPageRequest()
.data(new PatchStatusPageRequestData()
.attributes(new PatchStatusPageRequestDataAttributes()
.name("A Status Page in US1"))
.id(STATUS_PAGE_DATA_ID)
.type(StatusPageDataType.STATUS_PAGES));

    try {
      StatusPage result = apiInstance.updateStatusPage(STATUS_PAGE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#updateStatusPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}