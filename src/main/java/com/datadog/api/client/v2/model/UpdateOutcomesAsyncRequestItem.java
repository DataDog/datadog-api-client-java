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

/** Scorecard outcome for a single entity and rule. */
@JsonPropertyOrder({
  UpdateOutcomesAsyncRequestItem.JSON_PROPERTY_ENTITY_REFERENCE,
  UpdateOutcomesAsyncRequestItem.JSON_PROPERTY_REMARKS,
  UpdateOutcomesAsyncRequestItem.JSON_PROPERTY_RULE_ID,
  UpdateOutcomesAsyncRequestItem.JSON_PROPERTY_STATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class UpdateOutcomesAsyncRequestItem {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ENTITY_REFERENCE = "entity_reference";
  private String entityReference;

  public static final String JSON_PROPERTY_REMARKS = "remarks";
  private String remarks;

  public static final String JSON_PROPERTY_RULE_ID = "rule_id";
  private String ruleId;

  public static final String JSON_PROPERTY_STATE = "state";
  private State state;

  public UpdateOutcomesAsyncRequestItem() {}

  @JsonCreator
  public UpdateOutcomesAsyncRequestItem(
      @JsonProperty(required = true, value = JSON_PROPERTY_ENTITY_REFERENCE) String entityReference,
      @JsonProperty(required = true, value = JSON_PROPERTY_RULE_ID) String ruleId,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATE) State state) {
    this.entityReference = entityReference;
    this.ruleId = ruleId;
    this.state = state;
    this.unparsed |= !state.isValid();
  }

  public UpdateOutcomesAsyncRequestItem entityReference(String entityReference) {
    this.entityReference = entityReference;
    return this;
  }

  /**
   * The unique reference for an IDP entity.
   *
   * @return entityReference
   */
  @JsonProperty(JSON_PROPERTY_ENTITY_REFERENCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getEntityReference() {
    return entityReference;
  }

  public void setEntityReference(String entityReference) {
    this.entityReference = entityReference;
  }

  public UpdateOutcomesAsyncRequestItem remarks(String remarks) {
    this.remarks = remarks;
    return this;
  }

  /**
   * Any remarks regarding the scorecard rule's evaluation. Supports HTML hyperlinks.
   *
   * @return remarks
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REMARKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
  }

  public UpdateOutcomesAsyncRequestItem ruleId(String ruleId) {
    this.ruleId = ruleId;
    return this;
  }

  /**
   * The unique ID for a scorecard rule.
   *
   * @return ruleId
   */
  @JsonProperty(JSON_PROPERTY_RULE_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getRuleId() {
    return ruleId;
  }

  public void setRuleId(String ruleId) {
    this.ruleId = ruleId;
  }

  public UpdateOutcomesAsyncRequestItem state(State state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * The state of the rule evaluation.
   *
   * @return state
   */
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public State getState() {
    return state;
  }

  public void setState(State state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
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
   * @return UpdateOutcomesAsyncRequestItem
   */
  @JsonAnySetter
  public UpdateOutcomesAsyncRequestItem putAdditionalProperty(String key, Object value) {
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

  /** Return true if this UpdateOutcomesAsyncRequestItem object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOutcomesAsyncRequestItem updateOutcomesAsyncRequestItem =
        (UpdateOutcomesAsyncRequestItem) o;
    return Objects.equals(this.entityReference, updateOutcomesAsyncRequestItem.entityReference)
        && Objects.equals(this.remarks, updateOutcomesAsyncRequestItem.remarks)
        && Objects.equals(this.ruleId, updateOutcomesAsyncRequestItem.ruleId)
        && Objects.equals(this.state, updateOutcomesAsyncRequestItem.state)
        && Objects.equals(
            this.additionalProperties, updateOutcomesAsyncRequestItem.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(entityReference, remarks, ruleId, state, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOutcomesAsyncRequestItem {\n");
    sb.append("    entityReference: ").append(toIndentedString(entityReference)).append("\n");
    sb.append("    remarks: ").append(toIndentedString(remarks)).append("\n");
    sb.append("    ruleId: ").append(toIndentedString(ruleId)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
