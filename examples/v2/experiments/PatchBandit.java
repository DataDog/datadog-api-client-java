// Update bandit returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsBanditV2DTO;
import com.datadog.api.client.v2.model.ExperimentsBanditV2DTODataType;
import com.datadog.api.client.v2.model.ExperimentsBanditVariantInputV2;
import com.datadog.api.client.v2.model.ExperimentsPatchBanditV2Request;
import com.datadog.api.client.v2.model.ExperimentsPatchBanditV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsPatchBanditV2RequestDataAttributes;
import java.util.Arrays;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createBandit", true);
    defaultClient.setUnstableOperationEnabled("v2.patchBandit", true);
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    // there is a valid "bandit" in the system
    UUID BANDIT_DATA_ID = null;
    try {
      BANDIT_DATA_ID = UUID.fromString(System.getenv("BANDIT_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "feature_flag" in the system
    UUID FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_0_ID = null;
    try {
      FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_0_ID =
          UUID.fromString(System.getenv("FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_0_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }
    UUID FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_1_ID = null;
    try {
      FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_1_ID =
          UUID.fromString(System.getenv("FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_1_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    ExperimentsPatchBanditV2Request body =
        new ExperimentsPatchBanditV2Request()
            .data(
                new ExperimentsPatchBanditV2RequestData()
                    .type(ExperimentsBanditV2DTODataType.BANDITS)
                    .id(BANDIT_DATA_ID)
                    .attributes(
                        new ExperimentsPatchBanditV2RequestDataAttributes()
                            .name("bandit-14bb9543f523edde-renamed")
                            .variants(
                                Arrays.asList(
                                    new ExperimentsBanditVariantInputV2()
                                        .featureFlagVariantId(
                                            FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_0_ID),
                                    new ExperimentsBanditVariantInputV2()
                                        .featureFlagVariantId(
                                            FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_1_ID)
                                        .isFallback(true)))));

    try {
      ExperimentsBanditV2DTO result = apiInstance.patchBandit(BANDIT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#patchBandit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
