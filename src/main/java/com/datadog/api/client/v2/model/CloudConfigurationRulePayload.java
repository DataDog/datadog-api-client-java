/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>The payload of a cloud configuration rule.</p>
 */
@JsonPropertyOrder({
  CloudConfigurationRulePayload.JSON_PROPERTY_CASES,
  CloudConfigurationRulePayload.JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS,
  CloudConfigurationRulePayload.JSON_PROPERTY_CUSTOM_MESSAGE,
  CloudConfigurationRulePayload.JSON_PROPERTY_CUSTOM_NAME,
  CloudConfigurationRulePayload.JSON_PROPERTY_FILTERS,
  CloudConfigurationRulePayload.JSON_PROPERTY_IS_ENABLED,
  CloudConfigurationRulePayload.JSON_PROPERTY_MESSAGE,
  CloudConfigurationRulePayload.JSON_PROPERTY_NAME,
  CloudConfigurationRulePayload.JSON_PROPERTY_OPTIONS,
  CloudConfigurationRulePayload.JSON_PROPERTY_TAGS,
  CloudConfigurationRulePayload.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudConfigurationRulePayload {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CASES = "cases";
  private List<CloudConfigurationRuleCaseCreate> cases = new ArrayList<>();

  public static final String JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS = "complianceSignalOptions";
  private CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions;

  public static final String JSON_PROPERTY_CUSTOM_MESSAGE = "customMessage";
  private String customMessage;

  public static final String JSON_PROPERTY_CUSTOM_NAME = "customName";
  private String customName;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<SecurityMonitoringFilter> filters = null;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private CloudConfigurationRuleOptions options;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CloudConfigurationRuleType type;

  public CloudConfigurationRulePayload() {}

  @JsonCreator
  public CloudConfigurationRulePayload(
            @JsonProperty(required=true, value=JSON_PROPERTY_CASES)List<CloudConfigurationRuleCaseCreate> cases,
            @JsonProperty(required=true, value=JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS)CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions,
            @JsonProperty(required=true, value=JSON_PROPERTY_IS_ENABLED)Boolean isEnabled,
            @JsonProperty(required=true, value=JSON_PROPERTY_MESSAGE)String message,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_OPTIONS)CloudConfigurationRuleOptions options) {
        this.cases = cases;
        this.complianceSignalOptions = complianceSignalOptions;
        this.unparsed |= complianceSignalOptions.unparsed;
        this.isEnabled = isEnabled;
        this.message = message;
        this.name = name;
        this.options = options;
        this.unparsed |= options.unparsed;
  }
  public CloudConfigurationRulePayload cases(List<CloudConfigurationRuleCaseCreate> cases) {
    this.cases = cases;
    for (CloudConfigurationRuleCaseCreate item : cases) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public CloudConfigurationRulePayload addCasesItem(CloudConfigurationRuleCaseCreate casesItem) {
    this.cases.add(casesItem);
    this.unparsed |= casesItem.unparsed;
    return this;
  }

  /**
   * <p>Description of generated findings and signals (severity and channels to be notified in case of a signal). Must contain exactly one item.</p>
   * @return cases
  **/
      @JsonProperty(JSON_PROPERTY_CASES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<CloudConfigurationRuleCaseCreate> getCases() {
        return cases;
      }
  public void setCases(List<CloudConfigurationRuleCaseCreate> cases) {
    this.cases = cases;
  }
  public CloudConfigurationRulePayload complianceSignalOptions(CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions) {
    this.complianceSignalOptions = complianceSignalOptions;
    this.unparsed |= complianceSignalOptions.unparsed;
    return this;
  }

  /**
   * <p>How to generate compliance signals. Useful for cloud_configuration rules only.</p>
   * @return complianceSignalOptions
  **/
      @JsonProperty(JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public CloudConfigurationRuleComplianceSignalOptions getComplianceSignalOptions() {
        return complianceSignalOptions;
      }
  public void setComplianceSignalOptions(CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions) {
    this.complianceSignalOptions = complianceSignalOptions;
  }
  public CloudConfigurationRulePayload customMessage(String customMessage) {
    this.customMessage = customMessage;
    return this;
  }

  /**
   * <p>Custom/Overridden message for generated signals (used in case of Default rule update).</p>
   * @return customMessage
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCustomMessage() {
        return customMessage;
      }
  public void setCustomMessage(String customMessage) {
    this.customMessage = customMessage;
  }
  public CloudConfigurationRulePayload customName(String customName) {
    this.customName = customName;
    return this;
  }

  /**
   * <p>Custom/Overridden name of the rule (used in case of Default rule update).</p>
   * @return customName
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CUSTOM_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getCustomName() {
        return customName;
      }
  public void setCustomName(String customName) {
    this.customName = customName;
  }
  public CloudConfigurationRulePayload filters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
    for (SecurityMonitoringFilter item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public CloudConfigurationRulePayload addFiltersItem(SecurityMonitoringFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    this.unparsed |= filtersItem.unparsed;
    return this;
  }

  /**
   * <p>Additional queries to filter matched events before they are processed.</p>
   * @return filters
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_FILTERS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SecurityMonitoringFilter> getFilters() {
        return filters;
      }
  public void setFilters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
  }
  public CloudConfigurationRulePayload isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * <p>Whether the rule is enabled.</p>
   * @return isEnabled
  **/
      @JsonProperty(JSON_PROPERTY_IS_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getIsEnabled() {
        return isEnabled;
      }
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }
  public CloudConfigurationRulePayload message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Message in markdown format for generated findings and signals.</p>
   * @return message
  **/
      @JsonProperty(JSON_PROPERTY_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getMessage() {
        return message;
      }
  public void setMessage(String message) {
    this.message = message;
  }
  public CloudConfigurationRulePayload name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the rule.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public CloudConfigurationRulePayload options(CloudConfigurationRuleOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * <p>Options on cloud configuration rules.</p>
   * @return options
  **/
      @JsonProperty(JSON_PROPERTY_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public CloudConfigurationRuleOptions getOptions() {
        return options;
      }
  public void setOptions(CloudConfigurationRuleOptions options) {
    this.options = options;
  }
  public CloudConfigurationRulePayload tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public CloudConfigurationRulePayload addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>Tags for generated findings and signals.</p>
   * @return tags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getTags() {
        return tags;
      }
  public void setTags(List<String> tags) {
    this.tags = tags;
  }
  public CloudConfigurationRulePayload type(CloudConfigurationRuleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * <p>The rule type.</p>
   * @return type
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public CloudConfigurationRuleType getType() {
        return type;
      }
  public void setType(CloudConfigurationRuleType type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return CloudConfigurationRulePayload
   */
  @JsonAnySetter
  public CloudConfigurationRulePayload putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this CloudConfigurationRulePayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudConfigurationRulePayload cloudConfigurationRulePayload = (CloudConfigurationRulePayload) o;
    return Objects.equals(this.cases, cloudConfigurationRulePayload.cases) && Objects.equals(this.complianceSignalOptions, cloudConfigurationRulePayload.complianceSignalOptions) && Objects.equals(this.customMessage, cloudConfigurationRulePayload.customMessage) && Objects.equals(this.customName, cloudConfigurationRulePayload.customName) && Objects.equals(this.filters, cloudConfigurationRulePayload.filters) && Objects.equals(this.isEnabled, cloudConfigurationRulePayload.isEnabled) && Objects.equals(this.message, cloudConfigurationRulePayload.message) && Objects.equals(this.name, cloudConfigurationRulePayload.name) && Objects.equals(this.options, cloudConfigurationRulePayload.options) && Objects.equals(this.tags, cloudConfigurationRulePayload.tags) && Objects.equals(this.type, cloudConfigurationRulePayload.type) && Objects.equals(this.additionalProperties, cloudConfigurationRulePayload.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(cases,complianceSignalOptions,customMessage,customName,filters,isEnabled,message,name,options,tags,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudConfigurationRulePayload {\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    complianceSignalOptions: ").append(toIndentedString(complianceSignalOptions)).append("\n");
    sb.append("    customMessage: ").append(toIndentedString(customMessage)).append("\n");
    sb.append("    customName: ").append(toIndentedString(customName)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
