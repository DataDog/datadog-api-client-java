/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Response containing the hourly usage attribution by tag(s). */
@JsonPropertyOrder({
  HourlyUsageAttributionResponse.JSON_PROPERTY_METADATA,
  HourlyUsageAttributionResponse.JSON_PROPERTY_USAGE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HourlyUsageAttributionResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private HourlyUsageAttributionMetadata metadata;

  public static final String JSON_PROPERTY_USAGE = "usage";
  private List<HourlyUsageAttributionBody> usage = null;

  public HourlyUsageAttributionResponse metadata(HourlyUsageAttributionMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * The object containing document metadata.
   *
   * @return metadata
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HourlyUsageAttributionMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(HourlyUsageAttributionMetadata metadata) {
    this.metadata = metadata;
  }

  public HourlyUsageAttributionResponse usage(List<HourlyUsageAttributionBody> usage) {
    this.usage = usage;
    for (HourlyUsageAttributionBody item : usage) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HourlyUsageAttributionResponse addUsageItem(HourlyUsageAttributionBody usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    this.unparsed |= usageItem.unparsed;
    return this;
  }

  /**
   * Get the hourly usage attribution by tag(s).
   *
   * @return usage
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_USAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<HourlyUsageAttributionBody> getUsage() {
    return usage;
  }

  public void setUsage(List<HourlyUsageAttributionBody> usage) {
    this.usage = usage;
  }

  /** Return true if this HourlyUsageAttributionResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HourlyUsageAttributionResponse hourlyUsageAttributionResponse =
        (HourlyUsageAttributionResponse) o;
    return Objects.equals(this.metadata, hourlyUsageAttributionResponse.metadata)
        && Objects.equals(this.usage, hourlyUsageAttributionResponse.usage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HourlyUsageAttributionResponse {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
