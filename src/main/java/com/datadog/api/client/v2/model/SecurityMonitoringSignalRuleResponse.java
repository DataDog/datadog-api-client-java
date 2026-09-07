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
   * <p>Rule.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_BLOCKING,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_CASES,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_CREATED_AT,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_CREATION_AUTHOR_ID,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_CREATOR,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_CUSTOM_MESSAGE,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_CUSTOM_NAME,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_DEFAULT_RULE_ID,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_DEFAULT_TAGS,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_DEPRECATION_DATE,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_FILTERS,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_HAS_EXTENDED_TITLE,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_ID,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_IS_BETA,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_IS_DEFAULT,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_IS_DELETED,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_IS_DEPRECATED,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_IS_ENABLED,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_IS_PARTNER,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_MESSAGE,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_METADATA,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_NAME,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_OPTIONS,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_QUERIES,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_TAGS,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_TYPE,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_UPDATE_AUTHOR_ID,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_UPDATED_AT,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_UPDATER,
  SecurityMonitoringSignalRuleResponse.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringSignalRuleResponse {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_BLOCKING = "blocking";
  private Boolean blocking;

  public static final String JSON_PROPERTY_CASES = "cases";
  private List<SecurityMonitoringRuleCase> cases = null;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATION_AUTHOR_ID = "creationAuthorId";
  private Long creationAuthorId;

  public static final String JSON_PROPERTY_CREATOR = "creator";
  private SecurityMonitoringRuleUser creator;

  public static final String JSON_PROPERTY_CUSTOM_MESSAGE = "customMessage";
  private String customMessage;

  public static final String JSON_PROPERTY_CUSTOM_NAME = "customName";
  private String customName;

  public static final String JSON_PROPERTY_DEFAULT_RULE_ID = "defaultRuleId";
  private String defaultRuleId;

  public static final String JSON_PROPERTY_DEFAULT_TAGS = "defaultTags";
  private List<String> defaultTags = null;

  public static final String JSON_PROPERTY_DEPRECATION_DATE = "deprecationDate";
  private Long deprecationDate;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<SecurityMonitoringFilter> filters = null;

  public static final String JSON_PROPERTY_HAS_EXTENDED_TITLE = "hasExtendedTitle";
  private Boolean hasExtendedTitle;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_IS_BETA = "isBeta";
  private Boolean isBeta;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_IS_DELETED = "isDeleted";
  private Boolean isDeleted;

  public static final String JSON_PROPERTY_IS_DEPRECATED = "isDeprecated";
  private Boolean isDeprecated;

  public static final String JSON_PROPERTY_IS_ENABLED = "isEnabled";
  private Boolean isEnabled;

  public static final String JSON_PROPERTY_IS_PARTNER = "isPartner";
  private Boolean isPartner;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private SecurityMonitoringRuleMetadata metadata;

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

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private Long updatedAt;

  public static final String JSON_PROPERTY_UPDATER = "updater";
  private SecurityMonitoringRuleUser updater;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SecurityMonitoringSignalRuleResponse blocking(Boolean blocking) {
    this.blocking = blocking;
    return this;
  }

  /**
   * <p>Whether the rule blocks attackers.</p>
   * @return blocking
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_BLOCKING)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getBlocking() {
        return blocking;
      }
  public void setBlocking(Boolean blocking) {
    this.blocking = blocking;
  }
  public SecurityMonitoringSignalRuleResponse cases(List<SecurityMonitoringRuleCase> cases) {
    this.cases = cases;
    if (cases != null) {
    for (SecurityMonitoringRuleCase item : cases) {
      this.unparsed |= item.unparsed;
    }
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
   * <p>Cases for generating signals.</p>
   * @return cases
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CASES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SecurityMonitoringRuleCase> getCases() {
        return cases;
      }
  public void setCases(List<SecurityMonitoringRuleCase> cases) {
    this.cases = cases;
    if (cases != null) {
      for (SecurityMonitoringRuleCase item : cases) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public SecurityMonitoringSignalRuleResponse createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * <p>When the rule was created, timestamp in milliseconds.</p>
   * @return createdAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>User ID of the user who created the rule.</p>
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
  public SecurityMonitoringSignalRuleResponse creator(SecurityMonitoringRuleUser creator) {
    this.creator = creator;
    this.unparsed |= creator.unparsed;
    return this;
  }

  /**
   * <p>The user who created or last updated the rule.</p>
   * @return creator
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CREATOR)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleUser getCreator() {
        return creator;
      }
  public void setCreator(SecurityMonitoringRuleUser creator) {
    this.creator = creator;
    if (creator != null) {
      this.unparsed |= creator.unparsed;
    }
  }
  public SecurityMonitoringSignalRuleResponse customMessage(String customMessage) {
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
  public SecurityMonitoringSignalRuleResponse customName(String customName) {
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
  public SecurityMonitoringSignalRuleResponse defaultRuleId(String defaultRuleId) {
    this.defaultRuleId = defaultRuleId;
    return this;
  }

  /**
   * <p>The ID of the corresponding default rule.</p>
   * @return defaultRuleId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEFAULT_RULE_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getDefaultRuleId() {
        return defaultRuleId;
      }
  public void setDefaultRuleId(String defaultRuleId) {
    this.defaultRuleId = defaultRuleId;
  }
  public SecurityMonitoringSignalRuleResponse defaultTags(List<String> defaultTags) {
    this.defaultTags = defaultTags;
    return this;
  }
  public SecurityMonitoringSignalRuleResponse addDefaultTagsItem(String defaultTagsItem) {
    if (this.defaultTags == null) {
      this.defaultTags = new ArrayList<>();
    }
    this.defaultTags.add(defaultTagsItem);
    return this;
  }

  /**
   * <p>Default tags for default rules, included in tags.</p>
   * @return defaultTags
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEFAULT_TAGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getDefaultTags() {
        return defaultTags;
      }
  public void setDefaultTags(List<String> defaultTags) {
    this.defaultTags = defaultTags;
  }
  public SecurityMonitoringSignalRuleResponse deprecationDate(Long deprecationDate) {
    this.deprecationDate = deprecationDate;
    return this;
  }

  /**
   * <p>When the rule will be deprecated, timestamp in milliseconds.</p>
   * @return deprecationDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEPRECATION_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getDeprecationDate() {
        return deprecationDate;
      }
  public void setDeprecationDate(Long deprecationDate) {
    this.deprecationDate = deprecationDate;
  }
  public SecurityMonitoringSignalRuleResponse filters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
    if (filters != null) {
    for (SecurityMonitoringFilter item : filters) {
      this.unparsed |= item.unparsed;
    }
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
   * <p>Additional queries to filter matched events before they are processed. This field is deprecated for log detection, signal correlation, and workload security rules.</p>
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
    if (filters != null) {
      for (SecurityMonitoringFilter item : filters) {
        this.unparsed |= item.unparsed;
      }
    }
  }
  public SecurityMonitoringSignalRuleResponse hasExtendedTitle(Boolean hasExtendedTitle) {
    this.hasExtendedTitle = hasExtendedTitle;
    return this;
  }

  /**
   * <p>Whether the notifications include the triggering group-by values in their title.</p>
   * @return hasExtendedTitle
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_HAS_EXTENDED_TITLE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>The ID of the rule.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public SecurityMonitoringSignalRuleResponse isBeta(Boolean isBeta) {
    this.isBeta = isBeta;
    return this;
  }

  /**
   * <p>Whether the rule is in beta.</p>
   * @return isBeta
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_BETA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsBeta() {
        return isBeta;
      }
  public void setIsBeta(Boolean isBeta) {
    this.isBeta = isBeta;
  }
  public SecurityMonitoringSignalRuleResponse isDefault(Boolean isDefault) {
    this.isDefault = isDefault;
    return this;
  }

  /**
   * <p>Whether the rule is included by default.</p>
   * @return isDefault
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
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
   * <p>Whether the rule has been deleted.</p>
   * @return isDeleted
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_DELETED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsDeleted() {
        return isDeleted;
      }
  public void setIsDeleted(Boolean isDeleted) {
    this.isDeleted = isDeleted;
  }
  public SecurityMonitoringSignalRuleResponse isDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
    return this;
  }

  /**
   * <p>Whether the rule is deprecated.</p>
   * @return isDeprecated
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_DEPRECATED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsDeprecated() {
        return isDeprecated;
      }
  public void setIsDeprecated(Boolean isDeprecated) {
    this.isDeprecated = isDeprecated;
  }
  public SecurityMonitoringSignalRuleResponse isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * <p>Whether the rule is enabled.</p>
   * @return isEnabled
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsEnabled() {
        return isEnabled;
      }
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }
  public SecurityMonitoringSignalRuleResponse isPartner(Boolean isPartner) {
    this.isPartner = isPartner;
    return this;
  }

  /**
   * <p>Whether the rule is provided by a partner.</p>
   * @return isPartner
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_IS_PARTNER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Boolean getIsPartner() {
        return isPartner;
      }
  public void setIsPartner(Boolean isPartner) {
    this.isPartner = isPartner;
  }
  public SecurityMonitoringSignalRuleResponse message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Message for generated signals.</p>
   * @return message
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getMessage() {
        return message;
      }
  public void setMessage(String message) {
    this.message = message;
  }
  public SecurityMonitoringSignalRuleResponse metadata(SecurityMonitoringRuleMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * <p>Metadata associated with the rule.</p>
   * @return metadata
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_METADATA)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleMetadata getMetadata() {
        return metadata;
      }
  public void setMetadata(SecurityMonitoringRuleMetadata metadata) {
    this.metadata = metadata;
    if (metadata != null) {
      this.unparsed |= metadata.unparsed;
    }
  }
  public SecurityMonitoringSignalRuleResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the rule.</p>
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
  public SecurityMonitoringSignalRuleResponse options(SecurityMonitoringRuleOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * <p>Options.</p>
   * @return options
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleOptions getOptions() {
        return options;
      }
  public void setOptions(SecurityMonitoringRuleOptions options) {
    this.options = options;
    if (options != null) {
      this.unparsed |= options.unparsed;
    }
  }
  public SecurityMonitoringSignalRuleResponse queries(List<SecurityMonitoringSignalRuleResponseQuery> queries) {
    this.queries = queries;
    if (queries != null) {
    for (SecurityMonitoringSignalRuleResponseQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    }
    return this;
  }
  public SecurityMonitoringSignalRuleResponse addQueriesItem(SecurityMonitoringSignalRuleResponseQuery queriesItem) {
    if (this.queries == null) {
      this.queries = new ArrayList<>();
    }
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * <p>Queries for selecting logs which are part of the rule.</p>
   * @return queries
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_QUERIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SecurityMonitoringSignalRuleResponseQuery> getQueries() {
        return queries;
      }
  public void setQueries(List<SecurityMonitoringSignalRuleResponseQuery> queries) {
    this.queries = queries;
    if (queries != null) {
      for (SecurityMonitoringSignalRuleResponseQuery item : queries) {
        this.unparsed |= item.unparsed;
      }
    }
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
   * <p>Tags for generated signals.</p>
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
  public SecurityMonitoringSignalRuleResponse type(SecurityMonitoringSignalRuleType type) {
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
   * <p>User ID of the user who updated the rule.</p>
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
  public SecurityMonitoringSignalRuleResponse updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * <p>The date the rule was last updated, in milliseconds.</p>
   * @return updatedAt
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATED_AT)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getUpdatedAt() {
        return updatedAt;
      }
  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }
  public SecurityMonitoringSignalRuleResponse updater(SecurityMonitoringRuleUser updater) {
    this.updater = updater;
    this.unparsed |= updater.unparsed;
    return this;
  }

  /**
   * <p>The user who created or last updated the rule.</p>
   * @return updater
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_UPDATER)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleUser getUpdater() {
        return updater;
      }
  public void setUpdater(SecurityMonitoringRuleUser updater) {
    this.updater = updater;
    if (updater != null) {
      this.unparsed |= updater.unparsed;
    }
  }
  public SecurityMonitoringSignalRuleResponse version(Long version) {
    this.version = version;
    return this;
  }

  /**
   * <p>The version of the rule.</p>
   * @return version
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_VERSION)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getVersion() {
        return version;
      }
  public void setVersion(Long version) {
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

  /**
   * Return true if this SecurityMonitoringSignalRuleResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringSignalRuleResponse securityMonitoringSignalRuleResponse = (SecurityMonitoringSignalRuleResponse) o;
    return Objects.equals(this.blocking, securityMonitoringSignalRuleResponse.blocking) && Objects.equals(this.cases, securityMonitoringSignalRuleResponse.cases) && Objects.equals(this.createdAt, securityMonitoringSignalRuleResponse.createdAt) && Objects.equals(this.creationAuthorId, securityMonitoringSignalRuleResponse.creationAuthorId) && Objects.equals(this.creator, securityMonitoringSignalRuleResponse.creator) && Objects.equals(this.customMessage, securityMonitoringSignalRuleResponse.customMessage) && Objects.equals(this.customName, securityMonitoringSignalRuleResponse.customName) && Objects.equals(this.defaultRuleId, securityMonitoringSignalRuleResponse.defaultRuleId) && Objects.equals(this.defaultTags, securityMonitoringSignalRuleResponse.defaultTags) && Objects.equals(this.deprecationDate, securityMonitoringSignalRuleResponse.deprecationDate) && Objects.equals(this.filters, securityMonitoringSignalRuleResponse.filters) && Objects.equals(this.hasExtendedTitle, securityMonitoringSignalRuleResponse.hasExtendedTitle) && Objects.equals(this.id, securityMonitoringSignalRuleResponse.id) && Objects.equals(this.isBeta, securityMonitoringSignalRuleResponse.isBeta) && Objects.equals(this.isDefault, securityMonitoringSignalRuleResponse.isDefault) && Objects.equals(this.isDeleted, securityMonitoringSignalRuleResponse.isDeleted) && Objects.equals(this.isDeprecated, securityMonitoringSignalRuleResponse.isDeprecated) && Objects.equals(this.isEnabled, securityMonitoringSignalRuleResponse.isEnabled) && Objects.equals(this.isPartner, securityMonitoringSignalRuleResponse.isPartner) && Objects.equals(this.message, securityMonitoringSignalRuleResponse.message) && Objects.equals(this.metadata, securityMonitoringSignalRuleResponse.metadata) && Objects.equals(this.name, securityMonitoringSignalRuleResponse.name) && Objects.equals(this.options, securityMonitoringSignalRuleResponse.options) && Objects.equals(this.queries, securityMonitoringSignalRuleResponse.queries) && Objects.equals(this.tags, securityMonitoringSignalRuleResponse.tags) && Objects.equals(this.type, securityMonitoringSignalRuleResponse.type) && Objects.equals(this.updateAuthorId, securityMonitoringSignalRuleResponse.updateAuthorId) && Objects.equals(this.updatedAt, securityMonitoringSignalRuleResponse.updatedAt) && Objects.equals(this.updater, securityMonitoringSignalRuleResponse.updater) && Objects.equals(this.version, securityMonitoringSignalRuleResponse.version) && Objects.equals(this.additionalProperties, securityMonitoringSignalRuleResponse.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(blocking,cases,createdAt,creationAuthorId,creator,customMessage,customName,defaultRuleId,defaultTags,deprecationDate,filters,hasExtendedTitle,id,isBeta,isDefault,isDeleted,isDeprecated,isEnabled,isPartner,message,metadata,name,options,queries,tags,type,updateAuthorId,updatedAt,updater,version, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringSignalRuleResponse {\n");
    sb.append("    blocking: ").append(toIndentedString(blocking)).append("\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creationAuthorId: ").append(toIndentedString(creationAuthorId)).append("\n");
    sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
    sb.append("    customMessage: ").append(toIndentedString(customMessage)).append("\n");
    sb.append("    customName: ").append(toIndentedString(customName)).append("\n");
    sb.append("    defaultRuleId: ").append(toIndentedString(defaultRuleId)).append("\n");
    sb.append("    defaultTags: ").append(toIndentedString(defaultTags)).append("\n");
    sb.append("    deprecationDate: ").append(toIndentedString(deprecationDate)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    hasExtendedTitle: ").append(toIndentedString(hasExtendedTitle)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isBeta: ").append(toIndentedString(isBeta)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isDeprecated: ").append(toIndentedString(isDeprecated)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    isPartner: ").append(toIndentedString(isPartner)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateAuthorId: ").append(toIndentedString(updateAuthorId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
