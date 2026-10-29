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

/**
 * AWS Metrics Collection resource type tag filter. Each filter targets either a specific AWS
 * service's resource types (<code>service</code> and <code>resource_types</code>) or custom metrics
 * (<code>custom</code>). These two modes are mutually exclusive. The <code>expression</code>
 * defines a tag filter that Datadog uses when collecting metrics from the resource types of a
 * specified service. Wildcards, such as <code>?</code> (match a single character) and <code>*
 * </code> (match multiple characters), and exclusion using <code>!</code> before the tag are
 * supported. For example, <code>env:production AND instance-type:c?.* AND !region:us-east-1</code>.
 */
@JsonPropertyOrder({
  AWSResourceTypeTagFilter.JSON_PROPERTY_CUSTOM,
  AWSResourceTypeTagFilter.JSON_PROPERTY_EXPRESSION,
  AWSResourceTypeTagFilter.JSON_PROPERTY_RESOURCE_TYPES,
  AWSResourceTypeTagFilter.JSON_PROPERTY_SERVICE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSResourceTypeTagFilter {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM = "custom";
  private Boolean custom;

  public static final String JSON_PROPERTY_EXPRESSION = "expression";
  private String expression;

  public static final String JSON_PROPERTY_RESOURCE_TYPES = "resource_types";
  private List<String> resourceTypes = null;

  public static final String JSON_PROPERTY_SERVICE = "service";
  private String service;

  public AWSResourceTypeTagFilter() {}

  @JsonCreator
  public AWSResourceTypeTagFilter(
      @JsonProperty(required = true, value = JSON_PROPERTY_EXPRESSION) String expression) {
    this.expression = expression;
  }

  public AWSResourceTypeTagFilter custom(Boolean custom) {
    this.custom = custom;
    return this;
  }

  /**
   * Whether the tag filter applies to custom metrics. When <code>true</code>, <code>service</code>
   * and <code>resource_types</code> must be omitted.
   *
   * @return custom
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCustom() {
    return custom;
  }

  public void setCustom(Boolean custom) {
    this.custom = custom;
  }

  public AWSResourceTypeTagFilter expression(String expression) {
    this.expression = expression;
    return this;
  }

  /**
   * The tag filter expression to apply when collecting metrics for the matching resource types.
   *
   * @return expression
   */
  @JsonProperty(JSON_PROPERTY_EXPRESSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getExpression() {
    return expression;
  }

  public void setExpression(String expression) {
    this.expression = expression;
  }

  public AWSResourceTypeTagFilter resourceTypes(List<String> resourceTypes) {
    this.resourceTypes = resourceTypes;
    return this;
  }

  public AWSResourceTypeTagFilter addResourceTypesItem(String resourceTypesItem) {
    if (this.resourceTypes == null) {
      this.resourceTypes = new ArrayList<>();
    }
    this.resourceTypes.add(resourceTypesItem);
    return this;
  }

  /**
   * The AWS resource types of the service to which the tag filter applies. Required when <code>
   * service</code> is set. Use <code>*</code> as the only entry to match all resource types of the
   * service; <code>*</code> cannot be combined with specific resource types.
   *
   * @return resourceTypes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RESOURCE_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getResourceTypes() {
    return resourceTypes;
  }

  public void setResourceTypes(List<String> resourceTypes) {
    this.resourceTypes = resourceTypes;
  }

  public AWSResourceTypeTagFilter service(String service) {
    this.service = service;
    return this;
  }

  /**
   * The AWS service for which the tag filter defined in <code>expression</code> will be applied.
   * Required unless <code>custom</code> is <code>true</code>, and must be set together with <code>
   * resource_types</code>.
   *
   * @return service
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SERVICE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getService() {
    return service;
  }

  public void setService(String service) {
    this.service = service;
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
   * @return AWSResourceTypeTagFilter
   */
  @JsonAnySetter
  public AWSResourceTypeTagFilter putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AWSResourceTypeTagFilter object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSResourceTypeTagFilter awsResourceTypeTagFilter = (AWSResourceTypeTagFilter) o;
    return Objects.equals(this.custom, awsResourceTypeTagFilter.custom)
        && Objects.equals(this.expression, awsResourceTypeTagFilter.expression)
        && Objects.equals(this.resourceTypes, awsResourceTypeTagFilter.resourceTypes)
        && Objects.equals(this.service, awsResourceTypeTagFilter.service)
        && Objects.equals(this.additionalProperties, awsResourceTypeTagFilter.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custom, expression, resourceTypes, service, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSResourceTypeTagFilter {\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    expression: ").append(toIndentedString(expression)).append("\n");
    sb.append("    resourceTypes: ").append(toIndentedString(resourceTypes)).append("\n");
    sb.append("    service: ").append(toIndentedString(service)).append("\n");
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
