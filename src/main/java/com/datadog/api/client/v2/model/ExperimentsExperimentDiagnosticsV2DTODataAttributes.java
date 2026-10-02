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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/** Diagnostic check results and their evaluation state. */
@JsonPropertyOrder({
  ExperimentsExperimentDiagnosticsV2DTODataAttributes.JSON_PROPERTY_DIAGNOSTICS,
  ExperimentsExperimentDiagnosticsV2DTODataAttributes.JSON_PROPERTY_EVALUATED_AT,
  ExperimentsExperimentDiagnosticsV2DTODataAttributes.JSON_PROPERTY_RESULT,
  ExperimentsExperimentDiagnosticsV2DTODataAttributes.JSON_PROPERTY_STATE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsExperimentDiagnosticsV2DTODataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DIAGNOSTICS = "diagnostics";
  private List<ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems> diagnostics =
      new ArrayList<>();

  public static final String JSON_PROPERTY_EVALUATED_AT = "evaluated_at";
  private JsonNullable<OffsetDateTime> evaluatedAt = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_RESULT = "result";
  private JsonNullable<ExperimentsExperimentDiagnosticsV2DTODataAttributesResult> result =
      JsonNullable.<ExperimentsExperimentDiagnosticsV2DTODataAttributesResult>undefined();

  public static final String JSON_PROPERTY_STATE = "state";
  private ExperimentsExperimentDiagnosticsV2DTODataAttributesState state;

  public ExperimentsExperimentDiagnosticsV2DTODataAttributes() {}

  @JsonCreator
  public ExperimentsExperimentDiagnosticsV2DTODataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DIAGNOSTICS)
          List<ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems> diagnostics,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATE)
          ExperimentsExperimentDiagnosticsV2DTODataAttributesState state) {
    this.diagnostics = diagnostics;
    for (ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems item : diagnostics) {
      this.unparsed |= item.unparsed;
    }
    this.state = state;
    this.unparsed |= !state.isValid();
  }

  public ExperimentsExperimentDiagnosticsV2DTODataAttributes diagnostics(
      List<ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems> diagnostics) {
    this.diagnostics = diagnostics;
    for (ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems item : diagnostics) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public ExperimentsExperimentDiagnosticsV2DTODataAttributes addDiagnosticsItem(
      ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems diagnosticsItem) {
    this.diagnostics.add(diagnosticsItem);
    this.unparsed |= diagnosticsItem.unparsed;
    return this;
  }

  /**
   * Results of individual diagnostic checks.
   *
   * @return diagnostics
   */
  @JsonProperty(JSON_PROPERTY_DIAGNOSTICS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems>
      getDiagnostics() {
    return diagnostics;
  }

  public void setDiagnostics(
      List<ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems> diagnostics) {
    this.diagnostics = diagnostics;
    if (diagnostics != null) {
      for (ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems item : diagnostics) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ExperimentsExperimentDiagnosticsV2DTODataAttributes evaluatedAt(
      OffsetDateTime evaluatedAt) {
    this.evaluatedAt = JsonNullable.<OffsetDateTime>of(evaluatedAt);
    return this;
  }

  /**
   * Time when the diagnostic checks were evaluated.
   *
   * @return evaluatedAt
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getEvaluatedAt() {
    return evaluatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EVALUATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getEvaluatedAt_JsonNullable() {
    return evaluatedAt;
  }

  @JsonProperty(JSON_PROPERTY_EVALUATED_AT)
  public void setEvaluatedAt_JsonNullable(JsonNullable<OffsetDateTime> evaluatedAt) {
    this.evaluatedAt = evaluatedAt;
  }

  public void setEvaluatedAt(OffsetDateTime evaluatedAt) {
    this.evaluatedAt = JsonNullable.<OffsetDateTime>of(evaluatedAt);
  }

  public ExperimentsExperimentDiagnosticsV2DTODataAttributes result(
      ExperimentsExperimentDiagnosticsV2DTODataAttributesResult result) {
    this.result =
        JsonNullable.<ExperimentsExperimentDiagnosticsV2DTODataAttributesResult>of(result);
    return this;
  }

  /**
   * Overall result of the experiment diagnostic checks.
   *
   * @return result
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsExperimentDiagnosticsV2DTODataAttributesResult getResult() {
    return result.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_RESULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<ExperimentsExperimentDiagnosticsV2DTODataAttributesResult>
      getResult_JsonNullable() {
    return result;
  }

  @JsonProperty(JSON_PROPERTY_RESULT)
  public void setResult_JsonNullable(
      JsonNullable<ExperimentsExperimentDiagnosticsV2DTODataAttributesResult> result) {
    this.result = result;
  }

  public void setResult(ExperimentsExperimentDiagnosticsV2DTODataAttributesResult result) {
    if (!result.isValid()) {
      this.unparsed = true;
    }
    this.result =
        JsonNullable.<ExperimentsExperimentDiagnosticsV2DTODataAttributesResult>of(result);
  }

  public ExperimentsExperimentDiagnosticsV2DTODataAttributes state(
      ExperimentsExperimentDiagnosticsV2DTODataAttributesState state) {
    this.state = state;
    this.unparsed |= !state.isValid();
    return this;
  }

  /**
   * Current state of the diagnostic evaluation.
   *
   * @return state
   */
  @JsonProperty(JSON_PROPERTY_STATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsExperimentDiagnosticsV2DTODataAttributesState getState() {
    return state;
  }

  public void setState(ExperimentsExperimentDiagnosticsV2DTODataAttributesState state) {
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
   * @return ExperimentsExperimentDiagnosticsV2DTODataAttributes
   */
  @JsonAnySetter
  public ExperimentsExperimentDiagnosticsV2DTODataAttributes putAdditionalProperty(
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
   * Return true if this ExperimentsExperimentDiagnosticsV2DTODataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsExperimentDiagnosticsV2DTODataAttributes
        experimentsExperimentDiagnosticsV2DtoDataAttributes =
            (ExperimentsExperimentDiagnosticsV2DTODataAttributes) o;
    return Objects.equals(
            this.diagnostics, experimentsExperimentDiagnosticsV2DtoDataAttributes.diagnostics)
        && Objects.equals(
            this.evaluatedAt, experimentsExperimentDiagnosticsV2DtoDataAttributes.evaluatedAt)
        && Objects.equals(this.result, experimentsExperimentDiagnosticsV2DtoDataAttributes.result)
        && Objects.equals(this.state, experimentsExperimentDiagnosticsV2DtoDataAttributes.state)
        && Objects.equals(
            this.additionalProperties,
            experimentsExperimentDiagnosticsV2DtoDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(diagnostics, evaluatedAt, result, state, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsExperimentDiagnosticsV2DTODataAttributes {\n");
    sb.append("    diagnostics: ").append(toIndentedString(diagnostics)).append("\n");
    sb.append("    evaluatedAt: ").append(toIndentedString(evaluatedAt)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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
