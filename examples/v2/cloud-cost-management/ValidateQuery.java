// Validate query returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.RulesValidateQueryResponse;
import com.datadog.api.client.v2.model.RulesValidateQueryRequest;
import com.datadog.api.client.v2.model.RulesValidateQueryRequestData;
import com.datadog.api.client.v2.model.RulesValidateQueryRequestDataAttributes;
import com.datadog.api.client.v2.model.RulesValidateQueryRequestDataType;
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
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    RulesValidateQueryRequest body = new RulesValidateQueryRequest()
.data(new RulesValidateQueryRequestData()
.attributes(new RulesValidateQueryRequestDataAttributes()
.query("example:query AND test:true"))
.type(RulesValidateQueryRequestDataType.VALIDATE_QUERY));

    try {
      RulesValidateQueryResponse result = apiInstance.validateQuery(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#validateQuery");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}