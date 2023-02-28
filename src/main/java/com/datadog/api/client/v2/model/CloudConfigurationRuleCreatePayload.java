/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** Create a new cloud configuration rule. */
@JsonPropertyOrder({
  CloudConfigurationRuleCreatePayload.JSON_PROPERTY_CASES,
  CloudConfigurationRuleCreatePayload.JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS,
  CloudConfigurationRuleCreatePayload.JSON_PROPERTY_IS_ENABLED,
  CloudConfigurationRuleCreatePayload.JSON_PROPERTY_MESSAGE,
  CloudConfigurationRuleCreatePayload.JSON_PROPERTY_NAME,
  CloudConfigurationRuleCreatePayload.JSON_PROPERTY_OPTIONS,
  CloudConfigurationRuleCreatePayload.JSON_PROPERTY_TAGS,
  CloudConfigurationRuleCreatePayload.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CloudConfigurationRuleCreatePayload {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CASES = "cases";
  private List<CloudConfigurationRuleCaseCreate> cases = new ArrayList<>();

  public static final String JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS = "complianceSignalOptions";
  private CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions;

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

  public CloudConfigurationRuleCreatePayload() {}

  @JsonCreator
  public CloudConfigurationRuleCreatePayload(
      @JsonProperty(required = true, value = JSON_PROPERTY_CASES)
          List<CloudConfigurationRuleCaseCreate> cases,
      @JsonProperty(required = true, value = JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS)
          CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_ENABLED) Boolean isEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPTIONS)
          CloudConfigurationRuleOptions options) {
    this.cases = cases;
    this.complianceSignalOptions = complianceSignalOptions;
    this.unparsed |= complianceSignalOptions.unparsed;
    this.isEnabled = isEnabled;
    this.message = message;
    this.name = name;
    this.options = options;
    this.unparsed |= options.unparsed;
  }

  public CloudConfigurationRuleCreatePayload cases(List<CloudConfigurationRuleCaseCreate> cases) {
    this.cases = cases;
    for (CloudConfigurationRuleCaseCreate item : cases) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CloudConfigurationRuleCreatePayload addCasesItem(
      CloudConfigurationRuleCaseCreate casesItem) {
    this.cases.add(casesItem);
    this.unparsed |= casesItem.unparsed;
    return this;
  }

  /**
   * Description of generated findings and signals (severity and channels to be notified in case of
   * a signal). Must contain exactly one item.
   *
   * @return cases
   */
  @JsonProperty(JSON_PROPERTY_CASES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CloudConfigurationRuleCaseCreate> getCases() {
    return cases;
  }

  public void setCases(List<CloudConfigurationRuleCaseCreate> cases) {
    this.cases = cases;
  }

  public CloudConfigurationRuleCreatePayload complianceSignalOptions(
      CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions) {
    this.complianceSignalOptions = complianceSignalOptions;
    this.unparsed |= complianceSignalOptions.unparsed;
    return this;
  }

  /**
   * How to generate compliance signals. Useful for cloud_configuration rules only.
   *
   * @return complianceSignalOptions
   */
  @JsonProperty(JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CloudConfigurationRuleComplianceSignalOptions getComplianceSignalOptions() {
    return complianceSignalOptions;
  }

  public void setComplianceSignalOptions(
      CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions) {
    this.complianceSignalOptions = complianceSignalOptions;
  }

  public CloudConfigurationRuleCreatePayload isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether the rule is enabled.
   *
   * @return isEnabled
   */
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public CloudConfigurationRuleCreatePayload message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message in markdown format for generated findings and signals.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public CloudConfigurationRuleCreatePayload name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the rule.
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

  public CloudConfigurationRuleCreatePayload options(CloudConfigurationRuleOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Options on cloud configuration rules.
   *
   * @return options
   */
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CloudConfigurationRuleOptions getOptions() {
    return options;
  }

  public void setOptions(CloudConfigurationRuleOptions options) {
    this.options = options;
  }

  public CloudConfigurationRuleCreatePayload tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public CloudConfigurationRuleCreatePayload addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags for generated findings and signals.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }

  public CloudConfigurationRuleCreatePayload type(CloudConfigurationRuleType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The rule type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudConfigurationRuleType getType() {
    return type;
  }

  public void setType(CloudConfigurationRuleType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  /** Return true if this CloudConfigurationRuleCreatePayload object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CloudConfigurationRuleCreatePayload cloudConfigurationRuleCreatePayload =
        (CloudConfigurationRuleCreatePayload) o;
    return Objects.equals(this.cases, cloudConfigurationRuleCreatePayload.cases)
        && Objects.equals(
            this.complianceSignalOptions,
            cloudConfigurationRuleCreatePayload.complianceSignalOptions)
        && Objects.equals(this.isEnabled, cloudConfigurationRuleCreatePayload.isEnabled)
        && Objects.equals(this.message, cloudConfigurationRuleCreatePayload.message)
        && Objects.equals(this.name, cloudConfigurationRuleCreatePayload.name)
        && Objects.equals(this.options, cloudConfigurationRuleCreatePayload.options)
        && Objects.equals(this.tags, cloudConfigurationRuleCreatePayload.tags)
        && Objects.equals(this.type, cloudConfigurationRuleCreatePayload.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cases, complianceSignalOptions, isEnabled, message, name, options, tags, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CloudConfigurationRuleCreatePayload {\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    complianceSignalOptions: ")
        .append(toIndentedString(complianceSignalOptions))
        .append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
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
