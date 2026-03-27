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
import java.util.UUID;
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
   * <p>Metadata about the response.</p>
 */
@JsonPropertyOrder({
  MonitorSearchResponseMetadata.JSON_PROPERTY_PAGE,
  MonitorSearchResponseMetadata.JSON_PROPERTY_PAGE_COUNT,
  MonitorSearchResponseMetadata.JSON_PROPERTY_PER_PAGE,
  MonitorSearchResponseMetadata.JSON_PROPERTY_TOTAL_COUNT
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MonitorSearchResponseMetadata {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_PAGE = "page";
  private Long page;

  public static final String JSON_PROPERTY_PAGE_COUNT = "page_count";
  private Long pageCount;

  public static final String JSON_PROPERTY_PER_PAGE = "per_page";
  private Long perPage;

  public static final String JSON_PROPERTY_TOTAL_COUNT = "total_count";
  private Long totalCount;


  /**
   * <p>The page to start paginating from.</p>
   * @return page
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getPage() {
        return page;
      }

  /**
   * <p>The number of pages.</p>
   * @return pageCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGE_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getPageCount() {
        return pageCount;
      }

  /**
   * <p>The number of monitors to return per page.</p>
   * @return perPage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PER_PAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getPerPage() {
        return perPage;
      }

  /**
   * <p>The total number of monitors.</p>
   * @return totalCount
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOTAL_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTotalCount() {
        return totalCount;
      }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return MonitorSearchResponseMetadata
   */
  @JsonAnySetter
  public MonitorSearchResponseMetadata putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }

  /**
   * Return true if this MonitorSearchResponseMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonitorSearchResponseMetadata monitorSearchResponseMetadata = (MonitorSearchResponseMetadata) o;
    return Objects.equals(this.page, monitorSearchResponseMetadata.page) && Objects.equals(this.pageCount, monitorSearchResponseMetadata.pageCount) && Objects.equals(this.perPage, monitorSearchResponseMetadata.perPage) && Objects.equals(this.totalCount, monitorSearchResponseMetadata.totalCount) && Objects.equals(this.additionalProperties, monitorSearchResponseMetadata.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(page,pageCount,perPage,totalCount, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonitorSearchResponseMetadata {\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
    sb.append("    perPage: ").append(toIndentedString(perPage)).append("\n");
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
