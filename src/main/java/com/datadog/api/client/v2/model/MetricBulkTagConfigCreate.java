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
   * <p>Request object to bulk configure tags for metrics matching the given prefix.</p>
 */
@JsonPropertyOrder({
  MetricBulkTagConfigCreate.JSON_PROPERTY_ATTRIBUTES,
  MetricBulkTagConfigCreate.JSON_PROPERTY_ID,
  MetricBulkTagConfigCreate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricBulkTagConfigCreate {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private MetricBulkTagConfigCreateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MetricBulkConfigureTagsType type = MetricBulkConfigureTagsType.BULK_MANAGE_TAGS;

  public MetricBulkTagConfigCreate() {}

  @JsonCreator
  public MetricBulkTagConfigCreate(
            @JsonProperty(required=true, value=JSON_PROPERTY_ID)String id,
            @JsonProperty(required=true, value=JSON_PROPERTY_TYPE)MetricBulkConfigureTagsType type) {
        this.id = id;
        this.type = type;
        this.unparsed |= !type.isValid();
  }
  public MetricBulkTagConfigCreate attributes(MetricBulkTagConfigCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * <p>Optional parameters for bulk creating metric tag configurations.</p>
   * @return attributes
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public MetricBulkTagConfigCreateAttributes getAttributes() {
        return attributes;
      }
  public void setAttributes(MetricBulkTagConfigCreateAttributes attributes) {
    this.attributes = attributes;
  }
  public MetricBulkTagConfigCreate id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>A text prefix to match against metric names.</p>
   * @return id
  **/
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public MetricBulkTagConfigCreate type(MetricBulkConfigureTagsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The metric bulk configure tags resource.</p>
   * @return type
  **/
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public MetricBulkConfigureTagsType getType() {
        return type;
      }
  public void setType(MetricBulkConfigureTagsType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * Return true if this MetricBulkTagConfigCreate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricBulkTagConfigCreate metricBulkTagConfigCreate = (MetricBulkTagConfigCreate) o;
    return Objects.equals(this.attributes, metricBulkTagConfigCreate.attributes) && Objects.equals(this.id, metricBulkTagConfigCreate.id) && Objects.equals(this.type, metricBulkTagConfigCreate.type);
  }


  @Override
  public int hashCode() {
    return Objects.hash(attributes,id,type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MetricBulkTagConfigCreate {\n");
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
