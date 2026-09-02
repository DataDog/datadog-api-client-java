/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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
   * <p>Metadata related to the paginated response.</p>
 */
@JsonPropertyOrder({
  CSMAgentsMetadata.JSON_PROPERTY_PAGE_INDEX,
  CSMAgentsMetadata.JSON_PROPERTY_PAGE_SIZE,
  CSMAgentsMetadata.JSON_PROPERTY_TOTAL_FILTERED
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CSMAgentsMetadata {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_PAGE_INDEX = "page_index";
  private Long pageIndex;

  public static final String JSON_PROPERTY_PAGE_SIZE = "page_size";
  private Long pageSize;

  public static final String JSON_PROPERTY_TOTAL_FILTERED = "total_filtered";
  private Long totalFiltered;

  public CSMAgentsMetadata pageIndex(Long pageIndex) {
    this.pageIndex = pageIndex;
    return this;
  }

  /**
   * <p>The index of the current page in the paginated results.</p>
   * @return pageIndex
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGE_INDEX)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getPageIndex() {
        return pageIndex;
      }
  public void setPageIndex(Long pageIndex) {
    this.pageIndex = pageIndex;
  }
  public CSMAgentsMetadata pageSize(Long pageSize) {
    this.pageSize = pageSize;
    return this;
  }

  /**
   * <p>The number of items per page in the paginated results.</p>
   * @return pageSize
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGE_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getPageSize() {
        return pageSize;
      }
  public void setPageSize(Long pageSize) {
    this.pageSize = pageSize;
  }
  public CSMAgentsMetadata totalFiltered(Long totalFiltered) {
    this.totalFiltered = totalFiltered;
    return this;
  }

  /**
   * <p>Total number of items that match the filter criteria.</p>
   * @return totalFiltered
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TOTAL_FILTERED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getTotalFiltered() {
        return totalFiltered;
      }
  public void setTotalFiltered(Long totalFiltered) {
    this.totalFiltered = totalFiltered;
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
   * @return CSMAgentsMetadata
   */
  @JsonAnySetter
  public CSMAgentsMetadata putAdditionalProperty(String key, Object value) {
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
   * Return true if this CSMAgentsMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CSMAgentsMetadata csmAgentsMetadata = (CSMAgentsMetadata) o;
    return Objects.equals(this.pageIndex, csmAgentsMetadata.pageIndex) && Objects.equals(this.pageSize, csmAgentsMetadata.pageSize) && Objects.equals(this.totalFiltered, csmAgentsMetadata.totalFiltered) && Objects.equals(this.additionalProperties, csmAgentsMetadata.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(pageIndex,pageSize,totalFiltered, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CSMAgentsMetadata {\n");
    sb.append("    pageIndex: ").append(toIndentedString(pageIndex)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalFiltered: ").append(toIndentedString(totalFiltered)).append("\n");
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
