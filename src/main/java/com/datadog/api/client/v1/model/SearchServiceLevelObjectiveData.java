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
   * <p>A service level objective ID and attributes.</p>
 */
@JsonPropertyOrder({
  SearchServiceLevelObjectiveData.JSON_PROPERTY_ATTRIBUTES,
  SearchServiceLevelObjectiveData.JSON_PROPERTY_ID,
  SearchServiceLevelObjectiveData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SearchServiceLevelObjectiveData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SearchServiceLevelObjectiveAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public SearchServiceLevelObjectiveData attributes(SearchServiceLevelObjectiveAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>A service level objective object includes a service level indicator, thresholds
   * for one or more timeframes, and metadata (<code>name</code>, <code>description</code>, and <code>tags</code>).</p>
   * @return attributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SearchServiceLevelObjectiveAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(SearchServiceLevelObjectiveAttributes attributes) {
    this.attributes = attributes;
  }

  /**
   * <p>A unique identifier for the service level objective object.</p>
   * <p>Always included in service level objective responses.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public SearchServiceLevelObjectiveData type(String type) {
    this.type = type;
    return this;
  }

  /**
   * <p>The type of the object, must be <code>slo</code>.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getType() {
        return type;
      }
  public void setType(String type) {
    this.type = type;
  }

  /**
   * Return true if this SearchServiceLevelObjectiveData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchServiceLevelObjectiveData searchServiceLevelObjectiveData = (SearchServiceLevelObjectiveData) o;
    return Objects.equals(this.attributes, searchServiceLevelObjectiveData.attributes) && Objects.equals(this.id, searchServiceLevelObjectiveData.id) && Objects.equals(this.type, searchServiceLevelObjectiveData.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,id,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchServiceLevelObjectiveData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
