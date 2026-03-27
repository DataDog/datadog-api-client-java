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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Metadata about the search results. */
@JsonPropertyOrder({
  WidgetSearchMeta.JSON_PROPERTY_CREATED_BY_ANYONE_TOTAL,
  WidgetSearchMeta.JSON_PROPERTY_CREATED_BY_YOU_TOTAL,
  WidgetSearchMeta.JSON_PROPERTY_FAVORITED_BY_YOU_TOTAL,
  WidgetSearchMeta.JSON_PROPERTY_FILTERED_TOTAL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class WidgetSearchMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_BY_ANYONE_TOTAL = "created_by_anyone_total";
  private Long createdByAnyoneTotal;

  public static final String JSON_PROPERTY_CREATED_BY_YOU_TOTAL = "created_by_you_total";
  private Long createdByYouTotal;

  public static final String JSON_PROPERTY_FAVORITED_BY_YOU_TOTAL = "favorited_by_you_total";
  private Long favoritedByYouTotal;

  public static final String JSON_PROPERTY_FILTERED_TOTAL = "filtered_total";
  private Long filteredTotal;

  public WidgetSearchMeta createdByAnyoneTotal(Long createdByAnyoneTotal) {
    this.createdByAnyoneTotal = createdByAnyoneTotal;
    return this;
  }

  /**
   * Total number of widgets created by anyone.
   *
   * @return createdByAnyoneTotal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY_ANYONE_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedByAnyoneTotal() {
    return createdByAnyoneTotal;
  }

  public void setCreatedByAnyoneTotal(Long createdByAnyoneTotal) {
    this.createdByAnyoneTotal = createdByAnyoneTotal;
  }

  public WidgetSearchMeta createdByYouTotal(Long createdByYouTotal) {
    this.createdByYouTotal = createdByYouTotal;
    return this;
  }

  /**
   * Total number of widgets created by the current user.
   *
   * @return createdByYouTotal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_BY_YOU_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getCreatedByYouTotal() {
    return createdByYouTotal;
  }

  public void setCreatedByYouTotal(Long createdByYouTotal) {
    this.createdByYouTotal = createdByYouTotal;
  }

  public WidgetSearchMeta favoritedByYouTotal(Long favoritedByYouTotal) {
    this.favoritedByYouTotal = favoritedByYouTotal;
    return this;
  }

  /**
   * Total number of widgets favorited by the current user.
   *
   * @return favoritedByYouTotal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAVORITED_BY_YOU_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFavoritedByYouTotal() {
    return favoritedByYouTotal;
  }

  public void setFavoritedByYouTotal(Long favoritedByYouTotal) {
    this.favoritedByYouTotal = favoritedByYouTotal;
  }

  public WidgetSearchMeta filteredTotal(Long filteredTotal) {
    this.filteredTotal = filteredTotal;
    return this;
  }

  /**
   * Total number of widgets matching the current filter criteria.
   *
   * @return filteredTotal
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILTERED_TOTAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getFilteredTotal() {
    return filteredTotal;
  }

  public void setFilteredTotal(Long filteredTotal) {
    this.filteredTotal = filteredTotal;
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
   * @return WidgetSearchMeta
   */
  @JsonAnySetter
  public WidgetSearchMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this WidgetSearchMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WidgetSearchMeta widgetSearchMeta = (WidgetSearchMeta) o;
    return Objects.equals(this.createdByAnyoneTotal, widgetSearchMeta.createdByAnyoneTotal)
        && Objects.equals(this.createdByYouTotal, widgetSearchMeta.createdByYouTotal)
        && Objects.equals(this.favoritedByYouTotal, widgetSearchMeta.favoritedByYouTotal)
        && Objects.equals(this.filteredTotal, widgetSearchMeta.filteredTotal)
        && Objects.equals(this.additionalProperties, widgetSearchMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdByAnyoneTotal,
        createdByYouTotal,
        favoritedByYouTotal,
        filteredTotal,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WidgetSearchMeta {\n");
    sb.append("    createdByAnyoneTotal: ")
        .append(toIndentedString(createdByAnyoneTotal))
        .append("\n");
    sb.append("    createdByYouTotal: ").append(toIndentedString(createdByYouTotal)).append("\n");
    sb.append("    favoritedByYouTotal: ")
        .append(toIndentedString(favoritedByYouTotal))
        .append("\n");
    sb.append("    filteredTotal: ").append(toIndentedString(filteredTotal)).append("\n");
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
