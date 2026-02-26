// Create component returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.StatusPagesComponent;
import com.datadog.api.client.v2.model.CreateComponentRequest;
import com.datadog.api.client.v2.model.CreateComponentRequestData;
import com.datadog.api.client.v2.model.CreateComponentRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateComponentRequestDataAttributesType;
import com.datadog.api.client.v2.model.StatusPagesComponentGroupType;
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

    CreateComponentRequest body = new CreateComponentRequest()
.data(new CreateComponentRequestData()
.attributes(new CreateComponentRequestDataAttributes()
.name("Logs")
.position(0L)
.type(CreateComponentRequestDataAttributesType.COMPONENT))
.type(StatusPagesComponentGroupType.COMPONENTS));

    try {
      StatusPagesComponent result = apiInstance.createComponent(STATUS_PAGE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#createComponent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}