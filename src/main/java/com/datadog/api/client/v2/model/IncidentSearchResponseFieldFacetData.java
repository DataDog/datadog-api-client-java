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
   * <p>Facet value and number of occurrences for a property field of an incident.</p>
 */
@JsonPropertyOrder({
  IncidentSearchResponseFieldFacetData.JSON_PROPERTY_COUNT,
  IncidentSearchResponseFieldFacetData.JSON_PROPERTY_NAME
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentSearchResponseFieldFacetData {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_COUNT = "count";
  private Integer count;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public IncidentSearchResponseFieldFacetData count(Integer count) {
    this.count = count;
    return this;
  }

  /**
   * <p>Count of the facet value appearing in search results.</p>
   * maximum: 2147483647
   * @return count
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_COUNT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getCount() {
        return count;
      }
  public void setCount(Integer count) {
    this.count = count;
  }
  public IncidentSearchResponseFieldFacetData name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The facet value appearing in search results.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Return true if this IncidentSearchResponseFieldFacetData object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentSearchResponseFieldFacetData incidentSearchResponseFieldFacetData = (IncidentSearchResponseFieldFacetData) o;
    return Objects.equals(this.count, incidentSearchResponseFieldFacetData.count) && Objects.equals(this.name, incidentSearchResponseFieldFacetData.name);
  }


  @Override
  public int hashCode() {
    return Objects.hash(count,name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentSearchResponseFieldFacetData {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
