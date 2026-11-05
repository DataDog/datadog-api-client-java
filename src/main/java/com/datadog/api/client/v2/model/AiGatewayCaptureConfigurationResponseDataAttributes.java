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

/** Organization default mode, scoped overrides, and current configuration revision. */
@JsonPropertyOrder({
  AiGatewayCaptureConfigurationResponseDataAttributes.JSON_PROPERTY_CONFIGURATION_REVISION,
  AiGatewayCaptureConfigurationResponseDataAttributes.JSON_PROPERTY_DEFAULT_METADATA_CAPTURE,
  AiGatewayCaptureConfigurationResponseDataAttributes.JSON_PROPERTY_DEFAULT_MODE,
  AiGatewayCaptureConfigurationResponseDataAttributes.JSON_PROPERTY_OVERRIDES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayCaptureConfigurationResponseDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CONFIGURATION_REVISION = "configuration_revision";
  private String configurationRevision;

  public static final String JSON_PROPERTY_DEFAULT_METADATA_CAPTURE = "default_metadata_capture";
  private List<AiGatewayMetadataCaptureItem> defaultMetadataCapture = null;

  public static final String JSON_PROPERTY_DEFAULT_MODE = "default_mode";
  private AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode defaultMode;

  public static final String JSON_PROPERTY_OVERRIDES = "overrides";
  private List<AiGatewayCaptureOverride> overrides = new ArrayList<>();

  public AiGatewayCaptureConfigurationResponseDataAttributes() {}

  @JsonCreator
  public AiGatewayCaptureConfigurationResponseDataAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CONFIGURATION_REVISION)
          String configurationRevision,
      @JsonProperty(required = true, value = JSON_PROPERTY_DEFAULT_MODE)
          AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode defaultMode,
      @JsonProperty(required = true, value = JSON_PROPERTY_OVERRIDES)
          List<AiGatewayCaptureOverride> overrides) {
    this.configurationRevision = configurationRevision;
    this.defaultMode = defaultMode;
    this.unparsed |= !defaultMode.isValid();
    this.overrides = overrides;
    for (AiGatewayCaptureOverride item : overrides) {
      this.unparsed |= item.unparsed;
    }
  }

  public AiGatewayCaptureConfigurationResponseDataAttributes configurationRevision(
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

  public AiGatewayCaptureConfigurationResponseDataAttributes defaultMetadataCapture(
      List<AiGatewayMetadataCaptureItem> defaultMetadataCapture) {
    this.defaultMetadataCapture = defaultMetadataCapture;
    return this;
  }

  public AiGatewayCaptureConfigurationResponseDataAttributes addDefaultMetadataCaptureItem(
      AiGatewayMetadataCaptureItem defaultMetadataCaptureItem) {
    if (this.defaultMetadataCapture == null) {
      this.defaultMetadataCapture = new ArrayList<>();
    }
    this.defaultMetadataCapture.add(defaultMetadataCaptureItem);
    this.unparsed |= !defaultMetadataCaptureItem.isValid();
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
   * @return defaultMetadataCapture
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEFAULT_METADATA_CAPTURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AiGatewayMetadataCaptureItem> getDefaultMetadataCapture() {
    return defaultMetadataCapture;
  }

  public void setDefaultMetadataCapture(List<AiGatewayMetadataCaptureItem> defaultMetadataCapture) {
    this.defaultMetadataCapture = defaultMetadataCapture;
  }

  public AiGatewayCaptureConfigurationResponseDataAttributes defaultMode(
      AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode defaultMode) {
    this.defaultMode = defaultMode;
    this.unparsed |= !defaultMode.isValid();
    return this;
  }

  /**
   * Default capture mode for the organization. Change it in <strong>Org defaults</strong>.
   *
   * @return defaultMode
   */
  @JsonProperty(JSON_PROPERTY_DEFAULT_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode getDefaultMode() {
    return defaultMode;
  }

  public void setDefaultMode(
      AiGatewayCaptureConfigurationResponseDataAttributesDefaultMode defaultMode) {
    if (!defaultMode.isValid()) {
      this.unparsed = true;
    }
    this.defaultMode = defaultMode;
  }

  public AiGatewayCaptureConfigurationResponseDataAttributes overrides(
      List<AiGatewayCaptureOverride> overrides) {
    this.overrides = overrides;
    for (AiGatewayCaptureOverride item : overrides) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AiGatewayCaptureConfigurationResponseDataAttributes addOverridesItem(
      AiGatewayCaptureOverride overridesItem) {
    this.overrides.add(overridesItem);
    this.unparsed |= overridesItem.unparsed;
    return this;
  }

  /**
   * Scoped overrides currently configured for the organization.
   *
   * @return overrides
   */
  @JsonProperty(JSON_PROPERTY_OVERRIDES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AiGatewayCaptureOverride> getOverrides() {
    return overrides;
  }

  public void setOverrides(List<AiGatewayCaptureOverride> overrides) {
    this.overrides = overrides;
    if (overrides != null) {
      for (AiGatewayCaptureOverride item : overrides) {
        this.unparsed |= item.unparsed;
      }
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
   * @return AiGatewayCaptureConfigurationResponseDataAttributes
   */
  @JsonAnySetter
  public AiGatewayCaptureConfigurationResponseDataAttributes putAdditionalProperty(
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
   * Return true if this AiGatewayCaptureConfigurationResponseDataAttributes object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayCaptureConfigurationResponseDataAttributes
        aiGatewayCaptureConfigurationResponseDataAttributes =
            (AiGatewayCaptureConfigurationResponseDataAttributes) o;
    return Objects.equals(
            this.configurationRevision,
            aiGatewayCaptureConfigurationResponseDataAttributes.configurationRevision)
        && Objects.equals(
            this.defaultMetadataCapture,
            aiGatewayCaptureConfigurationResponseDataAttributes.defaultMetadataCapture)
        && Objects.equals(
            this.defaultMode, aiGatewayCaptureConfigurationResponseDataAttributes.defaultMode)
        && Objects.equals(
            this.overrides, aiGatewayCaptureConfigurationResponseDataAttributes.overrides)
        && Objects.equals(
            this.additionalProperties,
            aiGatewayCaptureConfigurationResponseDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        configurationRevision,
        defaultMetadataCapture,
        defaultMode,
        overrides,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayCaptureConfigurationResponseDataAttributes {\n");
    sb.append("    configurationRevision: ")
        .append(toIndentedString(configurationRevision))
        .append("\n");
    sb.append("    defaultMetadataCapture: ")
        .append(toIndentedString(defaultMetadataCapture))
        .append("\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    overrides: ").append(toIndentedString(overrides)).append("\n");
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
