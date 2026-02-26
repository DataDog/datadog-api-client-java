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

/** The payload of a signal correlation rule. */
@JsonPropertyOrder({
  SecurityMonitoringSignalRulePayload.JSON_PROPERTY_CASES,
  SecurityMonitoringSignalRulePayload.JSON_PROPERTY_CUSTOM_MESSAGE,
  SecurityMonitoringSignalRulePayload.JSON_PROPERTY_CUSTOM_NAME,
  SecurityMonitoringSignalRulePayload.JSON_PROPERTY_FILTERS,
  SecurityMonitoringSignalRulePayload.JSON_PROPERTY_HAS_EXTENDED_TITLE,
  SecurityMonitoringSignalRulePayload.JSON_PROPERTY_IS_ENABLED,
  SecurityMonitoringSignalRulePayload.JSON_PROPERTY_MESSAGE,
  SecurityMonitoringSignalRulePayload.JSON_PROPERTY_NAME,
  SecurityMonitoringSignalRulePayload.JSON_PROPERTY_OPTIONS,
  SecurityMonitoringSignalRulePayload.JSON_PROPERTY_QUERIES,
  SecurityMonitoringSignalRulePayload.JSON_PROPERTY_TAGS,
  SecurityMonitoringSignalRulePayload.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalRulePayload {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CASES = "cases";
  private List<SecurityMonitoringRuleCaseCreate> cases = new ArrayList<>();

  public static final String JSON_PROPERTY_CUSTOM_MESSAGE = "customMessage";
  private String customMessage;

  public static final String JSON_PROPERTY_CUSTOM_NAME = "customName";
  private String customName;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<SecurityMonitoringFilter> filters = null;

  public static final String JSON_PROPERTY_HAS_EXTENDED_TITLE = "hasExtendedTitle";
  private Boolean hasExtendedTitle;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private SecurityMonitoringRuleOptions options;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<SecurityMonitoringSignalRuleQuery> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SecurityMonitoringSignalRuleType type;

  public SecurityMonitoringSignalRulePayload() {}

  @JsonCreator
  public SecurityMonitoringSignalRulePayload(
      @JsonProperty(required = true, value = JSON_PROPERTY_CASES)
          List<SecurityMonitoringRuleCaseCreate> cases,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_ENABLED) Boolean isEnabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_OPTIONS)
          SecurityMonitoringRuleOptions options,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<SecurityMonitoringSignalRuleQuery> queries) {
    this.cases = cases;
    this.isEnabled = isEnabled;
    this.message = message;
    this.name = name;
    this.options = options;
    this.unparsed |= options.unparsed;
    this.queries = queries;
  }

  public SecurityMonitoringSignalRulePayload cases(List<SecurityMonitoringRuleCaseCreate> cases) {
    this.cases = cases;
    for (SecurityMonitoringRuleCaseCreate item : cases) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringSignalRulePayload addCasesItem(
      SecurityMonitoringRuleCaseCreate casesItem) {
    this.cases.add(casesItem);
    this.unparsed |= casesItem.unparsed;
    return this;
  }

  /**
   * Cases for generating signals.
   *
   * @return cases
   */
  @JsonProperty(JSON_PROPERTY_CASES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityMonitoringRuleCaseCreate> getCases() {
    return cases;
  }

  public void setCases(List<SecurityMonitoringRuleCaseCreate> cases) {
    this.cases = cases;
  }

  public SecurityMonitoringSignalRulePayload customMessage(String customMessage) {
    this.customMessage = customMessage;
    return this;
  }

  /**
   * Custom/Overridden message for generated signals (used in case of Default rule update).
   *
   * @return customMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomMessage() {
    return customMessage;
  }

  public void setCustomMessage(String customMessage) {
    this.customMessage = customMessage;
  }

  public SecurityMonitoringSignalRulePayload customName(String customName) {
    this.customName = customName;
    return this;
  }

  /**
   * Custom/Overridden name of the rule (used in case of Default rule update).
   *
   * @return customName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCustomName() {
    return customName;
  }

  public void setCustomName(String customName) {
    this.customName = customName;
  }

  public SecurityMonitoringSignalRulePayload filters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
    for (SecurityMonitoringFilter item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringSignalRulePayload addFiltersItem(SecurityMonitoringFilter filtersItem) {
    if (this.filters == null) {
      this.filters = new ArrayList<>();
    }
    this.filters.add(filtersItem);
    this.unparsed |= filtersItem.unparsed;
    return this;
  }

  /**
   * Additional queries to filter matched events before they are processed. This field is deprecated
   * for log detection, signal correlation, and workload security rules.
   *
   * @return filters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringFilter> getFilters() {
    return filters;
  }

  public void setFilters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
  }

  public SecurityMonitoringSignalRulePayload hasExtendedTitle(Boolean hasExtendedTitle) {
    this.hasExtendedTitle = hasExtendedTitle;
    return this;
  }

  /**
   * Whether the notifications include the triggering group-by values in their title.
   *
   * @return hasExtendedTitle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HAS_EXTENDED_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHasExtendedTitle() {
    return hasExtendedTitle;
  }

  public void setHasExtendedTitle(Boolean hasExtendedTitle) {
    this.hasExtendedTitle = hasExtendedTitle;
  }

  public SecurityMonitoringSignalRulePayload isEnabled(Boolean isEnabled) {
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

  public SecurityMonitoringSignalRulePayload message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message for generated signals.
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

  public SecurityMonitoringSignalRulePayload name(String name) {
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

  public SecurityMonitoringSignalRulePayload options(SecurityMonitoringRuleOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Options.
   *
   * @return options
   */
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringRuleOptions getOptions() {
    return options;
  }

  public void setOptions(SecurityMonitoringRuleOptions options) {
    this.options = options;
  }

  public SecurityMonitoringSignalRulePayload queries(
      List<SecurityMonitoringSignalRuleQuery> queries) {
    this.queries = queries;
    for (SecurityMonitoringSignalRuleQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringSignalRulePayload addQueriesItem(
      SecurityMonitoringSignalRuleQuery queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * Queries for selecting signals which are part of the rule.
   *
   * @return queries
   */
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityMonitoringSignalRuleQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<SecurityMonitoringSignalRuleQuery> queries) {
    this.queries = queries;
  }

  public SecurityMonitoringSignalRulePayload tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SecurityMonitoringSignalRulePayload addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * Tags for generated signals.
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

  public SecurityMonitoringSignalRulePayload type(SecurityMonitoringSignalRuleType type) {
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
  public SecurityMonitoringSignalRuleType getType() {
    return type;
  }

  public void setType(SecurityMonitoringSignalRuleType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return SecurityMonitoringSignalRulePayload
   */
  @JsonAnySetter
  public SecurityMonitoringSignalRulePayload putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringSignalRulePayload object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalRulePayload securityMonitoringSignalRulePayload =
        (SecurityMonitoringSignalRulePayload) o;
    return Objects.equals(this.cases, securityMonitoringSignalRulePayload.cases)
        && Objects.equals(this.customMessage, securityMonitoringSignalRulePayload.customMessage)
        && Objects.equals(this.customName, securityMonitoringSignalRulePayload.customName)
        && Objects.equals(this.filters, securityMonitoringSignalRulePayload.filters)
        && Objects.equals(
            this.hasExtendedTitle, securityMonitoringSignalRulePayload.hasExtendedTitle)
        && Objects.equals(this.isEnabled, securityMonitoringSignalRulePayload.isEnabled)
        && Objects.equals(this.message, securityMonitoringSignalRulePayload.message)
        && Objects.equals(this.name, securityMonitoringSignalRulePayload.name)
        && Objects.equals(this.options, securityMonitoringSignalRulePayload.options)
        && Objects.equals(this.queries, securityMonitoringSignalRulePayload.queries)
        && Objects.equals(this.tags, securityMonitoringSignalRulePayload.tags)
        && Objects.equals(this.type, securityMonitoringSignalRulePayload.type)
        && Objects.equals(
            this.additionalProperties, securityMonitoringSignalRulePayload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cases,
        customMessage,
        customName,
        filters,
        hasExtendedTitle,
        isEnabled,
        message,
        name,
        options,
        queries,
        tags,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalRulePayload {\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    customMessage: ").append(toIndentedString(customMessage)).append("\n");
    sb.append("    customName: ").append(toIndentedString(customName)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    hasExtendedTitle: ").append(toIndentedString(hasExtendedTitle)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
