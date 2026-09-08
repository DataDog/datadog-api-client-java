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
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import org.openapitools.jackson.nullable.JsonNullable;

/** The attributes of a unit cost. */
@JsonPropertyOrder({
  UnitCostDataAttributesResponse.JSON_PROPERTY_CREATED_AT,
  UnitCostDataAttributesResponse.JSON_PROPERTY_CREATED_BY,
  UnitCostDataAttributesResponse.JSON_PROPERTY_DENOMINATOR_QUERY,
  UnitCostDataAttributesResponse.JSON_PROPERTY_DENOMINATOR_TYPE,
  UnitCostDataAttributesResponse.JSON_PROPERTY_DESCRIPTION,
  UnitCostDataAttributesResponse.JSON_PROPERTY_NAME,
  UnitCostDataAttributesResponse.JSON_PROPERTY_NUMERATOR_QUERY,
  UnitCostDataAttributesResponse.JSON_PROPERTY_ORG_ID,
  UnitCostDataAttributesResponse.JSON_PROPERTY_UNIT_LABEL,
  UnitCostDataAttributesResponse.JSON_PROPERTY_UPDATED_AT,
  UnitCostDataAttributesResponse.JSON_PROPERTY_UPDATED_BY
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UnitCostDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_CREATED_BY = "created_by";
  private UUID createdBy;

  public static final String JSON_PROPERTY_DENOMINATOR_QUERY = "denominator_query";
  private UnitCostQueryDefinition denominatorQuery;

  public static final String JSON_PROPERTY_DENOMINATOR_TYPE = "denominator_type";
  private String denominatorType;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NUMERATOR_QUERY = "numerator_query";
  private UnitCostQueryDefinition numeratorQuery;

  public static final String JSON_PROPERTY_ORG_ID = "org_id";
  private Long orgId;

  public static final String JSON_PROPERTY_UNIT_LABEL = "unit_label";
  private String unitLabel;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public static final String JSON_PROPERTY_UPDATED_BY = "updated_by";
  private UUID updatedBy;

  public UnitCostDataAttributesResponse() {}

  @JsonCreator
  public UnitCostDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_BY) UUID createdBy,
      @JsonProperty(required = true, value = JSON_PROPERTY_DENOMINATOR_QUERY)
          UnitCostQueryDefinition denominatorQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_DENOMINATOR_TYPE) String denominatorType,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_NUMERATOR_QUERY)
          UnitCostQueryDefinition numeratorQuery,
      @JsonProperty(required = true, value = JSON_PROPERTY_ORG_ID) Long orgId,
      @JsonProperty(required = true, value = JSON_PROPERTY_UNIT_LABEL) String unitLabel,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_BY) UUID updatedBy) {
    this.createdAt = createdAt;
    this.createdBy = createdBy;
    this.denominatorQuery = denominatorQuery;
    this.unparsed |= denominatorQuery.unparsed;
    this.denominatorType = denominatorType;
    this.name = name;
    this.numeratorQuery = numeratorQuery;
    this.unparsed |= numeratorQuery.unparsed;
    this.orgId = orgId;
    this.unitLabel = unitLabel;
    this.updatedAt = updatedAt;
    this.updatedBy = updatedBy;
  }

  public UnitCostDataAttributesResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * The time the unit cost was created.
   *
   * @return createdAt
   */
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  public UnitCostDataAttributesResponse createdBy(UUID createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  /**
   * The UUID of the user who created the unit cost.
   *
   * @return createdBy
   */
  @JsonProperty(JSON_PROPERTY_CREATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(UUID createdBy) {
    this.createdBy = createdBy;
  }

  public UnitCostDataAttributesResponse denominatorQuery(UnitCostQueryDefinition denominatorQuery) {
    this.denominatorQuery = denominatorQuery;
    this.unparsed |= denominatorQuery.unparsed;
    return this;
  }

  /**
   * A timeseries object containing <code>queries</code> and <code>formulas</code> arrays.
   *
   * @return denominatorQuery
   */
  @JsonProperty(JSON_PROPERTY_DENOMINATOR_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UnitCostQueryDefinition getDenominatorQuery() {
    return denominatorQuery;
  }

  public void setDenominatorQuery(UnitCostQueryDefinition denominatorQuery) {
    this.denominatorQuery = denominatorQuery;
    if (denominatorQuery != null) {
      this.unparsed |= denominatorQuery.unparsed;
    }
  }

  public UnitCostDataAttributesResponse denominatorType(String denominatorType) {
    this.denominatorType = denominatorType;
    return this;
  }

  /**
   * The data source of the denominator queries, or <code>multisource</code> when the denominator
   * queries span more than one data source.
   *
   * @return denominatorType
   */
  @JsonProperty(JSON_PROPERTY_DENOMINATOR_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getDenominatorType() {
    return denominatorType;
  }

  public void setDenominatorType(String denominatorType) {
    this.denominatorType = denominatorType;
  }

  public UnitCostDataAttributesResponse description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * The description of the unit cost. Omitted when the unit cost has no description.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public UnitCostDataAttributesResponse name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the unit cost.
   *
   * @return name
   */
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public UnitCostDataAttributesResponse numeratorQuery(UnitCostQueryDefinition numeratorQuery) {
    this.numeratorQuery = numeratorQuery;
    this.unparsed |= numeratorQuery.unparsed;
    return this;
  }

  /**
   * A timeseries object containing <code>queries</code> and <code>formulas</code> arrays.
   *
   * @return numeratorQuery
   */
  @JsonProperty(JSON_PROPERTY_NUMERATOR_QUERY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UnitCostQueryDefinition getNumeratorQuery() {
    return numeratorQuery;
  }

  public void setNumeratorQuery(UnitCostQueryDefinition numeratorQuery) {
    this.numeratorQuery = numeratorQuery;
    if (numeratorQuery != null) {
      this.unparsed |= numeratorQuery.unparsed;
    }
  }

  public UnitCostDataAttributesResponse orgId(Long orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The ID of the organization the unit cost belongs to.
   *
   * @return orgId
   */
  @JsonProperty(JSON_PROPERTY_ORG_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getOrgId() {
    return orgId;
  }

  public void setOrgId(Long orgId) {
    this.orgId = orgId;
  }

  public UnitCostDataAttributesResponse unitLabel(String unitLabel) {
    this.unitLabel = unitLabel;
    return this;
  }

  /**
   * The label describing the denominator unit.
   *
   * @return unitLabel
   */
  @JsonProperty(JSON_PROPERTY_UNIT_LABEL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getUnitLabel() {
    return unitLabel;
  }

  public void setUnitLabel(String unitLabel) {
    this.unitLabel = unitLabel;
  }

  public UnitCostDataAttributesResponse updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * The time the unit cost was last updated.
   *
   * @return updatedAt
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }

  public UnitCostDataAttributesResponse updatedBy(UUID updatedBy) {
    this.updatedBy = updatedBy;
    return this;
  }

  /**
   * The UUID of the user who last updated the unit cost.
   *
   * @return updatedBy
   */
  @JsonProperty(JSON_PROPERTY_UPDATED_BY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getUpdatedBy() {
    return updatedBy;
  }

  public void setUpdatedBy(UUID updatedBy) {
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
   * @return UnitCostDataAttributesResponse
   */
  @JsonAnySetter
  public UnitCostDataAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UnitCostDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UnitCostDataAttributesResponse unitCostDataAttributesResponse =
        (UnitCostDataAttributesResponse) o;
    return Objects.equals(this.createdAt, unitCostDataAttributesResponse.createdAt)
        && Objects.equals(this.createdBy, unitCostDataAttributesResponse.createdBy)
        && Objects.equals(this.denominatorQuery, unitCostDataAttributesResponse.denominatorQuery)
        && Objects.equals(this.denominatorType, unitCostDataAttributesResponse.denominatorType)
        && Objects.equals(this.description, unitCostDataAttributesResponse.description)
        && Objects.equals(this.name, unitCostDataAttributesResponse.name)
        && Objects.equals(this.numeratorQuery, unitCostDataAttributesResponse.numeratorQuery)
        && Objects.equals(this.orgId, unitCostDataAttributesResponse.orgId)
        && Objects.equals(this.unitLabel, unitCostDataAttributesResponse.unitLabel)
        && Objects.equals(this.updatedAt, unitCostDataAttributesResponse.updatedAt)
        && Objects.equals(this.updatedBy, unitCostDataAttributesResponse.updatedBy)
        && Objects.equals(
            this.additionalProperties, unitCostDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        createdBy,
        denominatorQuery,
        denominatorType,
        description,
        name,
        numeratorQuery,
        orgId,
        unitLabel,
        updatedAt,
        updatedBy,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UnitCostDataAttributesResponse {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    denominatorQuery: ").append(toIndentedString(denominatorQuery)).append("\n");
    sb.append("    denominatorType: ").append(toIndentedString(denominatorType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    numeratorQuery: ").append(toIndentedString(numeratorQuery)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    unitLabel: ").append(toIndentedString(unitLabel)).append("\n");
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
