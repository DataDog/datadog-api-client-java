// Create a new service object returns "CREATED" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.OpsgenieIntegrationApi;
import com.datadog.api.client.v2.model.OpsgenieServiceResponse;
import com.datadog.api.client.v2.model.OpsgenieServiceCreateAttributes;
import com.datadog.api.client.v2.model.OpsgenieServiceCreateData;
import com.datadog.api.client.v2.model.OpsgenieServiceCreateRequest;
import com.datadog.api.client.v2.model.OpsgenieServiceRegionType;
import com.datadog.api.client.v2.model.OpsgenieServiceType;
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
    OpsgenieIntegrationApi apiInstance = new OpsgenieIntegrationApi(defaultClient);

    OpsgenieServiceCreateRequest body = new OpsgenieServiceCreateRequest()
.data(new OpsgenieServiceCreateData()
.attributes(new OpsgenieServiceCreateAttributes()
.name("Example-Opsgenie-Integration")
.opsgenieApiKey("00000000-0000-0000-0000-000000000000")
.region(OpsgenieServiceRegionType.US))
.type(OpsgenieServiceType.OPSGENIE_SERVICE));

    try {
      OpsgenieServiceResponse result = apiInstance.createOpsgenieService(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OpsgenieIntegrationApi#createOpsgenieService");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}