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
   * <p>Object containing the ordered list of log index names.</p>
 */
@JsonPropertyOrder({
  LogsIndexesOrder.JSON_PROPERTY_INDEX_NAMES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class LogsIndexesOrder {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_INDEX_NAMES = "index_names";
  private List<String> indexNames = new ArrayList<>();

  public LogsIndexesOrder() {}

  @JsonCreator
  public LogsIndexesOrder(
            @JsonProperty(required=true, value=JSON_PROPERTY_INDEX_NAMES)List<String> indexNames) {
        this.indexNames = indexNames;
  }
  public LogsIndexesOrder indexNames(List<String> indexNames) {
    this.indexNames = indexNames;
    return this;
  }
  public LogsIndexesOrder addIndexNamesItem(String indexNamesItem) {
    this.indexNames.add(indexNamesItem);
    return this;
  }

  /**
   * <p>Array of strings identifying by their name(s) the index(es) of your organization.
   * Logs are tested against the query filter of each index one by one, following the order of the array.
   * Logs are eventually stored in the first matching index.</p>
   * @return indexNames
  **/
      @JsonProperty(JSON_PROPERTY_INDEX_NAMES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<String> getIndexNames() {
        return indexNames;
      }
  public void setIndexNames(List<String> indexNames) {
    this.indexNames = indexNames;
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
   * @return LogsIndexesOrder
   */
  @JsonAnySetter
  public LogsIndexesOrder putAdditionalProperty(String key, Object value) {
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
   * Return true if this LogsIndexesOrder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogsIndexesOrder logsIndexesOrder = (LogsIndexesOrder) o;
    return Objects.equals(this.indexNames, logsIndexesOrder.indexNames) && Objects.equals(this.additionalProperties, logsIndexesOrder.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(indexNames, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogsIndexesOrder {\n");
    sb.append("    indexNames: ").append(toIndentedString(indexNames)).append("\n");
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
