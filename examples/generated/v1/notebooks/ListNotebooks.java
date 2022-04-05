import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.NotebooksApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    NotebooksApi apiInstance = new NotebooksApi(defaultClient);
    String authorHandle =
        "test@datadoghq.com"; // String | Return notebooks created by the given `author_handle`.
    String excludeAuthorHandle =
        "test@datadoghq.com"; // String | Return notebooks not created by the given `author_handle`.
    Long start = 0L; // Long | The index of the first notebook you want returned.
    Long count = 5L; // Long | The number of notebooks to be returned.
    String sortField = "modified"; // String | Sort by field `modified`, `name`, or `created`.
    String sortDir = "desc"; // String | Sort by direction `asc` or `desc`.
    String query =
        "postmortem"; // String | Return only notebooks with `query` string in notebook name or
                      // author handle.
    Boolean includeCells =
        true; // Boolean | Value of `false` excludes the `cells` and global `time` for each
              // notebook.
    Boolean isTemplate =
        false; // Boolean | True value returns only template notebooks. Default is false (returns
               // only non-template notebooks).
    String type =
        "investigation"; // String | If type is provided, returns only notebooks with that metadata
                         // type. Default does not have type filtering.
    try {
      NotebooksResponse result =
          apiInstance.listNotebooks(
              new NotebooksApi.ListNotebooksOptionalParameters()
                  .authorHandle(authorHandle)
                  .excludeAuthorHandle(excludeAuthorHandle)
                  .start(start)
                  .count(count)
                  .sortField(sortField)
                  .sortDir(sortDir)
                  .query(query)
                  .includeCells(includeCells)
                  .isTemplate(isTemplate)
                  .type(type));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotebooksApi#listNotebooks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
