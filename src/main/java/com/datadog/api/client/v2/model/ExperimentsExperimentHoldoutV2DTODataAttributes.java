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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of a holdout that the experiment is attached to. */
@JsonPropertyOrder({
  ExperimentsExperimentHoldoutV2DTODataAttributes.JSON_PROPERTY_EVALUATION_ORDER,
  ExperimentsExperimentHoldoutV2DTODataAttributes.JSON_PROPERTY_HOLDOUT_TYPE,
  ExperimentsExperimentHoldoutV2DTODataAttributes.JSON_PROPERTY_KEY,
  ExperimentsExperimentHoldoutV2DTODataAttributes.JSON_PROPERTY_KIND,
  ExperimentsExperimentHoldoutV2DTODataAttributes.JSON_PROPERTY_NAME,
  ExperimentsExperimentHoldoutV2DTODataAttributes.JSON_PROPERTY_STATE,
  ExperimentsExperimentHoldoutV2DTODataAttributes.JSON_PROPERTY_TRAFFIC_ALLOCATION
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsExperimentHoldoutV2DTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_EVALUATION_ORDER = "evaluation_order";
  private JsonNullable<Long> evaluationOrder = JsonNullable.<Long>undefined();

  public static final String JSON_PROPERTY_HOLDOUT_TYPE = "holdout_type";
  private JsonNullable<ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType> holdoutType =
      JsonNullable.<ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType>undefined();

  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_KIND = "kind";
  private ExperimentsExperimentHoldoutV2DTODataAttributesKind kind;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_STATE = "state";
  private ExperimentsExperimentHoldoutV2DTODataAttributesState state;

  public static final String JSON_PROPERTY_TRAFFIC_ALLOCATION = "traffic_allocation";
  private Double trafficAllocation;

  public ExperimentsExperimentHoldoutV2DTODataAttributes evaluationOrder(Long evaluationOrder) {
    this.evaluationOrder = JsonNullable.<Long>of(evaluationOrder);
    return this;
  }

  /**
   * Zero-based position of this MANAGED holdout in the experiment's evaluation order. The GLOBAL
   * holdout is evaluated first. Null for EXTERNAL holdouts.
   *
   * @return evaluationOrder
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Long getEvaluationOrder() {
    return evaluationOrder.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVALUATION_ORDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Long> getEvaluationOrder_JsonNullable() {
    return evaluationOrder;
  }

  @JsonProperty(JSON_PROPERTY_EVALUATION_ORDER)
  public void setEvaluationOrder_JsonNullable(JsonNullable<Long> evaluationOrder) {
    this.evaluationOrder = evaluationOrder;
  }

  public void setEvaluationOrder(Long evaluationOrder) {
    this.evaluationOrder = JsonNullable.<Long>of(evaluationOrder);
  }

  public ExperimentsExperimentHoldoutV2DTODataAttributes holdoutType(
      ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType holdoutType) {
    this.holdoutType =
        JsonNullable.<ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType>of(holdoutType);
    return this;
  }

  /**
   * How Datadog serves a MANAGED holdout. GLOBAL holdouts apply to every eligible experiment of a
   * subject type. SELECTIVE holdouts apply only to the experiments attached to them. Null for
   * EXTERNAL holdouts.
   *
   * @return holdoutType
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType getHoldoutType() {
    return holdoutType.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_HOLDOUT_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType>
      getHoldoutType_JsonNullable() {
    return holdoutType;
  }

  @JsonProperty(JSON_PROPERTY_HOLDOUT_TYPE)
  public void setHoldoutType_JsonNullable(
      JsonNullable<ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType> holdoutType) {
    this.holdoutType = holdoutType;
  }

  public void setHoldoutType(
      ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType holdoutType) {
    if (!holdoutType.isValid()) {
      this.unparsed = true;
    }
    this.holdoutType =
        JsonNullable.<ExperimentsExperimentHoldoutV2DTODataAttributesHoldoutType>of(holdoutType);
  }

  public ExperimentsExperimentHoldoutV2DTODataAttributes key(String key) {
    this.key = key;
    return this;
  }

  /**
   * Key of the holdout.
   *
   * @return key
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public ExperimentsExperimentHoldoutV2DTODataAttributes kind(
      ExperimentsExperimentHoldoutV2DTODataAttributesKind kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    return this;
  }

  /**
   * Whether Datadog serves the holdout. Datadog serves MANAGED holdouts. EXTERNAL holdouts record
   * what your own feature flagging system holds back, and Datadog does not serve them.
   *
   * @return kind
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsExperimentHoldoutV2DTODataAttributesKind getKind() {
    return kind;
  }

  public void setKind(ExperimentsExperimentHoldoutV2DTODataAttributesKind kind) {
    if (!kind.isValid()) {
      this.unparsed = true;
    }
    this.kind = kind;
  }

  public ExperimentsExperimentHoldoutV2DTODataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the holdout.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ExperimentsExperimentHoldoutV2DTODataAttributes state(
      ExperimentsExperimentHoldoutV2DTODataAttributesState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * Lifecycle phase of the holdout. PENDING holdouts have not started including experiments.
   * INCLUDING holdouts are adding experiments. WAITING_FOR_ANALYSIS holdouts have stopped including
   * experiments but have not started analysis. ANALYSING holdouts are in their analysis window.
   * COMPLETE applies only to EXTERNAL holdouts that have ended their analysis window but are not
   * archived.
   *
   * @return state
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ExperimentsExperimentHoldoutV2DTODataAttributesState getState() {
    return state;
  }

  public void setState(ExperimentsExperimentHoldoutV2DTODataAttributesState state) {
    if (!state.isValid()) {
      this.unparsed = true;
    }
    this.state = state;
  }

  public ExperimentsExperimentHoldoutV2DTODataAttributes trafficAllocation(
      Double trafficAllocation) {
    this.trafficAllocation = trafficAllocation;
    return this;
  }

  /**
   * Share of subjects the holdout holds back, from 0 to 1.
   *
   * @return trafficAllocation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRAFFIC_ALLOCATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Double getTrafficAllocation() {
    return trafficAllocation;
  }

  public void setTrafficAllocation(Double trafficAllocation) {
    this.trafficAllocation = trafficAllocation;
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
   * @return ExperimentsExperimentHoldoutV2DTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsExperimentHoldoutV2DTODataAttributes putAdditionalProperty(
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

  /** Return true if this ExperimentsExperimentHoldoutV2DTODataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsExperimentHoldoutV2DTODataAttributes
        experimentsExperimentHoldoutV2DtoDataAttributes =
            (ExperimentsExperimentHoldoutV2DTODataAttributes) o;
    return Objects.equals(
            this.evaluationOrder, experimentsExperimentHoldoutV2DtoDataAttributes.evaluationOrder)
        && Objects.equals(
            this.holdoutType, experimentsExperimentHoldoutV2DtoDataAttributes.holdoutType)
        && Objects.equals(this.key, experimentsExperimentHoldoutV2DtoDataAttributes.key)
        && Objects.equals(this.kind, experimentsExperimentHoldoutV2DtoDataAttributes.kind)
        && Objects.equals(this.name, experimentsExperimentHoldoutV2DtoDataAttributes.name)
        && Objects.equals(this.state, experimentsExperimentHoldoutV2DtoDataAttributes.state)
        && Objects.equals(
            this.trafficAllocation,
            experimentsExperimentHoldoutV2DtoDataAttributes.trafficAllocation)
        && Objects.equals(
            this.additionalProperties,
            experimentsExperimentHoldoutV2DtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        evaluationOrder,
        holdoutType,
        key,
        kind,
        name,
        state,
        trafficAllocation,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsExperimentHoldoutV2DTODataAttributes {\n");
    sb.append("    evaluationOrder: ").append(toIndentedString(evaluationOrder)).append("\n");
    sb.append("    holdoutType: ").append(toIndentedString(holdoutType)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    trafficAllocation: ").append(toIndentedString(trafficAllocation)).append("\n");
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
