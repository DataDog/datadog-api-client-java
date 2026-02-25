// Update Cloud Cost Management AWS CUR config returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.AwsCURConfigsResponse;
import com.datadog.api.client.v2.model.AwsCURConfigPatchData;
import com.datadog.api.client.v2.model.AwsCURConfigPatchRequest;
import com.datadog.api.client.v2.model.AwsCURConfigPatchRequestAttributes;
import com.datadog.api.client.v2.model.AwsCURConfigPatchRequestType;
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

    AwsCURConfigPatchRequest body = new AwsCURConfigPatchRequest()
.data(new AwsCURConfigPatchData()
.attributes(new AwsCURConfigPatchRequestAttributes()
.isEnabled(true))
.type(AwsCURConfigPatchRequestType.AWS_CUR_CONFIG_PATCH_REQUEST));

    try {
      AwsCURConfigsResponse result = apiInstance.updateCostAWSCURConfig(100L, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#updateCostAWSCURConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}