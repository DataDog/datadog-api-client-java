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

/** Optional, typed enrichment for a model catalog entry. Missing properties remain unknown. */
@JsonPropertyOrder({
  AiGatewayModelMetadata.JSON_PROPERTY_CAPABILITIES,
  AiGatewayModelMetadata.JSON_PROPERTY_DESCRIPTION,
  AiGatewayModelMetadata.JSON_PROPERTY_DISPLAY_NAME,
  AiGatewayModelMetadata.JSON_PROPERTY_FAMILY,
  AiGatewayModelMetadata.JSON_PROPERTY_KIND,
  AiGatewayModelMetadata.JSON_PROPERTY_KNOWLEDGE_CUTOFF,
  AiGatewayModelMetadata.JSON_PROPERTY_LAST_UPDATED,
  AiGatewayModelMetadata.JSON_PROPERTY_LIFECYCLE,
  AiGatewayModelMetadata.JSON_PROPERTY_LIMITS,
  AiGatewayModelMetadata.JSON_PROPERTY_MODALITIES,
  AiGatewayModelMetadata.JSON_PROPERTY_OPEN_WEIGHTS,
  AiGatewayModelMetadata.JSON_PROPERTY_REASONING,
  AiGatewayModelMetadata.JSON_PROPERTY_REFERENCE_PRICING,
  AiGatewayModelMetadata.JSON_PROPERTY_RELEASE_DATE,
  AiGatewayModelMetadata.JSON_PROPERTY_SOURCE,
  AiGatewayModelMetadata.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CAPABILITIES = "capabilities";
  private AiGatewayModelCapabilities capabilities;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "display_name";
  private String displayName;

  public static final String JSON_PROPERTY_FAMILY = "family";
  private String family;

  public static final String JSON_PROPERTY_KIND = "kind";
  private AiGatewayModelMetadataKind kind;

  public static final String JSON_PROPERTY_KNOWLEDGE_CUTOFF = "knowledge_cutoff";
  private String knowledgeCutoff;

  public static final String JSON_PROPERTY_LAST_UPDATED = "last_updated";
  private String lastUpdated;

  public static final String JSON_PROPERTY_LIFECYCLE = "lifecycle";
  private AiGatewayModelMetadataLifecycle lifecycle;

  public static final String JSON_PROPERTY_LIMITS = "limits";
  private AiGatewayModelLimits limits;

  public static final String JSON_PROPERTY_MODALITIES = "modalities";
  private AiGatewayModelModalities modalities;

  public static final String JSON_PROPERTY_OPEN_WEIGHTS = "open_weights";
  private Boolean openWeights;

  public static final String JSON_PROPERTY_REASONING = "reasoning";
  private AiGatewayModelReasoning reasoning;

  public static final String JSON_PROPERTY_REFERENCE_PRICING = "reference_pricing";
  private List<AiGatewayModelReferencePrice> referencePricing = null;

  public static final String JSON_PROPERTY_RELEASE_DATE = "release_date";
  private String releaseDate;

  public static final String JSON_PROPERTY_SOURCE = "source";
  private AiGatewayModelMetadataSource source;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AiGatewayModelMetadataStatus status;

  public AiGatewayModelMetadata() {}

  @JsonCreator
  public AiGatewayModelMetadata(
      @JsonProperty(required = true, value = JSON_PROPERTY_CAPABILITIES)
          AiGatewayModelCapabilities capabilities,
      @JsonProperty(required = true, value = JSON_PROPERTY_LIMITS) AiGatewayModelLimits limits,
      @JsonProperty(required = true, value = JSON_PROPERTY_MODALITIES)
          AiGatewayModelModalities modalities,
      @JsonProperty(required = true, value = JSON_PROPERTY_SOURCE)
          AiGatewayModelMetadataSource source,
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          AiGatewayModelMetadataStatus status) {
    this.capabilities = capabilities;
    this.unparsed |= capabilities.unparsed;
    this.limits = limits;
    this.unparsed |= limits.unparsed;
    this.modalities = modalities;
    this.unparsed |= modalities.unparsed;
    this.source = source;
    this.unparsed |= source.unparsed;
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public AiGatewayModelMetadata capabilities(AiGatewayModelCapabilities capabilities) {
    this.capabilities = capabilities;
    this.unparsed |= capabilities.unparsed;
    return this;
  }

  /**
   * Model features reported by the enrichment source. Omitted properties are unknown.
   *
   * @return capabilities
   */
  @JsonProperty(JSON_PROPERTY_CAPABILITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelCapabilities getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(AiGatewayModelCapabilities capabilities) {
    this.capabilities = capabilities;
    if (capabilities != null) {
      this.unparsed |= capabilities.unparsed;
    }
  }

  public AiGatewayModelMetadata description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Human-readable model description.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AiGatewayModelMetadata displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Human-readable model name.
   *
   * @return displayName
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public AiGatewayModelMetadata family(String family) {
    this.family = family;
    return this;
  }

  /**
   * Model family identifier.
   *
   * @return family
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FAMILY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFamily() {
    return family;
  }

  public void setFamily(String family) {
    this.family = family;
  }

  public AiGatewayModelMetadata kind(AiGatewayModelMetadataKind kind) {
    this.kind = kind;
    this.unparsed |= !kind.isValid();
    return this;
  }

  /**
   * Primary model kind. Decision models return a choice or score instead of generated text.
   *
   * @return kind
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KIND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayModelMetadataKind getKind() {
    return kind;
  }

  public void setKind(AiGatewayModelMetadataKind kind) {
    if (!kind.isValid()) {
      this.unparsed = true;
    }
    this.kind = kind;
  }

  public AiGatewayModelMetadata knowledgeCutoff(String knowledgeCutoff) {
    this.knowledgeCutoff = knowledgeCutoff;
    return this;
  }

  /**
   * Knowledge cutoff reported by the source.
   *
   * @return knowledgeCutoff
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KNOWLEDGE_CUTOFF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getKnowledgeCutoff() {
    return knowledgeCutoff;
  }

  public void setKnowledgeCutoff(String knowledgeCutoff) {
    this.knowledgeCutoff = knowledgeCutoff;
  }

  public AiGatewayModelMetadata lastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
    return this;
  }

  /**
   * Date the source record was last updated.
   *
   * @return lastUpdated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getLastUpdated() {
    return lastUpdated;
  }

  public void setLastUpdated(String lastUpdated) {
    this.lastUpdated = lastUpdated;
  }

  public AiGatewayModelMetadata lifecycle(AiGatewayModelMetadataLifecycle lifecycle) {
    this.lifecycle = lifecycle;
    this.unparsed |= !lifecycle.isValid();
    return this;
  }

  /**
   * Model lifecycle state.
   *
   * @return lifecycle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LIFECYCLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayModelMetadataLifecycle getLifecycle() {
    return lifecycle;
  }

  public void setLifecycle(AiGatewayModelMetadataLifecycle lifecycle) {
    if (!lifecycle.isValid()) {
      this.unparsed = true;
    }
    this.lifecycle = lifecycle;
  }

  public AiGatewayModelMetadata limits(AiGatewayModelLimits limits) {
    this.limits = limits;
    this.unparsed |= limits.unparsed;
    return this;
  }

  /**
   * Token limits reported by the enrichment source.
   *
   * @return limits
   */
  @JsonProperty(JSON_PROPERTY_LIMITS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelLimits getLimits() {
    return limits;
  }

  public void setLimits(AiGatewayModelLimits limits) {
    this.limits = limits;
    if (limits != null) {
      this.unparsed |= limits.unparsed;
    }
  }

  public AiGatewayModelMetadata modalities(AiGatewayModelModalities modalities) {
    this.modalities = modalities;
    this.unparsed |= modalities.unparsed;
    return this;
  }

  /**
   * Supported model input and output modalities.
   *
   * @return modalities
   */
  @JsonProperty(JSON_PROPERTY_MODALITIES)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelModalities getModalities() {
    return modalities;
  }

  public void setModalities(AiGatewayModelModalities modalities) {
    this.modalities = modalities;
    if (modalities != null) {
      this.unparsed |= modalities.unparsed;
    }
  }

  public AiGatewayModelMetadata openWeights(Boolean openWeights) {
    this.openWeights = openWeights;
    return this;
  }

  /**
   * Whether model weights are openly available.
   *
   * @return openWeights
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_OPEN_WEIGHTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOpenWeights() {
    return openWeights;
  }

  public void setOpenWeights(Boolean openWeights) {
    this.openWeights = openWeights;
  }

  public AiGatewayModelMetadata reasoning(AiGatewayModelReasoning reasoning) {
    this.reasoning = reasoning;
    this.unparsed |= reasoning.unparsed;
    return this;
  }

  /**
   * Supported reasoning controls. Absence means controls are unknown or unavailable.
   *
   * @return reasoning
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REASONING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AiGatewayModelReasoning getReasoning() {
    return reasoning;
  }

  public void setReasoning(AiGatewayModelReasoning reasoning) {
    this.reasoning = reasoning;
    if (reasoning != null) {
      this.unparsed |= reasoning.unparsed;
    }
  }

  public AiGatewayModelMetadata referencePricing(
      List<AiGatewayModelReferencePrice> referencePricing) {
    this.referencePricing = referencePricing;
    if (referencePricing != null) {
      for (AiGatewayModelReferencePrice item : referencePricing) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AiGatewayModelMetadata addReferencePricingItem(
      AiGatewayModelReferencePrice referencePricingItem) {
    if (this.referencePricing == null) {
      this.referencePricing = new ArrayList<>();
    }
    this.referencePricing.add(referencePricingItem);
    this.unparsed |= referencePricingItem.unparsed;
    return this;
  }

  /**
   * Provider-specific reference prices from the enrichment source. Omitted for shared
   * canonical-model fallback matches. These do not determine gateway charges.
   *
   * @return referencePricing
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REFERENCE_PRICING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AiGatewayModelReferencePrice> getReferencePricing() {
    return referencePricing;
  }

  public void setReferencePricing(List<AiGatewayModelReferencePrice> referencePricing) {
    this.referencePricing = referencePricing;
    if (referencePricing != null) {
      for (AiGatewayModelReferencePrice item : referencePricing) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AiGatewayModelMetadata releaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Model release date.
   *
   * @return releaseDate
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RELEASE_DATE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public AiGatewayModelMetadata source(AiGatewayModelMetadataSource source) {
    this.source = source;
    this.unparsed |= source.unparsed;
    return this;
  }

  /**
   * Provenance for model metadata enrichment.
   *
   * @return source
   */
  @JsonProperty(JSON_PROPERTY_SOURCE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelMetadataSource getSource() {
    return source;
  }

  public void setSource(AiGatewayModelMetadataSource source) {
    this.source = source;
    if (source != null) {
      this.unparsed |= source.unparsed;
    }
  }

  public AiGatewayModelMetadata status(AiGatewayModelMetadataStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * Completeness of the matched source record. Partial also identifies metadata from a base model
   * for a dated snapshot or from a shared canonical-model fallback.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AiGatewayModelMetadataStatus getStatus() {
    return status;
  }

  public void setStatus(AiGatewayModelMetadataStatus status) {
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
   * @return AiGatewayModelMetadata
   */
  @JsonAnySetter
  public AiGatewayModelMetadata putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelMetadata aiGatewayModelMetadata = (AiGatewayModelMetadata) o;
    return Objects.equals(this.capabilities, aiGatewayModelMetadata.capabilities)
        && Objects.equals(this.description, aiGatewayModelMetadata.description)
        && Objects.equals(this.displayName, aiGatewayModelMetadata.displayName)
        && Objects.equals(this.family, aiGatewayModelMetadata.family)
        && Objects.equals(this.kind, aiGatewayModelMetadata.kind)
        && Objects.equals(this.knowledgeCutoff, aiGatewayModelMetadata.knowledgeCutoff)
        && Objects.equals(this.lastUpdated, aiGatewayModelMetadata.lastUpdated)
        && Objects.equals(this.lifecycle, aiGatewayModelMetadata.lifecycle)
        && Objects.equals(this.limits, aiGatewayModelMetadata.limits)
        && Objects.equals(this.modalities, aiGatewayModelMetadata.modalities)
        && Objects.equals(this.openWeights, aiGatewayModelMetadata.openWeights)
        && Objects.equals(this.reasoning, aiGatewayModelMetadata.reasoning)
        && Objects.equals(this.referencePricing, aiGatewayModelMetadata.referencePricing)
        && Objects.equals(this.releaseDate, aiGatewayModelMetadata.releaseDate)
        && Objects.equals(this.source, aiGatewayModelMetadata.source)
        && Objects.equals(this.status, aiGatewayModelMetadata.status)
        && Objects.equals(this.additionalProperties, aiGatewayModelMetadata.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        capabilities,
        description,
        displayName,
        family,
        kind,
        knowledgeCutoff,
        lastUpdated,
        lifecycle,
        limits,
        modalities,
        openWeights,
        reasoning,
        referencePricing,
        releaseDate,
        source,
        status,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelMetadata {\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    family: ").append(toIndentedString(family)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    knowledgeCutoff: ").append(toIndentedString(knowledgeCutoff)).append("\n");
    sb.append("    lastUpdated: ").append(toIndentedString(lastUpdated)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
    sb.append("    modalities: ").append(toIndentedString(modalities)).append("\n");
    sb.append("    openWeights: ").append(toIndentedString(openWeights)).append("\n");
    sb.append("    reasoning: ").append(toIndentedString(reasoning)).append("\n");
    sb.append("    referencePricing: ").append(toIndentedString(referencePricing)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
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
