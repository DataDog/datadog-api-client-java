// Create an enrollment returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnPremManagementServiceApi;
import com.datadog.api.client.v2.model.OnPremManagementServiceCreateEnrollmentRequest;
import com.datadog.api.client.v2.model.OnPremManagementServiceCreateEnrollmentResponse;
import com.datadog.api.client.v2.model.OnPremManagementServiceEnrollmentAttributes;
import com.datadog.api.client.v2.model.OnPremManagementServiceEnrollmentAttributesRunnerModesItems;
import com.datadog.api.client.v2.model.OnPremManagementServiceEnrollmentDataRequest;
import com.datadog.api.client.v2.model.OnPremManagementServiceEnrollmentType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createOnPremManagementServiceEnrollment", true);
    OnPremManagementServiceApi apiInstance = new OnPremManagementServiceApi(defaultClient);

    OnPremManagementServiceCreateEnrollmentRequest body =
        new OnPremManagementServiceCreateEnrollmentRequest()
            .data(
                new OnPremManagementServiceEnrollmentDataRequest()
                    .attributes(
                        new OnPremManagementServiceEnrollmentAttributes()
                            .actionsAllowlist(Collections.singletonList("com.datadoghq.jenkins.*"))
                            .runnerHost("runner.example.com")
                            .runnerModes(
                                Collections.singletonList(
                                    OnPremManagementServiceEnrollmentAttributesRunnerModesItems
                                        .WORKFLOW_AUTOMATION))
                            .runnerName("my-runner"))
                    .type(OnPremManagementServiceEnrollmentType.ENROLLMENT));

    try {
      OnPremManagementServiceCreateEnrollmentResponse result =
          apiInstance.createOnPremManagementServiceEnrollment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " OnPremManagementServiceApi#createOnPremManagementServiceEnrollment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
