/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Request object to bulk configure tags for metrics matching the given prefix. */
@JsonPropertyOrder({
  MetricBulkTagConfigCreate.JSON_PROPERTY_ATTRIBUTES,
  MetricBulkTagConfigCreate.JSON_PROPERTY_ID,
  MetricBulkTagConfigCreate.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class MetricBulkTagConfigCreate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private MetricBulkTagConfigCreateAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private MetricBulkConfigureTagsType type = MetricBulkConfigureTagsType.BULK_MANAGE_TAGS;

  public MetricBulkTagConfigCreate() {}

  @JsonCreator
  public MetricBulkTagConfigCreate(
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) MetricBulkConfigureTagsType type) {
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
   * Optional parameters for bulk creating metric tag configurations.
   *
   * @return attributes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   * A text prefix to match against metric names.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
   * The metric bulk configure tags resource.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public MetricBulkConfigureTagsType getType() {
    return type;
  }

  public void setType(MetricBulkConfigureTagsType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this MetricBulkTagConfigCreate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MetricBulkTagConfigCreate metricBulkTagConfigCreate = (MetricBulkTagConfigCreate) o;
    return Objects.equals(this.attributes, metricBulkTagConfigCreate.attributes)
        && Objects.equals(this.id, metricBulkTagConfigCreate.id)
        && Objects.equals(this.type, metricBulkTagConfigCreate.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
