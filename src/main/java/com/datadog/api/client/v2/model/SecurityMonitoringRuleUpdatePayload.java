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

/** Update an existing rule. */
@JsonPropertyOrder({
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_CALCULATED_FIELDS,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_CASES,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_CUSTOM_MESSAGE,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_CUSTOM_NAME,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_FILTERS,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_GROUP_SIGNALS_BY,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_HAS_EXTENDED_TITLE,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_IS_ENABLED,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_MESSAGE,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_NAME,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_OPTIONS,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_QUERIES,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_REFERENCE_TABLES,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_SCHEDULING_OPTIONS,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_TAGS,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_THIRD_PARTY_CASES,
  SecurityMonitoringRuleUpdatePayload.JSON_PROPERTY_VERSION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleUpdatePayload {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CALCULATED_FIELDS = "calculatedFields";
  private List<CalculatedField> calculatedFields = null;

  public static final String JSON_PROPERTY_CASES = "cases";
  private List<SecurityMonitoringRuleCase> cases = null;

  public static final String JSON_PROPERTY_COMPLIANCE_SIGNAL_OPTIONS = "complianceSignalOptions";
  private CloudConfigurationRuleComplianceSignalOptions complianceSignalOptions;

  public static final String JSON_PROPERTY_CUSTOM_MESSAGE = "customMessage";
  private String customMessage;

  public static final String JSON_PROPERTY_CUSTOM_NAME = "customName";
  private String customName;

  public static final String JSON_PROPERTY_FILTERS = "filters";
  private List<SecurityMonitoringFilter> filters = null;

  public static final String JSON_PROPERTY_GROUP_SIGNALS_BY = "groupSignalsBy";
  private List<String> groupSignalsBy = null;

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
  private List<SecurityMonitoringRuleQuery> queries = null;

  public static final String JSON_PROPERTY_REFERENCE_TABLES = "referenceTables";
  private List<SecurityMonitoringReferenceTable> referenceTables = null;

  public static final String JSON_PROPERTY_SCHEDULING_OPTIONS = "schedulingOptions";
  private JsonNullable<SecurityMonitoringSchedulingOptions> schedulingOptions =
      JsonNullable.<SecurityMonitoringSchedulingOptions>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_THIRD_PARTY_CASES = "thirdPartyCases";
  private List<SecurityMonitoringThirdPartyRuleCase> thirdPartyCases = null;

  public static final String JSON_PROPERTY_VERSION = "version";
  private Integer version;

  public SecurityMonitoringRuleUpdatePayload calculatedFields(
      List<CalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    for (CalculatedField item : calculatedFields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringRuleUpdatePayload addCalculatedFieldsItem(
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

  public SecurityMonitoringRuleUpdatePayload cases(List<SecurityMonitoringRuleCase> cases) {
    this.cases = cases;
    for (SecurityMonitoringRuleCase item : cases) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringRuleUpdatePayload addCasesItem(SecurityMonitoringRuleCase casesItem) {
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

  public SecurityMonitoringRuleUpdatePayload complianceSignalOptions(
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

  public SecurityMonitoringRuleUpdatePayload customMessage(String customMessage) {
    this.customMessage = customMessage;
    return this;
  }

  /**
   * Custom/Overridden Message for generated signals (used in case of Default rule update).
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

  public SecurityMonitoringRuleUpdatePayload customName(String customName) {
    this.customName = customName;
    return this;
  }

  /**
   * Custom/Overridden name (used in case of Default rule update).
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

  public SecurityMonitoringRuleUpdatePayload filters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
    for (SecurityMonitoringFilter item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringRuleUpdatePayload addFiltersItem(SecurityMonitoringFilter filtersItem) {
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

  public SecurityMonitoringRuleUpdatePayload groupSignalsBy(List<String> groupSignalsBy) {
    this.groupSignalsBy = groupSignalsBy;
    return this;
  }

  public SecurityMonitoringRuleUpdatePayload addGroupSignalsByItem(String groupSignalsByItem) {
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

  public SecurityMonitoringRuleUpdatePayload hasExtendedTitle(Boolean hasExtendedTitle) {
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

  public SecurityMonitoringRuleUpdatePayload isEnabled(Boolean isEnabled) {
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

  public SecurityMonitoringRuleUpdatePayload message(String message) {
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

  public SecurityMonitoringRuleUpdatePayload name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the rule.
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

  public SecurityMonitoringRuleUpdatePayload options(SecurityMonitoringRuleOptions options) {
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

  public SecurityMonitoringRuleUpdatePayload queries(List<SecurityMonitoringRuleQuery> queries) {
    this.queries = queries;
    for (SecurityMonitoringRuleQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringRuleUpdatePayload addQueriesItem(
      SecurityMonitoringRuleQuery queriesItem) {
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
  public List<SecurityMonitoringRuleQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<SecurityMonitoringRuleQuery> queries) {
    this.queries = queries;
  }

  public SecurityMonitoringRuleUpdatePayload referenceTables(
      List<SecurityMonitoringReferenceTable> referenceTables) {
    this.referenceTables = referenceTables;
    for (SecurityMonitoringReferenceTable item : referenceTables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringRuleUpdatePayload addReferenceTablesItem(
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

  public SecurityMonitoringRuleUpdatePayload schedulingOptions(
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

  public SecurityMonitoringRuleUpdatePayload tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public SecurityMonitoringRuleUpdatePayload addTagsItem(String tagsItem) {
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

  public SecurityMonitoringRuleUpdatePayload thirdPartyCases(
      List<SecurityMonitoringThirdPartyRuleCase> thirdPartyCases) {
    this.thirdPartyCases = thirdPartyCases;
    for (SecurityMonitoringThirdPartyRuleCase item : thirdPartyCases) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringRuleUpdatePayload addThirdPartyCasesItem(
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

  public SecurityMonitoringRuleUpdatePayload version(Integer version) {
    this.version = version;
    return this;
  }

  /**
   * The version of the rule being updated. maximum: 2147483647
   *
   * @return version
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getVersion() {
    return version;
  }

  public void setVersion(Integer version) {
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
   * @return SecurityMonitoringRuleUpdatePayload
   */
  @JsonAnySetter
  public SecurityMonitoringRuleUpdatePayload putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringRuleUpdatePayload object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleUpdatePayload securityMonitoringRuleUpdatePayload =
        (SecurityMonitoringRuleUpdatePayload) o;
    return Objects.equals(
            this.calculatedFields, securityMonitoringRuleUpdatePayload.calculatedFields)
        && Objects.equals(this.cases, securityMonitoringRuleUpdatePayload.cases)
        && Objects.equals(
            this.complianceSignalOptions,
            securityMonitoringRuleUpdatePayload.complianceSignalOptions)
        && Objects.equals(this.customMessage, securityMonitoringRuleUpdatePayload.customMessage)
        && Objects.equals(this.customName, securityMonitoringRuleUpdatePayload.customName)
        && Objects.equals(this.filters, securityMonitoringRuleUpdatePayload.filters)
        && Objects.equals(this.groupSignalsBy, securityMonitoringRuleUpdatePayload.groupSignalsBy)
        && Objects.equals(
            this.hasExtendedTitle, securityMonitoringRuleUpdatePayload.hasExtendedTitle)
        && Objects.equals(this.isEnabled, securityMonitoringRuleUpdatePayload.isEnabled)
        && Objects.equals(this.message, securityMonitoringRuleUpdatePayload.message)
        && Objects.equals(this.name, securityMonitoringRuleUpdatePayload.name)
        && Objects.equals(this.options, securityMonitoringRuleUpdatePayload.options)
        && Objects.equals(this.queries, securityMonitoringRuleUpdatePayload.queries)
        && Objects.equals(this.referenceTables, securityMonitoringRuleUpdatePayload.referenceTables)
        && Objects.equals(
            this.schedulingOptions, securityMonitoringRuleUpdatePayload.schedulingOptions)
        && Objects.equals(this.tags, securityMonitoringRuleUpdatePayload.tags)
        && Objects.equals(this.thirdPartyCases, securityMonitoringRuleUpdatePayload.thirdPartyCases)
        && Objects.equals(this.version, securityMonitoringRuleUpdatePayload.version)
        && Objects.equals(
            this.additionalProperties, securityMonitoringRuleUpdatePayload.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        calculatedFields,
        cases,
        complianceSignalOptions,
        customMessage,
        customName,
        filters,
        groupSignalsBy,
        hasExtendedTitle,
        isEnabled,
        message,
        name,
        options,
        queries,
        referenceTables,
        schedulingOptions,
        tags,
        thirdPartyCases,
        version,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleUpdatePayload {\n");
    sb.append("    calculatedFields: ").append(toIndentedString(calculatedFields)).append("\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    complianceSignalOptions: ")
        .append(toIndentedString(complianceSignalOptions))
        .append("\n");
    sb.append("    customMessage: ").append(toIndentedString(customMessage)).append("\n");
    sb.append("    customName: ").append(toIndentedString(customName)).append("\n");
    sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
    sb.append("    groupSignalsBy: ").append(toIndentedString(groupSignalsBy)).append("\n");
    sb.append("    hasExtendedTitle: ").append(toIndentedString(hasExtendedTitle)).append("\n");
    sb.append("    isEnabled: ").append(toIndentedString(isEnabled)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    referenceTables: ").append(toIndentedString(referenceTables)).append("\n");
    sb.append("    schedulingOptions: ").append(toIndentedString(schedulingOptions)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thirdPartyCases: ").append(toIndentedString(thirdPartyCases)).append("\n");
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
