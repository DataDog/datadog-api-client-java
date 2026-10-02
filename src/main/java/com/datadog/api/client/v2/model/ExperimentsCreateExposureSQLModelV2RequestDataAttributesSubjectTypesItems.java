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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Mapping between a subject type and its identifier column in the SQL model. */
@JsonPropertyOrder({
  ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems
      .JSON_PROPERTY_COLUMN_NAME,
  ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems
      .JSON_PROPERTY_SUBJECT_TYPE_ID
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COLUMN_NAME = "column_name";
  private String columnName;

  public static final String JSON_PROPERTY_SUBJECT_TYPE_ID = "subject_type_id";
  private String subjectTypeId;

  public ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems() {}

  @JsonCreator
  public ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_COLUMN_NAME) String columnName,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUBJECT_TYPE_ID) String subjectTypeId) {
    this.columnName = columnName;
    this.subjectTypeId = subjectTypeId;
  }

  public ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems columnName(
      String columnName) {
    this.columnName = columnName;
    return this;
  }

  /**
   * SQL result column that contains the subject identifier.
   *
   * @return columnName
   */
  @JsonProperty(JSON_PROPERTY_COLUMN_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getColumnName() {
    return columnName;
  }

  public void setColumnName(String columnName) {
    this.columnName = columnName;
  }

  public ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems subjectTypeId(
      String subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
    return this;
  }

  /**
   * Identifier of the subject type mapped to this column.
   *
   * @return subjectTypeId
   */
  @JsonProperty(JSON_PROPERTY_SUBJECT_TYPE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getSubjectTypeId() {
    return subjectTypeId;
  }

  public void setSubjectTypeId(String subjectTypeId) {
    this.subjectTypeId = subjectTypeId;
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
   * @return ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems
   */
  @JsonAnySetter
  public ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems
      putAdditionalProperty(String key, Object value) {
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
   * Return true if this ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems
   * object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems
        experimentsCreateExposureSqlModelV2RequestDataAttributesSubjectTypesItems =
            (ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems) o;
    return Objects.equals(
            this.columnName,
            experimentsCreateExposureSqlModelV2RequestDataAttributesSubjectTypesItems.columnName)
        && Objects.equals(
            this.subjectTypeId,
            experimentsCreateExposureSqlModelV2RequestDataAttributesSubjectTypesItems.subjectTypeId)
        && Objects.equals(
            this.additionalProperties,
            experimentsCreateExposureSqlModelV2RequestDataAttributesSubjectTypesItems
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(columnName, subjectTypeId, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(
        "class ExperimentsCreateExposureSQLModelV2RequestDataAttributesSubjectTypesItems {\n");
    sb.append("    columnName: ").append(toIndentedString(columnName)).append("\n");
    sb.append("    subjectTypeId: ").append(toIndentedString(subjectTypeId)).append("\n");
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
