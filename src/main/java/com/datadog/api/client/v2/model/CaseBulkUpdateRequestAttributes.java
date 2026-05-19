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

/** Attributes for the bulk update, specifying which cases to update and the action to apply. */
@JsonPropertyOrder({
  CaseBulkUpdateRequestAttributes.JSON_PROPERTY_CASE_IDS,
  CaseBulkUpdateRequestAttributes.JSON_PROPERTY_PAYLOAD,
  CaseBulkUpdateRequestAttributes.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CaseBulkUpdateRequestAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CASE_IDS = "case_ids";
  private List<String> caseIds = new ArrayList<>();

  public static final String JSON_PROPERTY_PAYLOAD = "payload";
  private Map<String, String> payload = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private CaseBulkActionType type;

  public CaseBulkUpdateRequestAttributes() {}

  @JsonCreator
  public CaseBulkUpdateRequestAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CASE_IDS) List<String> caseIds,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) CaseBulkActionType type) {
    this.caseIds = caseIds;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public CaseBulkUpdateRequestAttributes caseIds(List<String> caseIds) {
    this.caseIds = caseIds;
    return this;
  }

  public CaseBulkUpdateRequestAttributes addCaseIdsItem(String caseIdsItem) {
    this.caseIds.add(caseIdsItem);
    return this;
  }

  /**
   * An array of case identifiers to apply the bulk action to.
   *
   * @return caseIds
   */
  @JsonProperty(JSON_PROPERTY_CASE_IDS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<String> getCaseIds() {
    return caseIds;
  }

  public void setCaseIds(List<String> caseIds) {
    this.caseIds = caseIds;
  }

  public CaseBulkUpdateRequestAttributes payload(Map<String, String> payload) {
    this.payload = payload;
    return this;
  }

  public CaseBulkUpdateRequestAttributes putPayloadItem(String key, String payloadItem) {
    if (this.payload == null) {
      this.payload = new HashMap<>();
    }
    this.payload.put(key, payloadItem);
    return this;
  }

  /**
   * A key-value map of action-specific parameters. The required keys depend on the action type (for
   * example, <code>priority</code> for the priority action, <code>assignee_id</code> for assign).
   *
   * @return payload
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAYLOAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getPayload() {
    return payload;
  }

  public void setPayload(Map<String, String> payload) {
    this.payload = payload;
  }

  public CaseBulkUpdateRequestAttributes type(CaseBulkActionType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The type of action to apply in a bulk update. Allowed values are <code>priority</code>, <code>
   * status</code>, <code>assign</code>, <code>unassign</code>, <code>archive</code>, <code>
   * unarchive</code>, <code>jira</code>, <code>servicenow</code>, <code>linear</code>, <code>
   * update_project</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public CaseBulkActionType getType() {
    return type;
  }

  public void setType(CaseBulkActionType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return CaseBulkUpdateRequestAttributes
   */
  @JsonAnySetter
  public CaseBulkUpdateRequestAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CaseBulkUpdateRequestAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CaseBulkUpdateRequestAttributes caseBulkUpdateRequestAttributes =
        (CaseBulkUpdateRequestAttributes) o;
    return Objects.equals(this.caseIds, caseBulkUpdateRequestAttributes.caseIds)
        && Objects.equals(this.payload, caseBulkUpdateRequestAttributes.payload)
        && Objects.equals(this.type, caseBulkUpdateRequestAttributes.type)
        && Objects.equals(
            this.additionalProperties, caseBulkUpdateRequestAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caseIds, payload, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CaseBulkUpdateRequestAttributes {\n");
    sb.append("    caseIds: ").append(toIndentedString(caseIds)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
