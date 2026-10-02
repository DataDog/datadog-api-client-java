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

/** Model entries removed by the update. Empty arrays mean no entries were removed. */
@JsonPropertyOrder({
  ExperimentsUpdateMetricSQLModelV2ResponseMeta.JSON_PROPERTY_DELETED_MEASURES,
  ExperimentsUpdateMetricSQLModelV2ResponseMeta.JSON_PROPERTY_DELETED_PROPERTIES,
  ExperimentsUpdateMetricSQLModelV2ResponseMeta.JSON_PROPERTY_DELETED_SUBJECT_TYPES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsUpdateMetricSQLModelV2ResponseMeta {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DELETED_MEASURES = "deleted_measures";
  private List<String> deletedMeasures = null;

  public static final String JSON_PROPERTY_DELETED_PROPERTIES = "deleted_properties";
  private List<String> deletedProperties = null;

  public static final String JSON_PROPERTY_DELETED_SUBJECT_TYPES = "deleted_subject_types";
  private List<String> deletedSubjectTypes = null;

  public ExperimentsUpdateMetricSQLModelV2ResponseMeta deletedMeasures(
      List<String> deletedMeasures) {
    this.deletedMeasures = deletedMeasures;
    return this;
  }

  public ExperimentsUpdateMetricSQLModelV2ResponseMeta addDeletedMeasuresItem(
      String deletedMeasuresItem) {
    if (this.deletedMeasures == null) {
      this.deletedMeasures = new ArrayList<>();
    }
    this.deletedMeasures.add(deletedMeasuresItem);
    return this;
  }

  /**
   * Measure column names removed from the model.
   *
   * @return deletedMeasures
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_MEASURES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDeletedMeasures() {
    return deletedMeasures;
  }

  public void setDeletedMeasures(List<String> deletedMeasures) {
    this.deletedMeasures = deletedMeasures;
  }

  public ExperimentsUpdateMetricSQLModelV2ResponseMeta deletedProperties(
      List<String> deletedProperties) {
    this.deletedProperties = deletedProperties;
    return this;
  }

  public ExperimentsUpdateMetricSQLModelV2ResponseMeta addDeletedPropertiesItem(
      String deletedPropertiesItem) {
    if (this.deletedProperties == null) {
      this.deletedProperties = new ArrayList<>();
    }
    this.deletedProperties.add(deletedPropertiesItem);
    return this;
  }

  /**
   * Property names removed from the model.
   *
   * @return deletedProperties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDeletedProperties() {
    return deletedProperties;
  }

  public void setDeletedProperties(List<String> deletedProperties) {
    this.deletedProperties = deletedProperties;
  }

  public ExperimentsUpdateMetricSQLModelV2ResponseMeta deletedSubjectTypes(
      List<String> deletedSubjectTypes) {
    this.deletedSubjectTypes = deletedSubjectTypes;
    return this;
  }

  public ExperimentsUpdateMetricSQLModelV2ResponseMeta addDeletedSubjectTypesItem(
      String deletedSubjectTypesItem) {
    if (this.deletedSubjectTypes == null) {
      this.deletedSubjectTypes = new ArrayList<>();
    }
    this.deletedSubjectTypes.add(deletedSubjectTypesItem);
    return this;
  }

  /**
   * Subject type IDs removed from the model.
   *
   * @return deletedSubjectTypes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DELETED_SUBJECT_TYPES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getDeletedSubjectTypes() {
    return deletedSubjectTypes;
  }

  public void setDeletedSubjectTypes(List<String> deletedSubjectTypes) {
    this.deletedSubjectTypes = deletedSubjectTypes;
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
   * @return ExperimentsUpdateMetricSQLModelV2ResponseMeta
   */
  @JsonAnySetter
  public ExperimentsUpdateMetricSQLModelV2ResponseMeta putAdditionalProperty(
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

  /** Return true if this ExperimentsUpdateMetricSQLModelV2ResponseMeta object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsUpdateMetricSQLModelV2ResponseMeta experimentsUpdateMetricSqlModelV2ResponseMeta =
        (ExperimentsUpdateMetricSQLModelV2ResponseMeta) o;
    return Objects.equals(
            this.deletedMeasures, experimentsUpdateMetricSqlModelV2ResponseMeta.deletedMeasures)
        && Objects.equals(
            this.deletedProperties, experimentsUpdateMetricSqlModelV2ResponseMeta.deletedProperties)
        && Objects.equals(
            this.deletedSubjectTypes,
            experimentsUpdateMetricSqlModelV2ResponseMeta.deletedSubjectTypes)
        && Objects.equals(
            this.additionalProperties,
            experimentsUpdateMetricSqlModelV2ResponseMeta.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        deletedMeasures, deletedProperties, deletedSubjectTypes, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsUpdateMetricSQLModelV2ResponseMeta {\n");
    sb.append("    deletedMeasures: ").append(toIndentedString(deletedMeasures)).append("\n");
    sb.append("    deletedProperties: ").append(toIndentedString(deletedProperties)).append("\n");
    sb.append("    deletedSubjectTypes: ")
        .append(toIndentedString(deletedSubjectTypes))
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
