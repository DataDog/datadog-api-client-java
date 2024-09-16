/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Match rule for the table widget text format. */
@JsonPropertyOrder({
  TableWidgetTextFormatMatch.JSON_PROPERTY_TYPE,
  TableWidgetTextFormatMatch.JSON_PROPERTY_VALUE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class TableWidgetTextFormatMatch {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_TYPE = "type";
  private TableWidgetTextFormatMatchType type;

  public static final String JSON_PROPERTY_VALUE = "value";
  private String value;

  public TableWidgetTextFormatMatch() {}

  @JsonCreator
  public TableWidgetTextFormatMatch(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          TableWidgetTextFormatMatchType type,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALUE) String value) {
    this.type = type;
    this.unparsed |= !type.isValid();
    this.value = value;
  }

  public TableWidgetTextFormatMatch type(TableWidgetTextFormatMatchType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Match or compare option.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public TableWidgetTextFormatMatchType getType() {
    return type;
  }

  public void setType(TableWidgetTextFormatMatchType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public TableWidgetTextFormatMatch value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Table Widget Match String.
   *
   * @return value
   */
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /**
   * A container for additional, undeclared properties. This is a holder for any undeclared
   * properties as specified with the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value. If the property
   * does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return TableWidgetTextFormatMatch
   */
  @JsonAnySetter
  public TableWidgetTextFormatMatch putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
      this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return The additional properties
   */
  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key The arbitrary key to get
   * @return The specific additional property for the given key
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
      return null;
    }
    return this.additionalProperties.get(key);
  }

  /** Return true if this TableWidgetTextFormatMatch object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TableWidgetTextFormatMatch tableWidgetTextFormatMatch = (TableWidgetTextFormatMatch) o;
    return Objects.equals(this.type, tableWidgetTextFormatMatch.type)
        && Objects.equals(this.value, tableWidgetTextFormatMatch.value)
        && Objects.equals(
            this.additionalProperties, tableWidgetTextFormatMatch.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TableWidgetTextFormatMatch {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
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
