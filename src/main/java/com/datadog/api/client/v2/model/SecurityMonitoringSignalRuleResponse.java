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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Rule. */
@JsonPropertyOrder({
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_CASES,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_CREATED_AT,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_CREATION_AUTHOR_ID,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_CUSTOM_MESSAGE,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_CUSTOM_NAME,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_DEPRECATION_DATE,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_FILTERS,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_HAS_EXTENDED_TITLE,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_ID,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_IS_DEFAULT,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_IS_DELETED,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_IS_ENABLED,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_MESSAGE,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_NAME,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_OPTIONS,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_QUERIES,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_TAGS,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_TYPE,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_UPDATE_AUTHOR_ID,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalRuleResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CASES = "cases";
  private List<SecurityMonitoringRuleCase> cases = null;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATION_AUTHOR_ID = "creationAuthorId";
  private Long creationAuthorId;

  public static final String JSON_PROPERTY_CUSTOM_MESSAGE = "customMessage";
  private String customMessage;

  public static final String JSON_PROPERTY_CUSTOM_NAME = "customName";
  private String customName;

  public static final String JSON_PROPERTY_DEPRECATION_DATE = "deprecationDate";
  private Long deprecationDate;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<SecurityMonitoringFilter> filters = null;

  public static final String JSON_PROPERTY_HAS_EXTENDED_TITLE = "hasExtendedTitle";
  private Boolean hasExtendedTitle;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private SecurityMonitoringRuleOptions options;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<SecurityMonitoringSignalRuleResponseQuery> queries = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SecurityMonitoringSignalRuleType type;

  public static final String JSON_PROPERTY_UPDATE_AUTHOR_ID = "updateAuthorId";
  private Long updateAuthorId;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SecurityMonitoringSignalRuleResponse cases(List<SecurityMonitoringRuleCase> cases) {
    this.cases = cases;
    for (SecurityMonitoringRuleCase item : cases) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringSignalRuleResponse addCasesItem(SecurityMonitoringRuleCase casesItem) {
    if (this.cases == null) {
      this.cases = new ArrayList<>();
    }
    this.cases.add(casesItem);
    this.unparsed |= casesItem.unparsed;
    return this;
  }

  /**
   * Cases for generating signals.
   *
   * @return cases
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringRuleCase> getCases() {
    return cases;
  }

  public void setCases(List<SecurityMonitoringRuleCase> cases) {
    this.cases = cases;
  }

  public SecurityMonitoringSignalRuleResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the rule was created, timestamp in milliseconds.
   *
   * @return createdAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public SecurityMonitoringSignalRuleResponse creationAuthorId(Long creationAuthorId) {
    this.creationAuthorId = creationAuthorId;
    return this;
  }

  /**
   * User ID of the user who created the rule.
   *
   * @return creationAuthorId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATION_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreationAuthorId() {
    return creationAuthorId;
  }

  public void setCreationAuthorId(Long creationAuthorId) {
    this.creationAuthorId = creationAuthorId;
  }

  public SecurityMonitoringSignalRuleResponse customMessage(String customMessage) {
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

  public SecurityMonitoringSignalRuleResponse customName(String customName) {
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

  public SecurityMonitoringSignalRuleResponse deprecationDate(Long deprecationDate) {
    this.deprecationDate = deprecationDate;
    return this;
  }

  /**
   * When the rule will be deprecated, timestamp in milliseconds.
   *
   * @return deprecationDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEPRECATION_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getDeprecationDate() {
    return deprecationDate;
  }

  public void setDeprecationDate(Long deprecationDate) {
    this.deprecationDate = deprecationDate;
  }

  public SecurityMonitoringSignalRuleResponse filters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
    for (SecurityMonitoringFilter item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringSignalRuleResponse addFiltersItem(SecurityMonitoringFilter filtersItem) {
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

  public SecurityMonitoringSignalRuleResponse hasExtendedTitle(Boolean hasExtendedTitle) {
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

  public SecurityMonitoringSignalRuleResponse id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The ID of the rule.
   *
   * @return id
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecurityMonitoringSignalRuleResponse isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * Whether the rule is included by default.
   *
   * @return isDefault
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsDefault() {
    return isDefault;
  }

  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }

  public SecurityMonitoringSignalRuleResponse isDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
    return this;
  }

  /**
   * Whether the rule has been deleted.
   *
   * @return isDeleted
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_DELETED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsDeleted() {
    return isDeleted;
  }

  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }

  public SecurityMonitoringSignalRuleResponse isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * Whether the rule is enabled.
   *
   * @return isEnabled
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_ENABLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }

  public SecurityMonitoringSignalRuleResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message for generated signals.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SecurityMonitoringSignalRuleResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the rule.
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

  public SecurityMonitoringSignalRuleResponse options(SecurityMonitoringRuleOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Options.
   *
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SecurityMonitoringRuleOptions getOptions() {
    return options;
  }

  public void setOptions(SecurityMonitoringRuleOptions options) {
    this.options = options;
  }

  public SecurityMonitoringSignalRuleResponse queries(
      List<SecurityMonitoringSignalRuleResponseQuery> queries) {
    this.queries = queries;
    for (SecurityMonitoringSignalRuleResponseQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringSignalRuleResponse addQueriesItem(
      SecurityMonitoringSignalRuleResponseQuery queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * Queries for selecting logs which are part of the rule.
   *
   * @return queries
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringSignalRuleResponseQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<SecurityMonitoringSignalRuleResponseQuery> queries) {
    this.queries = queries;
  }

  public SecurityMonitoringSignalRuleResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SecurityMonitoringSignalRuleResponse addTagsItem(String tagsItem) {
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

  public SecurityMonitoringSignalRuleResponse type(SecurityMonitoringSignalRuleType type) {
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

  public SecurityMonitoringSignalRuleResponse updateAuthorId(Long updateAuthorId) {
    this.updateAuthorId = updateAuthorId;
    return this;
  }

  /**
   * User ID of the user who updated the rule.
   *
   * @return updateAuthorId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATE_AUTHOR_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUpdateAuthorId() {
    return updateAuthorId;
  }

  public void setUpdateAuthorId(Long updateAuthorId) {
    this.updateAuthorId = updateAuthorId;
  }

  public SecurityMonitoringSignalRuleResponse version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the rule.
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getVersion() {
    return version;
  }

  public void setVersion(Long version) {
    this.version = version;
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
   * @return SecurityMonitoringSignalRuleResponse
   */
  @JsonAnySetter
  public SecurityMonitoringSignalRuleResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringSignalRuleResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalRuleResponse securityMonitoringSignalRuleResponse =
        (SecurityMonitoringSignalRuleResponse) o;
    return Objects.equals(this.cases, securityMonitoringSignalRuleResponse.cases)
        && Objects.equals(this.createdAt, securityMonitoringSignalRuleResponse.createdAt)
        && Objects.equals(
            this.creationAuthorId, securityMonitoringSignalRuleResponse.creationAuthorId)
        && Objects.equals(this.customMessage, securityMonitoringSignalRuleResponse.customMessage)
        && Objects.equals(this.customName, securityMonitoringSignalRuleResponse.customName)
        && Objects.equals(
            this.deprecationDate, securityMonitoringSignalRuleResponse.deprecationDate)
        && Objects.equals(this.filters, securityMonitoringSignalRuleResponse.filters)
        && Objects.equals(
            this.hasExtendedTitle, securityMonitoringSignalRuleResponse.hasExtendedTitle)
        && Objects.equals(this.id, securityMonitoringSignalRuleResponse.id)
        && Objects.equals(this.isDefault, securityMonitoringSignalRuleResponse.isDefault)
        && Objects.equals(this.isDeleted, securityMonitoringSignalRuleResponse.isDeleted)
        && Objects.equals(this.isEnabled, securityMonitoringSignalRuleResponse.isEnabled)
        && Objects.equals(this.message, securityMonitoringSignalRuleResponse.message)
        && Objects.equals(this.name, securityMonitoringSignalRuleResponse.name)
        && Objects.equals(this.options, securityMonitoringSignalRuleResponse.options)
        && Objects.equals(this.queries, securityMonitoringSignalRuleResponse.queries)
        && Objects.equals(this.tags, securityMonitoringSignalRuleResponse.tags)
        && Objects.equals(this.type, securityMonitoringSignalRuleResponse.type)
        && Objects.equals(this.updateAuthorId, securityMonitoringSignalRuleResponse.updateAuthorId)
        && Objects.equals(this.version, securityMonitoringSignalRuleResponse.version)
        && Objects.equals(
            this.additionalProperties, securityMonitoringSignalRuleResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        cases,
        createdAt,
        creationAuthorId,
        customMessage,
        customName,
        deprecationDate,
        filters,
        hasExtendedTitle,
        id,
        isDefault,
        isDeleted,
        isEnabled,
        message,
        name,
        options,
        queries,
        tags,
        type,
        updateAuthorId,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalRuleResponse {\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creationAuthorId: ").append(toIndentedString(creationAuthorId)).append("\n");
    sb.append("    customMessage: ").append(toIndentedString(customMessage)).append("\n");
    sb.append("    customName: ").append(toIndentedString(customName)).append("\n");
    sb.append("    deprecationDate: ").append(toIndentedString(deprecationDate)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    hasExtendedTitle: ").append(toIndentedString(hasExtendedTitle)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateAuthorId: ").append(toIndentedString(updateAuthorId)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
