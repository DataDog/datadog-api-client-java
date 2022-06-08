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

/** Opsgenie service data for a create request. */
@JsonPropertyOrder({
  OpsgenieServiceCreateData.JSON_PROPERTY_ATTRIBUTES,
  OpsgenieServiceCreateData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class OpsgenieServiceCreateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private OpsgenieServiceCreateAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private OpsgenieServiceType type = OpsgenieServiceType.OPSGENIE_SERVICE;

  public OpsgenieServiceCreateData() {}

  @JsonCreator
  public OpsgenieServiceCreateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          OpsgenieServiceCreateAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) OpsgenieServiceType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public OpsgenieServiceCreateData attributes(OpsgenieServiceCreateAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The Opsgenie service attributes for a create request.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OpsgenieServiceCreateAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(OpsgenieServiceCreateAttributes attributes) {
    this.attributes = attributes;
  }

  public OpsgenieServiceCreateData type(OpsgenieServiceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Opsgenie service resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OpsgenieServiceType getType() {
    return type;
  }

  public void setType(OpsgenieServiceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this OpsgenieServiceCreateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpsgenieServiceCreateData opsgenieServiceCreateData = (OpsgenieServiceCreateData) o;
    return Objects.equals(this.attributes, opsgenieServiceCreateData.attributes)
        && Objects.equals(this.type, opsgenieServiceCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpsgenieServiceCreateData {\n");
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
