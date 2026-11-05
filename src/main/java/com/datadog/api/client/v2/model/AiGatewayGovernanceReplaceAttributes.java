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

/** Organization-wide AI Gateway governance controls to replace. */
@JsonPropertyOrder({
  AiGatewayGovernanceReplaceAttributes.JSON_PROPERTY_DATA_CAPTURE_MODE,
  AiGatewayGovernanceReplaceAttributes.JSON_PROPERTY_METADATA_CAPTURE,
  AiGatewayGovernanceReplaceAttributes.JSON_PROPERTY_ZDR_MODE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayGovernanceReplaceAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA_CAPTURE_MODE = "data_capture_mode";
  private AiGatewayDataCaptureMode dataCaptureMode;

  public static final String JSON_PROPERTY_METADATA_CAPTURE = "metadata_capture";
  private List<AiGatewayMetadataCaptureItem> metadataCapture = null;

  public static final String JSON_PROPERTY_ZDR_MODE = "zdr_mode";
  private AiGatewayZDRMode zdrMode;

  public AiGatewayGovernanceReplaceAttributes() {}

  @JsonCreator
  public AiGatewayGovernanceReplaceAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA_CAPTURE_MODE)
          AiGatewayDataCaptureMode dataCaptureMode) {
    this.dataCaptureMode = dataCaptureMode;
    this.unparsed |= !dataCaptureMode.isValid();
  }

  public AiGatewayGovernanceReplaceAttributes dataCaptureMode(
      AiGatewayDataCaptureMode dataCaptureMode) {
    this.dataCaptureMode = dataCaptureMode;
    this.unparsed |= !dataCaptureMode.isValid();
    return this;
  }

  /**
   * Controls whether AI Gateway captures request and response content in addition to metadata.
   *
   * @return dataCaptureMode
   */
  @JsonProperty(JSON_PROPERTY_DATA_CAPTURE_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayDataCaptureMode getDataCaptureMode() {
    return dataCaptureMode;
  }

  public void setDataCaptureMode(AiGatewayDataCaptureMode dataCaptureMode) {
    if (!dataCaptureMode.isValid()) {
      this.unparsed = true;
    }
    this.dataCaptureMode = dataCaptureMode;
  }

  public AiGatewayGovernanceReplaceAttributes metadataCapture(
      List<AiGatewayMetadataCaptureItem> metadataCapture) {
    this.metadataCapture = metadataCapture;
    return this;
  }

  public AiGatewayGovernanceReplaceAttributes addMetadataCaptureItem(
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

  public AiGatewayGovernanceReplaceAttributes zdrMode(AiGatewayZDRMode zdrMode) {
    this.zdrMode = zdrMode;
    this.unparsed |= !zdrMode.isValid();
    return this;
  }

  /**
   * Zero data retention requirement for the organization's requests.
   *
   * @return zdrMode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ZDR_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayZDRMode getZdrMode() {
    return zdrMode;
  }

  public void setZdrMode(AiGatewayZDRMode zdrMode) {
    if (!zdrMode.isValid()) {
      this.unparsed = true;
    }
    this.zdrMode = zdrMode;
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
   * @return AiGatewayGovernanceReplaceAttributes
   */
  @JsonAnySetter
  public AiGatewayGovernanceReplaceAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayGovernanceReplaceAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayGovernanceReplaceAttributes aiGatewayGovernanceReplaceAttributes =
        (AiGatewayGovernanceReplaceAttributes) o;
    return Objects.equals(
            this.dataCaptureMode, aiGatewayGovernanceReplaceAttributes.dataCaptureMode)
        && Objects.equals(
            this.metadataCapture, aiGatewayGovernanceReplaceAttributes.metadataCapture)
        && Objects.equals(this.zdrMode, aiGatewayGovernanceReplaceAttributes.zdrMode)
        && Objects.equals(
            this.additionalProperties, aiGatewayGovernanceReplaceAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataCaptureMode, metadataCapture, zdrMode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayGovernanceReplaceAttributes {\n");
    sb.append("    dataCaptureMode: ").append(toIndentedString(dataCaptureMode)).append("\n");
    sb.append("    metadataCapture: ").append(toIndentedString(metadataCapture)).append("\n");
    sb.append("    zdrMode: ").append(toIndentedString(zdrMode)).append("\n");
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
