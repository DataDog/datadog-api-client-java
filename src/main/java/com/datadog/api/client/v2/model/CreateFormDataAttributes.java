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

/** The attributes for creating a form. */
@JsonPropertyOrder({
  CreateFormDataAttributes.JSON_PROPERTY_ANONYMOUS,
  CreateFormDataAttributes.JSON_PROPERTY_DATA_DEFINITION,
  CreateFormDataAttributes.JSON_PROPERTY_DESCRIPTION,
  CreateFormDataAttributes.JSON_PROPERTY_IDP_SURVEY,
  CreateFormDataAttributes.JSON_PROPERTY_NAME,
  CreateFormDataAttributes.JSON_PROPERTY_SINGLE_RESPONSE,
  CreateFormDataAttributes.JSON_PROPERTY_UI_DEFINITION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateFormDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ANONYMOUS = "anonymous";
  private Boolean anonymous = false;

  public static final String JSON_PROPERTY_DATA_DEFINITION = "data_definition";
  private FormDataDefinition dataDefinition;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_IDP_SURVEY = "idp_survey";
  private Boolean idpSurvey = false;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SINGLE_RESPONSE = "single_response";
  private Boolean singleResponse = false;

  public static final String JSON_PROPERTY_UI_DEFINITION = "ui_definition";
  private FormUiDefinition uiDefinition;

  public CreateFormDataAttributes() {}

  @JsonCreator
  public CreateFormDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_DEFINITION)
          FormDataDefinition dataDefinition,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_UI_DEFINITION)
          FormUiDefinition uiDefinition) {
    this.dataDefinition = dataDefinition;
    this.unparsed |= dataDefinition.unparsed;
    this.name = name;
    this.uiDefinition = uiDefinition;
    this.unparsed |= uiDefinition.unparsed;
  }

  public CreateFormDataAttributes anonymous(Boolean anonymous) {
    this.anonymous = anonymous;
    return this;
  }

  /**
   * Whether the form accepts anonymous submissions.
   *
   * @return anonymous
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ANONYMOUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAnonymous() {
    return anonymous;
  }

  public void setAnonymous(Boolean anonymous) {
    this.anonymous = anonymous;
  }

  public CreateFormDataAttributes dataDefinition(FormDataDefinition dataDefinition) {
    this.dataDefinition = dataDefinition;
    this.unparsed |= dataDefinition.unparsed;
    return this;
  }

  /**
   * A JSON Schema definition that describes the form's data fields.
   *
   * @return dataDefinition
   */
  @JsonProperty(JSON_PROPERTY_DATA_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormDataDefinition getDataDefinition() {
    return dataDefinition;
  }

  public void setDataDefinition(FormDataDefinition dataDefinition) {
    this.dataDefinition = dataDefinition;
  }

  public CreateFormDataAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * The description of the form.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public CreateFormDataAttributes idpSurvey(Boolean idpSurvey) {
    this.idpSurvey = idpSurvey;
    return this;
  }

  /**
   * Whether the form is an IDP survey.
   *
   * @return idpSurvey
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IDP_SURVEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIdpSurvey() {
    return idpSurvey;
  }

  public void setIdpSurvey(Boolean idpSurvey) {
    this.idpSurvey = idpSurvey;
  }

  public CreateFormDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the form.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateFormDataAttributes singleResponse(Boolean singleResponse) {
    this.singleResponse = singleResponse;
    return this;
  }

  /**
   * Whether each user can only submit one response.
   *
   * @return singleResponse
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SINGLE_RESPONSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getSingleResponse() {
    return singleResponse;
  }

  public void setSingleResponse(Boolean singleResponse) {
    this.singleResponse = singleResponse;
  }

  public CreateFormDataAttributes uiDefinition(FormUiDefinition uiDefinition) {
    this.uiDefinition = uiDefinition;
    this.unparsed |= uiDefinition.unparsed;
    return this;
  }

  /**
   * UI configuration for rendering form fields, including widget overrides, field ordering, and
   * themes.
   *
   * @return uiDefinition
   */
  @JsonProperty(JSON_PROPERTY_UI_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public FormUiDefinition getUiDefinition() {
    return uiDefinition;
  }

  public void setUiDefinition(FormUiDefinition uiDefinition) {
    this.uiDefinition = uiDefinition;
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
   * @return CreateFormDataAttributes
   */
  @JsonAnySetter
  public CreateFormDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateFormDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateFormDataAttributes createFormDataAttributes = (CreateFormDataAttributes) o;
    return Objects.equals(this.anonymous, createFormDataAttributes.anonymous)
        && Objects.equals(this.dataDefinition, createFormDataAttributes.dataDefinition)
        && Objects.equals(this.description, createFormDataAttributes.description)
        && Objects.equals(this.idpSurvey, createFormDataAttributes.idpSurvey)
        && Objects.equals(this.name, createFormDataAttributes.name)
        && Objects.equals(this.singleResponse, createFormDataAttributes.singleResponse)
        && Objects.equals(this.uiDefinition, createFormDataAttributes.uiDefinition)
        && Objects.equals(this.additionalProperties, createFormDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        anonymous,
        dataDefinition,
        description,
        idpSurvey,
        name,
        singleResponse,
        uiDefinition,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateFormDataAttributes {\n");
    sb.append("    anonymous: ").append(toIndentedString(anonymous)).append("\n");
    sb.append("    dataDefinition: ").append(toIndentedString(dataDefinition)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    idpSurvey: ").append(toIndentedString(idpSurvey)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    singleResponse: ").append(toIndentedString(singleResponse)).append("\n");
    sb.append("    uiDefinition: ").append(toIndentedString(uiDefinition)).append("\n");
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
