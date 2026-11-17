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

/** An event to instrument for the launch. */
@JsonPropertyOrder({
  ProductAnalyticsLaunchEvent.JSON_PROPERTY_DESCRIPTION,
  ProductAnalyticsLaunchEvent.JSON_PROPERTY_KPIS,
  ProductAnalyticsLaunchEvent.JSON_PROPERTY_NAME,
  ProductAnalyticsLaunchEvent.JSON_PROPERTY_PROPERTIES,
  ProductAnalyticsLaunchEvent.JSON_PROPERTY_TRIGGER,
  ProductAnalyticsLaunchEvent.JSON_PROPERTY_VIEWS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ProductAnalyticsLaunchEvent {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_KPIS = "kpis";
  private List<String> kpis = null;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_PROPERTIES = "properties";
  private List<ProductAnalyticsLaunchEventProperty> properties = null;

  public static final String JSON_PROPERTY_TRIGGER = "trigger";
  private String trigger;

  public static final String JSON_PROPERTY_VIEWS = "views";
  private List<String> views = null;

  public ProductAnalyticsLaunchEvent() {}

  @JsonCreator
  public ProductAnalyticsLaunchEvent(
      @JsonProperty(required = true, value = JSON_PROPERTY_NAME) String name) {
    this.name = name;
  }

  public ProductAnalyticsLaunchEvent description(String description) {
    this.description = description;
    return this;
  }

  /**
   * What the event records.
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

  public ProductAnalyticsLaunchEvent kpis(List<String> kpis) {
    this.kpis = kpis;
    return this;
  }

  public ProductAnalyticsLaunchEvent addKpisItem(String kpisItem) {
    if (this.kpis == null) {
      this.kpis = new ArrayList<>();
    }
    this.kpis.add(kpisItem);
    return this;
  }

  /**
   * IDs of the launch KPIs that the event measures.
   *
   * @return kpis
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_KPIS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getKpis() {
    return kpis;
  }

  public void setKpis(List<String> kpis) {
    this.kpis = kpis;
  }

  public ProductAnalyticsLaunchEvent name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the event, unique within the tracking plan.
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

  public ProductAnalyticsLaunchEvent properties(
      List<ProductAnalyticsLaunchEventProperty> properties) {
    this.properties = properties;
    if (properties != null) {
      for (ProductAnalyticsLaunchEventProperty item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public ProductAnalyticsLaunchEvent addPropertiesItem(
      ProductAnalyticsLaunchEventProperty propertiesItem) {
    if (this.properties == null) {
      this.properties = new ArrayList<>();
    }
    this.properties.add(propertiesItem);
    this.unparsed |= propertiesItem.unparsed;
    return this;
  }

  /**
   * Properties that the event carries.
   *
   * @return properties
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PROPERTIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<ProductAnalyticsLaunchEventProperty> getProperties() {
    return properties;
  }

  public void setProperties(List<ProductAnalyticsLaunchEventProperty> properties) {
    this.properties = properties;
    if (properties != null) {
      for (ProductAnalyticsLaunchEventProperty item : properties) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public ProductAnalyticsLaunchEvent trigger(String trigger) {
    this.trigger = trigger;
    return this;
  }

  /**
   * What causes the event to be sent.
   *
   * @return trigger
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TRIGGER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getTrigger() {
    return trigger;
  }

  public void setTrigger(String trigger) {
    this.trigger = trigger;
  }

  public ProductAnalyticsLaunchEvent views(List<String> views) {
    this.views = views;
    return this;
  }

  public ProductAnalyticsLaunchEvent addViewsItem(String viewsItem) {
    if (this.views == null) {
      this.views = new ArrayList<>();
    }
    this.views.add(viewsItem);
    return this;
  }

  /**
   * Views where the event is sent. Each value must be unique and not blank.
   *
   * @return views
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_VIEWS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getViews() {
    return views;
  }

  public void setViews(List<String> views) {
    this.views = views;
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
   * @return ProductAnalyticsLaunchEvent
   */
  @JsonAnySetter
  public ProductAnalyticsLaunchEvent putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ProductAnalyticsLaunchEvent object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductAnalyticsLaunchEvent productAnalyticsLaunchEvent = (ProductAnalyticsLaunchEvent) o;
    return Objects.equals(this.description, productAnalyticsLaunchEvent.description)
        && Objects.equals(this.kpis, productAnalyticsLaunchEvent.kpis)
        && Objects.equals(this.name, productAnalyticsLaunchEvent.name)
        && Objects.equals(this.properties, productAnalyticsLaunchEvent.properties)
        && Objects.equals(this.trigger, productAnalyticsLaunchEvent.trigger)
        && Objects.equals(this.views, productAnalyticsLaunchEvent.views)
        && Objects.equals(
            this.additionalProperties, productAnalyticsLaunchEvent.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, kpis, name, properties, trigger, views, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductAnalyticsLaunchEvent {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    kpis: ").append(toIndentedString(kpis)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    properties: ").append(toIndentedString(properties)).append("\n");
    sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
    sb.append("    views: ").append(toIndentedString(views)).append("\n");
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
