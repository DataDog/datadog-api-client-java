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
   * <p>Paging attributes.</p>
 */
@JsonPropertyOrder({
  ProcessSummariesMetaPage.JSON_PROPERTY_AFTER,
  ProcessSummariesMetaPage.JSON_PROPERTY_SIZE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProcessSummariesMetaPage {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_AFTER = "after";
  private String after;

  public static final String JSON_PROPERTY_SIZE = "size";
  private Integer size;

  public ProcessSummariesMetaPage after(String after) {
    this.after = after;
    return this;
  }

  /**
   * <p>The cursor used to get the next results, if any. To make the next request, use the same
   * parameters with the addition of the <code>page[cursor]</code>.</p>
   * @return after
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_AFTER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getAfter() {
        return after;
      }
  public void setAfter(String after) {
    this.after = after;
  }
  public ProcessSummariesMetaPage size(Integer size) {
    this.size = size;
    return this;
  }

  /**
   * <p>Number of results returned.</p>
   * minimum: 0
   * maximum: 10000
   * @return size
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SIZE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getSize() {
        return size;
      }
  public void setSize(Integer size) {
    this.size = size;
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
   * @return ProcessSummariesMetaPage
   */
  @JsonAnySetter
  public ProcessSummariesMetaPage putAdditionalProperty(String key, Object value) {
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
   * Return true if this ProcessSummariesMetaPage object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProcessSummariesMetaPage processSummariesMetaPage = (ProcessSummariesMetaPage) o;
    return Objects.equals(this.after, processSummariesMetaPage.after) && Objects.equals(this.size, processSummariesMetaPage.size) && Objects.equals(this.additionalProperties, processSummariesMetaPage.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(after,size, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProcessSummariesMetaPage {\n");
    sb.append("    after: ").append(toIndentedString(after)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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
