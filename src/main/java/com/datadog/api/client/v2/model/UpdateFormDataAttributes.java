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

/** The attributes for updating a form. */
@JsonPropertyOrder({UpdateFormDataAttributes.JSON_PROPERTY_FORM_UPDATE})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateFormDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FORM_UPDATE = "form_update";
  private FormUpdateAttributes formUpdate;

  public UpdateFormDataAttributes() {}

  @JsonCreator
  public UpdateFormDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_FORM_UPDATE)
          FormUpdateAttributes formUpdate) {
    this.formUpdate = formUpdate;
    this.unparsed |= formUpdate.unparsed;
  }

  public UpdateFormDataAttributes formUpdate(FormUpdateAttributes formUpdate) {
    this.formUpdate = formUpdate;
    this.unparsed |= formUpdate.unparsed;
    return this;
  }

  /**
   * The fields to update on a form. At least one field must be provided.
   *
   * @return formUpdate
   */
  @JsonProperty(JSON_PROPERTY_FORM_UPDATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormUpdateAttributes getFormUpdate() {
    return formUpdate;
  }

  public void setFormUpdate(FormUpdateAttributes formUpdate) {
    this.formUpdate = formUpdate;
    if (formUpdate != null) {
      this.unparsed |= formUpdate.unparsed;
    }
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
   * @return UpdateFormDataAttributes
   */
  @JsonAnySetter
  public UpdateFormDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UpdateFormDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateFormDataAttributes updateFormDataAttributes = (UpdateFormDataAttributes) o;
    return Objects.equals(this.formUpdate, updateFormDataAttributes.formUpdate)
        && Objects.equals(this.additionalProperties, updateFormDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(formUpdate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateFormDataAttributes {\n");
    sb.append("    formUpdate: ").append(toIndentedString(formUpdate)).append("\n");
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
