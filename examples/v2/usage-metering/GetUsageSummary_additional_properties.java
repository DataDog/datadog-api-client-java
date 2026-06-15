// Get usage across your account and read all fields from additionalProperties returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.UsageMeteringApi;
import com.datadog.api.client.v1.model.UsageSummaryDate;
import com.datadog.api.client.v1.model.UsageSummaryDateOrg;
import com.datadog.api.client.v1.model.UsageSummaryResponse;
import com.datadog.api.client.v2.model.UsageSummaryAvailableFieldsAttributes;
import com.datadog.api.client.v2.model.UsageSummaryAvailableFieldsResponse;
import java.time.OffsetDateTime;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();

    // Step 1: call v2 to discover every field name at each response level.
    com.datadog.api.client.v2.api.UsageMeteringApi v2Api =
        new com.datadog.api.client.v2.api.UsageMeteringApi(defaultClient);

    List<String> responseFields = null;
    List<String> dateFields = null;
    List<String> dateOrgFields = null;

    try {
      UsageSummaryAvailableFieldsResponse fieldsResponse =
          v2Api.getUsageSummaryAvailableFields();
      if (fieldsResponse.getData() != null
          && fieldsResponse.getData().getAttributes() != null) {
        UsageSummaryAvailableFieldsAttributes attrs =
            fieldsResponse.getData().getAttributes();
        responseFields = attrs.getResponseFields();
        dateFields = attrs.getDateFields();
        dateOrgFields = attrs.getDateOrgFields();
      }
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling UsageMeteringApi#getUsageSummaryAvailableFields");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
      return;
    }

    // Step 2: call v1 to get the actual usage summary, including per-org breakdowns.
    UsageMeteringApi v1Api = new UsageMeteringApi(defaultClient);

    try {
      UsageSummaryResponse result =
          v1Api.getUsageSummary(
              OffsetDateTime.parse("2021-11-11T11:11:11.111+00:00"),
              new UsageMeteringApi.GetUsageSummaryOptionalParameters()
                  .includeOrgDetails(true));

      // Step 3: read response-level additionalProperties using the discovered field names.
      System.out.println("=== Response-level additionalProperties ===");
      if (responseFields != null) {
        for (String field : responseFields) {
          Object value = result.getAdditionalProperty(field);
          if (value != null) {
            System.out.println(field + ": " + value);
          }
        }
      }

      // Step 4: iterate over each usage date and read date-level additionalProperties.
      if (result.getUsage() != null) {
        for (UsageSummaryDate dateEntry : result.getUsage()) {
          System.out.println("\n=== Date-level additionalProperties for " + dateEntry.getDate() + " ===");
          if (dateFields != null) {
            for (String field : dateFields) {
              Object value = dateEntry.getAdditionalProperty(field);
              if (value != null) {
                System.out.println("  " + field + ": " + value);
              }
            }
          }

          // Step 5: iterate over each org within the date and read org-level additionalProperties.
          if (dateEntry.getOrgs() != null) {
            for (UsageSummaryDateOrg orgEntry : dateEntry.getOrgs()) {
              System.out.println(
                  "\n  === Org-level additionalProperties for org "
                      + orgEntry.getId()
                      + " ===");
              if (dateOrgFields != null) {
                for (String field : dateOrgFields) {
                  Object value = orgEntry.getAdditionalProperty(field);
                  if (value != null) {
                    System.out.println("    " + field + ": " + value);
                  }
                }
              }
            }
          }
        }
      }
    } catch (ApiException e) {
      System.err.println("Exception when calling UsageMeteringApi#getUsageSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
