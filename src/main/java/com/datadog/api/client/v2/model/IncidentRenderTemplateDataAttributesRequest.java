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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for rendering a template. */
@JsonPropertyOrder({
  IncidentRenderTemplateDataAttributesRequest.JSON_PROPERTY_CONTENT,
  IncidentRenderTemplateDataAttributesRequest.JSON_PROPERTY_DATETIME_FORMAT,
  IncidentRenderTemplateDataAttributesRequest.JSON_PROPERTY_TIMEZONE,
  IncidentRenderTemplateDataAttributesRequest.JSON_PROPERTY_VALIDATE_LINKS,
  IncidentRenderTemplateDataAttributesRequest.JSON_PROPERTY_VALIDATE_VARIABLES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentRenderTemplateDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONTENT = "content";
  private String content;

  public static final String JSON_PROPERTY_DATETIME_FORMAT = "datetime_format";
  private String datetimeFormat;

  public static final String JSON_PROPERTY_TIMEZONE = "timezone";
  private String timezone;

  public static final String JSON_PROPERTY_VALIDATE_LINKS = "validate_links";
  private JsonNullable<Boolean> validateLinks = JsonNullable.<Boolean>undefined();

  public static final String JSON_PROPERTY_VALIDATE_VARIABLES = "validate_variables";
  private JsonNullable<Boolean> validateVariables = JsonNullable.<Boolean>undefined();

  public IncidentRenderTemplateDataAttributesRequest() {}

  @JsonCreator
  public IncidentRenderTemplateDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONTENT) String content) {
    this.content = content;
  }

  public IncidentRenderTemplateDataAttributesRequest content(String content) {
    this.content = content;
    return this;
  }

  /**
   * The template content to render.
   *
   * @return content
   */
  @JsonProperty(JSON_PROPERTY_CONTENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public IncidentRenderTemplateDataAttributesRequest datetimeFormat(String datetimeFormat) {
    this.datetimeFormat = datetimeFormat;
    return this;
  }

  /**
   * The date-time format to use for rendering.
   *
   * @return datetimeFormat
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATETIME_FORMAT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDatetimeFormat() {
    return datetimeFormat;
  }

  public void setDatetimeFormat(String datetimeFormat) {
    this.datetimeFormat = datetimeFormat;
  }

  public IncidentRenderTemplateDataAttributesRequest timezone(String timezone) {
    this.timezone = timezone;
    return this;
  }

  /**
   * The timezone to use for rendering.
   *
   * @return timezone
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TIMEZONE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTimezone() {
    return timezone;
  }

  public void setTimezone(String timezone) {
    this.timezone = timezone;
  }

  public IncidentRenderTemplateDataAttributesRequest validateLinks(Boolean validateLinks) {
    this.validateLinks = JsonNullable.<Boolean>of(validateLinks);
    return this;
  }

  /**
   * Whether to validate links in the rendered template.
   *
   * @return validateLinks
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getValidateLinks() {
    return validateLinks.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALIDATE_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getValidateLinks_JsonNullable() {
    return validateLinks;
  }

  @JsonProperty(JSON_PROPERTY_VALIDATE_LINKS)
  public void setValidateLinks_JsonNullable(JsonNullable<Boolean> validateLinks) {
    this.validateLinks = validateLinks;
  }

  public void setValidateLinks(Boolean validateLinks) {
    this.validateLinks = JsonNullable.<Boolean>of(validateLinks);
  }

  public IncidentRenderTemplateDataAttributesRequest validateVariables(Boolean validateVariables) {
    this.validateVariables = JsonNullable.<Boolean>of(validateVariables);
    return this;
  }

  /**
   * Whether to validate variables in the template.
   *
   * @return validateVariables
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Boolean getValidateVariables() {
    return validateVariables.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALIDATE_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Boolean> getValidateVariables_JsonNullable() {
    return validateVariables;
  }

  @JsonProperty(JSON_PROPERTY_VALIDATE_VARIABLES)
  public void setValidateVariables_JsonNullable(JsonNullable<Boolean> validateVariables) {
    this.validateVariables = validateVariables;
  }

  public void setValidateVariables(Boolean validateVariables) {
    this.validateVariables = JsonNullable.<Boolean>of(validateVariables);
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
   * @return IncidentRenderTemplateDataAttributesRequest
   */
  @JsonAnySetter
  public IncidentRenderTemplateDataAttributesRequest putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this IncidentRenderTemplateDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentRenderTemplateDataAttributesRequest incidentRenderTemplateDataAttributesRequest =
        (IncidentRenderTemplateDataAttributesRequest) o;
    return Objects.equals(this.content, incidentRenderTemplateDataAttributesRequest.content)
        && Objects.equals(
            this.datetimeFormat, incidentRenderTemplateDataAttributesRequest.datetimeFormat)
        && Objects.equals(this.timezone, incidentRenderTemplateDataAttributesRequest.timezone)
        && Objects.equals(
            this.validateLinks, incidentRenderTemplateDataAttributesRequest.validateLinks)
        && Objects.equals(
            this.validateVariables, incidentRenderTemplateDataAttributesRequest.validateVariables)
        && Objects.equals(
            this.additionalProperties,
            incidentRenderTemplateDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        content, datetimeFormat, timezone, validateLinks, validateVariables, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentRenderTemplateDataAttributesRequest {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    datetimeFormat: ").append(toIndentedString(datetimeFormat)).append("\n");
    sb.append("    timezone: ").append(toIndentedString(timezone)).append("\n");
    sb.append("    validateLinks: ").append(toIndentedString(validateLinks)).append("\n");
    sb.append("    validateVariables: ").append(toIndentedString(validateVariables)).append("\n");
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
