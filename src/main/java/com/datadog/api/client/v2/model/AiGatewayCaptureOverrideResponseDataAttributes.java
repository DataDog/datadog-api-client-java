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

/** Saved name, capture mode, request filters, and revision of the override. */
@JsonPropertyOrder({
  AiGatewayCaptureOverrideResponseDataAttributes.JSON_PROPERTY_METADATA_CAPTURE,
  AiGatewayCaptureOverrideResponseDataAttributes.JSON_PROPERTY_MODE,
  AiGatewayCaptureOverrideResponseDataAttributes.JSON_PROPERTY_NAME,
  AiGatewayCaptureOverrideResponseDataAttributes.JSON_PROPERTY_REVISION,
  AiGatewayCaptureOverrideResponseDataAttributes.JSON_PROPERTY_SCOPE,
  AiGatewayCaptureOverrideResponseDataAttributes.JSON_PROPERTY_SCOPE_RESTRICTED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayCaptureOverrideResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_METADATA_CAPTURE = "metadata_capture";
  private List<AiGatewayMetadataCaptureItem> metadataCapture = null;

  public static final String JSON_PROPERTY_MODE = "mode";
  private AiGatewayCaptureOverrideResponseDataAttributesMode mode;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_REVISION = "revision";
  private Long revision;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private AiGatewayCaptureResponseScope scope;

  public static final String JSON_PROPERTY_SCOPE_RESTRICTED = "scope_restricted";
  private Boolean scopeRestricted;

  public AiGatewayCaptureOverrideResponseDataAttributes() {}

  @JsonCreator
  public AiGatewayCaptureOverrideResponseDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          AiGatewayCaptureOverrideResponseDataAttributesMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_REVISION) Long revision,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE)
          AiGatewayCaptureResponseScope scope,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE_RESTRICTED)
          Boolean scopeRestricted) {
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.name = name;
    this.revision = revision;
    this.scope = scope;
    this.unparsed |= scope.unparsed;
    this.scopeRestricted = scopeRestricted;
  }

  public AiGatewayCaptureOverrideResponseDataAttributes metadataCapture(
      List<AiGatewayMetadataCaptureItem> metadataCapture) {
    this.metadataCapture = metadataCapture;
    return this;
  }

  public AiGatewayCaptureOverrideResponseDataAttributes addMetadataCaptureItem(
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

  public AiGatewayCaptureOverrideResponseDataAttributes mode(
      AiGatewayCaptureOverrideResponseDataAttributesMode mode) {
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
  public AiGatewayCaptureOverrideResponseDataAttributesMode getMode() {
    return mode;
  }

  public void setMode(AiGatewayCaptureOverrideResponseDataAttributesMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public AiGatewayCaptureOverrideResponseDataAttributes name(String name) {
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

  public AiGatewayCaptureOverrideResponseDataAttributes revision(Long revision) {
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

  public AiGatewayCaptureOverrideResponseDataAttributes scope(AiGatewayCaptureResponseScope scope) {
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

  public AiGatewayCaptureOverrideResponseDataAttributes scopeRestricted(Boolean scopeRestricted) {
    this.scopeRestricted = scopeRestricted;
    return this;
  }

  /**
   * Whether provider or model scope metadata was withheld. Omit unchanged scope on replacement to
   * preserve it.
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
   * @return AiGatewayCaptureOverrideResponseDataAttributes
   */
  @JsonAnySetter
  public AiGatewayCaptureOverrideResponseDataAttributes putAdditionalProperty(
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

  /** Return true if this AiGatewayCaptureOverrideResponseDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayCaptureOverrideResponseDataAttributes aiGatewayCaptureOverrideResponseDataAttributes =
        (AiGatewayCaptureOverrideResponseDataAttributes) o;
    return Objects.equals(
            this.metadataCapture, aiGatewayCaptureOverrideResponseDataAttributes.metadataCapture)
        && Objects.equals(this.mode, aiGatewayCaptureOverrideResponseDataAttributes.mode)
        && Objects.equals(this.name, aiGatewayCaptureOverrideResponseDataAttributes.name)
        && Objects.equals(this.revision, aiGatewayCaptureOverrideResponseDataAttributes.revision)
        && Objects.equals(this.scope, aiGatewayCaptureOverrideResponseDataAttributes.scope)
        && Objects.equals(
            this.scopeRestricted, aiGatewayCaptureOverrideResponseDataAttributes.scopeRestricted)
        && Objects.equals(
            this.additionalProperties,
            aiGatewayCaptureOverrideResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        metadataCapture, mode, name, revision, scope, scopeRestricted, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayCaptureOverrideResponseDataAttributes {\n");
    sb.append("    metadataCapture: ").append(toIndentedString(metadataCapture)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    scopeRestricted: ").append(toIndentedString(scopeRestricted)).append("\n");
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
