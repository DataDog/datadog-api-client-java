/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Journey Paths query definition. */
@JsonPropertyOrder({
  JourneyMapQuery.JSON_PROPERTY_CONVERSION_TYPE,
  JourneyMapQuery.JSON_PROPERTY_COUNTING_METHOD,
  JourneyMapQuery.JSON_PROPERTY_DATA_SOURCE,
  JourneyMapQuery.JSON_PROPERTY_ENTRIES_PER_STEP,
  JourneyMapQuery.JSON_PROPERTY_EVENT_FILTER,
  JourneyMapQuery.JSON_PROPERTY_EXPANDED_PREFIXES,
  JourneyMapQuery.JSON_PROPERTY_GROUP_BY,
  JourneyMapQuery.JSON_PROPERTY_SEARCH,
  JourneyMapQuery.JSON_PROPERTY_TARGET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class JourneyMapQuery {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONVERSION_TYPE = "conversion_type";
  private JourneyMapConversionType conversionType;

  public static final String JSON_PROPERTY_COUNTING_METHOD = "counting_method";
  private JourneyMapCountingMethod countingMethod;

  public static final String JSON_PROPERTY_DATA_SOURCE = "data_source";
  private ProductAnalyticsFunnelDataSource dataSource;

  public static final String JSON_PROPERTY_ENTRIES_PER_STEP = "entries_per_step";
  private Long entriesPerStep;

  public static final String JSON_PROPERTY_EVENT_FILTER = "event_filter";
  private String eventFilter;

  public static final String JSON_PROPERTY_EXPANDED_PREFIXES = "expanded_prefixes";
  private List<JourneyMapExpandedPrefix> expandedPrefixes = null;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<JourneyMapGroupBy> groupBy = null;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private UserJourneySearch search;

  public static final String JSON_PROPERTY_TARGET = "target";
  private JourneyMapTarget target;

  public JourneyMapQuery() {}

  @JsonCreator
  public JourneyMapQuery(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_SOURCE)
          ProductAnalyticsFunnelDataSource dataSource,
      @JsonProperty(required = true, value = JSON_PROPERTY_SEARCH) UserJourneySearch search,
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) JourneyMapTarget target) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    this.search = search;
    this.unparsed |= search.unparsed;
    this.target = target;
    this.unparsed |= target.unparsed;
  }

  public JourneyMapQuery conversionType(JourneyMapConversionType conversionType) {
    this.conversionType = conversionType;
    this.unparsed |= !conversionType.isValid();
    return this;
  }

  /**
   * Whether to show the paths that convert to the end step or drop off before it.
   *
   * @return conversionType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JourneyMapConversionType getConversionType() {
    return conversionType;
  }

  public void setConversionType(JourneyMapConversionType conversionType) {
    if (!conversionType.isValid()) {
      this.unparsed = true;
    }
    this.conversionType = conversionType;
  }

  public JourneyMapQuery countingMethod(JourneyMapCountingMethod countingMethod) {
    this.countingMethod = countingMethod;
    this.unparsed |= !countingMethod.isValid();
    return this;
  }

  /**
   * Whether to count unique journeys or all journeys.
   *
   * @return countingMethod
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COUNTING_METHOD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JourneyMapCountingMethod getCountingMethod() {
    return countingMethod;
  }

  public void setCountingMethod(JourneyMapCountingMethod countingMethod) {
    if (!countingMethod.isValid()) {
      this.unparsed = true;
    }
    this.countingMethod = countingMethod;
  }

  public JourneyMapQuery dataSource(ProductAnalyticsFunnelDataSource dataSource) {
    this.dataSource = dataSource;
    this.unparsed |= !dataSource.isValid();
    return this;
  }

  /**
   * Data source for user journey funnel queries.
   *
   * @return dataSource
   */
  @JsonProperty(JSON_PROPERTY_DATA_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ProductAnalyticsFunnelDataSource getDataSource() {
    return dataSource;
  }

  public void setDataSource(ProductAnalyticsFunnelDataSource dataSource) {
    if (!dataSource.isValid()) {
      this.unparsed = true;
    }
    this.dataSource = dataSource;
  }

  public JourneyMapQuery entriesPerStep(Long entriesPerStep) {
    this.entriesPerStep = entriesPerStep;
    return this;
  }

  /**
   * Maximum number of paths shown per step. minimum: 1 maximum: 10
   *
   * @return entriesPerStep
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENTRIES_PER_STEP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getEntriesPerStep() {
    return entriesPerStep;
  }

  public void setEntriesPerStep(Long entriesPerStep) {
    this.entriesPerStep = entriesPerStep;
  }

  public JourneyMapQuery eventFilter(String eventFilter) {
    this.eventFilter = eventFilter;
    return this;
  }

  /**
   * Filter applied to the events shown along the paths.
   *
   * @return eventFilter
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EVENT_FILTER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEventFilter() {
    return eventFilter;
  }

  public void setEventFilter(String eventFilter) {
    this.eventFilter = eventFilter;
  }

  public JourneyMapQuery expandedPrefixes(List<JourneyMapExpandedPrefix> expandedPrefixes) {
    this.expandedPrefixes = expandedPrefixes;
    if (expandedPrefixes != null) {
      for (JourneyMapExpandedPrefix item : expandedPrefixes) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public JourneyMapQuery addExpandedPrefixesItem(JourneyMapExpandedPrefix expandedPrefixesItem) {
    if (this.expandedPrefixes == null) {
      this.expandedPrefixes = new ArrayList<>();
    }
    this.expandedPrefixes.add(expandedPrefixesItem);
    this.unparsed |= expandedPrefixesItem.unparsed;
    return this;
  }

  /**
   * Paths expanded to show the events that follow them.
   *
   * @return expandedPrefixes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXPANDED_PREFIXES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<JourneyMapExpandedPrefix> getExpandedPrefixes() {
    return expandedPrefixes;
  }

  public void setExpandedPrefixes(List<JourneyMapExpandedPrefix> expandedPrefixes) {
    this.expandedPrefixes = expandedPrefixes;
    if (expandedPrefixes != null) {
      for (JourneyMapExpandedPrefix item : expandedPrefixes) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public JourneyMapQuery groupBy(List<JourneyMapGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (JourneyMapGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public JourneyMapQuery addGroupByItem(JourneyMapGroupBy groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    this.unparsed |= groupByItem.unparsed;
    return this;
  }

  /**
   * Group by configuration.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<JourneyMapGroupBy> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<JourneyMapGroupBy> groupBy) {
    this.groupBy = groupBy;
    if (groupBy != null) {
      for (JourneyMapGroupBy item : groupBy) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public JourneyMapQuery search(UserJourneySearch search) {
    this.search = search;
    this.unparsed |= search.unparsed;
    return this;
  }

  /**
   * User journey search configuration.
   *
   * @return search
   */
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UserJourneySearch getSearch() {
    return search;
  }

  public void setSearch(UserJourneySearch search) {
    this.search = search;
    if (search != null) {
      this.unparsed |= search.unparsed;
    }
  }

  public JourneyMapQuery target(JourneyMapTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * The pair of journey steps the paths are visualized between.
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public JourneyMapTarget getTarget() {
    return target;
  }

  public void setTarget(JourneyMapTarget target) {
    this.target = target;
    if (target != null) {
      this.unparsed |= target.unparsed;
    }
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
   * @return JourneyMapQuery
   */
  @JsonAnySetter
  public JourneyMapQuery putAdditionalProperty(String key, Object value) {
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

  /** Return true if this JourneyMapQuery object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    JourneyMapQuery journeyMapQuery = (JourneyMapQuery) o;
    return Objects.equals(this.conversionType, journeyMapQuery.conversionType)
        && Objects.equals(this.countingMethod, journeyMapQuery.countingMethod)
        && Objects.equals(this.dataSource, journeyMapQuery.dataSource)
        && Objects.equals(this.entriesPerStep, journeyMapQuery.entriesPerStep)
        && Objects.equals(this.eventFilter, journeyMapQuery.eventFilter)
        && Objects.equals(this.expandedPrefixes, journeyMapQuery.expandedPrefixes)
        && Objects.equals(this.groupBy, journeyMapQuery.groupBy)
        && Objects.equals(this.search, journeyMapQuery.search)
        && Objects.equals(this.target, journeyMapQuery.target)
        && Objects.equals(this.additionalProperties, journeyMapQuery.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conversionType,
        countingMethod,
        dataSource,
        entriesPerStep,
        eventFilter,
        expandedPrefixes,
        groupBy,
        search,
        target,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class JourneyMapQuery {\n");
    sb.append("    conversionType: ").append(toIndentedString(conversionType)).append("\n");
    sb.append("    countingMethod: ").append(toIndentedString(countingMethod)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    entriesPerStep: ").append(toIndentedString(entriesPerStep)).append("\n");
    sb.append("    eventFilter: ").append(toIndentedString(eventFilter)).append("\n");
    sb.append("    expandedPrefixes: ").append(toIndentedString(expandedPrefixes)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
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
