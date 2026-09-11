/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Settings of the Cloud Cost Management dataflow. Only the fields provided are changed. */
@JsonPropertyOrder({
  SnowflakeCloudCostMetricsIntegrationDataflowSettingsRequest.JSON_PROPERTY_QUERY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SnowflakeCloudCostMetricsIntegrationDataflowSettingsRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_QUERY_TAGS = "query_tags";
  private String queryTags;

  public SnowflakeCloudCostMetricsIntegrationDataflowSettingsRequest queryTags(String queryTags) {
    this.queryTags = queryTags;
    return this;
  }

  /**
   * Snowflake query tags to ingest, so that cost data can be broken down by them in Cloud Cost
   * Management. Provide the tag names as a comma-separated list without spaces, using only letters,
   * digits, underscores, dots, and hyphens. Datadog does not collect query tags by default.
   *
   * @return queryTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueryTags() {
    return queryTags;
  }

  public void setQueryTags(String queryTags) {
    this.queryTags = queryTags;
  }

  /**
   * Return true if this SnowflakeCloudCostMetricsIntegrationDataflowSettingsRequest object is equal
   * to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SnowflakeCloudCostMetricsIntegrationDataflowSettingsRequest
        snowflakeCloudCostMetricsIntegrationDataflowSettingsRequest =
            (SnowflakeCloudCostMetricsIntegrationDataflowSettingsRequest) o;
    return Objects.equals(
        this.queryTags, snowflakeCloudCostMetricsIntegrationDataflowSettingsRequest.queryTags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queryTags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SnowflakeCloudCostMetricsIntegrationDataflowSettingsRequest {\n");
    sb.append("    queryTags: ").append(toIndentedString(queryTags)).append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
