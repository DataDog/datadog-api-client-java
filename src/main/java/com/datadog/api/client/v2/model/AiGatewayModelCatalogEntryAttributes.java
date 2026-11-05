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

/** Model catalog entry configuration and metadata. */
@JsonPropertyOrder({
  AiGatewayModelCatalogEntryAttributes.JSON_PROPERTY_CREATED_AT,
  AiGatewayModelCatalogEntryAttributes.JSON_PROPERTY_ENABLED,
  AiGatewayModelCatalogEntryAttributes.JSON_PROPERTY_METADATA,
  AiGatewayModelCatalogEntryAttributes.JSON_PROPERTY_MODEL_ID_CANONICAL,
  AiGatewayModelCatalogEntryAttributes.JSON_PROPERTY_MODEL_ID_WIRE,
  AiGatewayModelCatalogEntryAttributes.JSON_PROPERTY_PROVIDER_ID,
  AiGatewayModelCatalogEntryAttributes.JSON_PROPERTY_SOURCE,
  AiGatewayModelCatalogEntryAttributes.JSON_PROPERTY_SUPPORTED_OPERATIONS,
  AiGatewayModelCatalogEntryAttributes.JSON_PROPERTY_UPDATED_AT
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelCatalogEntryAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ENABLED = "enabled";
  private Boolean enabled;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private AiGatewayModelMetadata metadata;

  public static final String JSON_PROPERTY_MODEL_ID_CANONICAL = "model_id_canonical";
  private String modelIdCanonical;

  public static final String JSON_PROPERTY_MODEL_ID_WIRE = "model_id_wire";
  private String modelIdWire;

  public static final String JSON_PROPERTY_PROVIDER_ID = "provider_id";
  private Long providerId;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private AiGatewayModelSource source;

  public static final String JSON_PROPERTY_SUPPORTED_OPERATIONS = "supported_operations";
  private List<AiGatewaySupportedOperation> supportedOperations = new ArrayList<>();

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private OffsetDateTime updatedAt;

  public AiGatewayModelCatalogEntryAttributes() {}

  @JsonCreator
  public AiGatewayModelCatalogEntryAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_CREATED_AT) OffsetDateTime createdAt,
      @JsonProperty(required = true, value = JSON_PROPERTY_ENABLED) Boolean enabled,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODEL_ID_CANONICAL)
          String modelIdCanonical,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODEL_ID_WIRE) String modelIdWire,
      @JsonProperty(required = true, value = JSON_PROPERTY_PROVIDER_ID) Long providerId,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE) AiGatewayModelSource source,
      @JsonProperty(required = true, value = JSON_PROPERTY_SUPPORTED_OPERATIONS)
          List<AiGatewaySupportedOperation> supportedOperations,
      @JsonProperty(required = true, value = JSON_PROPERTY_UPDATED_AT) OffsetDateTime updatedAt) {
    this.createdAt = createdAt;
    this.enabled = enabled;
    this.modelIdCanonical = modelIdCanonical;
    this.modelIdWire = modelIdWire;
    this.providerId = providerId;
    this.source = source;
    this.unparsed |= !source.isValid();
    this.supportedOperations = supportedOperations;
    this.updatedAt = updatedAt;
  }

  public AiGatewayModelCatalogEntryAttributes createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Time when the resource was created.
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

  public AiGatewayModelCatalogEntryAttributes enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Whether the resource is enabled.
   *
   * @return enabled
   */
  @JsonProperty(JSON_PROPERTY_ENABLED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public AiGatewayModelCatalogEntryAttributes metadata(AiGatewayModelMetadata metadata) {
    this.metadata = metadata;
    this.unparsed |= metadata.unparsed;
    return this;
  }

  /**
   * Optional, typed enrichment for a model catalog entry. Missing properties remain unknown.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayModelMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(AiGatewayModelMetadata metadata) {
    this.metadata = metadata;
    if (metadata != null) {
      this.unparsed |= metadata.unparsed;
    }
  }

  public AiGatewayModelCatalogEntryAttributes modelIdCanonical(String modelIdCanonical) {
    this.modelIdCanonical = modelIdCanonical;
    return this;
  }

  /**
   * Provider-independent model identifier.
   *
   * @return modelIdCanonical
   */
  @JsonProperty(JSON_PROPERTY_MODEL_ID_CANONICAL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModelIdCanonical() {
    return modelIdCanonical;
  }

  public void setModelIdCanonical(String modelIdCanonical) {
    this.modelIdCanonical = modelIdCanonical;
  }

  public AiGatewayModelCatalogEntryAttributes modelIdWire(String modelIdWire) {
    this.modelIdWire = modelIdWire;
    return this;
  }

  /**
   * Model identifier sent to the provider.
   *
   * @return modelIdWire
   */
  @JsonProperty(JSON_PROPERTY_MODEL_ID_WIRE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getModelIdWire() {
    return modelIdWire;
  }

  public void setModelIdWire(String modelIdWire) {
    this.modelIdWire = modelIdWire;
  }

  public AiGatewayModelCatalogEntryAttributes providerId(Long providerId) {
    this.providerId = providerId;
    return this;
  }

  /**
   * Provider identifier.
   *
   * @return providerId
   */
  @JsonProperty(JSON_PROPERTY_PROVIDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getProviderId() {
    return providerId;
  }

  public void setProviderId(Long providerId) {
    this.providerId = providerId;
  }

  public AiGatewayModelCatalogEntryAttributes source(AiGatewayModelSource source) {
    this.source = source;
    this.unparsed |= !source.isValid();
    return this;
  }

  /**
   * How a model catalog entry is managed.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelSource getSource() {
    return source;
  }

  public void setSource(AiGatewayModelSource source) {
    if (!source.isValid()) {
      this.unparsed = true;
    }
    this.source = source;
  }

  public AiGatewayModelCatalogEntryAttributes supportedOperations(
      List<AiGatewaySupportedOperation> supportedOperations) {
    this.supportedOperations = supportedOperations;
    return this;
  }

  public AiGatewayModelCatalogEntryAttributes addSupportedOperationsItem(
      AiGatewaySupportedOperation supportedOperationsItem) {
    this.supportedOperations.add(supportedOperationsItem);
    this.unparsed |= !supportedOperationsItem.isValid();
    return this;
  }

  /**
   * Operations supported by the model.
   *
   * @return supportedOperations
   */
  @JsonProperty(JSON_PROPERTY_SUPPORTED_OPERATIONS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<AiGatewaySupportedOperation> getSupportedOperations() {
    return supportedOperations;
  }

  public void setSupportedOperations(List<AiGatewaySupportedOperation> supportedOperations) {
    this.supportedOperations = supportedOperations;
  }

  public AiGatewayModelCatalogEntryAttributes updatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Time when the resource was last updated.
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
   * @return AiGatewayModelCatalogEntryAttributes
   */
  @JsonAnySetter
  public AiGatewayModelCatalogEntryAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelCatalogEntryAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelCatalogEntryAttributes aiGatewayModelCatalogEntryAttributes =
        (AiGatewayModelCatalogEntryAttributes) o;
    return Objects.equals(this.createdAt, aiGatewayModelCatalogEntryAttributes.createdAt)
        && Objects.equals(this.enabled, aiGatewayModelCatalogEntryAttributes.enabled)
        && Objects.equals(this.metadata, aiGatewayModelCatalogEntryAttributes.metadata)
        && Objects.equals(
            this.modelIdCanonical, aiGatewayModelCatalogEntryAttributes.modelIdCanonical)
        && Objects.equals(this.modelIdWire, aiGatewayModelCatalogEntryAttributes.modelIdWire)
        && Objects.equals(this.providerId, aiGatewayModelCatalogEntryAttributes.providerId)
        && Objects.equals(this.source, aiGatewayModelCatalogEntryAttributes.source)
        && Objects.equals(
            this.supportedOperations, aiGatewayModelCatalogEntryAttributes.supportedOperations)
        && Objects.equals(this.updatedAt, aiGatewayModelCatalogEntryAttributes.updatedAt)
        && Objects.equals(
            this.additionalProperties, aiGatewayModelCatalogEntryAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        createdAt,
        enabled,
        metadata,
        modelIdCanonical,
        modelIdWire,
        providerId,
        source,
        supportedOperations,
        updatedAt,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelCatalogEntryAttributes {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    modelIdCanonical: ").append(toIndentedString(modelIdCanonical)).append("\n");
    sb.append("    modelIdWire: ").append(toIndentedString(modelIdWire)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    supportedOperations: ")
        .append(toIndentedString(supportedOperations))
        .append("\n");
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
