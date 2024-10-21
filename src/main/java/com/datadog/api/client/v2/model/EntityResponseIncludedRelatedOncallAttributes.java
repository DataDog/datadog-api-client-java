/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Included related oncall attributes. */
@JsonPropertyOrder({
  EntityResponseIncludedRelatedOncallAttributes.JSON_PROPERTY_ESCALATIONS,
  EntityResponseIncludedRelatedOncallAttributes.JSON_PROPERTY_PROVIDER
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityResponseIncludedRelatedOncallAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ESCALATIONS = "escalations";
  private List<EntityResponseIncludedRelatedOncallEscalationItem> escalations = null;

  public static final String JSON_PROPERTY_PROVIDER = "provider";
  private String provider;

  public EntityResponseIncludedRelatedOncallAttributes escalations(
      List<EntityResponseIncludedRelatedOncallEscalationItem> escalations) {
    this.escalations = escalations;
    for (EntityResponseIncludedRelatedOncallEscalationItem item : escalations) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public EntityResponseIncludedRelatedOncallAttributes addEscalationsItem(
      EntityResponseIncludedRelatedOncallEscalationItem escalationsItem) {
    if (this.escalations == null) {
      this.escalations = new ArrayList<>();
    }
    this.escalations.add(escalationsItem);
    this.unparsed |= escalationsItem.unparsed;
    return this;
  }

  /**
   * Oncall escalations.
   *
   * @return escalations
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ESCALATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EntityResponseIncludedRelatedOncallEscalationItem> getEscalations() {
    return escalations;
  }

  public void setEscalations(List<EntityResponseIncludedRelatedOncallEscalationItem> escalations) {
    this.escalations = escalations;
  }

  public EntityResponseIncludedRelatedOncallAttributes provider(String provider) {
    this.provider = provider;
    return this;
  }

  /**
   * Oncall provider.
   *
   * @return provider
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROVIDER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
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
   * @return EntityResponseIncludedRelatedOncallAttributes
   */
  @JsonAnySetter
  public EntityResponseIncludedRelatedOncallAttributes putAdditionalProperty(
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

  /** Return true if this EntityResponseIncludedRelatedOncallAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityResponseIncludedRelatedOncallAttributes entityResponseIncludedRelatedOncallAttributes =
        (EntityResponseIncludedRelatedOncallAttributes) o;
    return Objects.equals(
            this.escalations, entityResponseIncludedRelatedOncallAttributes.escalations)
        && Objects.equals(this.provider, entityResponseIncludedRelatedOncallAttributes.provider)
        && Objects.equals(
            this.additionalProperties,
            entityResponseIncludedRelatedOncallAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(escalations, provider, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityResponseIncludedRelatedOncallAttributes {\n");
    sb.append("    escalations: ").append(toIndentedString(escalations)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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
