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

/** The supported attributes for updating a degradation template. */
@JsonPropertyOrder({
  PatchDegradationTemplateRequestDataAttributes.JSON_PROPERTY_COMPONENTS_AFFECTED,
  PatchDegradationTemplateRequestDataAttributes.JSON_PROPERTY_DEGRADATION_TITLE,
  PatchDegradationTemplateRequestDataAttributes.JSON_PROPERTY_NAME,
  PatchDegradationTemplateRequestDataAttributes.JSON_PROPERTY_UPDATES
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class PatchDegradationTemplateRequestDataAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_COMPONENTS_AFFECTED = "components_affected";
  private List<PatchDegradationTemplateRequestDataAttributesComponentsAffectedItems>
      componentsAffected = null;

  public static final String JSON_PROPERTY_DEGRADATION_TITLE = "degradation_title";
  private String degradationTitle;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_UPDATES = "updates";
  private List<PatchDegradationTemplateRequestDataAttributesUpdatesItems> updates = null;

  public PatchDegradationTemplateRequestDataAttributes componentsAffected(
      List<PatchDegradationTemplateRequestDataAttributesComponentsAffectedItems>
          componentsAffected) {
    this.componentsAffected = componentsAffected;
    if (componentsAffected != null) {
      for (PatchDegradationTemplateRequestDataAttributesComponentsAffectedItems item :
          componentsAffected) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public PatchDegradationTemplateRequestDataAttributes addComponentsAffectedItem(
      PatchDegradationTemplateRequestDataAttributesComponentsAffectedItems componentsAffectedItem) {
    if (this.componentsAffected == null) {
      this.componentsAffected = new ArrayList<>();
    }
    this.componentsAffected.add(componentsAffectedItem);
    this.unparsed |= componentsAffectedItem.unparsed;
    return this;
  }

  /**
   * The components affected by a degradation created from this template.
   *
   * @return componentsAffected
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPONENTS_AFFECTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PatchDegradationTemplateRequestDataAttributesComponentsAffectedItems>
      getComponentsAffected() {
    return componentsAffected;
  }

  public void setComponentsAffected(
      List<PatchDegradationTemplateRequestDataAttributesComponentsAffectedItems>
          componentsAffected) {
    this.componentsAffected = componentsAffected;
    if (componentsAffected != null) {
      for (PatchDegradationTemplateRequestDataAttributesComponentsAffectedItems item :
          componentsAffected) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public PatchDegradationTemplateRequestDataAttributes degradationTitle(String degradationTitle) {
    this.degradationTitle = degradationTitle;
    return this;
  }

  /**
   * The title used for a degradation created from this template.
   *
   * @return degradationTitle
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_DEGRADATION_TITLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getDegradationTitle() {
    return degradationTitle;
  }

  public void setDegradationTitle(String degradationTitle) {
    this.degradationTitle = degradationTitle;
  }

  public PatchDegradationTemplateRequestDataAttributes name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the degradation template.
   *
   * @return name
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PatchDegradationTemplateRequestDataAttributes updates(
      List<PatchDegradationTemplateRequestDataAttributesUpdatesItems> updates) {
    this.updates = updates;
    if (updates != null) {
      for (PatchDegradationTemplateRequestDataAttributesUpdatesItems item : updates) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public PatchDegradationTemplateRequestDataAttributes addUpdatesItem(
      PatchDegradationTemplateRequestDataAttributesUpdatesItems updatesItem) {
    if (this.updates == null) {
      this.updates = new ArrayList<>();
    }
    this.updates.add(updatesItem);
    this.unparsed |= updatesItem.unparsed;
    return this;
  }

  /**
   * The pre-filled updates for a degradation created from this template.
   *
   * @return updates
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<PatchDegradationTemplateRequestDataAttributesUpdatesItems> getUpdates() {
    return updates;
  }

  public void setUpdates(List<PatchDegradationTemplateRequestDataAttributesUpdatesItems> updates) {
    this.updates = updates;
    if (updates != null) {
      for (PatchDegradationTemplateRequestDataAttributesUpdatesItems item : updates) {
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
   * @return PatchDegradationTemplateRequestDataAttributes
   */
  @JsonAnySetter
  public PatchDegradationTemplateRequestDataAttributes putAdditionalProperty(
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

  /** Return true if this PatchDegradationTemplateRequestDataAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PatchDegradationTemplateRequestDataAttributes patchDegradationTemplateRequestDataAttributes =
        (PatchDegradationTemplateRequestDataAttributes) o;
    return Objects.equals(
            this.componentsAffected,
            patchDegradationTemplateRequestDataAttributes.componentsAffected)
        && Objects.equals(
            this.degradationTitle, patchDegradationTemplateRequestDataAttributes.degradationTitle)
        && Objects.equals(this.name, patchDegradationTemplateRequestDataAttributes.name)
        && Objects.equals(this.updates, patchDegradationTemplateRequestDataAttributes.updates)
        && Objects.equals(
            this.additionalProperties,
            patchDegradationTemplateRequestDataAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(componentsAffected, degradationTitle, name, updates, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PatchDegradationTemplateRequestDataAttributes {\n");
    sb.append("    componentsAffected: ").append(toIndentedString(componentsAffected)).append("\n");
    sb.append("    degradationTitle: ").append(toIndentedString(degradationTitle)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    updates: ").append(toIndentedString(updates)).append("\n");
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
