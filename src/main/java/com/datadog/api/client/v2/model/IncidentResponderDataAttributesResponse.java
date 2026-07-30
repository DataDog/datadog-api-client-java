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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes of an incident responder in a response. */
@JsonPropertyOrder({
  IncidentResponderDataAttributesResponse.JSON_PROPERTY_CREATED,
  IncidentResponderDataAttributesResponse.JSON_PROPERTY_EXTERNAL_ID,
  IncidentResponderDataAttributesResponse.JSON_PROPERTY_EXTERNAL_SOURCE,
  IncidentResponderDataAttributesResponse.JSON_PROPERTY_IS_BILLABLE,
  IncidentResponderDataAttributesResponse.JSON_PROPERTY_LAST_ACTIVE,
  IncidentResponderDataAttributesResponse.JSON_PROPERTY_META,
  IncidentResponderDataAttributesResponse.JSON_PROPERTY_MODIFIED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentResponderDataAttributesResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED = "created";
  private OffsetDateTime created;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "external_id";
  private JsonNullable<String> externalId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXTERNAL_SOURCE = "external_source";
  private JsonNullable<String> externalSource = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_IS_BILLABLE = "is_billable";
  private Boolean isBillable;

  public static final String JSON_PROPERTY_LAST_ACTIVE = "last_active";
  private JsonNullable<OffsetDateTime> lastActive = JsonNullable.<OffsetDateTime>undefined();

  public static final String JSON_PROPERTY_META = "meta";
  private JsonNullable<Map<String, Object>> meta = JsonNullable.<Map<String, Object>>undefined();

  public static final String JSON_PROPERTY_MODIFIED = "modified";
  private OffsetDateTime modified;

  public IncidentResponderDataAttributesResponse() {}

  @JsonCreator
  public IncidentResponderDataAttributesResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED) OffsetDateTime created,
      @JsonProperty(required = true, value = JSON_PROPERTY_IS_BILLABLE) Boolean isBillable,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODIFIED) OffsetDateTime modified) {
    this.created = created;
    this.isBillable = isBillable;
    this.modified = modified;
  }

  public IncidentResponderDataAttributesResponse created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Timestamp when the responder was created.
   *
   * @return created
   */
  @JsonProperty(JSON_PROPERTY_CREATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }

  public IncidentResponderDataAttributesResponse externalId(String externalId) {
    this.externalId = JsonNullable.<String>of(externalId);
    return this;
  }

  /**
   * The external ID of the responder.
   *
   * @return externalId
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getExternalId() {
    return externalId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getExternalId_JsonNullable() {
    return externalId;
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  public void setExternalId_JsonNullable(JsonNullable<String> externalId) {
    this.externalId = externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = JsonNullable.<String>of(externalId);
  }

  public IncidentResponderDataAttributesResponse externalSource(String externalSource) {
    this.externalSource = JsonNullable.<String>of(externalSource);
    return this;
  }

  /**
   * The external source of the responder.
   *
   * @return externalSource
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getExternalSource() {
    return externalSource.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getExternalSource_JsonNullable() {
    return externalSource;
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_SOURCE)
  public void setExternalSource_JsonNullable(JsonNullable<String> externalSource) {
    this.externalSource = externalSource;
  }

  public void setExternalSource(String externalSource) {
    this.externalSource = JsonNullable.<String>of(externalSource);
  }

  public IncidentResponderDataAttributesResponse isBillable(Boolean isBillable) {
    this.isBillable = isBillable;
    return this;
  }

  /**
   * Whether this responder counts toward billing.
   *
   * @return isBillable
   */
  @JsonProperty(JSON_PROPERTY_IS_BILLABLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getIsBillable() {
    return isBillable;
  }

  public void setIsBillable(Boolean isBillable) {
    this.isBillable = isBillable;
  }

  public IncidentResponderDataAttributesResponse lastActive(OffsetDateTime lastActive) {
    this.lastActive = JsonNullable.<OffsetDateTime>of(lastActive);
    return this;
  }

  /**
   * Timestamp when the responder was last active.
   *
   * @return lastActive
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public OffsetDateTime getLastActive() {
    return lastActive.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_ACTIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<OffsetDateTime> getLastActive_JsonNullable() {
    return lastActive;
  }

  @JsonProperty(JSON_PROPERTY_LAST_ACTIVE)
  public void setLastActive_JsonNullable(JsonNullable<OffsetDateTime> lastActive) {
    this.lastActive = lastActive;
  }

  public void setLastActive(OffsetDateTime lastActive) {
    this.lastActive = JsonNullable.<OffsetDateTime>of(lastActive);
  }

  public IncidentResponderDataAttributesResponse meta(Map<String, Object> meta) {
    this.meta = JsonNullable.<Map<String, Object>>of(meta);
    return this;
  }

  public IncidentResponderDataAttributesResponse putMetaItem(String key, Object metaItem) {
    if (this.meta == null || !this.meta.isPresent()) {
      this.meta = JsonNullable.<Map<String, Object>>of(new HashMap<>());
    }
    try {
      this.meta.get().put(key, metaItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * Additional metadata for the responder.
   *
   * @return meta
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public Map<String, Object> getMeta() {
    return meta.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<Map<String, Object>> getMeta_JsonNullable() {
    return meta;
  }

  @JsonProperty(JSON_PROPERTY_META)
  public void setMeta_JsonNullable(JsonNullable<Map<String, Object>> meta) {
    this.meta = meta;
  }

  public void setMeta(Map<String, Object> meta) {
    this.meta = JsonNullable.<Map<String, Object>>of(meta);
  }

  public IncidentResponderDataAttributesResponse modified(OffsetDateTime modified) {
    this.modified = modified;
    return this;
  }

  /**
   * Timestamp when the responder was last modified.
   *
   * @return modified
   */
  @JsonProperty(JSON_PROPERTY_MODIFIED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public OffsetDateTime getModified() {
    return modified;
  }

  public void setModified(OffsetDateTime modified) {
    this.modified = modified;
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
   * @return IncidentResponderDataAttributesResponse
   */
  @JsonAnySetter
  public IncidentResponderDataAttributesResponse putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentResponderDataAttributesResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentResponderDataAttributesResponse incidentResponderDataAttributesResponse =
        (IncidentResponderDataAttributesResponse) o;
    return Objects.equals(this.created, incidentResponderDataAttributesResponse.created)
        && Objects.equals(this.externalId, incidentResponderDataAttributesResponse.externalId)
        && Objects.equals(
            this.externalSource, incidentResponderDataAttributesResponse.externalSource)
        && Objects.equals(this.isBillable, incidentResponderDataAttributesResponse.isBillable)
        && Objects.equals(this.lastActive, incidentResponderDataAttributesResponse.lastActive)
        && Objects.equals(this.meta, incidentResponderDataAttributesResponse.meta)
        && Objects.equals(this.modified, incidentResponderDataAttributesResponse.modified)
        && Objects.equals(
            this.additionalProperties,
            incidentResponderDataAttributesResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        created,
        externalId,
        externalSource,
        isBillable,
        lastActive,
        meta,
        modified,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentResponderDataAttributesResponse {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    externalSource: ").append(toIndentedString(externalSource)).append("\n");
    sb.append("    isBillable: ").append(toIndentedString(isBillable)).append("\n");
    sb.append("    lastActive: ").append(toIndentedString(lastActive)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    modified: ").append(toIndentedString(modified)).append("\n");
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
