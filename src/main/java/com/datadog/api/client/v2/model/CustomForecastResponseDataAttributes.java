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

/** Attributes of a custom forecast. */
@JsonPropertyOrder({
  CustomForecastResponseDataAttributes.JSON_PROPERTY_BUDGET_UID,
  CustomForecastResponseDataAttributes.JSON_PROPERTY_CREATED_AT,
  CustomForecastResponseDataAttributes.JSON_PROPERTY_CREATED_BY,
  CustomForecastResponseDataAttributes.JSON_PROPERTY_ENTRIES,
  CustomForecastResponseDataAttributes.JSON_PROPERTY_UPDATED_AT,
  CustomForecastResponseDataAttributes.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CustomForecastResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BUDGET_UID = "budget_uid";
  private String budgetUid;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private Long createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private String createdBy;

  public static final String JSON_PROPERTY_ENTRIES = "entries";
  private List<CustomForecastEntry> entries = new ArrayList<>();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private Long updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private String updatedBy;

  public CustomForecastResponseDataAttributes() {}

  @JsonCreator
  public CustomForecastResponseDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_BUDGET_UID) String budgetUid,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) Long createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) String createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTRIES)
          List<CustomForecastEntry> entries,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) Long updatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_BY) String updatedBy) {
    this.budgetUid = budgetUid;
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.entries = entries;
    for (CustomForecastEntry item : entries) {
      this.unparsed |= item.unparsed;
    }
    this.updatedAt = updatedAt;
    this.updatedBy = updatedBy;
  }

  public CustomForecastResponseDataAttributes budgetUid(String budgetUid) {
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

  public CustomForecastResponseDataAttributes createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp the custom forecast was created, in Unix milliseconds.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }

  public CustomForecastResponseDataAttributes createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The id of the user that created the custom forecast.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }

  public CustomForecastResponseDataAttributes entries(List<CustomForecastEntry> entries) {
    this.entries = entries;
    for (CustomForecastEntry item : entries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public CustomForecastResponseDataAttributes addEntriesItem(CustomForecastEntry entriesItem) {
    this.entries.add(entriesItem);
    this.unparsed |= entriesItem.unparsed;
    return this;
  }

  /**
   * Monthly custom forecast entries.
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
    if (entries != null) {
      for (CustomForecastEntry item : entries) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public CustomForecastResponseDataAttributes updatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp the custom forecast was last updated, in Unix milliseconds.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(Long updatedAt) {
    this.updatedAt = updatedAt;
  }

  public CustomForecastResponseDataAttributes updatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * The id of the user that last updated the custom forecast.
   *
   * @return updatedBy
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(String updatedBy) {
    this.updatedBy = updatedBy;
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
   * @return CustomForecastResponseDataAttributes
   */
  @JsonAnySetter
  public CustomForecastResponseDataAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CustomForecastResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomForecastResponseDataAttributes customForecastResponseDataAttributes =
        (CustomForecastResponseDataAttributes) o;
    return Objects.equals(this.budgetUid, customForecastResponseDataAttributes.budgetUid)
        && Objects.equals(this.createdAt, customForecastResponseDataAttributes.createdAt)
        && Objects.equals(this.createdBy, customForecastResponseDataAttributes.createdBy)
        && Objects.equals(this.entries, customForecastResponseDataAttributes.entries)
        && Objects.equals(this.updatedAt, customForecastResponseDataAttributes.updatedAt)
        && Objects.equals(this.updatedBy, customForecastResponseDataAttributes.updatedBy)
        && Objects.equals(
            this.additionalProperties, customForecastResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        budgetUid, createdAt, createdBy, entries, updatedAt, updatedBy, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomForecastResponseDataAttributes {\n");
    sb.append("    budgetUid: ").append(toIndentedString(budgetUid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    entries: ").append(toIndentedString(entries)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    updatedBy: ").append(toIndentedString(updatedBy)).append("\n");
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
