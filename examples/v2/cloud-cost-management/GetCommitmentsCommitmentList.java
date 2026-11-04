// Get commitments list returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.api.CloudCostManagementApi.GetCommitmentsCommitmentListOptionalParameters;
import com.datadog.api.client.v2.model.CommitmentsCommitmentType;
import com.datadog.api.client.v2.model.CommitmentsListResponse;
import com.datadog.api.client.v2.model.CommitmentsProvider;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getCommitmentsCommitmentList", true);
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    try {
      CommitmentsListResponse result =
          apiInstance.getCommitmentsCommitmentList(
              CommitmentsProvider.AWS,
              "ec2",
              1788220800000L,
              1790812799000L,
              new GetCommitmentsCommitmentListOptionalParameters()
                  .commitmentType(CommitmentsCommitmentType.RESERVED_INSTANCES));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudCostManagementApi#getCommitmentsCommitmentList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
