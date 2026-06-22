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

/** Attributes of a custom forecast upsert request. */
@JsonPropertyOrder({
  CustomForecastUpsertRequestDataAttributes.JSON_PROPERTY_BUDGET_UID,
  CustomForecastUpsertRequestDataAttributes.JSON_PROPERTY_ENTRIES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomForecastUpsertRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUDGET_UID = "budget_uid";
  private String budgetUid;

  public static final String JSON_PROPERTY_ENTRIES = "entries";
  private List<CustomForecastEntry> entries = new ArrayList<>();

  public CustomForecastUpsertRequestDataAttributes() {}

  @JsonCreator
  public CustomForecastUpsertRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_BUDGET_UID) String budgetUid,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTRIES)
          List<CustomForecastEntry> entries) {
    this.budgetUid = budgetUid;
    this.entries = entries;
  }

  public CustomForecastUpsertRequestDataAttributes budgetUid(String budgetUid) {
    this.budgetUid = budgetUid;
    return this;
  }

  /**
   * The UUID of the budget that this custom forecast belongs to.
   *
   * @return budgetUid
   */
  @JsonProperty(JSON_PROPERTY_BUDGET_UID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getBudgetUid() {
    return budgetUid;
  }

  public void setBudgetUid(String budgetUid) {
    this.budgetUid = budgetUid;
  }

  public CustomForecastUpsertRequestDataAttributes entries(List<CustomForecastEntry> entries) {
    this.entries = entries;
    for (CustomForecastEntry item : entries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CustomForecastUpsertRequestDataAttributes addEntriesItem(CustomForecastEntry entriesItem) {
    this.entries.add(entriesItem);
    this.unparsed |= entriesItem.unparsed;
    return this;
  }

  /**
   * Monthly custom forecast entries. An empty list deletes any existing custom forecast for the
   * budget.
   *
   * @return entries
   */
  @JsonProperty(JSON_PROPERTY_ENTRIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<CustomForecastEntry> getEntries() {
    return entries;
  }

  public void setEntries(List<CustomForecastEntry> entries) {
    this.entries = entries;
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
   * @return CustomForecastUpsertRequestDataAttributes
   */
  @JsonAnySetter
  public CustomForecastUpsertRequestDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomForecastUpsertRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomForecastUpsertRequestDataAttributes customForecastUpsertRequestDataAttributes =
        (CustomForecastUpsertRequestDataAttributes) o;
    return Objects.equals(this.budgetUid, customForecastUpsertRequestDataAttributes.budgetUid)
        && Objects.equals(this.entries, customForecastUpsertRequestDataAttributes.entries)
        && Objects.equals(
            this.additionalProperties,
            customForecastUpsertRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(budgetUid, entries, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomForecastUpsertRequestDataAttributes {\n");
    sb.append("    budgetUid: ").append(toIndentedString(budgetUid)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
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
