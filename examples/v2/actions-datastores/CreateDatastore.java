// Create datastore returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionsDatastoresApi;
import com.datadog.api.client.v2.model.CreateAppsDatastoreRequest;
import com.datadog.api.client.v2.model.CreateAppsDatastoreRequestData;
import com.datadog.api.client.v2.model.CreateAppsDatastoreRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateAppsDatastoreResponse;
import com.datadog.api.client.v2.model.DatastoreDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionsDatastoresApi apiInstance = new ActionsDatastoresApi(defaultClient);

    CreateAppsDatastoreRequest body =
        new CreateAppsDatastoreRequest()
            .data(
                new CreateAppsDatastoreRequestData()
                    .attributes(
                        new CreateAppsDatastoreRequestDataAttributes()
                            .name("datastore-name")
                            .primaryColumnName("primaryKey"))
                    .type(DatastoreDataType.DATASTORES));

    try {
      CreateAppsDatastoreResponse result = apiInstance.createDatastore(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionsDatastoresApi#createDatastore");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
