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

/** A single entry in the version history of a dataset. */
@JsonPropertyOrder({
  SecurityMonitoringDatasetVersionEntry.JSON_PROPERTY_CHANGES,
  SecurityMonitoringDatasetVersionEntry.JSON_PROPERTY_DATASET
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringDatasetVersionEntry {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGES = "changes";
  private List<SecurityMonitoringDatasetVersionFieldChange> changes = new ArrayList<>();

  public static final String JSON_PROPERTY_DATASET = "dataset";
  private SecurityMonitoringDatasetAttributesResponse dataset;

  public SecurityMonitoringDatasetVersionEntry() {}

  @JsonCreator
  public SecurityMonitoringDatasetVersionEntry(
      @JsonProperty(required = true, value = JSON_PROPERTY_CHANGES)
          List<SecurityMonitoringDatasetVersionFieldChange> changes,
      @JsonProperty(required = true, value = JSON_PROPERTY_DATASET)
          SecurityMonitoringDatasetAttributesResponse dataset) {
    this.changes = changes;
    for (SecurityMonitoringDatasetVersionFieldChange item : changes) {
      this.unparsed |= item.unparsed;
    }
    this.dataset = dataset;
    this.unparsed |= dataset.unparsed;
  }

  public SecurityMonitoringDatasetVersionEntry changes(
      List<SecurityMonitoringDatasetVersionFieldChange> changes) {
    this.changes = changes;
    for (SecurityMonitoringDatasetVersionFieldChange item : changes) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SecurityMonitoringDatasetVersionEntry addChangesItem(
      SecurityMonitoringDatasetVersionFieldChange changesItem) {
    this.changes.add(changesItem);
    this.unparsed |= changesItem.unparsed;
    return this;
  }

  /**
   * The list of field changes between this version of the dataset and the previous one.
   *
   * @return changes
   */
  @JsonProperty(JSON_PROPERTY_CHANGES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<SecurityMonitoringDatasetVersionFieldChange> getChanges() {
    return changes;
  }

  public void setChanges(List<SecurityMonitoringDatasetVersionFieldChange> changes) {
    this.changes = changes;
    if (changes != null) {
      for (SecurityMonitoringDatasetVersionFieldChange item : changes) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public SecurityMonitoringDatasetVersionEntry dataset(
      SecurityMonitoringDatasetAttributesResponse dataset) {
    this.dataset = dataset;
    this.unparsed |= dataset.unparsed;
    return this;
  }

  /**
   * The attributes of a Cloud SIEM dataset.
   *
   * @return dataset
   */
  @JsonProperty(JSON_PROPERTY_DATASET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public SecurityMonitoringDatasetAttributesResponse getDataset() {
    return dataset;
  }

  public void setDataset(SecurityMonitoringDatasetAttributesResponse dataset) {
    this.dataset = dataset;
    if (dataset != null) {
      this.unparsed |= dataset.unparsed;
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
   * @return SecurityMonitoringDatasetVersionEntry
   */
  @JsonAnySetter
  public SecurityMonitoringDatasetVersionEntry putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SecurityMonitoringDatasetVersionEntry object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringDatasetVersionEntry securityMonitoringDatasetVersionEntry =
        (SecurityMonitoringDatasetVersionEntry) o;
    return Objects.equals(this.changes, securityMonitoringDatasetVersionEntry.changes)
        && Objects.equals(this.dataset, securityMonitoringDatasetVersionEntry.dataset)
        && Objects.equals(
            this.additionalProperties, securityMonitoringDatasetVersionEntry.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(changes, dataset, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringDatasetVersionEntry {\n");
    sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
    sb.append("    dataset: ").append(toIndentedString(dataset)).append("\n");
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
