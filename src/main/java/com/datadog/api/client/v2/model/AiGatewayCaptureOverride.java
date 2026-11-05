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
import java.util.UUID;

/** Saved data capture override with its request filters, capture mode, revision, and timestamps. */
@JsonPropertyOrder({
  AiGatewayCaptureOverride.JSON_PROPERTY_CREATED_AT,
  AiGatewayCaptureOverride.JSON_PROPERTY_ID,
  AiGatewayCaptureOverride.JSON_PROPERTY_METADATA_CAPTURE,
  AiGatewayCaptureOverride.JSON_PROPERTY_MODE,
  AiGatewayCaptureOverride.JSON_PROPERTY_NAME,
  AiGatewayCaptureOverride.JSON_PROPERTY_REVISION,
  AiGatewayCaptureOverride.JSON_PROPERTY_SCOPE,
  AiGatewayCaptureOverride.JSON_PROPERTY_SCOPE_RESTRICTED,
  AiGatewayCaptureOverride.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayCaptureOverride {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ID = "id";
  private UUID id;

  public static final String JSON_PROPERTY_METADATA_CAPTURE = "metadata_capture";
  private List<AiGatewayMetadataCaptureItem> metadataCapture = null;

  public static final String JSON_PROPERTY_MODE = "mode";
  private AiGatewayCaptureOverrideMode mode;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REVISION = "revision";
  private Long revision;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private AiGatewayCaptureResponseScope scope;

  public static final String JSON_PROPERTY_SCOPE_RESTRICTED = "scope_restricted";
  private Boolean scopeRestricted;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public AiGatewayCaptureOverride() {}

  @JsonCreator
  public AiGatewayCaptureOverride(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) UUID id,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE) AiGatewayCaptureOverrideMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_REVISION) Long revision,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE)
          AiGatewayCaptureResponseScope scope,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE_RESTRICTED)
          Boolean scopeRestricted,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.createdAt = createdAt;
    this.id = id;
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.name = name;
    this.revision = revision;
    this.scope = scope;
    this.unparsed |= scope.unparsed;
    this.scopeRestricted = scopeRestricted;
    this.updatedAt = updatedAt;
  }

  public AiGatewayCaptureOverride createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Timestamp when the override was created.
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

  public AiGatewayCaptureOverride id(UUID id) {
    this.id = id;
    return this;
  }

  /**
   * UUID identifying the override within the organization.
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

  public AiGatewayCaptureOverride metadataCapture(
      List<AiGatewayMetadataCaptureItem> metadataCapture) {
    this.metadataCapture = metadataCapture;
    return this;
  }

  public AiGatewayCaptureOverride addMetadataCaptureItem(
      AiGatewayMetadataCaptureItem metadataCaptureItem) {
    if (this.metadataCapture == null) {
      this.metadataCapture = new ArrayList<>();
    }
    this.metadataCapture.add(metadataCaptureItem);
    this.unparsed |= !metadataCaptureItem.isValid();
    return this;
  }

  /**
   * Items Metadata-only capture adds, each listed once. An item requires the items whose
   * information it already reveals: <code>tool_output_size</code>, <code>tool_names</code> and
   * <code>conversation_shape</code> require <code>tool_usage</code>, and <code>input_size_by_role
   * </code> requires <code>tool_output_size</code>. A set that leaves out a required item is
   * rejected. When several Metadata-only overrides match a request, it gets only the items all of
   * them select.
   *
   * @return metadataCapture
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AiGatewayMetadataCaptureItem> getMetadataCapture() {
    return metadataCapture;
  }

  public void setMetadataCapture(List<AiGatewayMetadataCaptureItem> metadataCapture) {
    this.metadataCapture = metadataCapture;
  }

  public AiGatewayCaptureOverride mode(AiGatewayCaptureOverrideMode mode) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    return this;
  }

  /**
   * Capture mode for matching traffic.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayCaptureOverrideMode getMode() {
    return mode;
  }

  public void setMode(AiGatewayCaptureOverrideMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public AiGatewayCaptureOverride name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Display name of the override. Names need not be unique; identify overrides by <code>id</code>.
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

  public AiGatewayCaptureOverride revision(Long revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Current override revision, required for replacement or deletion.
   *
   * @return revision
   */
  @JsonProperty(JSON_PROPERTY_REVISION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getRevision() {
    return revision;
  }

  public void setRevision(Long revision) {
    this.revision = revision;
  }

  public AiGatewayCaptureOverride scope(AiGatewayCaptureResponseScope scope) {
    this.scope = scope;
    this.unparsed |= scope.unparsed;
    return this;
  }

  /**
   * Visible request filters. Provider and model tags are withheld when the caller cannot view them.
   * An empty object or empty tags can represent a fully restricted scope; scope_restricted
   * identifies redaction.
   *
   * @return scope
   */
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayCaptureResponseScope getScope() {
    return scope;
  }

  public void setScope(AiGatewayCaptureResponseScope scope) {
    this.scope = scope;
    if (scope != null) {
      this.unparsed |= scope.unparsed;
    }
  }

  public AiGatewayCaptureOverride scopeRestricted(Boolean scopeRestricted) {
    this.scopeRestricted = scopeRestricted;
    return this;
  }

  /**
   * Whether provider or model scope metadata was withheld. Omit unchanged scope fields on an
   * unrelated update to preserve their saved values.
   *
   * @return scopeRestricted
   */
  @JsonProperty(JSON_PROPERTY_SCOPE_RESTRICTED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getScopeRestricted() {
    return scopeRestricted;
  }

  public void setScopeRestricted(Boolean scopeRestricted) {
    this.scopeRestricted = scopeRestricted;
  }

  public AiGatewayCaptureOverride updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Timestamp when the override was last modified.
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
   * @return AiGatewayCaptureOverride
   */
  @JsonAnySetter
  public AiGatewayCaptureOverride putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayCaptureOverride object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayCaptureOverride aiGatewayCaptureOverride = (AiGatewayCaptureOverride) o;
    return Objects.equals(this.createdAt, aiGatewayCaptureOverride.createdAt)
        && Objects.equals(this.id, aiGatewayCaptureOverride.id)
        && Objects.equals(this.metadataCapture, aiGatewayCaptureOverride.metadataCapture)
        && Objects.equals(this.mode, aiGatewayCaptureOverride.mode)
        && Objects.equals(this.name, aiGatewayCaptureOverride.name)
        && Objects.equals(this.revision, aiGatewayCaptureOverride.revision)
        && Objects.equals(this.scope, aiGatewayCaptureOverride.scope)
        && Objects.equals(this.scopeRestricted, aiGatewayCaptureOverride.scopeRestricted)
        && Objects.equals(this.updatedAt, aiGatewayCaptureOverride.updatedAt)
        && Objects.equals(this.additionalProperties, aiGatewayCaptureOverride.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        id,
        metadataCapture,
        mode,
        name,
        revision,
        scope,
        scopeRestricted,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayCaptureOverride {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    metadataCapture: ").append(toIndentedString(metadataCapture)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    scopeRestricted: ").append(toIndentedString(scopeRestricted)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
