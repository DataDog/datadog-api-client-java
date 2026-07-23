// Update a RUM operation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumOperationsApi;
import com.datadog.api.client.v2.model.RUMOperationJourneyCompositeRule;
import com.datadog.api.client.v2.model.RUMOperationJourneyCompositeRuleKind;
import com.datadog.api.client.v2.model.RUMOperationJourneyNode;
import com.datadog.api.client.v2.model.RUMOperationJourneyPredicate;
import com.datadog.api.client.v2.model.RUMOperationJourneyRum;
import com.datadog.api.client.v2.model.RUMOperationJourneyStep;
import com.datadog.api.client.v2.model.RUMOperationJourneyStepType;
import com.datadog.api.client.v2.model.RUMOperationRequestAttributes;
import com.datadog.api.client.v2.model.RUMOperationResponse;
import com.datadog.api.client.v2.model.RUMOperationType;
import com.datadog.api.client.v2.model.RUMOperationUpdateRequest;
import com.datadog.api.client.v2.model.RUMOperationUpdateRequestData;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateRUMOperation", true);
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    RUMOperationUpdateRequest body =
        new RUMOperationUpdateRequest()
            .data(
                new RUMOperationUpdateRequestData()
                    .attributes(
                        new RUMOperationRequestAttributes()
                            .applicationId(null)
                            .category(null)
                            .description(null)
                            .displayName("Checkout completed")
                            .journeyRum(
                                new RUMOperationJourneyRum()
                                    .rumSteps(
                                        Collections.singletonList(
                                            new RUMOperationJourneyStep()
                                                .composite(
                                                    new RUMOperationJourneyCompositeRule()
                                                        .kind(
                                                            RUMOperationJourneyCompositeRuleKind
                                                                .ALL_OF)
                                                        .maxWindowMs(30000L)
                                                        .predicates(
                                                            Collections.singletonList(
                                                                new RUMOperationJourneyPredicate()
                                                                    .query(
                                                                        "@type:action"
                                                                            + " @action.type:click"))))
                                                .nodes(
                                                    Collections.singletonList(
                                                        new RUMOperationJourneyNode()
                                                            .query(
                                                                "@type:action @action.type:click")))
                                                .type(RUMOperationJourneyStepType.START))))
                            .name("checkout_completed")
                            .tags(Collections.singletonList("team:checkout")))
                    .id("abc12345-1234-5678-abcd-ef1234567890")
                    .type(RUMOperationType.OPERATIONS));

    try {
      RUMOperationResponse result = apiInstance.updateRUMOperation("operation_id", body);
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
