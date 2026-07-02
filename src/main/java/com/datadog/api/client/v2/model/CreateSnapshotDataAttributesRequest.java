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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/** Attributes for snapshot creation. */
@JsonPropertyOrder({
  CreateSnapshotDataAttributesRequest.JSON_PROPERTY_ADDITIONAL_CONFIG,
  CreateSnapshotDataAttributesRequest.JSON_PROPERTY_END,
  CreateSnapshotDataAttributesRequest.JSON_PROPERTY_HEIGHT,
  CreateSnapshotDataAttributesRequest.JSON_PROPERTY_IS_AUTHENTICATED,
  CreateSnapshotDataAttributesRequest.JSON_PROPERTY_START,
  CreateSnapshotDataAttributesRequest.JSON_PROPERTY_TTL,
  CreateSnapshotDataAttributesRequest.JSON_PROPERTY_WIDGET_DEFINITION,
  CreateSnapshotDataAttributesRequest.JSON_PROPERTY_WIDTH
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateSnapshotDataAttributesRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ADDITIONAL_CONFIG = "additional_config";
  private CreateSnapshotAdditionalConfig additionalConfig;

  public static final String JSON_PROPERTY_END = "end";
  private Long end;

  public static final String JSON_PROPERTY_HEIGHT = "height";
  private Long height;

  public static final String JSON_PROPERTY_IS_AUTHENTICATED = "is_authenticated";
  private Boolean isAuthenticated;

  public static final String JSON_PROPERTY_START = "start";
  private Long start;

  public static final String JSON_PROPERTY_TTL = "ttl";
  private CreateSnapshotTTL ttl;

  public static final String JSON_PROPERTY_WIDGET_DEFINITION = "widget_definition";
  private Map<String, Object> widgetDefinition = new HashMap<String, Object>();

  public static final String JSON_PROPERTY_WIDTH = "width";
  private Long width;

  public CreateSnapshotDataAttributesRequest() {}

  @JsonCreator
  public CreateSnapshotDataAttributesRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_END) Long end,
      @JsonProperty(required = true, value = JSON_PROPERTY_START) Long start,
      @JsonProperty(required = true, value = JSON_PROPERTY_WIDGET_DEFINITION)
          Map<String, Object> widgetDefinition) {
    this.end = end;
    this.start = start;
    this.widgetDefinition = widgetDefinition;
  }

  public CreateSnapshotDataAttributesRequest additionalConfig(
      CreateSnapshotAdditionalConfig additionalConfig) {
    this.additionalConfig = additionalConfig;
    this.unparsed |= additionalConfig.unparsed;
    return this;
  }

  /**
   * Additional configuration options for snapshot creation.
   *
   * @return additionalConfig
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_CONFIG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CreateSnapshotAdditionalConfig getAdditionalConfig() {
    return additionalConfig;
  }

  public void setAdditionalConfig(CreateSnapshotAdditionalConfig additionalConfig) {
    this.additionalConfig = additionalConfig;
  }

  public CreateSnapshotDataAttributesRequest end(Long end) {
    this.end = end;
    return this;
  }

  /**
   * End of the time window for the snapshot, in milliseconds since Unix epoch.
   *
   * @return end
   */
  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getEnd() {
    return end;
  }

  public void setEnd(Long end) {
    this.end = end;
  }

  public CreateSnapshotDataAttributesRequest height(Long height) {
    this.height = height;
    return this;
  }

  /**
   * The height of the rendered snapshot in pixels.
   *
   * @return height
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEIGHT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getHeight() {
    return height;
  }

  public void setHeight(Long height) {
    this.height = height;
  }

  public CreateSnapshotDataAttributesRequest isAuthenticated(Boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
    return this;
  }

  /**
   * Whether the snapshot requires authentication to view. Authenticated snapshots are scoped to the
   * creating organization.
   *
   * @return isAuthenticated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_AUTHENTICATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsAuthenticated() {
    return isAuthenticated;
  }

  public void setIsAuthenticated(Boolean isAuthenticated) {
    this.isAuthenticated = isAuthenticated;
  }

  public CreateSnapshotDataAttributesRequest start(Long start) {
    this.start = start;
    return this;
  }

  /**
   * Start of the time window for the snapshot, in milliseconds since Unix epoch.
   *
   * @return start
   */
  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Long getStart() {
    return start;
  }

  public void setStart(Long start) {
    this.start = start;
  }

  public CreateSnapshotDataAttributesRequest ttl(CreateSnapshotTTL ttl) {
    this.ttl = ttl;
    this.unparsed |= !ttl.isValid();
    return this;
  }

  /**
   * The time-to-live for the snapshot. This value corresponds to storage lifecycle policies that
   * automatically delete the snapshot after the specified period.
   *
   * @return ttl
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TTL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public CreateSnapshotTTL getTtl() {
    return ttl;
  }

  public void setTtl(CreateSnapshotTTL ttl) {
    if (!ttl.isValid()) {
      this.unparsed = true;
    }
    this.ttl = ttl;
  }

  public CreateSnapshotDataAttributesRequest widgetDefinition(
      Map<String, Object> widgetDefinition) {
    this.widgetDefinition = widgetDefinition;
    return this;
  }

  public CreateSnapshotDataAttributesRequest putWidgetDefinitionItem(
      String key, Object widgetDefinitionItem) {
    this.widgetDefinition.put(key, widgetDefinitionItem);
    return this;
  }

  /**
   * The widget definition to render as a snapshot. Must include a valid <code>type</code> field and
   * non-empty <code>requests</code> array.
   *
   * @return widgetDefinition
   */
  @JsonProperty(JSON_PROPERTY_WIDGET_DEFINITION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public Map<String, Object> getWidgetDefinition() {
    return widgetDefinition;
  }

  public void setWidgetDefinition(Map<String, Object> widgetDefinition) {
    this.widgetDefinition = widgetDefinition;
  }

  public CreateSnapshotDataAttributesRequest width(Long width) {
    this.width = width;
    return this;
  }

  /**
   * The width of the rendered snapshot in pixels.
   *
   * @return width
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WIDTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getWidth() {
    return width;
  }

  public void setWidth(Long width) {
    this.width = width;
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
   * @return CreateSnapshotDataAttributesRequest
   */
  @JsonAnySetter
  public CreateSnapshotDataAttributesRequest putAdditionalProperty(String key, Object value) {
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

  /** Return true if this CreateSnapshotDataAttributesRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateSnapshotDataAttributesRequest createSnapshotDataAttributesRequest =
        (CreateSnapshotDataAttributesRequest) o;
    return Objects.equals(
            this.additionalConfig, createSnapshotDataAttributesRequest.additionalConfig)
        && Objects.equals(this.end, createSnapshotDataAttributesRequest.end)
        && Objects.equals(this.height, createSnapshotDataAttributesRequest.height)
        && Objects.equals(this.isAuthenticated, createSnapshotDataAttributesRequest.isAuthenticated)
        && Objects.equals(this.start, createSnapshotDataAttributesRequest.start)
        && Objects.equals(this.ttl, createSnapshotDataAttributesRequest.ttl)
        && Objects.equals(
            this.widgetDefinition, createSnapshotDataAttributesRequest.widgetDefinition)
        && Objects.equals(this.width, createSnapshotDataAttributesRequest.width)
        && Objects.equals(
            this.additionalProperties, createSnapshotDataAttributesRequest.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        additionalConfig,
        end,
        height,
        isAuthenticated,
        start,
        ttl,
        widgetDefinition,
        width,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateSnapshotDataAttributesRequest {\n");
    sb.append("    additionalConfig: ").append(toIndentedString(additionalConfig)).append("\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    isAuthenticated: ").append(toIndentedString(isAuthenticated)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
    sb.append("    ttl: ").append(toIndentedString(ttl)).append("\n");
    sb.append("    widgetDefinition: ").append(toIndentedString(widgetDefinition)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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
