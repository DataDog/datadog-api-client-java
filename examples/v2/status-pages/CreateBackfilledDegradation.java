// Create backfilled degradation returns "Created" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.CreateBackfilledDegradationRequest;
import com.datadog.api.client.v2.model.CreateBackfilledDegradationRequestData;
import com.datadog.api.client.v2.model.CreateBackfilledDegradationRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateBackfilledDegradationRequestDataAttributesUpdatesItems;
import com.datadog.api.client.v2.model.CreateDegradationRequestDataAttributesComponentsAffectedItems;
import com.datadog.api.client.v2.model.CreateDegradationRequestDataAttributesStatus;
import com.datadog.api.client.v2.model.Degradation;
import com.datadog.api.client.v2.model.PatchDegradationRequestDataType;
import com.datadog.api.client.v2.model.StatusPagesComponentDataAttributesStatus;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "status_page" in the system
    UUID STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID = null;
    try {
      STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID =
          UUID.fromString(
              System.getenv("STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }
    UUID STATUS_PAGE_DATA_ID = null;
    try {
      STATUS_PAGE_DATA_ID = UUID.fromString(System.getenv("STATUS_PAGE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    CreateBackfilledDegradationRequest body =
        new CreateBackfilledDegradationRequest()
            .data(
                new CreateBackfilledDegradationRequestData()
                    .attributes(
                        new CreateBackfilledDegradationRequestDataAttributes()
                            .title("Past API Outage")
                            .updates(
                                Arrays.asList(
                                    new CreateBackfilledDegradationRequestDataAttributesUpdatesItems()
                                        .componentsAffected(
                                            Collections.singletonList(
                                                new CreateDegradationRequestDataAttributesComponentsAffectedItems()
                                                    .id(
                                                        STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID)
                                                    .status(
                                                        StatusPagesComponentDataAttributesStatus
                                                            .DEGRADED)))
                                        .description("We detected elevated error rates in the API.")
                                        .startedAt(OffsetDateTime.now().plusHours(-1))
                                        .status(
                                            CreateDegradationRequestDataAttributesStatus
                                                .INVESTIGATING),
                                    new CreateBackfilledDegradationRequestDataAttributesUpdatesItems()
                                        .componentsAffected(
                                            Collections.singletonList(
                                                new CreateDegradationRequestDataAttributesComponentsAffectedItems()
                                                    .id(
                                                        STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID)
                                                    .status(
                                                        StatusPagesComponentDataAttributesStatus
                                                            .DEGRADED)))
                                        .description(
                                            "Root cause identified as a misconfigured deployment.")
                                        .startedAt(OffsetDateTime.now().plusMinutes(-30))
                                        .status(
                                            CreateDegradationRequestDataAttributesStatus
                                                .IDENTIFIED),
                                    new CreateBackfilledDegradationRequestDataAttributesUpdatesItems()
                                        .componentsAffected(
                                            Collections.singletonList(
                                                new CreateDegradationRequestDataAttributesComponentsAffectedItems()
                                                    .id(
                                                        STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_COMPONENTS_0_ID)
                                                    .status(
                                                        StatusPagesComponentDataAttributesStatus
                                                            .OPERATIONAL)))
                                        .description(
                                            "The issue has been resolved and API is operating"
                                                + " normally.")
                                        .startedAt(OffsetDateTime.now())
                                        .status(
                                            CreateDegradationRequestDataAttributesStatus
                                                .RESOLVED))))
                    .type(PatchDegradationRequestDataType.DEGRADATIONS));

    try {
      Degradation result = apiInstance.createBackfilledDegradation(STATUS_PAGE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#createBackfilledDegradation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
