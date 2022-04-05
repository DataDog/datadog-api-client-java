import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.ServiceLevelObjectivesApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
    String ids =
        "id1, id2, id3"; // String | A comma separated list of the IDs of the service level
                         // objectives objects.
    String query = "monitor"; // String | The query string to filter results based on SLO names.
    String tagsQuery =
        "env:prod"; // String | The query string to filter results based on a single SLO tag.
    String metricsQuery =
        "aws.elb.request_count"; // String | The query string to filter results based on SLO
                                 // numerator and denominator.
    Long limit = 56L; // Long | The number of SLOs to return in the response.
    Long offset =
        56L; // Long | The specific offset to use as the beginning of the returned response.
    try {
      SLOListResponse result =
          apiInstance.listSLOs(
              new ServiceLevelObjectivesApi.ListSLOsOptionalParameters()
                  .ids(ids)
                  .query(query)
                  .tagsQuery(tagsQuery)
                  .metricsQuery(metricsQuery)
                  .limit(limit)
                  .offset(offset));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectivesApi#listSLOs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
