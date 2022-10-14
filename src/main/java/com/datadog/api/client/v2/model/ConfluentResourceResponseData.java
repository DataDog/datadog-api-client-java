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

/** Confluent Cloud resource data. */
@JsonPropertyOrder({
  ConfluentResourceResponseData.JSON_PROPERTY_ATTRIBUTES,
  ConfluentResourceResponseData.JSON_PROPERTY_ID,
  ConfluentResourceResponseData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConfluentResourceResponseData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ConfluentResourceResponseAttributes attributes;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ConfluentResourceType type = ConfluentResourceType.CONFLUENT_CLOUD_RESOURCES;

  public ConfluentResourceResponseData() {}

  @JsonCreator
  public ConfluentResourceResponseData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          ConfluentResourceResponseAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ConfluentResourceType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ConfluentResourceResponseData attributes(ConfluentResourceResponseAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Model representation of a Confluent Cloud resource.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ConfluentResourceResponseAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ConfluentResourceResponseAttributes attributes) {
    this.attributes = attributes;
  }

  public ConfluentResourceResponseData id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID associated with the Confluent resource.
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

  public ConfluentResourceResponseData type(ConfluentResourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The JSON:API type for this request.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ConfluentResourceType getType() {
    return type;
  }

  public void setType(ConfluentResourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ConfluentResourceResponseData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfluentResourceResponseData confluentResourceResponseData = (ConfluentResourceResponseData) o;
    return Objects.equals(this.attributes, confluentResourceResponseData.attributes)
        && Objects.equals(this.id, confluentResourceResponseData.id)
        && Objects.equals(this.type, confluentResourceResponseData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfluentResourceResponseData {\n");
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
