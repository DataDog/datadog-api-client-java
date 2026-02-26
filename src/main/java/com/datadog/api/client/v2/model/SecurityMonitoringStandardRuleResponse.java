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
import org.openapitools.jackson.nullable.JsonNullable;

/** Rule. */
@JsonPropertyOrder({
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_CALCULATED_FIELDS,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_CASES,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_CREATED_AT,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_CREATION_AUTHOR_ID,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_CUSTOM_MESSAGE,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_CUSTOM_NAME,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_DEFAULT_TAGS,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_DEPRECATION_DATE,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_FILTERS,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_GROUP_SIGNALS_BY,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_HAS_EXTENDED_TITLE,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_ID,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_IS_DEFAULT,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_IS_DELETED,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_IS_ENABLED,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_MESSAGE,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_NAME,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_OPTIONS,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_QUERIES,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_REFERENCE_TABLES,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_SCHEDULING_OPTIONS,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_TAGS,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_THIRD_PARTY_CASES,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_TYPE,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_UPDATE_AUTHOR_ID,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_UPDATED_AT,
  SecurityMonitoringStandardRuleResponse.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringStandardRuleResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CALCULATED_FIELDS = "calculatedFields";
  private List<CalculatedField> calculatedFields = null;

  public static final String JSON_PROPERTY_CASES = "cases";
  private List<SecurityMonitoringRuleCase> cases = null;

  public static final String JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS = "complianceSignalOptions";
  private CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATION_AUTHOR_ID = "creationAuthorId";
  private Long creationAuthorId;

  public static final String JSON_PROPERTY_CUSTOM_MESSAGE = "customMessage";
  private String customMessage;

  public static final String JSON_PROPERTY_CUSTOM_NAME = "customName";
  private String customName;

  public static final String JSON_PROPERTY_DEFAULT_TAGS = "defaultTags";
  private List<String> defaultTags = null;

  public static final String JSON_PROPERTY_DEPRECATION_DATE = "deprecationDate";
  private Long deprecationDate;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<SecurityMonitoringFilter> filters = null;

  public static final String JSON_PROPERTY_GROUP_SIGNALS_BY = "groupSignalsBy";
  private List<String> groupSignalsBy = null;

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
  private List<SecurityMonitoringStandardRuleQuery> queries = null;

  public static final String JSON_PROPERTY_REFERENCE_TABLES = "referenceTables";
  private List<SecurityMonitoringReferenceTable> referenceTables = null;

  public static final String JSON_PROPERTY_SCHEDULING_OPTIONS = "schedulingOptions";
  private JsonNullable<SecurityMonitoringSchedulingOptions> schedulingOptions =
      JsonNullable.<SecurityMonitoringSchedulingOptions>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_THIRD_PARTY_CASES = "thirdPartyCases";
  private List<SecurityMonitoringThirdPartyRuleCase> thirdPartyCases = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SecurityMonitoringRuleTypeRead type;

  public static final String JSON_PROPERTY_UPDATE_AUTHOR_ID = "updateAuthorId";
  private Long updateAuthorId;

  public static final String JSON_PROPERTY_UPDATED_AT = "updatedAt";
  private Long updatedAt;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Long version;

  public SecurityMonitoringStandardRuleResponse calculatedFields(
      List<CalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    for (CalculatedField item : calculatedFields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringStandardRuleResponse addCalculatedFieldsItem(
      CalculatedField calculatedFieldsItem) {
    if (this.calculatedFields == null) {
      this.calculatedFields = new ArrayList<>();
    }
    this.calculatedFields.add(calculatedFieldsItem);
    this.unparsed |= calculatedFieldsItem.unparsed;
    return this;
  }

  /**
   * Calculated fields. Only allowed for scheduled rules - in other words, when schedulingOptions is
   * also defined.
   *
   * @return calculatedFields
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CALCULATED_FIELDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<CalculatedField> getCalculatedFields() {
    return calculatedFields;
  }

  public void setCalculatedFields(List<CalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
  }

  public SecurityMonitoringStandardRuleResponse cases(List<SecurityMonitoringRuleCase> cases) {
    this.cases = cases;
    for (SecurityMonitoringRuleCase item : cases) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringStandardRuleResponse addCasesItem(SecurityMonitoringRuleCase casesItem) {
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

  public SecurityMonitoringStandardRuleResponse complianceSignalOptions(
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
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CloudConfigurationRuleComplianceSignalOptions getComplianceSignalOptions() {
    return complianceSignalOptions;
  }

  public void setComplianceSignalOptions(
      CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions) {
    this.complianceSignalOptions = complianceSignalOptions;
  }

  public SecurityMonitoringStandardRuleResponse createdAt(Long createdAt) {
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

  public SecurityMonitoringStandardRuleResponse creationAuthorId(Long creationAuthorId) {
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

  public SecurityMonitoringStandardRuleResponse customMessage(String customMessage) {
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

  public SecurityMonitoringStandardRuleResponse customName(String customName) {
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

  public SecurityMonitoringStandardRuleResponse defaultTags(List<String> defaultTags) {
    this.defaultTags = defaultTags;
    return this;
  }

  public SecurityMonitoringStandardRuleResponse addDefaultTagsItem(String defaultTagsItem) {
    if (this.defaultTags == null) {
      this.defaultTags = new ArrayList<>();
    }
    this.defaultTags.add(defaultTagsItem);
    return this;
  }

  /**
   * Default Tags for default rules (included in tags)
   *
   * @return defaultTags
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDefaultTags() {
    return defaultTags;
  }

  public void setDefaultTags(List<String> defaultTags) {
    this.defaultTags = defaultTags;
  }

  public SecurityMonitoringStandardRuleResponse deprecationDate(Long deprecationDate) {
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

  public SecurityMonitoringStandardRuleResponse filters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
    for (SecurityMonitoringFilter item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringStandardRuleResponse addFiltersItem(
      SecurityMonitoringFilter filtersItem) {
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

  public SecurityMonitoringStandardRuleResponse groupSignalsBy(List<String> groupSignalsBy) {
    this.groupSignalsBy = groupSignalsBy;
    return this;
  }

  public SecurityMonitoringStandardRuleResponse addGroupSignalsByItem(String groupSignalsByItem) {
    if (this.groupSignalsBy == null) {
      this.groupSignalsBy = new ArrayList<>();
    }
    this.groupSignalsBy.add(groupSignalsByItem);
    return this;
  }

  /**
   * Additional grouping to perform on top of the existing groups in the query section. Must be a
   * subset of the existing groups.
   *
   * @return groupSignalsBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_SIGNALS_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroupSignalsBy() {
    return groupSignalsBy;
  }

  public void setGroupSignalsBy(List<String> groupSignalsBy) {
    this.groupSignalsBy = groupSignalsBy;
  }

  public SecurityMonitoringStandardRuleResponse hasExtendedTitle(Boolean hasExtendedTitle) {
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

  public SecurityMonitoringStandardRuleResponse id(String id) {
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

  public SecurityMonitoringStandardRuleResponse isDefault(Boolean isDefault) {
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

  public SecurityMonitoringStandardRuleResponse isDeleted(Boolean isDeleted) {
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

  public SecurityMonitoringStandardRuleResponse isEnabled(Boolean isEnabled) {
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

  public SecurityMonitoringStandardRuleResponse message(String message) {
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

  public SecurityMonitoringStandardRuleResponse name(String name) {
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

  public SecurityMonitoringStandardRuleResponse options(SecurityMonitoringRuleOptions options) {
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

  public SecurityMonitoringStandardRuleResponse queries(
      List<SecurityMonitoringStandardRuleQuery> queries) {
    this.queries = queries;
    for (SecurityMonitoringStandardRuleQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringStandardRuleResponse addQueriesItem(
      SecurityMonitoringStandardRuleQuery queriesItem) {
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
  public List<SecurityMonitoringStandardRuleQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<SecurityMonitoringStandardRuleQuery> queries) {
    this.queries = queries;
  }

  public SecurityMonitoringStandardRuleResponse referenceTables(
      List<SecurityMonitoringReferenceTable> referenceTables) {
    this.referenceTables = referenceTables;
    for (SecurityMonitoringReferenceTable item : referenceTables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringStandardRuleResponse addReferenceTablesItem(
      SecurityMonitoringReferenceTable referenceTablesItem) {
    if (this.referenceTables == null) {
      this.referenceTables = new ArrayList<>();
    }
    this.referenceTables.add(referenceTablesItem);
    this.unparsed |= referenceTablesItem.unparsed;
    return this;
  }

  /**
   * Reference tables for the rule.
   *
   * @return referenceTables
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_TABLES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringReferenceTable> getReferenceTables() {
    return referenceTables;
  }

  public void setReferenceTables(List<SecurityMonitoringReferenceTable> referenceTables) {
    this.referenceTables = referenceTables;
  }

  public SecurityMonitoringStandardRuleResponse schedulingOptions(
      SecurityMonitoringSchedulingOptions schedulingOptions) {
    this.schedulingOptions =
        JsonNullable.<SecurityMonitoringSchedulingOptions>of(schedulingOptions);
    return this;
  }

  /**
   * Options for scheduled rules. When this field is present, the rule runs based on the schedule.
   * When absent, it runs real-time on ingested logs.
   *
   * @return schedulingOptions
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public SecurityMonitoringSchedulingOptions getSchedulingOptions() {
    return schedulingOptions.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SCHEDULING_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<SecurityMonitoringSchedulingOptions> getSchedulingOptions_JsonNullable() {
    return schedulingOptions;
  }

  @JsonProperty(JSON_PROPERTY_SCHEDULING_OPTIONS)
  public void setSchedulingOptions_JsonNullable(
      JsonNullable<SecurityMonitoringSchedulingOptions> schedulingOptions) {
    this.schedulingOptions = schedulingOptions;
  }

  public void setSchedulingOptions(SecurityMonitoringSchedulingOptions schedulingOptions) {
    this.schedulingOptions =
        JsonNullable.<SecurityMonitoringSchedulingOptions>of(schedulingOptions);
  }

  public SecurityMonitoringStandardRuleResponse tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SecurityMonitoringStandardRuleResponse addTagsItem(String tagsItem) {
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

  public SecurityMonitoringStandardRuleResponse thirdPartyCases(
      List<SecurityMonitoringThirdPartyRuleCase> thirdPartyCases) {
    this.thirdPartyCases = thirdPartyCases;
    for (SecurityMonitoringThirdPartyRuleCase item : thirdPartyCases) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringStandardRuleResponse addThirdPartyCasesItem(
      SecurityMonitoringThirdPartyRuleCase thirdPartyCasesItem) {
    if (this.thirdPartyCases == null) {
      this.thirdPartyCases = new ArrayList<>();
    }
    this.thirdPartyCases.add(thirdPartyCasesItem);
    this.unparsed |= thirdPartyCasesItem.unparsed;
    return this;
  }

  /**
   * Cases for generating signals from third-party rules. Only available for third-party rules.
   *
   * @return thirdPartyCases
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringThirdPartyRuleCase> getThirdPartyCases() {
    return thirdPartyCases;
  }

  public void setThirdPartyCases(List<SecurityMonitoringThirdPartyRuleCase> thirdPartyCases) {
    this.thirdPartyCases = thirdPartyCases;
  }

  public SecurityMonitoringStandardRuleResponse type(SecurityMonitoringRuleTypeRead type) {
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
  public SecurityMonitoringRuleTypeRead getType() {
    return type;
  }

  public void setType(SecurityMonitoringRuleTypeRead type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public SecurityMonitoringStandardRuleResponse updateAuthorId(Long updateAuthorId) {
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

  public SecurityMonitoringStandardRuleResponse updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The date the rule was last updated, in milliseconds.
   *
   * @return updatedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public SecurityMonitoringStandardRuleResponse version(Long version) {
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
   * @return SecurityMonitoringStandardRuleResponse
   */
  @JsonAnySetter
  public SecurityMonitoringStandardRuleResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringStandardRuleResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringStandardRuleResponse securityMonitoringStandardRuleResponse =
        (SecurityMonitoringStandardRuleResponse) o;
    return Objects.equals(
            this.calculatedFields, securityMonitoringStandardRuleResponse.calculatedFields)
        && Objects.equals(this.cases, securityMonitoringStandardRuleResponse.cases)
        && Objects.equals(
            this.complianceSignalOptions,
            securityMonitoringStandardRuleResponse.complianceSignalOptions)
        && Objects.equals(this.createdAt, securityMonitoringStandardRuleResponse.createdAt)
        && Objects.equals(
            this.creationAuthorId, securityMonitoringStandardRuleResponse.creationAuthorId)
        && Objects.equals(this.customMessage, securityMonitoringStandardRuleResponse.customMessage)
        && Objects.equals(this.customName, securityMonitoringStandardRuleResponse.customName)
        && Objects.equals(this.defaultTags, securityMonitoringStandardRuleResponse.defaultTags)
        && Objects.equals(
            this.deprecationDate, securityMonitoringStandardRuleResponse.deprecationDate)
        && Objects.equals(this.filters, securityMonitoringStandardRuleResponse.filters)
        && Objects.equals(
            this.groupSignalsBy, securityMonitoringStandardRuleResponse.groupSignalsBy)
        && Objects.equals(
            this.hasExtendedTitle, securityMonitoringStandardRuleResponse.hasExtendedTitle)
        && Objects.equals(this.id, securityMonitoringStandardRuleResponse.id)
        && Objects.equals(this.isDefault, securityMonitoringStandardRuleResponse.isDefault)
        && Objects.equals(this.isDeleted, securityMonitoringStandardRuleResponse.isDeleted)
        && Objects.equals(this.isEnabled, securityMonitoringStandardRuleResponse.isEnabled)
        && Objects.equals(this.message, securityMonitoringStandardRuleResponse.message)
        && Objects.equals(this.name, securityMonitoringStandardRuleResponse.name)
        && Objects.equals(this.options, securityMonitoringStandardRuleResponse.options)
        && Objects.equals(this.queries, securityMonitoringStandardRuleResponse.queries)
        && Objects.equals(
            this.referenceTables, securityMonitoringStandardRuleResponse.referenceTables)
        && Objects.equals(
            this.schedulingOptions, securityMonitoringStandardRuleResponse.schedulingOptions)
        && Objects.equals(this.tags, securityMonitoringStandardRuleResponse.tags)
        && Objects.equals(
            this.thirdPartyCases, securityMonitoringStandardRuleResponse.thirdPartyCases)
        && Objects.equals(this.type, securityMonitoringStandardRuleResponse.type)
        && Objects.equals(
            this.updateAuthorId, securityMonitoringStandardRuleResponse.updateAuthorId)
        && Objects.equals(this.updatedAt, securityMonitoringStandardRuleResponse.updatedAt)
        && Objects.equals(this.version, securityMonitoringStandardRuleResponse.version)
        && Objects.equals(
            this.additionalProperties, securityMonitoringStandardRuleResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        calculatedFields,
        cases,
        complianceSignalOptions,
        createdAt,
        creationAuthorId,
        customMessage,
        customName,
        defaultTags,
        deprecationDate,
        filters,
        groupSignalsBy,
        hasExtendedTitle,
        id,
        isDefault,
        isDeleted,
        isEnabled,
        message,
        name,
        options,
        queries,
        referenceTables,
        schedulingOptions,
        tags,
        thirdPartyCases,
        type,
        updateAuthorId,
        updatedAt,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringStandardRuleResponse {\n");
    sb.append("    calculatedFields: ").append(toIndentedString(calculatedFields)).append("\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    complianceSignalOptions: ")
        .append(toIndentedString(complianceSignalOptions))
        .append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    creationAuthorId: ").append(toIndentedString(creationAuthorId)).append("\n");
    sb.append("    customMessage: ").append(toIndentedString(customMessage)).append("\n");
    sb.append("    customName: ").append(toIndentedString(customName)).append("\n");
    sb.append("    defaultTags: ").append(toIndentedString(defaultTags)).append("\n");
    sb.append("    deprecationDate: ").append(toIndentedString(deprecationDate)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    groupSignalsBy: ").append(toIndentedString(groupSignalsBy)).append("\n");
    sb.append("    hasExtendedTitle: ").append(toIndentedString(hasExtendedTitle)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    isDeleted: ").append(toIndentedString(isDeleted)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    referenceTables: ").append(toIndentedString(referenceTables)).append("\n");
    sb.append("    schedulingOptions: ").append(toIndentedString(schedulingOptions)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thirdPartyCases: ").append(toIndentedString(thirdPartyCases)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    updateAuthorId: ").append(toIndentedString(updateAuthorId)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
