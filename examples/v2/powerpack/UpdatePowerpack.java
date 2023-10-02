// Update a powerpack returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.PowerpackApi;
import com.datadog.api.client.v2.model.Powerpack;
import com.datadog.api.client.v2.model.PowerpackAttributes;
import com.datadog.api.client.v2.model.PowerpackData;
import com.datadog.api.client.v2.model.PowerpackResponse;
import com.datadog.api.client.v2.model.PowerpackTemplateVariable;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    PowerpackApi apiInstance = new PowerpackApi(defaultClient);

    // there is a valid "powerpack" in the system
    String POWERPACK_DATA_ID = System.getenv("POWERPACK_DATA_ID");

    Powerpack body =
        new Powerpack()
            .data(
                new PowerpackData()
                    .attributes(
                        new PowerpackAttributes()
                            .description("Sample powerpack")
                            .groupWidget(
                                Map.ofEntries(
                                    Map.entry(
                                        "definition",
                                        "{'layout_type': 'ordered', 'show_title': True, 'title':"
                                            + " 'Sample Powerpack', 'type': 'group', 'widgets':"
                                            + " [{'definition': {'content': 'test', 'type':"
                                            + " 'note'}}]}"),
                                    Map.entry(
                                        "layout", "{'height': 3, 'width': 12, 'x': 0, 'y': 0}")))
                            .name("Sample Powerpack")
                            .tags(Collections.singletonList("tag:sample"))
                            .templateVariables(
                                Collections.singletonList(
                                    new PowerpackTemplateVariable()
                                        .defaults(Collections.singletonList("*"))
                                        .name("sample"))))
                    .type("powerpack"));

    try {
      PowerpackResponse result = apiInstance.updatePowerpack(POWERPACK_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling PowerpackApi#updatePowerpack");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
