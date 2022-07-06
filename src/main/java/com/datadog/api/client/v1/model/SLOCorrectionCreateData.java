/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/** The data object associated with the SLO correction to be created. */
@JsonPropertyOrder({
  SLOCorrectionCreateData.JSON_PROPERTY_ATTRIBUTES,
  SLOCorrectionCreateData.JSON_PROPERTY_TYPE
})
@javax.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SLOCorrectionCreateData {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ATTRIBUTES = "attributes";
  private SLOCorrectionCreateRequestAttributes attributes;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SLOCorrectionType type = SLOCorrectionType.CORRECTION;

  public SLOCorrectionCreateData() {}

  @JsonCreator
  public SLOCorrectionCreateData(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) SLOCorrectionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public SLOCorrectionCreateData attributes(SLOCorrectionCreateRequestAttributes attributes) {
    this.attributes = attributes;
    this.unparsed |= attributes.unparsed;
    return this;
  }

  /**
   * The attribute object associated with the SLO correction to be created.
   *
   * @return attributes
   */
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ATTRIBUTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SLOCorrectionCreateRequestAttributes getAttributes() {
    return attributes;
  }

  public void setAttributes(SLOCorrectionCreateRequestAttributes attributes) {
    this.attributes = attributes;
  }

  public SLOCorrectionCreateData type(SLOCorrectionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * SLO correction resource type.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SLOCorrectionType getType() {
    return type;
  }

  public void setType(SLOCorrectionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this SLOCorrectionCreateData object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SLOCorrectionCreateData sloCorrectionCreateData = (SLOCorrectionCreateData) o;
    return Objects.equals(this.attributes, sloCorrectionCreateData.attributes)
        && Objects.equals(this.type, sloCorrectionCreateData.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attributes, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SLOCorrectionCreateData {\n");
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
