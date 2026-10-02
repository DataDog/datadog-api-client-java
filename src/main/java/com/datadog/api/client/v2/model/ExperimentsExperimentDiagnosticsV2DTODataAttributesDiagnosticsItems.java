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
import org.openapitools.jackson.nullable.JsonNullable;

/** Result of one diagnostic check for an experiment. */
@JsonPropertyOrder({
  ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems.JSON_PROPERTY_MESSAGE,
  ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems.JSON_PROPERTY_METRIC_ID,
  ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems.JSON_PROPERTY_SKIPPED_REASON,
  ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems.JSON_PROPERTY_STATUS,
  ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems.JSON_PROPERTY_TITLE,
  ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_MESSAGE = "message";
  private JsonNullable<String> message = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_METRIC_ID = "metric_id";
  private JsonNullable<String> metricId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SKIPPED_REASON = "skipped_reason";
  private JsonNullable<
          ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsSkippedReason>
      skippedReason =
          JsonNullable
              .<ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsSkippedReason>
                  undefined();

  public static final String JSON_PROPERTY_STATUS = "status";
  private ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus status;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType type;

  public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems() {}

  @JsonCreator
  public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems(
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus status,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType type) {
    this.status = status;
    this.unparsed |= !status.isValid();
    this.title = title;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems message(
      String message) {
    this.message = JsonNullable.<String>of(message);
    return this;
  }

  /**
   * Explanation of the diagnostic check result.
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getMessage() {
    return message.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMessage_JsonNullable() {
    return message;
  }

  @JsonProperty(JSON_PROPERTY_MESSAGE)
  public void setMessage_JsonNullable(JsonNullable<String> message) {
    this.message = message;
  }

  public void setMessage(String message) {
    this.message = JsonNullable.<String>of(message);
  }

  public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems metricId(
      String metricId) {
    this.metricId = JsonNullable.<String>of(metricId);
    return this;
  }

  /**
   * Identifier of the metric associated with this check.
   *
   * @return metricId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getMetricId() {
    return metricId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METRIC_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getMetricId_JsonNullable() {
    return metricId;
  }

  @JsonProperty(JSON_PROPERTY_METRIC_ID)
  public void setMetricId_JsonNullable(JsonNullable<String> metricId) {
    this.metricId = metricId;
  }

  public void setMetricId(String metricId) {
    this.metricId = JsonNullable.<String>of(metricId);
  }

  public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems skippedReason(
      ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsSkippedReason
          skippedReason) {
    this.skippedReason =
        JsonNullable
            .<ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsSkippedReason>of(
                skippedReason);
    return this;
  }

  /**
   * Reason the diagnostic check could not be evaluated.
   *
   * @return skippedReason
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsSkippedReason
      getSkippedReason() {
    return skippedReason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SKIPPED_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<
          ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsSkippedReason>
      getSkippedReason_JsonNullable() {
    return skippedReason;
  }

  @JsonProperty(JSON_PROPERTY_SKIPPED_REASON)
  public void setSkippedReason_JsonNullable(
      JsonNullable<ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsSkippedReason>
          skippedReason) {
    this.skippedReason = skippedReason;
  }

  public void setSkippedReason(
      ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsSkippedReason
          skippedReason) {
    if (!skippedReason.isValid()) {
      this.unparsed = true;
    }
    this.skippedReason =
        JsonNullable
            .<ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsSkippedReason>of(
                skippedReason);
  }

  public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems status(
      ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Outcome of an individual diagnostic check.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus getStatus() {
    return status;
  }

  public void setStatus(
      ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Short title of the diagnostic check.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems type(
      ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * Kind of diagnostic check performed.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType getType() {
    return type;
  }

  public void setType(
      ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItemsType type) {
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
   * @return ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems
   */
  @JsonAnySetter
  public ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems putAdditionalProperty(
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
   * Return true if this ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems object
   * is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems
        experimentsExperimentDiagnosticsV2DtoDataAttributesDiagnosticsItems =
            (ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems) o;
    return Objects.equals(
            this.message,
            experimentsExperimentDiagnosticsV2DtoDataAttributesDiagnosticsItems.message)
        && Objects.equals(
            this.metricId,
            experimentsExperimentDiagnosticsV2DtoDataAttributesDiagnosticsItems.metricId)
        && Objects.equals(
            this.skippedReason,
            experimentsExperimentDiagnosticsV2DtoDataAttributesDiagnosticsItems.skippedReason)
        && Objects.equals(
            this.status, experimentsExperimentDiagnosticsV2DtoDataAttributesDiagnosticsItems.status)
        && Objects.equals(
            this.title, experimentsExperimentDiagnosticsV2DtoDataAttributesDiagnosticsItems.title)
        && Objects.equals(
            this.type, experimentsExperimentDiagnosticsV2DtoDataAttributesDiagnosticsItems.type)
        && Objects.equals(
            this.additionalProperties,
            experimentsExperimentDiagnosticsV2DtoDataAttributesDiagnosticsItems
                .additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        message, metricId, skippedReason, status, title, type, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsExperimentDiagnosticsV2DTODataAttributesDiagnosticsItems {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metricId: ").append(toIndentedString(metricId)).append("\n");
    sb.append("    skippedReason: ").append(toIndentedString(skippedReason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
