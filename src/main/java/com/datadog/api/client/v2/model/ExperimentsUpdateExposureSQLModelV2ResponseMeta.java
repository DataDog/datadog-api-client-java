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

/** Removed model entries. Present only when the update removes an entry. */
@JsonPropertyOrder({
  ExperimentsUpdateExposureSQLModelV2ResponseMeta.JSON_PROPERTY_REMOVED_PROPERTY_NAMES,
  ExperimentsUpdateExposureSQLModelV2ResponseMeta.JSON_PROPERTY_REMOVED_SUBJECT_TYPE_IDS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsUpdateExposureSQLModelV2ResponseMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REMOVED_PROPERTY_NAMES = "removed_property_names";
  private List<String> removedPropertyNames = null;

  public static final String JSON_PROPERTY_REMOVED_SUBJECT_TYPE_IDS = "removed_subject_type_ids";
  private List<String> removedSubjectTypeIds = null;

  public ExperimentsUpdateExposureSQLModelV2ResponseMeta removedPropertyNames(
      List<String> removedPropertyNames) {
    this.removedPropertyNames = removedPropertyNames;
    return this;
  }

  public ExperimentsUpdateExposureSQLModelV2ResponseMeta addRemovedPropertyNamesItem(
      String removedPropertyNamesItem) {
    if (this.removedPropertyNames == null) {
      this.removedPropertyNames = new ArrayList<>();
    }
    this.removedPropertyNames.add(removedPropertyNamesItem);
    return this;
  }

  /**
   * Property names removed from the model.
   *
   * @return removedPropertyNames
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOVED_PROPERTY_NAMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRemovedPropertyNames() {
    return removedPropertyNames;
  }

  public void setRemovedPropertyNames(List<String> removedPropertyNames) {
    this.removedPropertyNames = removedPropertyNames;
  }

  public ExperimentsUpdateExposureSQLModelV2ResponseMeta removedSubjectTypeIds(
      List<String> removedSubjectTypeIds) {
    this.removedSubjectTypeIds = removedSubjectTypeIds;
    return this;
  }

  public ExperimentsUpdateExposureSQLModelV2ResponseMeta addRemovedSubjectTypeIdsItem(
      String removedSubjectTypeIdsItem) {
    if (this.removedSubjectTypeIds == null) {
      this.removedSubjectTypeIds = new ArrayList<>();
    }
    this.removedSubjectTypeIds.add(removedSubjectTypeIdsItem);
    return this;
  }

  /**
   * Subject type IDs removed from the model.
   *
   * @return removedSubjectTypeIds
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMOVED_SUBJECT_TYPE_IDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getRemovedSubjectTypeIds() {
    return removedSubjectTypeIds;
  }

  public void setRemovedSubjectTypeIds(List<String> removedSubjectTypeIds) {
    this.removedSubjectTypeIds = removedSubjectTypeIds;
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
   * @return ExperimentsUpdateExposureSQLModelV2ResponseMeta
   */
  @JsonAnySetter
  public ExperimentsUpdateExposureSQLModelV2ResponseMeta putAdditionalProperty(
      String key, Object value) {
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

  /** Return true if this ExperimentsUpdateExposureSQLModelV2ResponseMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsUpdateExposureSQLModelV2ResponseMeta
        experimentsUpdateExposureSqlModelV2ResponseMeta =
            (ExperimentsUpdateExposureSQLModelV2ResponseMeta) o;
    return Objects.equals(
            this.removedPropertyNames,
            experimentsUpdateExposureSqlModelV2ResponseMeta.removedPropertyNames)
        && Objects.equals(
            this.removedSubjectTypeIds,
            experimentsUpdateExposureSqlModelV2ResponseMeta.removedSubjectTypeIds)
        && Objects.equals(
            this.additionalProperties,
            experimentsUpdateExposureSqlModelV2ResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(removedPropertyNames, removedSubjectTypeIds, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsUpdateExposureSQLModelV2ResponseMeta {\n");
    sb.append("    removedPropertyNames: ")
        .append(toIndentedString(removedPropertyNames))
        .append("\n");
    sb.append("    removedSubjectTypeIds: ")
        .append(toIndentedString(removedSubjectTypeIds))
        .append("\n");
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
