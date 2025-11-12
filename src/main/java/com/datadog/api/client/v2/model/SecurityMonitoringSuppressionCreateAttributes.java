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

/** Object containing the attributes of the suppression rule to be created. */
@JsonPropertyOrder({
  SecurityMonitoringSuppressionCreateAttributes.JSON_PROPERTY_DATA_EXCLUSION_QUERY,
  SecurityMonitoringSuppressionCreateAttributes.JSON_PROPERTY_DESCRIPTION,
  SecurityMonitoringSuppressionCreateAttributes.JSON_PROPERTY_ENABLED,
  SecurityMonitoringSuppressionCreateAttributes.JSON_PROPERTY_EXPIRATION_DATE,
  SecurityMonitoringSuppressionCreateAttributes.JSON_PROPERTY_NAME,
  SecurityMonitoringSuppressionCreateAttributes.JSON_PROPERTY_RULE_QUERY,
  SecurityMonitoringSuppressionCreateAttributes.JSON_PROPERTY_START_DATE,
  SecurityMonitoringSuppressionCreateAttributes.JSON_PROPERTY_SUPPRESSION_QUERY,
  SecurityMonitoringSuppressionCreateAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSuppressionCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_EXCLUSION_QUERY = "data_exclusion_query";
  private String dataExclusionQuery;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expiration_date";
  private Long expirationDate;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RULE_QUERY = "rule_query";
  private String ruleQuery;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private Long startDate;

  public static final String JSON_PROPERTY_SUPPRESSION_QUERY = "suppression_query";
  private String suppressionQuery;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public SecurityMonitoringSuppressionCreateAttributes() {}

  @JsonCreator
  public SecurityMonitoringSuppressionCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_QUERY) String ruleQuery) {
    this.enabled = enabled;
    this.name = name;
    this.ruleQuery = ruleQuery;
  }

  public SecurityMonitoringSuppressionCreateAttributes dataExclusionQuery(
      String dataExclusionQuery) {
    this.dataExclusionQuery = dataExclusionQuery;
    return this;
  }

  /**
   * An exclusion query on the input data of the security rules, which could be logs, Agent events,
   * or other types of data based on the security rule. Events matching this query are ignored by
   * any detection rules referenced in the suppression rule.
   *
   * @return dataExclusionQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DATA_EXCLUSION_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDataExclusionQuery() {
    return dataExclusionQuery;
  }

  public void setDataExclusionQuery(String dataExclusionQuery) {
    this.dataExclusionQuery = dataExclusionQuery;
  }

  public SecurityMonitoringSuppressionCreateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A description for the suppression rule.
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

  public SecurityMonitoringSuppressionCreateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the suppression rule is enabled.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public SecurityMonitoringSuppressionCreateAttributes expirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * A Unix millisecond timestamp giving an expiration date for the suppression rule. After this
   * date, it won't suppress signals anymore.
   *
   * @return expirationDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }

  public SecurityMonitoringSuppressionCreateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the suppression rule.
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

  public SecurityMonitoringSuppressionCreateAttributes ruleQuery(String ruleQuery) {
    this.ruleQuery = ruleQuery;
    return this;
  }

  /**
   * The rule query of the suppression rule, with the same syntax as the search bar for detection
   * rules.
   *
   * @return ruleQuery
   */
  @JsonProperty(JSON_PROPERTY_RULE_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRuleQuery() {
    return ruleQuery;
  }

  public void setRuleQuery(String ruleQuery) {
    this.ruleQuery = ruleQuery;
  }

  public SecurityMonitoringSuppressionCreateAttributes startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * A Unix millisecond timestamp giving the start date for the suppression rule. After this date,
   * it starts suppressing signals.
   *
   * @return startDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStartDate() {
    return startDate;
  }

  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }

  public SecurityMonitoringSuppressionCreateAttributes suppressionQuery(String suppressionQuery) {
    this.suppressionQuery = suppressionQuery;
    return this;
  }

  /**
   * The suppression query of the suppression rule. If a signal matches this query, it is suppressed
   * and is not triggered. It uses the same syntax as the queries to search signals in the Signals
   * Explorer.
   *
   * @return suppressionQuery
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUPPRESSION_QUERY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSuppressionQuery() {
    return suppressionQuery;
  }

  public void setSuppressionQuery(String suppressionQuery) {
    this.suppressionQuery = suppressionQuery;
  }

  public SecurityMonitoringSuppressionCreateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SecurityMonitoringSuppressionCreateAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags associated with the suppression rule.
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
   * @return SecurityMonitoringSuppressionCreateAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringSuppressionCreateAttributes putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringSuppressionCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSuppressionCreateAttributes securityMonitoringSuppressionCreateAttributes =
        (SecurityMonitoringSuppressionCreateAttributes) o;
    return Objects.equals(
            this.dataExclusionQuery,
            securityMonitoringSuppressionCreateAttributes.dataExclusionQuery)
        && Objects.equals(
            this.description, securityMonitoringSuppressionCreateAttributes.description)
        && Objects.equals(this.enabled, securityMonitoringSuppressionCreateAttributes.enabled)
        && Objects.equals(
            this.expirationDate, securityMonitoringSuppressionCreateAttributes.expirationDate)
        && Objects.equals(this.name, securityMonitoringSuppressionCreateAttributes.name)
        && Objects.equals(this.ruleQuery, securityMonitoringSuppressionCreateAttributes.ruleQuery)
        && Objects.equals(this.startDate, securityMonitoringSuppressionCreateAttributes.startDate)
        && Objects.equals(
            this.suppressionQuery, securityMonitoringSuppressionCreateAttributes.suppressionQuery)
        && Objects.equals(this.tags, securityMonitoringSuppressionCreateAttributes.tags)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringSuppressionCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dataExclusionQuery,
        description,
        enabled,
        expirationDate,
        name,
        ruleQuery,
        startDate,
        suppressionQuery,
        tags,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSuppressionCreateAttributes {\n");
    sb.append("    dataExclusionQuery: ").append(toIndentedString(dataExclusionQuery)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ruleQuery: ").append(toIndentedString(ruleQuery)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    suppressionQuery: ").append(toIndentedString(suppressionQuery)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
