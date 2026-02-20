// Edit a test suite returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SyntheticsApi;
import com.datadog.api.client.v2.model.SuiteCreateEdit;
import com.datadog.api.client.v2.model.SuiteCreateEditRequest;
import com.datadog.api.client.v2.model.SyntheticsSuite;
import com.datadog.api.client.v2.model.SyntheticsSuiteOptions;
import com.datadog.api.client.v2.model.SyntheticsSuiteResponse;
import com.datadog.api.client.v2.model.SyntheticsSuiteTest;
import com.datadog.api.client.v2.model.SyntheticsSuiteTestAlertingCriticality;
import com.datadog.api.client.v2.model.SyntheticsSuiteType;
import com.datadog.api.client.v2.model.SyntheticsSuiteTypes;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SuiteCreateEditRequest body =
        new SuiteCreateEditRequest()
            .data(
                new SuiteCreateEdit()
                    .attributes(
                        new SyntheticsSuite()
                            .message("Notification message")
                            .name("Example suite name")
                            .options(new SyntheticsSuiteOptions())
                            .tags(Collections.singletonList("env:production"))
                            .tests(
                                Collections.singletonList(
                                    new SyntheticsSuiteTest()
                                        .alertingCriticality(
                                            SyntheticsSuiteTestAlertingCriticality.CRITICAL)
                                        .publicId("")))
                            .type(SyntheticsSuiteType.SUITE))
                    .type(SyntheticsSuiteTypes.SUITES));

    try {
      SyntheticsSuiteResponse result = apiInstance.editSyntheticsSuite("public_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#editSyntheticsSuite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
