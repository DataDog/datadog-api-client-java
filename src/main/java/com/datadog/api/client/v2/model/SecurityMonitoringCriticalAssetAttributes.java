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
   * <p>The attributes of the critical asset.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringCriticalAssetAttributes.JSON_PROPERTY_CREATION_AUTHOR_ID,
  SecurityMonitoringCriticalAssetAttributes.JSON_PROPERTY_CREATION_DATE,
  SecurityMonitoringCriticalAssetAttributes.JSON_PROPERTY_CREATOR,
  SecurityMonitoringCriticalAssetAttributes.JSON_PROPERTY_ENABLED,
  SecurityMonitoringCriticalAssetAttributes.JSON_PROPERTY_QUERY,
  SecurityMonitoringCriticalAssetAttributes.JSON_PROPERTY_RULE_QUERY,
  SecurityMonitoringCriticalAssetAttributes.JSON_PROPERTY_SEVERITY,
  SecurityMonitoringCriticalAssetAttributes.JSON_PROPERTY_TAGS,
  SecurityMonitoringCriticalAssetAttributes.JSON_PROPERTY_UPDATE_AUTHOR_ID,
  SecurityMonitoringCriticalAssetAttributes.JSON_PROPERTY_UPDATE_DATE,
  SecurityMonitoringCriticalAssetAttributes.JSON_PROPERTY_UPDATER,
  SecurityMonitoringCriticalAssetAttributes.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringCriticalAssetAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATION_AUTHOR_ID = "creation_author_id";
  private Long creationAuthorId;

  public static final String JSON_PROPERTY_CREATION_DATE = "creation_date";
  private Long creationDate;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private SecurityMonitoringUser creator;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_QUERY = "query";
  private String query;

  public static final String JSON_PROPERTY_RULE_QUERY = "rule_query";
  private String ruleQuery;

  public static final String JSON_PROPERTY_SEVERITY = "severity";
  private SecurityMonitoringCriticalAssetSeverity severity;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_UPDATE_AUTHOR_ID = "update_author_id";
  private Long updateAuthorId;

  public static final String JSON_PROPERTY_UPDATE_DATE = "update_date";
  private Long updateDate;

  public static final String JSON_PROPERTY_UPDATER = "updater";
  private SecurityMonitoringUser updater;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public SecurityMonitoringCriticalAssetAttributes creationAuthorId(Long creationAuthorId) {
    this.creationAuthorId = creationAuthorId;
    return this;
  }

  /**
   * <p>ID of user who created the critical asset.</p>
   * @return creationAuthorId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATION_AUTHOR_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getCreationAuthorId() {
        return creationAuthorId;
      }
  public void setCreationAuthorId(Long creationAuthorId) {
    this.creationAuthorId = creationAuthorId;
  }
  public SecurityMonitoringCriticalAssetAttributes creationDate(Long creationDate) {
    this.creationDate = creationDate;
    return this;
  }

  /**
   * <p>A Unix millisecond timestamp given the creation date of the critical asset.</p>
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
  public SecurityMonitoringCriticalAssetAttributes creator(SecurityMonitoringUser creator) {
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
  public SecurityMonitoringCriticalAssetAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * <p>Whether the critical asset is enabled.</p>
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
  public SecurityMonitoringCriticalAssetAttributes query(String query) {
    this.query = query;
    return this;
  }

  /**
   * <p>The query for the critical asset. It uses the same syntax as the queries to search signals in the Signals Explorer.</p>
   * @return query
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getQuery() {
        return query;
      }
  public void setQuery(String query) {
    this.query = query;
  }
  public SecurityMonitoringCriticalAssetAttributes ruleQuery(String ruleQuery) {
    this.ruleQuery = ruleQuery;
    return this;
  }

  /**
   * <p>The rule query of the critical asset, with the same syntax as the search bar for detection rules. This determines which rules this critical asset will apply to.</p>
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
  public SecurityMonitoringCriticalAssetAttributes severity(SecurityMonitoringCriticalAssetSeverity severity) {
    this.severity = severity;
    this.unparsed |= !severity.isValid();
    return this;
  }

  /**
   * <p>Severity associated with this critical asset. Either an explicit severity can be set, or the severity can be increased or decreased.</p>
   * @return severity
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SEVERITY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringCriticalAssetSeverity getSeverity() {
        return severity;
      }
  public void setSeverity(SecurityMonitoringCriticalAssetSeverity severity) {
    if (!severity.isValid()) {
        this.unparsed = true;
    }
    this.severity = severity;
  }
  public SecurityMonitoringCriticalAssetAttributes tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public SecurityMonitoringCriticalAssetAttributes addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * <p>List of tags associated with the critical asset.</p>
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
  public SecurityMonitoringCriticalAssetAttributes updateAuthorId(Long updateAuthorId) {
    this.updateAuthorId = updateAuthorId;
    return this;
  }

  /**
   * <p>ID of user who updated the critical asset.</p>
   * @return updateAuthorId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATE_AUTHOR_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getUpdateAuthorId() {
        return updateAuthorId;
      }
  public void setUpdateAuthorId(Long updateAuthorId) {
    this.updateAuthorId = updateAuthorId;
  }
  public SecurityMonitoringCriticalAssetAttributes updateDate(Long updateDate) {
    this.updateDate = updateDate;
    return this;
  }

  /**
   * <p>A Unix millisecond timestamp given the update date of the critical asset.</p>
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
  public SecurityMonitoringCriticalAssetAttributes updater(SecurityMonitoringUser updater) {
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
  public SecurityMonitoringCriticalAssetAttributes version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * <p>The version of the critical asset; it starts at 1, and is incremented at each update.</p>
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
   * @return SecurityMonitoringCriticalAssetAttributes
   */
  @JsonAnySetter
  public SecurityMonitoringCriticalAssetAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this SecurityMonitoringCriticalAssetAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringCriticalAssetAttributes securityMonitoringCriticalAssetAttributes = (SecurityMonitoringCriticalAssetAttributes) o;
    return Objects.equals(this.creationAuthorId, securityMonitoringCriticalAssetAttributes.creationAuthorId) && Objects.equals(this.creationDate, securityMonitoringCriticalAssetAttributes.creationDate) && Objects.equals(this.creator, securityMonitoringCriticalAssetAttributes.creator) && Objects.equals(this.enabled, securityMonitoringCriticalAssetAttributes.enabled) && Objects.equals(this.query, securityMonitoringCriticalAssetAttributes.query) && Objects.equals(this.ruleQuery, securityMonitoringCriticalAssetAttributes.ruleQuery) && Objects.equals(this.severity, securityMonitoringCriticalAssetAttributes.severity) && Objects.equals(this.tags, securityMonitoringCriticalAssetAttributes.tags) && Objects.equals(this.updateAuthorId, securityMonitoringCriticalAssetAttributes.updateAuthorId) && Objects.equals(this.updateDate, securityMonitoringCriticalAssetAttributes.updateDate) && Objects.equals(this.updater, securityMonitoringCriticalAssetAttributes.updater) && Objects.equals(this.version, securityMonitoringCriticalAssetAttributes.version) && Objects.equals(this.additionalProperties, securityMonitoringCriticalAssetAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(creationAuthorId,creationDate,creator,enabled,query,ruleQuery,severity,tags,updateAuthorId,updateDate,updater,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringCriticalAssetAttributes {\n");
    sb.append("    creationAuthorId: ").append(toIndentedString(creationAuthorId)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    ruleQuery: ").append(toIndentedString(ruleQuery)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    updateAuthorId: ").append(toIndentedString(updateAuthorId)).append("\n");
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
