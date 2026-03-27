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
   * <p>Create a new rule.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_CALCULATED_FIELDS,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_CASES,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_FILTERS,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_GROUP_SIGNALS_BY,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_HAS_EXTENDED_TITLE,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_IS_ENABLED,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_MESSAGE,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_NAME,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_OPTIONS,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_QUERIES,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_REFERENCE_TABLES,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_SCHEDULING_OPTIONS,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_TAGS,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_THIRD_PARTY_CASES,
  SecurityMonitoringStandardRuleCreatePayload.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringStandardRuleCreatePayload {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CALCULATED_FIELDS = "calculatedFields";
  private List<CalculatedField> calculatedFields = null;

  public static final String JSON_PROPERTY_CASES = "cases";
  private List<SecurityMonitoringRuleCaseCreate> cases = new ArrayList<>();

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
  private List<SecurityMonitoringStandardRuleQuery> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_REFERENCE_TABLES = "referenceTables";
  private List<SecurityMonitoringReferenceTable> referenceTables = null;

  public static final String JSON_PROPERTY_SCHEDULING_OPTIONS = "schedulingOptions";
  private JsonNullable<SecurityMonitoringSchedulingOptions> schedulingOptions = JsonNullable.<SecurityMonitoringSchedulingOptions>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_THIRD_PARTY_CASES = "thirdPartyCases";
  private List<SecurityMonitoringThirdPartyRuleCaseCreate> thirdPartyCases = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private SecurityMonitoringRuleTypeCreate type;

  public SecurityMonitoringStandardRuleCreatePayload() {}

  @JsonCreator
  public SecurityMonitoringStandardRuleCreatePayload(
            @JsonProperty(required=true, value=JSON_PROPERTY_CASES)List<SecurityMonitoringRuleCaseCreate> cases,
            @JsonProperty(required=true, value=JSON_PROPERTY_IS_ENABLED)Boolean isEnabled,
            @JsonProperty(required=true, value=JSON_PROPERTY_MESSAGE)String message,
            @JsonProperty(required=true, value=JSON_PROPERTY_NAME)String name,
            @JsonProperty(required=true, value=JSON_PROPERTY_OPTIONS)SecurityMonitoringRuleOptions options,
            @JsonProperty(required=true, value=JSON_PROPERTY_QUERIES)List<SecurityMonitoringStandardRuleQuery> queries) {
        this.cases = cases;
        this.isEnabled = isEnabled;
        this.message = message;
        this.name = name;
        this.options = options;
        this.unparsed |= options.unparsed;
        this.queries = queries;
  }
  public SecurityMonitoringStandardRuleCreatePayload calculatedFields(List<CalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    for (CalculatedField item : calculatedFields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SecurityMonitoringStandardRuleCreatePayload addCalculatedFieldsItem(CalculatedField calculatedFieldsItem) {
    if (this.calculatedFields == null) {
      this.calculatedFields = new ArrayList<>();
    }
    this.calculatedFields.add(calculatedFieldsItem);
    this.unparsed |= calculatedFieldsItem.unparsed;
    return this;
  }

  /**
   * <p>Calculated fields. Only allowed for scheduled rules - in other words, when schedulingOptions is also defined.</p>
   * @return calculatedFields
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CALCULATED_FIELDS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<CalculatedField> getCalculatedFields() {
        return calculatedFields;
      }
  public void setCalculatedFields(List<CalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
  }
  public SecurityMonitoringStandardRuleCreatePayload cases(List<SecurityMonitoringRuleCaseCreate> cases) {
    this.cases = cases;
    for (SecurityMonitoringRuleCaseCreate item : cases) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SecurityMonitoringStandardRuleCreatePayload addCasesItem(SecurityMonitoringRuleCaseCreate casesItem) {
    this.cases.add(casesItem);
    this.unparsed |= casesItem.unparsed;
    return this;
  }

  /**
   * <p>Cases for generating signals.</p>
   * @return cases
  **/
      @JsonProperty(JSON_PROPERTY_CASES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<SecurityMonitoringRuleCaseCreate> getCases() {
        return cases;
      }
  public void setCases(List<SecurityMonitoringRuleCaseCreate> cases) {
    this.cases = cases;
  }
  public SecurityMonitoringStandardRuleCreatePayload filters(List<SecurityMonitoringFilter> filters) {
    this.filters = filters;
    for (SecurityMonitoringFilter item : filters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SecurityMonitoringStandardRuleCreatePayload addFiltersItem(SecurityMonitoringFilter filtersItem) {
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
  }
  public SecurityMonitoringStandardRuleCreatePayload groupSignalsBy(List<String> groupSignalsBy) {
    this.groupSignalsBy = groupSignalsBy;
    return this;
  }
  public SecurityMonitoringStandardRuleCreatePayload addGroupSignalsByItem(String groupSignalsByItem) {
    if (this.groupSignalsBy == null) {
      this.groupSignalsBy = new ArrayList<>();
    }
    this.groupSignalsBy.add(groupSignalsByItem);
    return this;
  }

  /**
   * <p>Additional grouping to perform on top of the existing groups in the query section. Must be a subset of the existing groups.</p>
   * @return groupSignalsBy
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_GROUP_SIGNALS_BY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getGroupSignalsBy() {
        return groupSignalsBy;
      }
  public void setGroupSignalsBy(List<String> groupSignalsBy) {
    this.groupSignalsBy = groupSignalsBy;
  }
  public SecurityMonitoringStandardRuleCreatePayload hasExtendedTitle(Boolean hasExtendedTitle) {
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
  public SecurityMonitoringStandardRuleCreatePayload isEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
    return this;
  }

  /**
   * <p>Whether the rule is enabled.</p>
   * @return isEnabled
  **/
      @JsonProperty(JSON_PROPERTY_IS_ENABLED)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public Boolean getIsEnabled() {
        return isEnabled;
      }
  public void setIsEnabled(Boolean isEnabled) {
    this.isEnabled = isEnabled;
  }
  public SecurityMonitoringStandardRuleCreatePayload message(String message) {
    this.message = message;
    return this;
  }

  /**
   * <p>Message for generated signals.</p>
   * @return message
  **/
      @JsonProperty(JSON_PROPERTY_MESSAGE)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getMessage() {
        return message;
      }
  public void setMessage(String message) {
    this.message = message;
  }
  public SecurityMonitoringStandardRuleCreatePayload name(String name) {
    this.name = name;
    return this;
  }

  /**
   * <p>The name of the rule.</p>
   * @return name
  **/
      @JsonProperty(JSON_PROPERTY_NAME)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getName() {
        return name;
      }
  public void setName(String name) {
    this.name = name;
  }
  public SecurityMonitoringStandardRuleCreatePayload options(SecurityMonitoringRuleOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * <p>Options.</p>
   * @return options
  **/
      @JsonProperty(JSON_PROPERTY_OPTIONS)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public SecurityMonitoringRuleOptions getOptions() {
        return options;
      }
  public void setOptions(SecurityMonitoringRuleOptions options) {
    this.options = options;
  }
  public SecurityMonitoringStandardRuleCreatePayload queries(List<SecurityMonitoringStandardRuleQuery> queries) {
    this.queries = queries;
    for (SecurityMonitoringStandardRuleQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SecurityMonitoringStandardRuleCreatePayload addQueriesItem(SecurityMonitoringStandardRuleQuery queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * <p>Queries for selecting logs which are part of the rule.</p>
   * @return queries
  **/
      @JsonProperty(JSON_PROPERTY_QUERIES)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public List<SecurityMonitoringStandardRuleQuery> getQueries() {
        return queries;
      }
  public void setQueries(List<SecurityMonitoringStandardRuleQuery> queries) {
    this.queries = queries;
  }
  public SecurityMonitoringStandardRuleCreatePayload referenceTables(List<SecurityMonitoringReferenceTable> referenceTables) {
    this.referenceTables = referenceTables;
    for (SecurityMonitoringReferenceTable item : referenceTables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SecurityMonitoringStandardRuleCreatePayload addReferenceTablesItem(SecurityMonitoringReferenceTable referenceTablesItem) {
    if (this.referenceTables == null) {
      this.referenceTables = new ArrayList<>();
    }
    this.referenceTables.add(referenceTablesItem);
    this.unparsed |= referenceTablesItem.unparsed;
    return this;
  }

  /**
   * <p>Reference tables for the rule.</p>
   * @return referenceTables
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REFERENCE_TABLES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SecurityMonitoringReferenceTable> getReferenceTables() {
        return referenceTables;
      }
  public void setReferenceTables(List<SecurityMonitoringReferenceTable> referenceTables) {
    this.referenceTables = referenceTables;
  }
  public SecurityMonitoringStandardRuleCreatePayload schedulingOptions(SecurityMonitoringSchedulingOptions schedulingOptions) {
    this.schedulingOptions = JsonNullable.<SecurityMonitoringSchedulingOptions>of(schedulingOptions);
    return this;
  }

  /**
   * <p>Options for scheduled rules. When this field is present, the rule runs based on the schedule. When absent, it runs real-time on ingested logs.</p>
   * @return schedulingOptions
  **/
      @jakarta.annotation.Nullable
      @JsonIgnore
      public SecurityMonitoringSchedulingOptions getSchedulingOptions() {
        return schedulingOptions.orElse(null);
      }
  @JsonProperty(JSON_PROPERTY_SCHEDULING_OPTIONS)
  @JsonInclude(
    value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<SecurityMonitoringSchedulingOptions> getSchedulingOptions_JsonNullable() {
    return schedulingOptions;
  }
  @JsonProperty(JSON_PROPERTY_SCHEDULING_OPTIONS)public void setSchedulingOptions_JsonNullable(JsonNullable<SecurityMonitoringSchedulingOptions> schedulingOptions) {
    this.schedulingOptions = schedulingOptions;
  }
  public void setSchedulingOptions(SecurityMonitoringSchedulingOptions schedulingOptions) {
    this.schedulingOptions = JsonNullable.<SecurityMonitoringSchedulingOptions>of(schedulingOptions);
  }
  public SecurityMonitoringStandardRuleCreatePayload tags(List<String> tags) {
    this.tags = tags;
    return this;
  }
  public SecurityMonitoringStandardRuleCreatePayload addTagsItem(String tagsItem) {
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
  public SecurityMonitoringStandardRuleCreatePayload thirdPartyCases(List<SecurityMonitoringThirdPartyRuleCaseCreate> thirdPartyCases) {
    this.thirdPartyCases = thirdPartyCases;
    for (SecurityMonitoringThirdPartyRuleCaseCreate item : thirdPartyCases) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SecurityMonitoringStandardRuleCreatePayload addThirdPartyCasesItem(SecurityMonitoringThirdPartyRuleCaseCreate thirdPartyCasesItem) {
    if (this.thirdPartyCases == null) {
      this.thirdPartyCases = new ArrayList<>();
    }
    this.thirdPartyCases.add(thirdPartyCasesItem);
    this.unparsed |= thirdPartyCasesItem.unparsed;
    return this;
  }

  /**
   * <p>Cases for generating signals from third-party rules. Only available for third-party rules.</p>
   * @return thirdPartyCases
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_THIRD_PARTY_CASES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SecurityMonitoringThirdPartyRuleCaseCreate> getThirdPartyCases() {
        return thirdPartyCases;
      }
  public void setThirdPartyCases(List<SecurityMonitoringThirdPartyRuleCaseCreate> thirdPartyCases) {
    this.thirdPartyCases = thirdPartyCases;
  }
  public SecurityMonitoringStandardRuleCreatePayload type(SecurityMonitoringRuleTypeCreate type) {
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
      public SecurityMonitoringRuleTypeCreate getType() {
        return type;
      }
  public void setType(SecurityMonitoringRuleTypeCreate type) {
    if (!type.isValid()) {
        this.unparsed = true;
    }
    this.type = type;
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
   * @return SecurityMonitoringStandardRuleCreatePayload
   */
  @JsonAnySetter
  public SecurityMonitoringStandardRuleCreatePayload putAdditionalProperty(String key, Object value) {
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
   * Return true if this SecurityMonitoringStandardRuleCreatePayload object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringStandardRuleCreatePayload securityMonitoringStandardRuleCreatePayload = (SecurityMonitoringStandardRuleCreatePayload) o;
    return Objects.equals(this.calculatedFields, securityMonitoringStandardRuleCreatePayload.calculatedFields) && Objects.equals(this.cases, securityMonitoringStandardRuleCreatePayload.cases) && Objects.equals(this.filters, securityMonitoringStandardRuleCreatePayload.filters) && Objects.equals(this.groupSignalsBy, securityMonitoringStandardRuleCreatePayload.groupSignalsBy) && Objects.equals(this.hasExtendedTitle, securityMonitoringStandardRuleCreatePayload.hasExtendedTitle) && Objects.equals(this.isEnabled, securityMonitoringStandardRuleCreatePayload.isEnabled) && Objects.equals(this.message, securityMonitoringStandardRuleCreatePayload.message) && Objects.equals(this.name, securityMonitoringStandardRuleCreatePayload.name) && Objects.equals(this.options, securityMonitoringStandardRuleCreatePayload.options) && Objects.equals(this.queries, securityMonitoringStandardRuleCreatePayload.queries) && Objects.equals(this.referenceTables, securityMonitoringStandardRuleCreatePayload.referenceTables) && Objects.equals(this.schedulingOptions, securityMonitoringStandardRuleCreatePayload.schedulingOptions) && Objects.equals(this.tags, securityMonitoringStandardRuleCreatePayload.tags) && Objects.equals(this.thirdPartyCases, securityMonitoringStandardRuleCreatePayload.thirdPartyCases) && Objects.equals(this.type, securityMonitoringStandardRuleCreatePayload.type) && Objects.equals(this.additionalProperties, securityMonitoringStandardRuleCreatePayload.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(calculatedFields,cases,filters,groupSignalsBy,hasExtendedTitle,isEnabled,message,name,options,queries,referenceTables,schedulingOptions,tags,thirdPartyCases,type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringStandardRuleCreatePayload {\n");
    sb.append("    calculatedFields: ").append(toIndentedString(calculatedFields)).append("\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
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
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
