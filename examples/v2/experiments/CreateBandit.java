// Create bandit returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsBanditFlagConfigurationInputV2;
import com.datadog.api.client.v2.model.ExperimentsBanditV2DTO;
import com.datadog.api.client.v2.model.ExperimentsBanditV2DTODataType;
import com.datadog.api.client.v2.model.ExperimentsBanditVariantInputV2;
import com.datadog.api.client.v2.model.ExperimentsCreateBanditV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateBanditV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsCreateBanditV2RequestDataAttributes;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createBandit", true);
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

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
    UUID FEATURE_FLAG_DATA_ID = null;
    try {
      FEATURE_FLAG_DATA_ID = UUID.fromString(System.getenv("FEATURE_FLAG_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "environment" in the system
    UUID ENVIRONMENT_DATA_ID = null;
    try {
      ENVIRONMENT_DATA_ID = UUID.fromString(System.getenv("ENVIRONMENT_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "experiment_subject_type" in the system
    UUID EXPERIMENT_SUBJECT_TYPE_DATA_ID = null;
    try {
      EXPERIMENT_SUBJECT_TYPE_DATA_ID =
          UUID.fromString(System.getenv("EXPERIMENT_SUBJECT_TYPE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    ExperimentsCreateBanditV2Request body =
        new ExperimentsCreateBanditV2Request()
            .data(
                new ExperimentsCreateBanditV2RequestData()
                    .type(ExperimentsBanditV2DTODataType.BANDITS)
                    .attributes(
                        new ExperimentsCreateBanditV2RequestDataAttributes()
                            .name("bandit-14bb9543f523edde")
                            .datadogFlagConfiguration(
                                new ExperimentsBanditFlagConfigurationInputV2()
                                    .featureFlagId(FEATURE_FLAG_DATA_ID)
                                    .environmentId(ENVIRONMENT_DATA_ID))
                            .variants(
                                Arrays.asList(
                                    new ExperimentsBanditVariantInputV2()
                                        .featureFlagVariantId(
                                            FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_0_ID)
                                        .isFallback(true),
                                    new ExperimentsBanditVariantInputV2()
                                        .featureFlagVariantId(
                                            FEATURE_FLAG_DATA_ATTRIBUTES_VARIANTS_1_ID)))
                            .subjectTypeId(EXPERIMENT_SUBJECT_TYPE_DATA_ID)
                            .tags(Collections.singletonList("bdd"))));

    try {
      ExperimentsBanditV2DTO result = apiInstance.createBandit(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#createBandit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
