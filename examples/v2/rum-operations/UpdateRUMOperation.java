// Update a RUM operation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumOperationsApi;
import com.datadog.api.client.v2.model.RUMOperationJourneyNode;
import com.datadog.api.client.v2.model.RUMOperationJourneyRum;
import com.datadog.api.client.v2.model.RUMOperationJourneyStep;
import com.datadog.api.client.v2.model.RUMOperationJourneyStepType;
import com.datadog.api.client.v2.model.RUMOperationRequestAttributes;
import com.datadog.api.client.v2.model.RUMOperationResponse;
import com.datadog.api.client.v2.model.RUMOperationType;
import com.datadog.api.client.v2.model.RUMOperationUpdateRequest;
import com.datadog.api.client.v2.model.RUMOperationUpdateRequestData;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    // there is a valid "rum_operation" in the system
    String RUM_OPERATION_DATA_ATTRIBUTES_NAME = System.getenv("RUM_OPERATION_DATA_ATTRIBUTES_NAME");
    String RUM_OPERATION_DATA_ID = System.getenv("RUM_OPERATION_DATA_ID");

    RUMOperationUpdateRequest body =
        new RUMOperationUpdateRequest()
            .data(
                new RUMOperationUpdateRequestData()
                    .id(RUM_OPERATION_DATA_ID)
                    .type(RUMOperationType.OPERATIONS)
                    .attributes(
                        new RUMOperationRequestAttributes()
                            .name(RUM_OPERATION_DATA_ATTRIBUTES_NAME)
                            .displayName("BDD operation updated")
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
      RUMOperationResponse result = apiInstance.updateRUMOperation(RUM_OPERATION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumOperationsApi#updateRUMOperation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
