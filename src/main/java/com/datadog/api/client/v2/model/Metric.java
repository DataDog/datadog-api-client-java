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
   * <p>Object for a single metric tag configuration.</p>
 */
@JsonPropertyOrder({
  Metric.JSON_PROPERTY_ID,
  Metric.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class Metric {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MetricType type = MetricType.METRICS;

  public Metric id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The metric name for this resource.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public Metric type(MetricType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The metric resource type.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MetricType getType() {
        return type;
      }
  public void setType(MetricType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this Metric object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Metric metric = (Metric) o;
    return Objects.equals(this.id, metric.id) && Objects.equals(this.type, metric.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(id,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Metric {\n");
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
