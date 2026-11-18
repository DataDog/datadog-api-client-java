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

/** Selects the users who converted or dropped off in a funnel. */
@JsonPropertyOrder({
  SegmentJourneyBlock.JSON_PROPERTY_CONVERSION_TYPE,
  SegmentJourneyBlock.JSON_PROPERTY_EXCLUDE_ANONYMOUS_TRAFFIC,
  SegmentJourneyBlock.JSON_PROPERTY_FROM,
  SegmentJourneyBlock.JSON_PROPERTY_GROUP_BY,
  SegmentJourneyBlock.JSON_PROPERTY_NAME,
  SegmentJourneyBlock.JSON_PROPERTY_SEARCH,
  SegmentJourneyBlock.JSON_PROPERTY_TARGET,
  SegmentJourneyBlock.JSON_PROPERTY_TO
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SegmentJourneyBlock {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONVERSION_TYPE = "conversion_type";
  private ProductAnalyticsJourneyConversionType conversionType;

  public static final String JSON_PROPERTY_EXCLUDE_ANONYMOUS_TRAFFIC = "exclude_anonymous_traffic";
  private Boolean excludeAnonymousTraffic;

  public static final String JSON_PROPERTY_FROM = "from";
  private Long from;

  public static final String JSON_PROPERTY_GROUP_BY = "group_by";
  private List<Map<String, Object>> groupBy = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_SEARCH = "search";
  private Map<String, Object> search = null;

  public static final String JSON_PROPERTY_TARGET = "target";
  private Map<String, Object> target = null;

  public static final String JSON_PROPERTY_TO = "to";
  private Long to;

  public SegmentJourneyBlock conversionType(ProductAnalyticsJourneyConversionType conversionType) {
    this.conversionType = conversionType;
    this.unparsed |= !conversionType.isValid();
    return this;
  }

  /**
   * Whether to return the entities that converted at the target step, or those that dropped off.
   *
   * @return conversionType
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONVERSION_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ProductAnalyticsJourneyConversionType getConversionType() {
    return conversionType;
  }

  public void setConversionType(ProductAnalyticsJourneyConversionType conversionType) {
    if (!conversionType.isValid()) {
      this.unparsed = true;
    }
    this.conversionType = conversionType;
  }

  public SegmentJourneyBlock excludeAnonymousTraffic(Boolean excludeAnonymousTraffic) {
    this.excludeAnonymousTraffic = excludeAnonymousTraffic;
    return this;
  }

  /**
   * Whether to leave out anonymous users.
   *
   * @return excludeAnonymousTraffic
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXCLUDE_ANONYMOUS_TRAFFIC)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getExcludeAnonymousTraffic() {
    return excludeAnonymousTraffic;
  }

  public void setExcludeAnonymousTraffic(Boolean excludeAnonymousTraffic) {
    this.excludeAnonymousTraffic = excludeAnonymousTraffic;
  }

  public SegmentJourneyBlock from(Long from) {
    this.from = from;
    return this;
  }

  /**
   * Start of the time range, in epoch milliseconds.
   *
   * @return from
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFrom() {
    return from;
  }

  public void setFrom(Long from) {
    this.from = from;
  }

  public SegmentJourneyBlock groupBy(List<Map<String, Object>> groupBy) {
    this.groupBy = groupBy;
    return this;
  }

  public SegmentJourneyBlock addGroupByItem(Map<String, Object> groupByItem) {
    if (this.groupBy == null) {
      this.groupBy = new ArrayList<>();
    }
    this.groupBy.add(groupByItem);
    return this;
  }

  /**
   * Group-by definitions of the funnel query.
   *
   * @return groupBy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_GROUP_BY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<Map<String, Object>> getGroupBy() {
    return groupBy;
  }

  public void setGroupBy(List<Map<String, Object>> groupBy) {
    this.groupBy = groupBy;
  }

  public SegmentJourneyBlock name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the block, used in <code>combination</code>.
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

  public SegmentJourneyBlock search(Map<String, Object> search) {
    this.search = search;
    return this;
  }

  public SegmentJourneyBlock putSearchItem(String key, Object searchItem) {
    if (this.search == null) {
      this.search = new HashMap<>();
    }
    this.search.put(key, searchItem);
    return this;
  }

  /**
   * Funnel search, with the same shape as the <code>search</code> of a Product Analytics journey
   * query.
   *
   * @return search
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SEARCH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getSearch() {
    return search;
  }

  public void setSearch(Map<String, Object> search) {
    this.search = search;
  }

  public SegmentJourneyBlock target(Map<String, Object> target) {
    this.target = target;
    return this;
  }

  public SegmentJourneyBlock putTargetItem(String key, Object targetItem) {
    if (this.target == null) {
      this.target = new HashMap<>();
    }
    this.target.put(key, targetItem);
    return this;
  }

  /**
   * Funnel step or step range to evaluate.
   *
   * @return target
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getTarget() {
    return target;
  }

  public void setTarget(Map<String, Object> target) {
    this.target = target;
  }

  public SegmentJourneyBlock to(Long to) {
    this.to = to;
    return this;
  }

  /**
   * End of the time range, in epoch milliseconds.
   *
   * @return to
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getTo() {
    return to;
  }

  public void setTo(Long to) {
    this.to = to;
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
   * @return SegmentJourneyBlock
   */
  @JsonAnySetter
  public SegmentJourneyBlock putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SegmentJourneyBlock object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SegmentJourneyBlock segmentJourneyBlock = (SegmentJourneyBlock) o;
    return Objects.equals(this.conversionType, segmentJourneyBlock.conversionType)
        && Objects.equals(this.excludeAnonymousTraffic, segmentJourneyBlock.excludeAnonymousTraffic)
        && Objects.equals(this.from, segmentJourneyBlock.from)
        && Objects.equals(this.groupBy, segmentJourneyBlock.groupBy)
        && Objects.equals(this.name, segmentJourneyBlock.name)
        && Objects.equals(this.search, segmentJourneyBlock.search)
        && Objects.equals(this.target, segmentJourneyBlock.target)
        && Objects.equals(this.to, segmentJourneyBlock.to)
        && Objects.equals(this.additionalProperties, segmentJourneyBlock.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        conversionType,
        excludeAnonymousTraffic,
        from,
        groupBy,
        name,
        search,
        target,
        to,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SegmentJourneyBlock {\n");
    sb.append("    conversionType: ").append(toIndentedString(conversionType)).append("\n");
    sb.append("    excludeAnonymousTraffic: ")
        .append(toIndentedString(excludeAnonymousTraffic))
        .append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    groupBy: ").append(toIndentedString(groupBy)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    search: ").append(toIndentedString(search)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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
