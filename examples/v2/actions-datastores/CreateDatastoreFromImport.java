// Create datastore from import returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionsDatastoresApi;
import com.datadog.api.client.v2.model.CreateAppsDatastoreFromImportRequest;
import com.datadog.api.client.v2.model.CreateAppsDatastoreFromImportRequestData;
import com.datadog.api.client.v2.model.CreateAppsDatastoreFromImportRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateAppsDatastoreFromImportRequestDataType;
import com.datadog.api.client.v2.model.CreateAppsDatastoreFromImportResponse;
import java.util.Arrays;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionsDatastoresApi apiInstance = new ActionsDatastoresApi(defaultClient);

    CreateAppsDatastoreFromImportRequest body =
        new CreateAppsDatastoreFromImportRequest()
            .data(
                new CreateAppsDatastoreFromImportRequestData()
                    .attributes(
                        new CreateAppsDatastoreFromImportRequestDataAttributes()
                            .name("datastore-name")
                            .primaryColumnName("primaryKey")
                            .values(
                                Arrays.asList(
                                    Map.ofEntries(
                                        Map.entry("primaryKey", "key1"),
                                        Map.entry(
                                            "value", "{'data': 'example data 1', 'key': 'value'}")),
                                    Map.ofEntries(
                                        Map.entry("primaryKey", "key2"),
                                        Map.entry(
                                            "value",
                                            "{'data': 'example data 2', 'key': 'value'}")))))
                    .type(CreateAppsDatastoreFromImportRequestDataType.DATASTORES));

    try {
      CreateAppsDatastoreFromImportResponse result = apiInstance.createDatastoreFromImport(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsDatastoresApi#createDatastoreFromImport");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
