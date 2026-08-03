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
   * <p>The suppression rule properties to be updated.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringSuppressionUpdateAttributes.JSON_PROPERTY_DATA_EXCLUSION_QUERY,
  SecurityMonitoringSuppressionUpdateAttributes.JSON_PROPERTY_DESCRIPTION,
  SecurityMonitoringSuppressionUpdateAttributes.JSON_PROPERTY_ENABLED,
  SecurityMonitoringSuppressionUpdateAttributes.JSON_PROPERTY_EXPIRATION_DATE,
  SecurityMonitoringSuppressionUpdateAttributes.JSON_PROPERTY_NAME,
  SecurityMonitoringSuppressionUpdateAttributes.JSON_PROPERTY_RULE_QUERY,
  SecurityMonitoringSuppressionUpdateAttributes.JSON_PROPERTY_START_DATE,
  SecurityMonitoringSuppressionUpdateAttributes.JSON_PROPERTY_SUPPRESSION_QUERY,
  SecurityMonitoringSuppressionUpdateAttributes.JSON_PROPERTY_TAGS,
  SecurityMonitoringSuppressionUpdateAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSuppressionUpdateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_EXCLUSION_QUERY = "data_exclusion_query";
  private String dataExclusionQuery;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_EXPIRATION_DATE = "expiration_date";
  private JsonNullable<Long> expirationDate = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_RULE_QUERY = "rule_query";
  private String ruleQuery;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private JsonNullable<Long> startDate = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_SUPPRESSION_QUERY = "suppression_query";
  private String suppressionQuery;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public SecurityMonitoringSuppressionUpdateAttributes dataExclusionQuery(String dataExclusionQuery) {
    this.dataExclusionQuery = dataExclusionQuery;
    return this;
  }

  /**
   * <p>An exclusion query on the input data of the security rules, which could be logs, Agent events, or other types of data based on the security rule. Events matching this query are ignored by any detection rules referenced in the suppression rule.</p>
   * @return dataExclusionQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DATA_EXCLUSION_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDataExclusionQuery() {
        return dataExclusionQuery;
      }
  public void setDataExclusionQuery(String dataExclusionQuery) {
    this.dataExclusionQuery = dataExclusionQuery;
  }
  public SecurityMonitoringSuppressionUpdateAttributes description(String description) {
    this.description = description;
    return this;
  }

  /**
   * <p>A description for the suppression rule.</p>
   * @return description
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DESCRIPTION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDescription() {
        return description;
      }
  public void setDescription(String description) {
    this.description = description;
  }
  public SecurityMonitoringSuppressionUpdateAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether the suppression rule is enabled.</p>
   * @return enabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEnabled() {
        return enabled;
      }
  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }
  public SecurityMonitoringSuppressionUpdateAttributes expirationDate(Long expirationDate) {
    this.expirationDate = JsonNullable.<Long>of(expirationDate);
    return this;
  }

  /**
   * <p>A Unix millisecond timestamp giving an expiration date for the suppression rule. After this date, it won't suppress signals anymore. If unset, the expiration date of the suppression rule is left untouched. If set to <code>null</code>, the expiration date is removed.</p>
   * @return expirationDate
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getExpirationDate() {
        return expirationDate.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getExpirationDate_JsonNullable() {
    return expirationDate;
  }
  @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)public void setExpirationDate_JsonNullable(JsonNullable<Long> expirationDate) {
    this.expirationDate = expirationDate;
  }
  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = JsonNullable.<Long>of(expirationDate);
  }
  public SecurityMonitoringSuppressionUpdateAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the suppression rule.</p>
   * @return name
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public SecurityMonitoringSuppressionUpdateAttributes ruleQuery(String ruleQuery) {
    this.ruleQuery = ruleQuery;
    return this;
  }

  /**
   * <p>The rule query of the suppression rule, with the same syntax as the search bar for detection rules.</p>
   * @return ruleQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_RULE_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRuleQuery() {
        return ruleQuery;
      }
  public void setRuleQuery(String ruleQuery) {
    this.ruleQuery = ruleQuery;
  }
  public SecurityMonitoringSuppressionUpdateAttributes startDate(Long startDate) {
    this.startDate = JsonNullable.<Long>of(startDate);
    return this;
  }

  /**
   * <p>A Unix millisecond timestamp giving the start date for the suppression rule. After this date, it starts suppressing signals. If unset, the start date of the suppression rule is left untouched. If set to <code>null</code>, the start date is removed.</p>
   * @return startDate
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public Long getStartDate() {
        return startDate.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_START_DATE)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getStartDate_JsonNullable() {
    return startDate;
  }
  @JsonProperty(JSON_PROPERTY_START_DATE)public void setStartDate_JsonNullable(JsonNullable<Long> startDate) {
    this.startDate = startDate;
  }
  public void setStartDate(Long startDate) {
    this.startDate = JsonNullable.<Long>of(startDate);
  }
  public SecurityMonitoringSuppressionUpdateAttributes suppressionQuery(String suppressionQuery) {
    this.suppressionQuery = suppressionQuery;
    return this;
  }

  /**
   * <p>The suppression query of the suppression rule. If a signal matches this query, it is suppressed and not triggered. Same syntax as the queries to search signals in the signal explorer.</p>
   * @return suppressionQuery
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SUPPRESSION_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSuppressionQuery() {
        return suppressionQuery;
      }
  public void setSuppressionQuery(String suppressionQuery) {
    this.suppressionQuery = suppressionQuery;
  }
  public SecurityMonitoringSuppressionUpdateAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public SecurityMonitoringSuppressionUpdateAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>List of tags associated with the suppression rule.</p>
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
  public SecurityMonitoringSuppressionUpdateAttributes version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * <p>The current version of the suppression. This is optional, but it can help prevent concurrent modifications.</p>
   * maximum: 2147483647
   * @return version
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Integer getVersion() {
        return version;
      }
  public void setVersion(Integer version) {
    this.version = version;
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
   * @return SecurityMonitoringSuppressionUpdateAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringSuppressionUpdateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this SecurityMonitoringSuppressionUpdateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSuppressionUpdateAttributes securityMonitoringSuppressionUpdateAttributes = (SecurityMonitoringSuppressionUpdateAttributes) o;
    return Objects.equals(this.dataExclusionQuery, securityMonitoringSuppressionUpdateAttributes.dataExclusionQuery) && Objects.equals(this.description, securityMonitoringSuppressionUpdateAttributes.description) && Objects.equals(this.enabled, securityMonitoringSuppressionUpdateAttributes.enabled) && Objects.equals(this.expirationDate, securityMonitoringSuppressionUpdateAttributes.expirationDate) && Objects.equals(this.name, securityMonitoringSuppressionUpdateAttributes.name) && Objects.equals(this.ruleQuery, securityMonitoringSuppressionUpdateAttributes.ruleQuery) && Objects.equals(this.startDate, securityMonitoringSuppressionUpdateAttributes.startDate) && Objects.equals(this.suppressionQuery, securityMonitoringSuppressionUpdateAttributes.suppressionQuery) && Objects.equals(this.tags, securityMonitoringSuppressionUpdateAttributes.tags) && Objects.equals(this.version, securityMonitoringSuppressionUpdateAttributes.version) && Objects.equals(this.additionalProperties, securityMonitoringSuppressionUpdateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(dataExclusionQuery,description,enabled,expirationDate,name,ruleQuery,startDate,suppressionQuery,tags,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSuppressionUpdateAttributes {\n");
    sb.append("    dataExclusionQuery: ").append(toIndentedString(dataExclusionQuery)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ruleQuery: ").append(toIndentedString(ruleQuery)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    suppressionQuery: ").append(toIndentedString(suppressionQuery)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
