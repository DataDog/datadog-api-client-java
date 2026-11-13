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

/** The most recently started refresh. Null until one starts. */
@JsonPropertyOrder({
  ExperimentsBanditRefreshV2.JSON_PROPERTY_CREATED_AT,
  ExperimentsBanditRefreshV2.JSON_PROPERTY_ENDED_AT,
  ExperimentsBanditRefreshV2.JSON_PROPERTY_ID,
  ExperimentsBanditRefreshV2.JSON_PROPERTY_STARTED_AT,
  ExperimentsBanditRefreshV2.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ExperimentsBanditRefreshV2 {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ENDED_AT = "ended_at";
  private OffsetDateTime endedAt;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_STARTED_AT = "started_at";
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_STATUS = "status";
  private ExperimentsBanditRefreshStatus status;

  public ExperimentsBanditRefreshV2() {}

  @JsonCreator
  public ExperimentsBanditRefreshV2(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENDED_AT) OffsetDateTime endedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) UUID id,
      @JsonProperty(required = true, value = JSON_PROPERTY_STARTED_AT) OffsetDateTime startedAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          ExperimentsBanditRefreshStatus status) {
    this.createdAt = createdAt;
    this.endedAt = endedAt;
    if (endedAt != null) {}
    this.id = id;
    this.startedAt = startedAt;
    if (startedAt != null) {}
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public ExperimentsBanditRefreshV2 createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * When the refresh was requested.
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

  public ExperimentsBanditRefreshV2 endedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
    if (endedAt != null) {}
    return this;
  }

  /**
   * When the refresh finished. Null while it runs.
   *
   * @return endedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ENDED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getEndedAt() {
    return endedAt;
  }

  public void setEndedAt(OffsetDateTime endedAt) {
    this.endedAt = endedAt;
  }

  public ExperimentsBanditRefreshV2 id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * The refresh ID.
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public ExperimentsBanditRefreshV2 startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    if (startedAt != null) {}
    return this;
  }

  /**
   * When the refresh started running. Null while it is pending.
   *
   * @return startedAt
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }

  public ExperimentsBanditRefreshV2 status(ExperimentsBanditRefreshStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the refresh.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ExperimentsBanditRefreshStatus getStatus() {
    return status;
  }

  public void setStatus(ExperimentsBanditRefreshStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
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
   * @return ExperimentsBanditRefreshV2
   */
  @JsonAnySetter
  public ExperimentsBanditRefreshV2 putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ExperimentsBanditRefreshV2 object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExperimentsBanditRefreshV2 experimentsBanditRefreshV2 = (ExperimentsBanditRefreshV2) o;
    return Objects.equals(this.createdAt, experimentsBanditRefreshV2.createdAt)
        && Objects.equals(this.endedAt, experimentsBanditRefreshV2.endedAt)
        && Objects.equals(this.id, experimentsBanditRefreshV2.id)
        && Objects.equals(this.startedAt, experimentsBanditRefreshV2.startedAt)
        && Objects.equals(this.status, experimentsBanditRefreshV2.status)
        && Objects.equals(
            this.additionalProperties, experimentsBanditRefreshV2.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, endedAt, id, startedAt, status, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExperimentsBanditRefreshV2 {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    endedAt: ").append(toIndentedString(endedAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
