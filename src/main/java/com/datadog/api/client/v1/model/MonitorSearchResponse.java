/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The response form a monitor search.</p>
 */
@JsonPropertyOrder({
  MonitorSearchResponse.JSON_PROPERTY_COUNTS,
  MonitorSearchResponse.JSON_PROPERTY_METADATA,
  MonitorSearchResponse.JSON_PROPERTY_MONITORS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorSearchResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNTS = "counts";
  private MonitorSearchResponseCounts counts;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private MonitorSearchResponseMetadata metadata;

  public static final String JSON_PROPERTY_MONITORS = "monitors";
  private List<MonitorSearchResult> monitors = null;


  /**
   * <p>The counts of monitors per different criteria.</p>
   * @return counts
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COUNTS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorSearchResponseCounts getCounts() {
        return counts;
      }
  public MonitorSearchResponse metadata(MonitorSearchResponseMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * <p>Metadata about the response.</p>
   * @return metadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MonitorSearchResponseMetadata getMetadata() {
        return metadata;
      }
  public void setMetadata(MonitorSearchResponseMetadata metadata) {
    this.metadata = metadata;
  }

  /**
   * <p>The list of found monitors.</p>
   * @return monitors
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MONITORS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<MonitorSearchResult> getMonitors() {
        return monitors;
      }

  /**
   * Return true if this MonitorSearchResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorSearchResponse monitorSearchResponse = (MonitorSearchResponse) o;
    return Objects.equals(this.counts, monitorSearchResponse.counts) && Objects.equals(this.metadata, monitorSearchResponse.metadata) && Objects.equals(this.monitors, monitorSearchResponse.monitors);
  }


  @Override
  public int hashCode() {
    return Objects.hash(counts,metadata,monitors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorSearchResponse {\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    monitors: ").append(toIndentedString(monitors)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
