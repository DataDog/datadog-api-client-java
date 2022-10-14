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

/** Data object for updating a Confluent account. */
@JsonPropertyOrder({
  ConfluentAccountUpdateRequestData.JSON_PROPERTY_ATTRIBUTES,
  ConfluentAccountUpdateRequestData.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ConfluentAccountUpdateRequestData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private ConfluentAccountUpdateRequestAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ConfluentAccountType type = ConfluentAccountType.CONFLUENT_CLOUD_ACCOUNTS;

  public ConfluentAccountUpdateRequestData() {}

  @JsonCreator
  public ConfluentAccountUpdateRequestData(
      @JsonProperty(required = true, value = JSON_PROPERTY_ATTRIBUTES)
          ConfluentAccountUpdateRequestAttributes attributes,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) ConfluentAccountType type) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ConfluentAccountUpdateRequestData attributes(
      ConfluentAccountUpdateRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * Attributes object for updating a Confluent account.
   *
   * @return attributes
   */
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ConfluentAccountUpdateRequestAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(ConfluentAccountUpdateRequestAttributes attributes) {
    this.attributes = attributes;
  }

  public ConfluentAccountUpdateRequestData type(ConfluentAccountType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The JSON:API type for this API. Should always be <code>confluent-cloud-accounts</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ConfluentAccountType getType() {
    return type;
  }

  public void setType(ConfluentAccountType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this ConfluentAccountUpdateRequestData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConfluentAccountUpdateRequestData confluentAccountUpdateRequestData =
        (ConfluentAccountUpdateRequestData) o;
    return Objects.equals(this.attributes, confluentAccountUpdateRequestData.attributes)
        && Objects.equals(this.type, confluentAccountUpdateRequestData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConfluentAccountUpdateRequestData {\n");
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
