/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Attributes of a suggested action for a security signal. The available fields depend on the action
 * type.
 */
@JsonPropertyOrder({
  SecurityMonitoringSignalSuggestedActionAttributes.JSON_PROPERTY_NAME,
  SecurityMonitoringSignalSuggestedActionAttributes.JSON_PROPERTY_QUERY_FILTER,
  SecurityMonitoringSignalSuggestedActionAttributes.JSON_PROPERTY_TEMPLATE_VARIABLES,
  SecurityMonitoringSignalSuggestedActionAttributes.JSON_PROPERTY_TITLE,
  SecurityMonitoringSignalSuggestedActionAttributes.JSON_PROPERTY_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalSuggestedActionAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_QUERY_FILTER = "query_filter";
  private String queryFilter;

  public static final String JSON_PROPERTY_TEMPLATE_VARIABLES = "template_variables";
  private Map<String, List<String>> templateVariables = null;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_URL = "url";
  private String url;

  public SecurityMonitoringSignalSuggestedActionAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the investigation log query.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecurityMonitoringSignalSuggestedActionAttributes queryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
    return this;
  }

  /**
   * The log query filter for the investigation.
   *
   * @return queryFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERY_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getQueryFilter() {
    return queryFilter;
  }

  public void setQueryFilter(String queryFilter) {
    this.queryFilter = queryFilter;
  }

  public SecurityMonitoringSignalSuggestedActionAttributes templateVariables(
      Map<String, List<String>> templateVariables) {
    this.templateVariables = templateVariables;
    return this;
  }

  public SecurityMonitoringSignalSuggestedActionAttributes putTemplateVariablesItem(
      String key, List<String> templateVariablesItem) {
    if (this.templateVariables == null) {
      this.templateVariables = new HashMap<>();
    }
    this.templateVariables.put(key, templateVariablesItem);
    return this;
  }

  /**
   * Template variables applied to the investigation log query, mapping attribute paths to values
   * extracted from the signal.
   *
   * @return templateVariables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TEMPLATE_VARIABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, List<String>> getTemplateVariables() {
    return templateVariables;
  }

  public void setTemplateVariables(Map<String, List<String>> templateVariables) {
    this.templateVariables = templateVariables;
  }

  public SecurityMonitoringSignalSuggestedActionAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * The title of the recommended blog post.
   *
   * @return title
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public SecurityMonitoringSignalSuggestedActionAttributes url(String url) {
    this.url = url;
    return this;
  }

  /**
   * The URL of the suggested action.
   *
   * @return url
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
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
   * @return SecurityMonitoringSignalSuggestedActionAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringSignalSuggestedActionAttributes putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringSignalSuggestedActionAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalSuggestedActionAttributes
        securityMonitoringSignalSuggestedActionAttributes =
            (SecurityMonitoringSignalSuggestedActionAttributes) o;
    return Objects.equals(this.name, securityMonitoringSignalSuggestedActionAttributes.name)
        && Objects.equals(
            this.queryFilter, securityMonitoringSignalSuggestedActionAttributes.queryFilter)
        && Objects.equals(
            this.templateVariables,
            securityMonitoringSignalSuggestedActionAttributes.templateVariables)
        && Objects.equals(this.title, securityMonitoringSignalSuggestedActionAttributes.title)
        && Objects.equals(this.url, securityMonitoringSignalSuggestedActionAttributes.url)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSignalSuggestedActionAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, queryFilter, templateVariables, title, url, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalSuggestedActionAttributes {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    queryFilter: ").append(toIndentedString(queryFilter)).append("\n");
    sb.append("    templateVariables: ").append(toIndentedString(templateVariables)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
