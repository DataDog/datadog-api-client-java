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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of an included report target resource. */
@JsonPropertyOrder({
  ReportScheduleResourceAttributes.JSON_PROPERTY_RESOURCE_TYPE,
  ReportScheduleResourceAttributes.JSON_PROPERTY_TEMPLATE_VARIABLES,
  ReportScheduleResourceAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ReportScheduleResourceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RESOURCE_TYPE = "resource_type";
  private ReportScheduleResourceType resourceType;

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private JsonNullable<List<ReportScheduleIndexTemplateVariable>> templateVariables =
      JsonNullable.<List<ReportScheduleIndexTemplateVariable>>undefined();

  public static final String JSON_PROPERTY_TITLE = "title";
  private JsonNullable<String> title = JsonNullable.<String>undefined();

  public ReportScheduleResourceAttributes() {}

  @JsonCreator
  public ReportScheduleResourceAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_RESOURCE_TYPE)
          ReportScheduleResourceType resourceType) {
    this.resourceType = resourceType;
    this.unparsed |= !resourceType.isValid();
  }

  public ReportScheduleResourceAttributes resourceType(ReportScheduleResourceType resourceType) {
    this.resourceType = resourceType;
    this.unparsed |= !resourceType.isValid();
    return this;
  }

  /**
   * The type of dashboard resource the report schedule targets.
   *
   * @return resourceType
   */
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ReportScheduleResourceType getResourceType() {
    return resourceType;
  }

  public void setResourceType(ReportScheduleResourceType resourceType) {
    if (!resourceType.isValid()) {
      this.unparsed = true;
    }
    this.resourceType = resourceType;
  }

  public ReportScheduleResourceAttributes templateVariables(
      List<ReportScheduleIndexTemplateVariable> templateVariables) {
    this.templateVariables =
        JsonNullable.<List<ReportScheduleIndexTemplateVariable>>of(templateVariables);
    return this;
  }

  public ReportScheduleResourceAttributes addTemplateVariablesItem(
      ReportScheduleIndexTemplateVariable templateVariablesItem) {
    if (this.templateVariables == null || !this.templateVariables.isPresent()) {
      this.templateVariables =
          JsonNullable.<List<ReportScheduleIndexTemplateVariable>>of(new ArrayList<>());
    }
    try {
      this.templateVariables.get().add(templateVariablesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Template variable metadata from the dashboard resource, when available.
   *
   * @return templateVariables
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<ReportScheduleIndexTemplateVariable> getTemplateVariables() {
    return templateVariables.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<ReportScheduleIndexTemplateVariable>>
      getTemplateVariables_JsonNullable() {
    return templateVariables;
  }

  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
  public void setTemplateVariables_JsonNullable(
      JsonNullable<List<ReportScheduleIndexTemplateVariable>> templateVariables) {
    this.templateVariables = templateVariables;
  }

  public void setTemplateVariables(List<ReportScheduleIndexTemplateVariable> templateVariables) {
    this.templateVariables =
        JsonNullable.<List<ReportScheduleIndexTemplateVariable>>of(templateVariables);
  }

  public ReportScheduleResourceAttributes title(String title) {
    this.title = JsonNullable.<String>of(title);
    return this;
  }

  /**
   * The title of the dashboard or integration dashboard resource, when available.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getTitle() {
    return title.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getTitle_JsonNullable() {
    return title;
  }

  @JsonProperty(JSON_PROPERTY_TITLE)
  public void setTitle_JsonNullable(JsonNullable<String> title) {
    this.title = title;
  }

  public void setTitle(String title) {
    this.title = JsonNullable.<String>of(title);
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
   * @return ReportScheduleResourceAttributes
   */
  @JsonAnySetter
  public ReportScheduleResourceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ReportScheduleResourceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportScheduleResourceAttributes reportScheduleResourceAttributes =
        (ReportScheduleResourceAttributes) o;
    return Objects.equals(this.resourceType, reportScheduleResourceAttributes.resourceType)
        && Objects.equals(
            this.templateVariables, reportScheduleResourceAttributes.templateVariables)
        && Objects.equals(this.title, reportScheduleResourceAttributes.title)
        && Objects.equals(
            this.additionalProperties, reportScheduleResourceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceType, templateVariables, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportScheduleResourceAttributes {\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
