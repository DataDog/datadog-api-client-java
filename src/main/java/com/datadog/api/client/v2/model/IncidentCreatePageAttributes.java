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
import org.openapitools.jackson.nullable.JsonNullable;

/** Attributes for creating a page from an incident. */
@JsonPropertyOrder({
  IncidentCreatePageAttributes.JSON_PROPERTY_DESCRIPTION,
  IncidentCreatePageAttributes.JSON_PROPERTY_SERVICES,
  IncidentCreatePageAttributes.JSON_PROPERTY_TAGS,
  IncidentCreatePageAttributes.JSON_PROPERTY_TARGET,
  IncidentCreatePageAttributes.JSON_PROPERTY_TITLE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentCreatePageAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SERVICES = "services";
  private JsonNullable<List<String>> services = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_TAGS = "tags";
  private JsonNullable<List<String>> tags = JsonNullable.<List<String>>undefined();

  public static final String JSON_PROPERTY_TARGET = "target";
  private IncidentPageTarget target;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public IncidentCreatePageAttributes() {}

  @JsonCreator
  public IncidentCreatePageAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_TARGET) IncidentPageTarget target,
      @JsonProperty(required = true, value = JSON_PROPERTY_TITLE) String title) {
    this.target = target;
    this.unparsed |= target.unparsed;
    this.title = title;
  }

  public IncidentCreatePageAttributes description(String description) {
    this.description = JsonNullable.<String>of(description);
    return this;
  }

  /**
   * Description of the page.
   *
   * @return description
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public String getDescription() {
    return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }

  public IncidentCreatePageAttributes services(List<String> services) {
    this.services = JsonNullable.<List<String>>of(services);
    return this;
  }

  public IncidentCreatePageAttributes addServicesItem(String servicesItem) {
    if (this.services == null || !this.services.isPresent()) {
      this.services = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.services.get().add(servicesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of services associated with the page.
   *
   * @return services
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getServices() {
    return services.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SERVICES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getServices_JsonNullable() {
    return services;
  }

  @JsonProperty(JSON_PROPERTY_SERVICES)
  public void setServices_JsonNullable(JsonNullable<List<String>> services) {
    this.services = services;
  }

  public void setServices(List<String> services) {
    this.services = JsonNullable.<List<String>>of(services);
  }

  public IncidentCreatePageAttributes tags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
    return this;
  }

  public IncidentCreatePageAttributes addTagsItem(String tagsItem) {
    if (this.tags == null || !this.tags.isPresent()) {
      this.tags = JsonNullable.<List<String>>of(new ArrayList<>());
    }
    try {
      this.tags.get().add(tagsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

  /**
   * List of tags for the page.
   *
   * @return tags
   */
  @jakarta.annotation.Nullable
  @JsonIgnore
  public List<String> getTags() {
    return tags.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public JsonNullable<List<String>> getTags_JsonNullable() {
    return tags;
  }

  @JsonProperty(JSON_PROPERTY_TAGS)
  public void setTags_JsonNullable(JsonNullable<List<String>> tags) {
    this.tags = tags;
  }

  public void setTags(List<String> tags) {
    this.tags = JsonNullable.<List<String>>of(tags);
  }

  public IncidentCreatePageAttributes target(IncidentPageTarget target) {
    this.target = target;
    this.unparsed |= target.unparsed;
    return this;
  }

  /**
   * Target for creating a page from an incident.
   *
   * @return target
   */
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public IncidentPageTarget getTarget() {
    return target;
  }

  public void setTarget(IncidentPageTarget target) {
    this.target = target;
  }

  public IncidentCreatePageAttributes title(String title) {
    this.title = title;
    return this;
  }

  /**
   * Title of the page.
   *
   * @return title
   */
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
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
   * @return IncidentCreatePageAttributes
   */
  @JsonAnySetter
  public IncidentCreatePageAttributes putAdditionalProperty(String key, Object value) {
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

  /** Return true if this IncidentCreatePageAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentCreatePageAttributes incidentCreatePageAttributes = (IncidentCreatePageAttributes) o;
    return Objects.equals(this.description, incidentCreatePageAttributes.description)
        && Objects.equals(this.services, incidentCreatePageAttributes.services)
        && Objects.equals(this.tags, incidentCreatePageAttributes.tags)
        && Objects.equals(this.target, incidentCreatePageAttributes.target)
        && Objects.equals(this.title, incidentCreatePageAttributes.title)
        && Objects.equals(
            this.additionalProperties, incidentCreatePageAttributes.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, services, tags, target, title, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentCreatePageAttributes {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    services: ").append(toIndentedString(services)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
