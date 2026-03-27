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
   * <p>The attributes of the suppression rule.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_CREATION_DATE,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_CREATOR,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_DATA_EXCLUSION_QUERY,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_DESCRIPTION,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_EDITABLE,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_ENABLED,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_EXPIRATION_DATE,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_NAME,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_RULE_QUERY,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_START_DATE,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_SUPPRESSION_QUERY,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_TAGS,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_UPDATE_DATE,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_UPDATER,
  SecurityMonitoringSuppressionAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSuppressionAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATION_DATE = "creation_date";
  private Long creationDate;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private SecurityMonitoringUser creator;

  public static final String JSON_PROPERTY_DATA_EXCLUSION_QUERY = "data_exclusion_query";
  private String dataExclusionQuery;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_EDITABLE = "editable";
  private Boolean editable;

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

  public static final String JSON_PROPERTY_UPDATE_DATE = "update_date";
  private Long updateDate;

  public static final String JSON_PROPERTY_UPDATER = "updater";
  private SecurityMonitoringUser updater;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public SecurityMonitoringSuppressionAttributes creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * <p>A Unix millisecond timestamp given the creation date of the suppression rule.</p>
   * @return creationDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATION_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCreationDate() {
        return creationDate;
      }
  public void setCreationDate(Long creationDate) {
    this.creationDate = creationDate;
  }
  public SecurityMonitoringSuppressionAttributes creator(SecurityMonitoringUser creator) {
    this.creator = creator;
    this.unparsed |= creator.unparsed;
    return this;
  }

  /**
   * <p>A user.</p>
   * @return creator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringUser getCreator() {
        return creator;
      }
  public void setCreator(SecurityMonitoringUser creator) {
    this.creator = creator;
  }
  public SecurityMonitoringSuppressionAttributes dataExclusionQuery(String dataExclusionQuery) {
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
  public SecurityMonitoringSuppressionAttributes description(String description) {
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
  public SecurityMonitoringSuppressionAttributes editable(Boolean editable) {
    this.editable = editable;
    return this;
  }

  /**
   * <p>Whether the suppression rule is editable.</p>
   * @return editable
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EDITABLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getEditable() {
        return editable;
      }
  public void setEditable(Boolean editable) {
    this.editable = editable;
  }
  public SecurityMonitoringSuppressionAttributes enabled(Boolean enabled) {
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
  public SecurityMonitoringSuppressionAttributes expirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * <p>A Unix millisecond timestamp giving an expiration date for the suppression rule. After this date, it won't suppress signals anymore.</p>
   * @return expirationDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_EXPIRATION_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getExpirationDate() {
        return expirationDate;
      }
  public void setExpirationDate(Long expirationDate) {
    this.expirationDate = expirationDate;
  }
  public SecurityMonitoringSuppressionAttributes name(String name) {
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
  public SecurityMonitoringSuppressionAttributes ruleQuery(String ruleQuery) {
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
  public SecurityMonitoringSuppressionAttributes startDate(Long startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <p>A Unix millisecond timestamp giving the start date for the suppression rule. After this date, it starts suppressing signals.</p>
   * @return startDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getStartDate() {
        return startDate;
      }
  public void setStartDate(Long startDate) {
    this.startDate = startDate;
  }
  public SecurityMonitoringSuppressionAttributes suppressionQuery(String suppressionQuery) {
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
  public SecurityMonitoringSuppressionAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public SecurityMonitoringSuppressionAttributes addTagsItem(String tagsItem) {
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
  public SecurityMonitoringSuppressionAttributes updateDate(Long updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * <p>A Unix millisecond timestamp given the update date of the suppression rule.</p>
   * @return updateDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATE_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getUpdateDate() {
        return updateDate;
      }
  public void setUpdateDate(Long updateDate) {
    this.updateDate = updateDate;
  }
  public SecurityMonitoringSuppressionAttributes updater(SecurityMonitoringUser updater) {
    this.updater = updater;
    this.unparsed |= updater.unparsed;
    return this;
  }

  /**
   * <p>A user.</p>
   * @return updater
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringUser getUpdater() {
        return updater;
      }
  public void setUpdater(SecurityMonitoringUser updater) {
    this.updater = updater;
  }
  public SecurityMonitoringSuppressionAttributes version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * <p>The version of the suppression rule; it starts at 1, and is incremented at each update.</p>
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
   * @return SecurityMonitoringSuppressionAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringSuppressionAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this SecurityMonitoringSuppressionAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSuppressionAttributes securityMonitoringSuppressionAttributes = (SecurityMonitoringSuppressionAttributes) o;
    return Objects.equals(this.creationDate, securityMonitoringSuppressionAttributes.creationDate) && Objects.equals(this.creator, securityMonitoringSuppressionAttributes.creator) && Objects.equals(this.dataExclusionQuery, securityMonitoringSuppressionAttributes.dataExclusionQuery) && Objects.equals(this.description, securityMonitoringSuppressionAttributes.description) && Objects.equals(this.editable, securityMonitoringSuppressionAttributes.editable) && Objects.equals(this.enabled, securityMonitoringSuppressionAttributes.enabled) && Objects.equals(this.expirationDate, securityMonitoringSuppressionAttributes.expirationDate) && Objects.equals(this.name, securityMonitoringSuppressionAttributes.name) && Objects.equals(this.ruleQuery, securityMonitoringSuppressionAttributes.ruleQuery) && Objects.equals(this.startDate, securityMonitoringSuppressionAttributes.startDate) && Objects.equals(this.suppressionQuery, securityMonitoringSuppressionAttributes.suppressionQuery) && Objects.equals(this.tags, securityMonitoringSuppressionAttributes.tags) && Objects.equals(this.updateDate, securityMonitoringSuppressionAttributes.updateDate) && Objects.equals(this.updater, securityMonitoringSuppressionAttributes.updater) && Objects.equals(this.version, securityMonitoringSuppressionAttributes.version) && Objects.equals(this.additionalProperties, securityMonitoringSuppressionAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(creationDate,creator,dataExclusionQuery,description,editable,enabled,expirationDate,name,ruleQuery,startDate,suppressionQuery,tags,updateDate,updater,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSuppressionAttributes {\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    dataExclusionQuery: ").append(toIndentedString(dataExclusionQuery)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ruleQuery: ").append(toIndentedString(ruleQuery)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    suppressionQuery: ").append(toIndentedString(suppressionQuery)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateDate: ").append(toIndentedString(updateDate)).append("\n");
    sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
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
