// Post dependencies for analysis returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.ScaRequest;
import com.datadog.api.client.v2.model.ScaRequestData;
import com.datadog.api.client.v2.model.ScaRequestDataAttributes;
import com.datadog.api.client.v2.model.ScaRequestDataAttributesCommit;
import com.datadog.api.client.v2.model.ScaRequestDataAttributesDependenciesItems;
import com.datadog.api.client.v2.model.ScaRequestDataAttributesDependenciesItemsLocationsItems;
import com.datadog.api.client.v2.model.ScaRequestDataAttributesDependenciesItemsLocationsItemsFilePosition;
import com.datadog.api.client.v2.model.ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition;
import com.datadog.api.client.v2.model.ScaRequestDataAttributesDependenciesItemsReachableSymbolPropertiesItems;
import com.datadog.api.client.v2.model.ScaRequestDataAttributesFilesItems;
import com.datadog.api.client.v2.model.ScaRequestDataAttributesRelationsItems;
import com.datadog.api.client.v2.model.ScaRequestDataAttributesRepository;
import com.datadog.api.client.v2.model.ScaRequestDataAttributesVulnerabilitiesItems;
import com.datadog.api.client.v2.model.ScaRequestDataAttributesVulnerabilitiesItemsAffectsItems;
import com.datadog.api.client.v2.model.ScaRequestDataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createSCAResult", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    ScaRequest body =
        new ScaRequest()
            .data(
                new ScaRequestData()
                    .attributes(
                        new ScaRequestDataAttributes()
                            .commit(new ScaRequestDataAttributesCommit())
                            .dependencies(
                                Collections.singletonList(
                                    new ScaRequestDataAttributesDependenciesItems()
                                        .locations(
                                            Collections.singletonList(
                                                new ScaRequestDataAttributesDependenciesItemsLocationsItems()
                                                    .block(
                                                        new ScaRequestDataAttributesDependenciesItemsLocationsItemsFilePosition()
                                                            .end(
                                                                new ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition())
                                                            .start(
                                                                new ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition()))
                                                    .name(
                                                        new ScaRequestDataAttributesDependenciesItemsLocationsItemsFilePosition()
                                                            .end(
                                                                new ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition())
                                                            .start(
                                                                new ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition()))
                                                    .namespace(
                                                        new ScaRequestDataAttributesDependenciesItemsLocationsItemsFilePosition()
                                                            .end(
                                                                new ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition())
                                                            .start(
                                                                new ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition()))
                                                    .version(
                                                        new ScaRequestDataAttributesDependenciesItemsLocationsItemsFilePosition()
                                                            .end(
                                                                new ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition())
                                                            .start(
                                                                new ScaRequestDataAttributesDependenciesItemsLocationsItemsPosition()))))
                                        .reachableSymbolProperties(
                                            Collections.singletonList(
                                                new ScaRequestDataAttributesDependenciesItemsReachableSymbolPropertiesItems()))))
                            .files(
                                Collections.singletonList(new ScaRequestDataAttributesFilesItems()))
                            .relations(
                                Collections.singletonList(
                                    new ScaRequestDataAttributesRelationsItems()))
                            .repository(new ScaRequestDataAttributesRepository())
                            .vulnerabilities(
                                Collections.singletonList(
                                    new ScaRequestDataAttributesVulnerabilitiesItems()
                                        .affects(
                                            Collections.singletonList(
                                                new ScaRequestDataAttributesVulnerabilitiesItemsAffectsItems())))))
                    .type(ScaRequestDataType.SCAREQUESTS));

    try {
      apiInstance.createSCAResult(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#createSCAResult");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
