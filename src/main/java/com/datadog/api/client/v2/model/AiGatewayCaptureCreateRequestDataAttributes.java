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

/** Settings and configuration revision for creating the override. */
@JsonPropertyOrder({
  AiGatewayCaptureCreateRequestDataAttributes.JSON_PROPERTY_CONFIGURATION_REVISION,
  AiGatewayCaptureCreateRequestDataAttributes.JSON_PROPERTY_CONFIRM_FULL_CAPTURE,
  AiGatewayCaptureCreateRequestDataAttributes.JSON_PROPERTY_METADATA_CAPTURE,
  AiGatewayCaptureCreateRequestDataAttributes.JSON_PROPERTY_MODE,
  AiGatewayCaptureCreateRequestDataAttributes.JSON_PROPERTY_NAME,
  AiGatewayCaptureCreateRequestDataAttributes.JSON_PROPERTY_OPERATION,
  AiGatewayCaptureCreateRequestDataAttributes.JSON_PROPERTY_REVISION,
  AiGatewayCaptureCreateRequestDataAttributes.JSON_PROPERTY_SCOPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayCaptureCreateRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGURATION_REVISION = "configuration_revision";
  private String configurationRevision;

  public static final String JSON_PROPERTY_CONFIRM_FULL_CAPTURE = "confirm_full_capture";
  private Boolean confirmFullCapture;

  public static final String JSON_PROPERTY_METADATA_CAPTURE = "metadata_capture";
  private List<AiGatewayMetadataCaptureItem> metadataCapture = null;

  public static final String JSON_PROPERTY_MODE = "mode";
  private AiGatewayCaptureCreateRequestDataAttributesMode mode;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_OPERATION = "operation";
  private AiGatewayCaptureCreateRequestDataAttributesOperation operation;

  public static final String JSON_PROPERTY_REVISION = "revision";
  private Long revision;

  public static final String JSON_PROPERTY_SCOPE = "scope";
  private AiGatewayCaptureScope scope;

  public AiGatewayCaptureCreateRequestDataAttributes() {}

  @JsonCreator
  public AiGatewayCaptureCreateRequestDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIGURATION_REVISION)
          String configurationRevision,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE)
          AiGatewayCaptureCreateRequestDataAttributesMode mode,
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name,
      @JsonProperty(required = true, value = JSON_PROPERTY_SCOPE) AiGatewayCaptureScope scope) {
    this.configurationRevision = configurationRevision;
    this.mode = mode;
    this.unparsed |= !mode.isValid();
    this.name = name;
    this.scope = scope;
    this.unparsed |= scope.unparsed;
  }

  public AiGatewayCaptureCreateRequestDataAttributes configurationRevision(
      String configurationRevision) {
    this.configurationRevision = configurationRevision;
    return this;
  }

  /**
   * Opaque revision of the organization default and all overrides. Writes require the revision
   * returned by a current read or preview.
   *
   * @return configurationRevision
   */
  @JsonProperty(JSON_PROPERTY_CONFIGURATION_REVISION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getConfigurationRevision() {
    return configurationRevision;
  }

  public void setConfigurationRevision(String configurationRevision) {
    this.configurationRevision = configurationRevision;
  }

  public AiGatewayCaptureCreateRequestDataAttributes confirmFullCapture(
      Boolean confirmFullCapture) {
    this.confirmFullCapture = confirmFullCapture;
    return this;
  }

  /**
   * Set to <code>true</code> to confirm a change that can enable full capture, including a deletion
   * that causes a <code>full_capture</code> override or the organization default to apply.
   *
   * @return confirmFullCapture
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CONFIRM_FULL_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getConfirmFullCapture() {
    return confirmFullCapture;
  }

  public void setConfirmFullCapture(Boolean confirmFullCapture) {
    this.confirmFullCapture = confirmFullCapture;
  }

  public AiGatewayCaptureCreateRequestDataAttributes metadataCapture(
      List<AiGatewayMetadataCaptureItem> metadataCapture) {
    this.metadataCapture = metadataCapture;
    return this;
  }

  public AiGatewayCaptureCreateRequestDataAttributes addMetadataCaptureItem(
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

  public AiGatewayCaptureCreateRequestDataAttributes mode(
      AiGatewayCaptureCreateRequestDataAttributesMode mode) {
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
  public AiGatewayCaptureCreateRequestDataAttributesMode getMode() {
    return mode;
  }

  public void setMode(AiGatewayCaptureCreateRequestDataAttributesMode mode) {
    if (!mode.isValid()) {
      this.unparsed = true;
    }
    this.mode = mode;
  }

  public AiGatewayCaptureCreateRequestDataAttributes name(String name) {
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

  public AiGatewayCaptureCreateRequestDataAttributes operation(
      AiGatewayCaptureCreateRequestDataAttributesOperation operation) {
    this.operation = operation;
    this.unparsed |= !operation.isValid();
    return this;
  }

  /**
   * Proposed operation for preview. Write endpoints infer it from the HTTP method.
   *
   * @return operation
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPERATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayCaptureCreateRequestDataAttributesOperation getOperation() {
    return operation;
  }

  public void setOperation(AiGatewayCaptureCreateRequestDataAttributesOperation operation) {
    if (!operation.isValid()) {
      this.unparsed = true;
    }
    this.operation = operation;
  }

  public AiGatewayCaptureCreateRequestDataAttributes revision(Long revision) {
    this.revision = revision;
    return this;
  }

  /**
   * Current override revision, required for replacement or deletion.
   *
   * @return revision
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REVISION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getRevision() {
    return revision;
  }

  public void setRevision(Long revision) {
    this.revision = revision;
  }

  public AiGatewayCaptureCreateRequestDataAttributes scope(AiGatewayCaptureScope scope) {
    this.scope = scope;
    this.unparsed |= scope.unparsed;
    return this;
  }

  /**
   * All selected filters combine with AND, with one value per filter. The <code>model</code> and
   * <code>provider</code> tags apply to each actual direct or routed attempt, including fallback
   * destinations. Routes are not selectable filters. At least one filter is required. If any
   * matching override uses <code>metadata_only</code>, that mode applies. Otherwise, if any
   * matching override uses <code>full_capture</code>, that mode applies. The organization default
   * applies only when no override matches. Overrides have no priority or specificity ordering.
   *
   * @return scope
   */
  @JsonProperty(JSON_PROPERTY_SCOPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayCaptureScope getScope() {
    return scope;
  }

  public void setScope(AiGatewayCaptureScope scope) {
    this.scope = scope;
    if (scope != null) {
      this.unparsed |= scope.unparsed;
    }
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
   * @return AiGatewayCaptureCreateRequestDataAttributes
   */
  @JsonAnySetter
  public AiGatewayCaptureCreateRequestDataAttributes putAdditionalProperty(
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

  /** Return true if this AiGatewayCaptureCreateRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayCaptureCreateRequestDataAttributes aiGatewayCaptureCreateRequestDataAttributes =
        (AiGatewayCaptureCreateRequestDataAttributes) o;
    return Objects.equals(
            this.configurationRevision,
            aiGatewayCaptureCreateRequestDataAttributes.configurationRevision)
        && Objects.equals(
            this.confirmFullCapture, aiGatewayCaptureCreateRequestDataAttributes.confirmFullCapture)
        && Objects.equals(
            this.metadataCapture, aiGatewayCaptureCreateRequestDataAttributes.metadataCapture)
        && Objects.equals(this.mode, aiGatewayCaptureCreateRequestDataAttributes.mode)
        && Objects.equals(this.name, aiGatewayCaptureCreateRequestDataAttributes.name)
        && Objects.equals(this.operation, aiGatewayCaptureCreateRequestDataAttributes.operation)
        && Objects.equals(this.revision, aiGatewayCaptureCreateRequestDataAttributes.revision)
        && Objects.equals(this.scope, aiGatewayCaptureCreateRequestDataAttributes.scope)
        && Objects.equals(
            this.additionalProperties,
            aiGatewayCaptureCreateRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        configurationRevision,
        confirmFullCapture,
        metadataCapture,
        mode,
        name,
        operation,
        revision,
        scope,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayCaptureCreateRequestDataAttributes {\n");
    sb.append("    configurationRevision: ")
        .append(toIndentedString(configurationRevision))
        .append("\n");
    sb.append("    confirmFullCapture: ").append(toIndentedString(confirmFullCapture)).append("\n");
    sb.append("    metadataCapture: ").append(toIndentedString(metadataCapture)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    operation: ").append(toIndentedString(operation)).append("\n");
    sb.append("    revision: ").append(toIndentedString(revision)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
