// Create a RUM operation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumOperationsApi;
import com.datadog.api.client.v2.model.RUMOperationCreateRequest;
import com.datadog.api.client.v2.model.RUMOperationCreateRequestData;
import com.datadog.api.client.v2.model.RUMOperationJourneyNode;
import com.datadog.api.client.v2.model.RUMOperationJourneyRum;
import com.datadog.api.client.v2.model.RUMOperationJourneyStep;
import com.datadog.api.client.v2.model.RUMOperationJourneyStepType;
import com.datadog.api.client.v2.model.RUMOperationRequestAttributes;
import com.datadog.api.client.v2.model.RUMOperationResponse;
import com.datadog.api.client.v2.model.RUMOperationType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    RUMOperationCreateRequest body =
        new RUMOperationCreateRequest()
            .data(
                new RUMOperationCreateRequestData()
                    .type(RUMOperationType.OPERATIONS)
                    .attributes(
                        new RUMOperationRequestAttributes()
                            .name("bdd_examplerumoperation")
                            .displayName("BDD operation")
                            .tags(Collections.singletonList("team:rum-backend"))
                            .journeyRum(
                                new RUMOperationJourneyRum()
                                    .rumSteps(
                                        Arrays.asList(
                                            new RUMOperationJourneyStep()
                                                .type(RUMOperationJourneyStepType.START)
                                                .nodes(
                                                    Collections.singletonList(
                                                        new RUMOperationJourneyNode()
                                                            .query(
                                                                "@type:action"
                                                                    + " @action.type:click"))),
                                            new RUMOperationJourneyStep()
                                                .type(RUMOperationJourneyStepType.STOP)
                                                .nodes(
                                                    Collections.singletonList(
                                                        new RUMOperationJourneyNode()
                                                            .query("@type:view"))))))));

    try {
      RUMOperationResponse result = apiInstance.createRUMOperation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumOperationsApi#createRUMOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
