/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** A parameter definition for a segment template. */
@JsonPropertyOrder({
  RumSegmentTemplateParameterDef.JSON_PROPERTY_DEFAULT,
  RumSegmentTemplateParameterDef.JSON_PROPERTY_DESCRIPTION,
  RumSegmentTemplateParameterDef.JSON_PROPERTY_VALIDATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class RumSegmentTemplateParameterDef {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT = "default";
  private String _default;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_VALIDATE = "validate";
  private String validate;

  public RumSegmentTemplateParameterDef() {}

  @JsonCreator
  public RumSegmentTemplateParameterDef(
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFAULT) String _default,
      @JsonProperty(required = true, value = JSON_PROPERTY_DESCRIPTION) String description,
      @JsonProperty(required = true, value = JSON_PROPERTY_VALIDATE) String validate) {
    this._default = _default;
    this.description = description;
    this.validate = validate;
  }

  public RumSegmentTemplateParameterDef _default(String _default) {
    this._default = _default;
    return this;
  }

  /**
   * The default value for the parameter.
   *
   * @return _default
   */
  @JsonProperty(JSON_PROPERTY_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }

  public RumSegmentTemplateParameterDef description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description of the parameter.
   *
   * @return description
   */
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public RumSegmentTemplateParameterDef validate(String validate) {
    this.validate = validate;
    return this;
  }

  /**
   * Validation rules for the parameter.
   *
   * @return validate
   */
  @JsonProperty(JSON_PROPERTY_VALIDATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getValidate() {
    return validate;
  }

  public void setValidate(String validate) {
    this.validate = validate;
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
   * @return RumSegmentTemplateParameterDef
   */
  @JsonAnySetter
  public RumSegmentTemplateParameterDef putAdditionalProperty(String key, Object value) {
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

  /** Return true if this RumSegmentTemplateParameterDef object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RumSegmentTemplateParameterDef rumSegmentTemplateParameterDef =
        (RumSegmentTemplateParameterDef) o;
    return Objects.equals(this._default, rumSegmentTemplateParameterDef._default)
        && Objects.equals(this.description, rumSegmentTemplateParameterDef.description)
        && Objects.equals(this.validate, rumSegmentTemplateParameterDef.validate)
        && Objects.equals(
            this.additionalProperties, rumSegmentTemplateParameterDef.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(_default, description, validate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RumSegmentTemplateParameterDef {\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    validate: ").append(toIndentedString(validate)).append("\n");
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
