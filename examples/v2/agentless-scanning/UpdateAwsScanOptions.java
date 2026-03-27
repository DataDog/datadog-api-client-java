// Update AWS scan options returns "No Content" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.AgentlessScanningApi;
import com.datadog.api.client.v2.model.AwsScanOptionsType;
import com.datadog.api.client.v2.model.AwsScanOptionsUpdateAttributes;
import com.datadog.api.client.v2.model.AwsScanOptionsUpdateData;
import com.datadog.api.client.v2.model.AwsScanOptionsUpdateRequest;
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
    AgentlessScanningApi apiInstance = new AgentlessScanningApi(defaultClient);

    AwsScanOptionsUpdateRequest body = new AwsScanOptionsUpdateRequest()
.data(new AwsScanOptionsUpdateData()
.type(AwsScanOptionsType.AWS_SCAN_OPTIONS)
.id("000000000002")
.attributes(new AwsScanOptionsUpdateAttributes()
.vulnHostOs(true)
.vulnContainersOs(true)
.lambda(false)));

    try {
      apiInstance.updateAwsScanOptions("000000000002", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentlessScanningApi#updateAwsScanOptions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}