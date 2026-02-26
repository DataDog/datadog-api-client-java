/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Attributes for updating a change request.</p>
 */
@JsonPropertyOrder({
  ChangeRequestUpdateAttributes.JSON_PROPERTY_CHANGE_REQUEST_PLAN,
  ChangeRequestUpdateAttributes.JSON_PROPERTY_CHANGE_REQUEST_RISK,
  ChangeRequestUpdateAttributes.JSON_PROPERTY_CHANGE_REQUEST_TYPE,
  ChangeRequestUpdateAttributes.JSON_PROPERTY_END_DATE,
  ChangeRequestUpdateAttributes.JSON_PROPERTY_ID,
  ChangeRequestUpdateAttributes.JSON_PROPERTY_START_DATE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ChangeRequestUpdateAttributes {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_CHANGE_REQUEST_PLAN = "change_request_plan";
  private String changeRequestPlan;

  public static final String JSON_PROPERTY_CHANGE_REQUEST_RISK = "change_request_risk";
  private ChangeRequestRiskLevel changeRequestRisk;

  public static final String JSON_PROPERTY_CHANGE_REQUEST_TYPE = "change_request_type";
  private ChangeRequestChangeType changeRequestType;

  public static final String JSON_PROPERTY_END_DATE = "end_date";
  private OffsetDateTime endDate;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_START_DATE = "start_date";
  private OffsetDateTime startDate;

  public ChangeRequestUpdateAttributes changeRequestPlan(String changeRequestPlan) {
    this.changeRequestPlan = changeRequestPlan;
    return this;
  }

  /**
   * <p>The plan associated with the change request.</p>
   * @return changeRequestPlan
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_PLAN)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getChangeRequestPlan() {
        return changeRequestPlan;
      }
  public void setChangeRequestPlan(String changeRequestPlan) {
    this.changeRequestPlan = changeRequestPlan;
  }
  public ChangeRequestUpdateAttributes changeRequestRisk(ChangeRequestRiskLevel changeRequestRisk) {
    this.changeRequestRisk = changeRequestRisk;
    this.unparsed |= !changeRequestRisk.isValid();
    return this;
  }

  /**
   * <p>The risk level of the change request.</p>
   * @return changeRequestRisk
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_RISK)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ChangeRequestRiskLevel getChangeRequestRisk() {
        return changeRequestRisk;
      }
  public void setChangeRequestRisk(ChangeRequestRiskLevel changeRequestRisk) {
    if (!changeRequestRisk.isValid()) {
        this.unparsed = true;
    }
    this.changeRequestRisk = changeRequestRisk;
  }
  public ChangeRequestUpdateAttributes changeRequestType(ChangeRequestChangeType changeRequestType) {
    this.changeRequestType = changeRequestType;
    this.unparsed |= !changeRequestType.isValid();
    return this;
  }

  /**
   * <p>The type of the change request.</p>
   * @return changeRequestType
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_CHANGE_REQUEST_TYPE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public ChangeRequestChangeType getChangeRequestType() {
        return changeRequestType;
      }
  public void setChangeRequestType(ChangeRequestChangeType changeRequestType) {
    if (!changeRequestType.isValid()) {
        this.unparsed = true;
    }
    this.changeRequestType = changeRequestType;
  }
  public ChangeRequestUpdateAttributes endDate(OffsetDateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * <p>The planned end date of the change request.</p>
   * @return endDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_END_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getEndDate() {
        return endDate;
      }
  public void setEndDate(OffsetDateTime endDate) {
    this.endDate = endDate;
  }
  public ChangeRequestUpdateAttributes id(String id) {
    this.id = id;
    return this;
  }

  /**
   * <p>The identifier of the change request to update.</p>
   * @return id
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getId() {
        return id;
      }
  public void setId(String id) {
    this.id = id;
  }
  public ChangeRequestUpdateAttributes startDate(OffsetDateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * <p>The planned start date of the change request.</p>
   * @return startDate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_START_DATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public OffsetDateTime getStartDate() {
        return startDate;
      }
  public void setStartDate(OffsetDateTime startDate) {
    this.startDate = startDate;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return ChangeRequestUpdateAttributes
   */
  @JsonAnySetter
  public ChangeRequestUpdateAttributes putAdditionalProperty(String key, Object value) {
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
   * Return true if this ChangeRequestUpdateAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChangeRequestUpdateAttributes changeRequestUpdateAttributes = (ChangeRequestUpdateAttributes) o;
    return Objects.equals(this.changeRequestPlan, changeRequestUpdateAttributes.changeRequestPlan) && Objects.equals(this.changeRequestRisk, changeRequestUpdateAttributes.changeRequestRisk) && Objects.equals(this.changeRequestType, changeRequestUpdateAttributes.changeRequestType) && Objects.equals(this.endDate, changeRequestUpdateAttributes.endDate) && Objects.equals(this.id, changeRequestUpdateAttributes.id) && Objects.equals(this.startDate, changeRequestUpdateAttributes.startDate) && Objects.equals(this.additionalProperties, changeRequestUpdateAttributes.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(changeRequestPlan,changeRequestRisk,changeRequestType,endDate,id,startDate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChangeRequestUpdateAttributes {\n");
    sb.append("    changeRequestPlan: ").append(toIndentedString(changeRequestPlan)).append("\n");
    sb.append("    changeRequestRisk: ").append(toIndentedString(changeRequestRisk)).append("\n");
    sb.append("    changeRequestType: ").append(toIndentedString(changeRequestType)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
