// Update App Favorite Status returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppBuilderApi;
import com.datadog.api.client.v2.model.AppFavoriteType;
import com.datadog.api.client.v2.model.UpdateAppFavoriteRequest;
import com.datadog.api.client.v2.model.UpdateAppFavoriteRequestData;
import com.datadog.api.client.v2.model.UpdateAppFavoriteRequestDataAttributes;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AppBuilderApi apiInstance = new AppBuilderApi(defaultClient);

    // there is a valid "app" in the system
    UUID APP_DATA_ID = null;
    try {
      APP_DATA_ID = UUID.fromString(System.getenv("APP_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    UpdateAppFavoriteRequest body =
        new UpdateAppFavoriteRequest()
            .data(
                new UpdateAppFavoriteRequestData()
                    .attributes(new UpdateAppFavoriteRequestDataAttributes().favorite(true))
                    .type(AppFavoriteType.FAVORITES));

    try {
      apiInstance.updateAppFavorite(APP_DATA_ID, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppBuilderApi#updateAppFavorite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
