/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v2.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** Object used to create an application key. */
@JsonPropertyOrder({
  ApplicationKeyCreateData.JSON_PROPERTY_ATTRIBUTES,
  ApplicationKeyCreateData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApplicationKeyCreateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ApplicationKeyCreateAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ApplicationKeysType type = ApplicationKeysType.APPLICATION_KEYS;

  public ApplicationKeyCreateData() {}

  @JsonCreator
  public ApplicationKeyCreateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          ApplicationKeyCreateAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ApplicationKeysType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ApplicationKeyCreateData attributes(ApplicationKeyCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes used to create an application Key.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ApplicationKeyCreateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ApplicationKeyCreateAttributes attributes) {
    this.attributes = attributes;
  }

  public ApplicationKeyCreateData type(ApplicationKeysType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Application Keys resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ApplicationKeysType getType() {
    return type;
  }

  public void setType(ApplicationKeysType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ApplicationKeyCreateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationKeyCreateData applicationKeyCreateData = (ApplicationKeyCreateData) o;
    return Objects.equals(this.attributes, applicationKeyCreateData.attributes)
        && Objects.equals(this.type, applicationKeyCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationKeyCreateData {\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
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
