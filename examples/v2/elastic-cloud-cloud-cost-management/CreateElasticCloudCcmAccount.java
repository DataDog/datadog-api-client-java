// Create an Elastic Cloud CCM account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ElasticCloudCloudCostManagementApi;
import com.datadog.api.client.v2.model.ElasticCloudCcmAccountAttributes;
import com.datadog.api.client.v2.model.ElasticCloudCcmAccountCreateData;
import com.datadog.api.client.v2.model.ElasticCloudCcmAccountRequest;
import com.datadog.api.client.v2.model.ElasticCloudCcmAccountResponse;
import com.datadog.api.client.v2.model.ElasticCloudCcmAuthentication;
import com.datadog.api.client.v2.model.ElasticCloudCcmDataflow;
import com.datadog.api.client.v2.model.ElasticCloudCcmDataflowId;
import com.datadog.api.client.v2.model.ElasticCloudCcmSettings;
import com.datadog.api.client.v2.model.ElasticCloudCcmTokenAuth;
import com.datadog.api.client.v2.model.ElasticCloudCcmTokenAuthType;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createElasticCloudCcmAccount", true);
    ElasticCloudCloudCostManagementApi apiInstance =
        new ElasticCloudCloudCostManagementApi(defaultClient);

    ElasticCloudCcmAccountRequest body =
        new ElasticCloudCcmAccountRequest()
            .data(
                new ElasticCloudCcmAccountCreateData()
                    .attributes(
                        new ElasticCloudCcmAccountAttributes()
                            .authentication(
                                new ElasticCloudCcmAuthentication(
                                    new ElasticCloudCcmTokenAuth()
                                        .apiKey("your-billing-api-key")
                                        .type(ElasticCloudCcmTokenAuthType.BEARER_TOKEN)))
                            .dataflows(
                                Collections.singletonList(
                                    new ElasticCloudCcmDataflow()
                                        .enabled(true)
                                        .id(ElasticCloudCcmDataflowId.COST_DATA)))
                            .name("elastic-cloud-ccm-prod")
                            .settings(new ElasticCloudCcmSettings().elasticOrgId("2079364244")))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      ElasticCloudCcmAccountResponse result = apiInstance.createElasticCloudCcmAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ElasticCloudCloudCostManagementApi#createElasticCloudCcmAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
