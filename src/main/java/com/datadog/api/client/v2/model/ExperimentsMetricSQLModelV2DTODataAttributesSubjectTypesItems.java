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

/** A mapping between a subject type and its identifying SQL column. */
@JsonPropertyOrder({
  ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems.JSON_PROPERTY_COLUMN_NAME,
  ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems.JSON_PROPERTY_SUBJECT_TYPE_ID,
  ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems
      .JSON_PROPERTY_UNIQUE_SUBJECT_COUNT_MEASURE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN_NAME = "column_name";
  private String columnName;

  public static final String JSON_PROPERTY_SUBJECT_TYPE_ID = "subject_type_id";
  private String subjectTypeId;

  public static final String JSON_PROPERTY_UNIQUE_SUBJECT_COUNT_MEASURE_ID =
      "unique_subject_count_measure_id";
  private String uniqueSubjectCountMeasureId;

  public ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems columnName(
      String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * Name of the SQL result column that identifies subjects of this type.
   *
   * @return columnName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COLUMN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems subjectTypeId(
      String subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
    return this;
  }

  /**
   * ID of the subject type used by this configuration.
   *
   * @return subjectTypeId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSubjectTypeId() {
    return subjectTypeId;
  }

  public void setSubjectTypeId(String subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
  }

  public ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems uniqueSubjectCountMeasureId(
      String uniqueSubjectCountMeasureId) {
    this.uniqueSubjectCountMeasureId = uniqueSubjectCountMeasureId;
    return this;
  }

  /**
   * Read-only measure ID. Pass it as warehouse_metric_measure.id when the metric operation is
   * <code>uniqueSubjects</code>.
   *
   * @return uniqueSubjectCountMeasureId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UNIQUE_SUBJECT_COUNT_MEASURE_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUniqueSubjectCountMeasureId() {
    return uniqueSubjectCountMeasureId;
  }

  public void setUniqueSubjectCountMeasureId(String uniqueSubjectCountMeasureId) {
    this.uniqueSubjectCountMeasureId = uniqueSubjectCountMeasureId;
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
   * @return ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems
   */
  @JsonAnySetter
  public ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems putAdditionalProperty(
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

  /**
   * Return true if this ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems object is
   * equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems
        experimentsMetricSqlModelV2DtoDataAttributesSubjectTypesItems =
            (ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems) o;
    return Objects.equals(
            this.columnName,
            experimentsMetricSqlModelV2DtoDataAttributesSubjectTypesItems.columnName)
        && Objects.equals(
            this.subjectTypeId,
            experimentsMetricSqlModelV2DtoDataAttributesSubjectTypesItems.subjectTypeId)
        && Objects.equals(
            this.uniqueSubjectCountMeasureId,
            experimentsMetricSqlModelV2DtoDataAttributesSubjectTypesItems
                .uniqueSubjectCountMeasureId)
        && Objects.equals(
            this.additionalProperties,
            experimentsMetricSqlModelV2DtoDataAttributesSubjectTypesItems.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        columnName, subjectTypeId, uniqueSubjectCountMeasureId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsMetricSQLModelV2DTODataAttributesSubjectTypesItems {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    subjectTypeId: ").append(toIndentedString(subjectTypeId)).append("\n");
    sb.append("    uniqueSubjectCountMeasureId: ")
        .append(toIndentedString(uniqueSubjectCountMeasureId))
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
