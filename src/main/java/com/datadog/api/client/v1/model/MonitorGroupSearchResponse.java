/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.List;
import java.util.Objects;

/** The response of a monitor group search. */
@JsonPropertyOrder({
  MonitorGroupSearchResponse.JSON_PROPERTY_COUNTS,
  MonitorGroupSearchResponse.JSON_PROPERTY_GROUPS,
  MonitorGroupSearchResponse.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorGroupSearchResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNTS = "counts";
  private MonitorGroupSearchResponseCounts counts;

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<MonitorGroupSearchResult> groups = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private MonitorSearchResponseMetadata metadata;

  /**
   * The counts of monitor groups per different criteria.
   *
   * @return counts
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorGroupSearchResponseCounts getCounts() {
    return counts;
  }

  /**
   * The list of found monitor groups.
   *
   * @return groups
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<MonitorGroupSearchResult> getGroups() {
    return groups;
  }

  public MonitorGroupSearchResponse metadata(MonitorSearchResponseMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * Metadata about the response.
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public MonitorSearchResponseMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(MonitorSearchResponseMetadata metadata) {
    this.metadata = metadata;
  }

  /** Return true if this MonitorGroupSearchResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorGroupSearchResponse monitorGroupSearchResponse = (MonitorGroupSearchResponse) o;
    return Objects.equals(this.counts, monitorGroupSearchResponse.counts)
        && Objects.equals(this.groups, monitorGroupSearchResponse.groups)
        && Objects.equals(this.metadata, monitorGroupSearchResponse.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(counts, groups, metadata);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorGroupSearchResponse {\n");
    sb.append("    counts: ").append(toIndentedString(counts)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("}");
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
