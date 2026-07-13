// Preview AWS metric name filter returns "AWS metric name filter preview result" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwsIntegrationApi;
import com.datadog.api.client.v2.model.AWSMetricNameFilterPreviewRequest;
import com.datadog.api.client.v2.model.AWSMetricNameFilterPreviewRequestAttributes;
import com.datadog.api.client.v2.model.AWSMetricNameFilterPreviewRequestData;
import com.datadog.api.client.v2.model.AWSMetricNameFilterPreviewResponse;
import com.datadog.api.client.v2.model.AWSMetricNameFilterPreviewType;
import com.datadog.api.client.v2.model.AWSMetricNameFilters;
import com.datadog.api.client.v2.model.AWSMetricNameFiltersIncludeOnly;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.previewAWSMetricNameFilter", true);
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSMetricNameFilterPreviewRequest body =
        new AWSMetricNameFilterPreviewRequest()
            .data(
                new AWSMetricNameFilterPreviewRequestData()
                    .attributes(
                        new AWSMetricNameFilterPreviewRequestAttributes()
                            .metricNameFilters(
                                Collections.singletonList(
                                    new AWSMetricNameFilters(
                                        new AWSMetricNameFiltersIncludeOnly()
                                            .includeOnly(
                                                Collections.singletonList("aws.ec2.network_in"))
                                            .namespace("AWS/EC2")))))
                    .type(AWSMetricNameFilterPreviewType.METRIC_NAME_FILTER_PREVIEW));

    try {
      AWSMetricNameFilterPreviewResponse result =
          apiInstance.previewAWSMetricNameFilter("aws_account_config_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#previewAWSMetricNameFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
