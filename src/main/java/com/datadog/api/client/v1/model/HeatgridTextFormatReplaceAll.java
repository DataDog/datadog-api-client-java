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

/** Replace the entire matching group label. */
@JsonPropertyOrder({
  HeatgridTextFormatReplaceAll.JSON_PROPERTY_TYPE,
  HeatgridTextFormatReplaceAll.JSON_PROPERTY_WITH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HeatgridTextFormatReplaceAll {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private HeatgridTextFormatReplaceAllType type;

  public static final String JSON_PROPERTY_WITH = "with";
  private String with;

  public HeatgridTextFormatReplaceAll() {}

  @JsonCreator
  public HeatgridTextFormatReplaceAll(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          HeatgridTextFormatReplaceAllType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_WITH) String with) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.with = with;
  }

  public HeatgridTextFormatReplaceAll type(HeatgridTextFormatReplaceAllType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Replace the entire matching group label.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HeatgridTextFormatReplaceAllType getType() {
    return type;
  }

  public void setType(HeatgridTextFormatReplaceAllType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public HeatgridTextFormatReplaceAll with(String with) {
    this.with = with;
    return this;
  }

  /**
   * Replacement string.
   *
   * @return with
   */
  @JsonProperty(JSON_PROPERTY_WITH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getWith() {
    return with;
  }

  public void setWith(String with) {
    this.with = with;
  }

  /** Return true if this HeatgridTextFormatReplaceAll object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeatgridTextFormatReplaceAll heatgridTextFormatReplaceAll = (HeatgridTextFormatReplaceAll) o;
    return Objects.equals(this.type, heatgridTextFormatReplaceAll.type)
        && Objects.equals(this.with, heatgridTextFormatReplaceAll.with);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, with);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeatgridTextFormatReplaceAll {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    with: ").append(toIndentedString(with)).append("\n");
    sb.append('}');
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
