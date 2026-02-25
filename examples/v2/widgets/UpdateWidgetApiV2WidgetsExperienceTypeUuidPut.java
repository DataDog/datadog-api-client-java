// Update a widget returns "Successful Response" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.WidgetsApi;
import com.datadog.api.client.v2.model.WidgetSchemaJSONAPIDocument;
import com.datadog.api.client.v2.model.CreateOrUpdateWidgetRequestAttributes;
import com.datadog.api.client.v2.model.CreateOrUpdateWidgetRequestJSONAPIRequestDocument;
import com.datadog.api.client.v2.model.CreateOrUpdateWidgetRequestResourceObjectRequest;
import com.datadog.api.client.v2.model.Definition;
import com.datadog.api.client.v2.model.ErrorLinks;
import com.datadog.api.client.v2.model.ErrorLinksAbout;
import com.datadog.api.client.v2.model.ErrorSource;
import com.datadog.api.client.v2.model.LinksDescribedBy;
import com.datadog.api.client.v2.model.LinksFirst;
import com.datadog.api.client.v2.model.LinksLast;
import com.datadog.api.client.v2.model.LinksNext;
import com.datadog.api.client.v2.model.LinksPrev;
import com.datadog.api.client.v2.model.LinksRelated;
import com.datadog.api.client.v2.model.LinksSelf;
import com.datadog.api.client.v2.model.ResourceObjectInputAttributes;
import com.datadog.api.client.v2.model.WidgetErrorInput;
import com.datadog.api.client.v2.model.WidgetExperienceType;
import com.datadog.api.client.v2.model.WidgetLinks;
import com.datadog.api.client.v2.model.WidgetResourceObjectInput;
import com.datadog.api.client.v2.model.WidgetType;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    WidgetsApi apiInstance = new WidgetsApi(defaultClient);

    CreateOrUpdateWidgetRequestJSONAPIRequestDocument body = new CreateOrUpdateWidgetRequestJSONAPIRequestDocument()
.data(new CreateOrUpdateWidgetRequestResourceObjectRequest()
.attributes(new CreateOrUpdateWidgetRequestAttributes()
.definition(new Definition()
.title("My Timeseries Widget")
.type(WidgetType.TIMESERIES)))
.id(null)
.lid(null)
.links(new WidgetLinks()
.describedBy(null)
.first(null)
.last(null)
.next(null)
.prev(null)
.related(null)
.self(null))
.meta(null)
.relationships(null)
.type(""))
.errors(Collections.singletonList(new WidgetErrorInput()
.code(null)
.detail(null)
.id(null)
.links(new ErrorLinks()
.about(new ErrorLinksAbout(
"")))
.meta(null)
.source(new ErrorSource()
.header(null)
.parameter(null)
.pointer(null))
.status(null)
.title(null)))
.included(Collections.singletonList(new WidgetResourceObjectInput()
.attributes(null)
.id("")
.links(new WidgetLinks()
.describedBy(null)
.first(null)
.last(null)
.next(null)
.prev(null)
.related(null)
.self(null))
.meta(null)
.relationships(null)
.type("")))
.links(new WidgetLinks()
.describedBy(null)
.first(null)
.last(null)
.next(null)
.prev(null)
.related(null)
.self(null))
.meta(null);

    try {
      WidgetSchemaJSONAPIDocument result = apiInstance.updateWidgetApiV2WidgetsExperienceTypeUuidPut(UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"), WidgetExperienceType.CCM_REPORTS, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WidgetsApi#updateWidgetApiV2WidgetsExperienceTypeUuidPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}