// Edit degradation update returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.DegradationUpdate;
import com.datadog.api.client.v2.model.PatchDegradationUpdateRequest;
import com.datadog.api.client.v2.model.PatchDegradationUpdateRequestData;
import com.datadog.api.client.v2.model.PatchDegradationUpdateRequestDataAttributes;
import com.datadog.api.client.v2.model.PatchDegradationUpdateRequestDataAttributesStatus;
import com.datadog.api.client.v2.model.PatchDegradationUpdateRequestDataType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    PatchDegradationUpdateRequest body =
        new PatchDegradationUpdateRequest()
            .data(
                new PatchDegradationUpdateRequestData()
                    .attributes(
                        new PatchDegradationUpdateRequestDataAttributes()
                            .description(
                                "We've identified the source of the latency increase and are"
                                    + " deploying a fix.")
                            .status(PatchDegradationUpdateRequestDataAttributesStatus.IDENTIFIED))
                    .id("00000000-0000-0000-0000-000000000000")
                    .type(PatchDegradationUpdateRequestDataType.DEGRADATION_UPDATES));

    try {
      DegradationUpdate result =
          apiInstance.editDegradationUpdate(
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"),
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"),
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"),
              body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#editDegradationUpdate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
