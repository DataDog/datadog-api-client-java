// Create a DEM journey variant returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DemApi;
import com.datadog.api.client.v2.model.DemRumNode;
import com.datadog.api.client.v2.model.DemRumStep;
import com.datadog.api.client.v2.model.DemRumStepType;
import com.datadog.api.client.v2.model.DemVariantAttributes;
import com.datadog.api.client.v2.model.DemVariantRequest;
import com.datadog.api.client.v2.model.DemVariantRequestData;
import com.datadog.api.client.v2.model.DemVariantResponse;
import com.datadog.api.client.v2.model.DemVariantType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DemApi apiInstance = new DemApi(defaultClient);

    DemVariantRequest body =
        new DemVariantRequest()
            .data(
                new DemVariantRequestData()
                    .attributes(
                        new DemVariantAttributes()
                            .filter("device.type:mobile")
                            .name("Mobile checkout")
                            .rumSteps(
                                Arrays.asList(
                                    new DemRumStep()
                                        .nodes(
                                            Collections.singletonList(
                                                new DemRumNode().query("action.name:'checkout'")))
                                        .type(DemRumStepType.START),
                                    new DemRumStep()
                                        .nodes(
                                            Collections.singletonList(
                                                new DemRumNode()
                                                    .query("action.name:'confirmation'")))
                                        .type(DemRumStepType.STOP))))
                    .type(DemVariantType.VARIANTS));

    try {
      DemVariantResponse result = apiInstance.createJourneyVariant("journey-abc123", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DemApi#createJourneyVariant");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
