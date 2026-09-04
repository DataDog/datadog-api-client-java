// Update a DEM journey returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DemApi;
import com.datadog.api.client.v2.model.DemJourneyCreateAttributes;
import com.datadog.api.client.v2.model.DemJourneyCreateData;
import com.datadog.api.client.v2.model.DemJourneyCreateRequest;
import com.datadog.api.client.v2.model.DemJourneyResponse;
import com.datadog.api.client.v2.model.DemJourneyRum;
import com.datadog.api.client.v2.model.DemJourneyType;
import com.datadog.api.client.v2.model.DemRumNode;
import com.datadog.api.client.v2.model.DemRumStep;
import com.datadog.api.client.v2.model.DemRumStepType;
import com.datadog.api.client.v2.model.DemVariant;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DemApi apiInstance = new DemApi(defaultClient);

    DemJourneyCreateRequest body =
        new DemJourneyCreateRequest()
            .data(
                new DemJourneyCreateData()
                    .attributes(
                        new DemJourneyCreateAttributes()
                            .description("Tracks the user checkout flow from cart to confirmation.")
                            .journeyRum(
                                new DemJourneyRum()
                                    .filter("env:prod")
                                    .rumSteps(
                                        Arrays.asList(
                                            new DemRumStep()
                                                .nodes(
                                                    Collections.singletonList(
                                                        new DemRumNode()
                                                            .query("action.name:'checkout'")))
                                                .type(DemRumStepType.START),
                                            new DemRumStep()
                                                .nodes(
                                                    Collections.singletonList(
                                                        new DemRumNode()
                                                            .query("action.name:'confirmation'")))
                                                .type(DemRumStepType.STOP)))
                                    .variants(
                                        Collections.singletonList(
                                            new DemVariant()
                                                .name("Mobile checkout")
                                                .rumSteps(
                                                    Arrays.asList(
                                                        new DemRumStep()
                                                            .nodes(
                                                                Collections.singletonList(
                                                                    new DemRumNode()
                                                                        .query(
                                                                            "action.name:'checkout'")))
                                                            .type(DemRumStepType.START),
                                                        new DemRumStep()
                                                            .nodes(
                                                                Collections.singletonList(
                                                                    new DemRumNode()
                                                                        .query(
                                                                            "action.name:'confirmation'")))
                                                            .type(DemRumStepType.STOP))))))
                            .name("Checkout Flow")
                            .tags(Arrays.asList("team:synthetics", "env:prod"))
                            .variants(
                                Collections.singletonList(
                                    new DemVariant()
                                        .name("Mobile checkout")
                                        .rumSteps(
                                            Arrays.asList(
                                                new DemRumStep()
                                                    .nodes(
                                                        Collections.singletonList(
                                                            new DemRumNode()
                                                                .query("action.name:'checkout'")))
                                                    .type(DemRumStepType.START),
                                                new DemRumStep()
                                                    .nodes(
                                                        Collections.singletonList(
                                                            new DemRumNode()
                                                                .query(
                                                                    "action.name:'confirmation'")))
                                                    .type(DemRumStepType.STOP))))))
                    .type(DemJourneyType.JOURNEYS));

    try {
      DemJourneyResponse result = apiInstance.updateJourney("journey-abc123", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DemApi#updateJourney");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
