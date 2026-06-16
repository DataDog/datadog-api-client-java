// Create or update a form version returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FormsApi;
import com.datadog.api.client.v2.model.FormDataDefinition;
import com.datadog.api.client.v2.model.FormDataDefinitionType;
import com.datadog.api.client.v2.model.FormUiDefinition;
import com.datadog.api.client.v2.model.FormUiDefinitionUiTheme;
import com.datadog.api.client.v2.model.FormUiDefinitionUiThemePrimaryColor;
import com.datadog.api.client.v2.model.FormVersionResponse;
import com.datadog.api.client.v2.model.FormVersionState;
import com.datadog.api.client.v2.model.FormVersionType;
import com.datadog.api.client.v2.model.LatestVersionMatchPolicy;
import com.datadog.api.client.v2.model.UpsertFormVersionData;
import com.datadog.api.client.v2.model.UpsertFormVersionDataAttributes;
import com.datadog.api.client.v2.model.UpsertFormVersionRequest;
import com.datadog.api.client.v2.model.UpsertFormVersionUpsertParams;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.upsertFormVersion", true);
    FormsApi apiInstance = new FormsApi(defaultClient);

    // there is a valid "form" in the system
    UUID FORM_DATA_ID = null;
    try {
      FORM_DATA_ID = UUID.fromString(System.getenv("FORM_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    UpsertFormVersionRequest body =
        new UpsertFormVersionRequest()
            .data(
                new UpsertFormVersionData()
                    .attributes(
                        new UpsertFormVersionDataAttributes()
                            .dataDefinition(
                                new FormDataDefinition()
                                    .description("Welcome to the Engineering Experience Survey.")
                                    .title("Developer Experience Survey")
                                    .type(FormDataDefinitionType.OBJECT))
                            .state(FormVersionState.FROZEN)
                            .uiDefinition(
                                new FormUiDefinition()
                                    .uiTheme(
                                        new FormUiDefinitionUiTheme()
                                            .primaryColor(
                                                FormUiDefinitionUiThemePrimaryColor.GRAY)))
                            .upsertParams(
                                new UpsertFormVersionUpsertParams()
                                    .etag(
                                        "b51f08b698d88d8027a935d9db649774949f5fb41a0c559bfee6a9a13225c72d")
                                    .insertOnly(false)
                                    .matchPolicy(LatestVersionMatchPolicy.NONE)))
                    .type(FormVersionType.FORM_VERSIONS));

    try {
      FormVersionResponse result = apiInstance.upsertFormVersion(FORM_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormsApi#upsertFormVersion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
