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
import org.openapitools.jackson.nullable.JsonNullable;

/** Metadata for the list connection groups response. */
@JsonPropertyOrder({
  ListConnectionGroupsResponseMeta.JSON_PROPERTY_INTEGRATION_COUNTS,
  ListConnectionGroupsResponseMeta.JSON_PROPERTY_TOTAL,
  ListConnectionGroupsResponseMeta.JSON_PROPERTY_TOTAL_FILTERED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ListConnectionGroupsResponseMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_INTEGRATION_COUNTS = "integration_counts";
  private JsonNullable<List<IntegrationCounts>> integrationCounts =
      JsonNullable.<List<IntegrationCounts>>undefined();

  public static final String JSON_PROPERTY_TOTAL = "total";
  private Long total;

  public static final String JSON_PROPERTY_TOTAL_FILTERED = "total_filtered";
  private Long totalFiltered;

  public ListConnectionGroupsResponseMeta() {}

  @JsonCreator
  public ListConnectionGroupsResponseMeta(
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL) Long total,
      @JsonProperty(required = true, value = JSON_PROPERTY_TOTAL_FILTERED) Long totalFiltered) {
    this.total = total;
    this.totalFiltered = totalFiltered;
  }

  public ListConnectionGroupsResponseMeta integrationCounts(
      List<IntegrationCounts> integrationCounts) {
    this.integrationCounts = JsonNullable.<List<IntegrationCounts>>of(integrationCounts);
    return this;
  }

  public ListConnectionGroupsResponseMeta addIntegrationCountsItem(
      IntegrationCounts integrationCountsItem) {
    if (this.integrationCounts == null || !this.integrationCounts.isPresent()) {
      this.integrationCounts = JsonNullable.<List<IntegrationCounts>>of(new ArrayList<>());
    }
    try {
      this.integrationCounts.get().add(integrationCountsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Count of integrations by type.
   *
   * @return integrationCounts
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<IntegrationCounts> getIntegrationCounts() {
    return integrationCounts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_INTEGRATION_COUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<IntegrationCounts>> getIntegrationCounts_JsonNullable() {
    return integrationCounts;
  }

  @JsonProperty(JSON_PROPERTY_INTEGRATION_COUNTS)
  public void setIntegrationCounts_JsonNullable(
      JsonNullable<List<IntegrationCounts>> integrationCounts) {
    this.integrationCounts = integrationCounts;
  }

  public void setIntegrationCounts(List<IntegrationCounts> integrationCounts) {
    this.integrationCounts = JsonNullable.<List<IntegrationCounts>>of(integrationCounts);
  }

  public ListConnectionGroupsResponseMeta total(Long total) {
    this.total = total;
    return this;
  }

  /**
   * The total number of connection groups.
   *
   * @return total
   */
  @JsonProperty(JSON_PROPERTY_TOTAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotal() {
    return total;
  }

  public void setTotal(Long total) {
    this.total = total;
  }

  public ListConnectionGroupsResponseMeta totalFiltered(Long totalFiltered) {
    this.totalFiltered = totalFiltered;
    return this;
  }

  /**
   * The total number of connection groups that match the specified filters.
   *
   * @return totalFiltered
   */
  @JsonProperty(JSON_PROPERTY_TOTAL_FILTERED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getTotalFiltered() {
    return totalFiltered;
  }

  public void setTotalFiltered(Long totalFiltered) {
    this.totalFiltered = totalFiltered;
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
   * @return ListConnectionGroupsResponseMeta
   */
  @JsonAnySetter
  public ListConnectionGroupsResponseMeta putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ListConnectionGroupsResponseMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListConnectionGroupsResponseMeta listConnectionGroupsResponseMeta =
        (ListConnectionGroupsResponseMeta) o;
    return Objects.equals(
            this.integrationCounts, listConnectionGroupsResponseMeta.integrationCounts)
        && Objects.equals(this.total, listConnectionGroupsResponseMeta.total)
        && Objects.equals(this.totalFiltered, listConnectionGroupsResponseMeta.totalFiltered)
        && Objects.equals(
            this.additionalProperties, listConnectionGroupsResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationCounts, total, totalFiltered, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListConnectionGroupsResponseMeta {\n");
    sb.append("    integrationCounts: ").append(toIndentedString(integrationCounts)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    totalFiltered: ").append(toIndentedString(totalFiltered)).append("\n");
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
