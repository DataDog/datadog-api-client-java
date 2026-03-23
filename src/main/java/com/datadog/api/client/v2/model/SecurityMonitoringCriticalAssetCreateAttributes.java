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

/** Object containing the attributes of the critical asset to be created. */
@JsonPropertyOrder({
  SecurityMonitoringCriticalAssetCreateAttributes.JSON_PROPERTY_ENABLED,
  SecurityMonitoringCriticalAssetCreateAttributes.JSON_PROPERTY_QUERY,
  SecurityMonitoringCriticalAssetCreateAttributes.JSON_PROPERTY_RULE_QUERY,
  SecurityMonitoringCriticalAssetCreateAttributes.JSON_PROPERTY_SEVERITY,
  SecurityMonitoringCriticalAssetCreateAttributes.JSON_PROPERTY_TAGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringCriticalAssetCreateAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled = true;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RULE_QUERY = "rule_query";
  private String ruleQuery;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private SecurityMonitoringCriticalAssetSeverity severity;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public SecurityMonitoringCriticalAssetCreateAttributes() {}

  @JsonCreator
  public SecurityMonitoringCriticalAssetCreateAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERY) String query,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_QUERY) String ruleQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEVERITY)
          SecurityMonitoringCriticalAssetSeverity severity) {
    this.query = query;
    this.ruleQuery = ruleQuery;
    this.severity = severity;
    this.unparsed |= !severity.isValid();
  }

  public SecurityMonitoringCriticalAssetCreateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the critical asset is enabled. Defaults to <code>true</code> if not specified.
   *
   * @return enabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public SecurityMonitoringCriticalAssetCreateAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * The query for the critical asset. It uses the same syntax as the queries to search signals in
   * the Signals Explorer.
   *
   * @return query
   */
  @JsonProperty(JSON_PROPERTY_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public SecurityMonitoringCriticalAssetCreateAttributes ruleQuery(String ruleQuery) {
    this.ruleQuery = ruleQuery;
    return this;
  }

  /**
   * The rule query of the critical asset, with the same syntax as the search bar for detection
   * rules. This determines which rules this critical asset will apply to.
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

  public SecurityMonitoringCriticalAssetCreateAttributes severity(
      SecurityMonitoringCriticalAssetSeverity severity) {
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    return this;
  }

  /**
   * Severity associated with this critical asset. Either an explicit severity can be set, or the
   * severity can be increased or decreased.
   *
   * @return severity
   */
  @JsonProperty(JSON_PROPERTY_SEVERITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringCriticalAssetSeverity getSeverity() {
    return severity;
  }

  public void setSeverity(SecurityMonitoringCriticalAssetSeverity severity) {
    if (!severity.isValid()) {
      this.unparsed = true;
    }
    this.severity = severity;
  }

  public SecurityMonitoringCriticalAssetCreateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SecurityMonitoringCriticalAssetCreateAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * List of tags associated with the critical asset.
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
   * @return SecurityMonitoringCriticalAssetCreateAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringCriticalAssetCreateAttributes putAdditionalProperty(
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

  /** Return true if this SecurityMonitoringCriticalAssetCreateAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringCriticalAssetCreateAttributes
        securityMonitoringCriticalAssetCreateAttributes =
            (SecurityMonitoringCriticalAssetCreateAttributes) o;
    return Objects.equals(this.enabled, securityMonitoringCriticalAssetCreateAttributes.enabled)
        && Objects.equals(this.query, securityMonitoringCriticalAssetCreateAttributes.query)
        && Objects.equals(this.ruleQuery, securityMonitoringCriticalAssetCreateAttributes.ruleQuery)
        && Objects.equals(this.severity, securityMonitoringCriticalAssetCreateAttributes.severity)
        && Objects.equals(this.tags, securityMonitoringCriticalAssetCreateAttributes.tags)
        && Objects.equals(
            this.additionalProperties,
            securityMonitoringCriticalAssetCreateAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, query, ruleQuery, severity, tags, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringCriticalAssetCreateAttributes {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    ruleQuery: ").append(toIndentedString(ruleQuery)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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
