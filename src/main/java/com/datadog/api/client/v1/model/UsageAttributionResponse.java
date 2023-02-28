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
   * <p>Response containing the Usage Summary by tag(s).</p>
 */
@JsonPropertyOrder({
  UsageAttributionResponse.JSON_PROPERTY_METADATA,
  UsageAttributionResponse.JSON_PROPERTY_USAGE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UsageAttributionResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_METADATA = "metadata";
  private UsageAttributionMetadata metadata;

  public static final String JSON_PROPERTY_USAGE = "usage";
  private List<UsageAttributionBody> usage = null;

  public UsageAttributionResponse metadata(UsageAttributionMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * <p>The object containing document metadata.</p>
   * @return metadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public UsageAttributionMetadata getMetadata() {
        return metadata;
      }
  public void setMetadata(UsageAttributionMetadata metadata) {
    this.metadata = metadata;
  }
  public UsageAttributionResponse usage(List<UsageAttributionBody> usage) {
    this.usage = usage;
    for (UsageAttributionBody item : usage) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public UsageAttributionResponse addUsageItem(UsageAttributionBody usageItem) {
    if (this.usage == null) {
      this.usage = new ArrayList<>();
    }
    this.usage.add(usageItem);
    this.unparsed |= usageItem.unparsed;
    return this;
  }

  /**
   * <p>Get usage summary by tag(s).</p>
   * @return usage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_USAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<UsageAttributionBody> getUsage() {
        return usage;
      }
  public void setUsage(List<UsageAttributionBody> usage) {
    this.usage = usage;
  }

  /**
   * Return true if this UsageAttributionResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsageAttributionResponse usageAttributionResponse = (UsageAttributionResponse) o;
    return Objects.equals(this.metadata, usageAttributionResponse.metadata) && Objects.equals(this.usage, usageAttributionResponse.usage);
  }


  @Override
  public int hashCode() {
    return Objects.hash(metadata,usage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsageAttributionResponse {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
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
