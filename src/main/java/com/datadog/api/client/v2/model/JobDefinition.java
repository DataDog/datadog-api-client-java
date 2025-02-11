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

/** Definition of a historical job. */
@JsonPropertyOrder({
  JobDefinition.JSON_PROPERTY_CALCULATED_FIELDS,
  JobDefinition.JSON_PROPERTY_CASES,
  JobDefinition.JSON_PROPERTY_FROM,
  JobDefinition.JSON_PROPERTY_GROUP_SIGNALS_BY,
  JobDefinition.JSON_PROPERTY_INDEX,
  JobDefinition.JSON_PROPERTY_MESSAGE,
  JobDefinition.JSON_PROPERTY_NAME,
  JobDefinition.JSON_PROPERTY_OPTIONS,
  JobDefinition.JSON_PROPERTY_QUERIES,
  JobDefinition.JSON_PROPERTY_REFERENCE_TABLES,
  JobDefinition.JSON_PROPERTY_TAGS,
  JobDefinition.JSON_PROPERTY_THIRD_PARTY_CASES,
  JobDefinition.JSON_PROPERTY_TO,
  JobDefinition.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JobDefinition {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CALCULATED_FIELDS = "calculatedFields";
  private List<CalculatedField> calculatedFields = null;

  public static final String JSON_PROPERTY_CASES = "cases";
  private List<SecurityMonitoringRuleCaseCreate> cases = new ArrayList<>();

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_GROUP_SIGNALS_BY = "groupSignalsBy";
  private List<String> groupSignalsBy = null;

  public static final String JSON_PROPERTY_INDEX = "index";
  private String index;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPTIONS = "options";
  private HistoricalJobOptions options;

  public static final String JSON_PROPERTY_QUERIES = "queries";
  private List<HistoricalJobQuery> queries = new ArrayList<>();

  public static final String JSON_PROPERTY_REFERENCE_TABLES = "referenceTables";
  private List<SecurityMonitoringReferenceTable> referenceTables = null;

  public static final String JSON_PROPERTY_TAGS = "tags";
  private List<String> tags = null;

  public static final String JSON_PROPERTY_THIRD_PARTY_CASES = "thirdPartyCases";
  private List<SecurityMonitoringThirdPartyRuleCaseCreate> thirdPartyCases = null;

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public static final String JSON_PROPERTY_TYPE = "type";
  private String type;

  public JobDefinition() {}

  @JsonCreator
  public JobDefinition(
      @JsonProperty(required = true, value = JSON_PROPERTY_CASES)
          List<SecurityMonitoringRuleCaseCreate> cases,
      @JsonProperty(required = true, value = JSON_PROPERTY_FROM) Long from,
      @JsonProperty(required = true, value = JSON_PROPERTY_INDEX) String index,
      @JsonProperty(required = true, value = JSON_PROPERTY_MESSAGE) String message,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_QUERIES)
          List<HistoricalJobQuery> queries,
      @JsonProperty(required = true, value = JSON_PROPERTY_TO) Long to) {
    this.cases = cases;
    this.from = from;
    this.index = index;
    this.message = message;
    this.name = name;
    this.queries = queries;
    this.to = to;
  }

  public JobDefinition calculatedFields(List<CalculatedField> calculatedFields) {
    this.calculatedFields = calculatedFields;
    for (CalculatedField item : calculatedFields) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public JobDefinition addCalculatedFieldsItem(CalculatedField calculatedFieldsItem) {
    if (this.calculatedFields == null) {
      this.calculatedFields = new ArrayList<>();
    }
    this.calculatedFields.add(calculatedFieldsItem);
    this.unparsed |= calculatedFieldsItem.unparsed;
    return this;
  }

  /**
   * Calculated fields.
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

  public JobDefinition cases(List<SecurityMonitoringRuleCaseCreate> cases) {
    this.cases = cases;
    for (SecurityMonitoringRuleCaseCreate item : cases) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public JobDefinition addCasesItem(SecurityMonitoringRuleCaseCreate casesItem) {
    this.cases.add(casesItem);
    this.unparsed |= casesItem.unparsed;
    return this;
  }

  /**
   * Cases used for generating job results.
   *
   * @return cases
   */
  @JsonProperty(JSON_PROPERTY_CASES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityMonitoringRuleCaseCreate> getCases() {
    return cases;
  }

  public void setCases(List<SecurityMonitoringRuleCaseCreate> cases) {
    this.cases = cases;
  }

  public JobDefinition from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Starting time of data analyzed by the job.
   *
   * @return from
   */
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public JobDefinition groupSignalsBy(List<String> groupSignalsBy) {
    this.groupSignalsBy = groupSignalsBy;
    return this;
  }

  public JobDefinition addGroupSignalsByItem(String groupSignalsByItem) {
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

  public JobDefinition index(String index) {
    this.index = index;
    return this;
  }

  /**
   * Index used to load the data.
   *
   * @return index
   */
  @JsonProperty(JSON_PROPERTY_INDEX)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getIndex() {
    return index;
  }

  public void setIndex(String index) {
    this.index = index;
  }

  public JobDefinition message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message for generated results.
   *
   * @return message
   */
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public JobDefinition name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Job name.
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

  public JobDefinition options(HistoricalJobOptions options) {
    this.options = options;
    this.unparsed |= options.unparsed;
    return this;
  }

  /**
   * Job options.
   *
   * @return options
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPTIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HistoricalJobOptions getOptions() {
    return options;
  }

  public void setOptions(HistoricalJobOptions options) {
    this.options = options;
  }

  public JobDefinition queries(List<HistoricalJobQuery> queries) {
    this.queries = queries;
    for (HistoricalJobQuery item : queries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public JobDefinition addQueriesItem(HistoricalJobQuery queriesItem) {
    this.queries.add(queriesItem);
    this.unparsed |= queriesItem.unparsed;
    return this;
  }

  /**
   * Queries for selecting logs analyzed by the job.
   *
   * @return queries
   */
  @JsonProperty(JSON_PROPERTY_QUERIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<HistoricalJobQuery> getQueries() {
    return queries;
  }

  public void setQueries(List<HistoricalJobQuery> queries) {
    this.queries = queries;
  }

  public JobDefinition referenceTables(List<SecurityMonitoringReferenceTable> referenceTables) {
    this.referenceTables = referenceTables;
    for (SecurityMonitoringReferenceTable item : referenceTables) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public JobDefinition addReferenceTablesItem(
      SecurityMonitoringReferenceTable referenceTablesItem) {
    if (this.referenceTables == null) {
      this.referenceTables = new ArrayList<>();
    }
    this.referenceTables.add(referenceTablesItem);
    this.unparsed |= referenceTablesItem.unparsed;
    return this;
  }

  /**
   * Reference tables used in the queries.
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

  public JobDefinition tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public JobDefinition addTagsItem(String tagsItem) {
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

  public JobDefinition thirdPartyCases(
      List<SecurityMonitoringThirdPartyRuleCaseCreate> thirdPartyCases) {
    this.thirdPartyCases = thirdPartyCases;
    for (SecurityMonitoringThirdPartyRuleCaseCreate item : thirdPartyCases) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public JobDefinition addThirdPartyCasesItem(
      SecurityMonitoringThirdPartyRuleCaseCreate thirdPartyCasesItem) {
    if (this.thirdPartyCases == null) {
      this.thirdPartyCases = new ArrayList<>();
    }
    this.thirdPartyCases.add(thirdPartyCasesItem);
    this.unparsed |= thirdPartyCasesItem.unparsed;
    return this;
  }

  /**
   * Cases for generating results from third-party detection method. Only available for third-party
   * detection method.
   *
   * @return thirdPartyCases
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_THIRD_PARTY_CASES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SecurityMonitoringThirdPartyRuleCaseCreate> getThirdPartyCases() {
    return thirdPartyCases;
  }

  public void setThirdPartyCases(List<SecurityMonitoringThirdPartyRuleCaseCreate> thirdPartyCases) {
    this.thirdPartyCases = thirdPartyCases;
  }

  public JobDefinition to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * Ending time of data analyzed by the job.
   *
   * @return to
   */
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
  }

  public JobDefinition type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Job type.
   *
   * @return type
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
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
   * @return JobDefinition
   */
  @JsonAnySetter
  public JobDefinition putAdditionalProperty(String key, Object value) {
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

  /** Return true if this JobDefinition object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JobDefinition jobDefinition = (JobDefinition) o;
    return Objects.equals(this.calculatedFields, jobDefinition.calculatedFields)
        && Objects.equals(this.cases, jobDefinition.cases)
        && Objects.equals(this.from, jobDefinition.from)
        && Objects.equals(this.groupSignalsBy, jobDefinition.groupSignalsBy)
        && Objects.equals(this.index, jobDefinition.index)
        && Objects.equals(this.message, jobDefinition.message)
        && Objects.equals(this.name, jobDefinition.name)
        && Objects.equals(this.options, jobDefinition.options)
        && Objects.equals(this.queries, jobDefinition.queries)
        && Objects.equals(this.referenceTables, jobDefinition.referenceTables)
        && Objects.equals(this.tags, jobDefinition.tags)
        && Objects.equals(this.thirdPartyCases, jobDefinition.thirdPartyCases)
        && Objects.equals(this.to, jobDefinition.to)
        && Objects.equals(this.type, jobDefinition.type)
        && Objects.equals(this.additionalProperties, jobDefinition.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        calculatedFields,
        cases,
        from,
        groupSignalsBy,
        index,
        message,
        name,
        options,
        queries,
        referenceTables,
        tags,
        thirdPartyCases,
        to,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JobDefinition {\n");
    sb.append("    calculatedFields: ").append(toIndentedString(calculatedFields)).append("\n");
    sb.append("    cases: ").append(toIndentedString(cases)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    groupSignalsBy: ").append(toIndentedString(groupSignalsBy)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    queries: ").append(toIndentedString(queries)).append("\n");
    sb.append("    referenceTables: ").append(toIndentedString(referenceTables)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    thirdPartyCases: ").append(toIndentedString(thirdPartyCases)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
