/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** Alert event attributes. */
@JsonPropertyOrder({
  AlertEventCustomAttributes.JSON_PROPERTY_CUSTOM,
  AlertEventCustomAttributes.JSON_PROPERTY_LINKS,
  AlertEventCustomAttributes.JSON_PROPERTY_PRIORITY,
  AlertEventCustomAttributes.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AlertEventCustomAttributes {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_CUSTOM = "custom";
  private Map<String, Object> custom = null;

  public static final String JSON_PROPERTY_LINKS = "links";
  private List<AlertEventCustomAttributesLinksItems> links = null;

  public static final String JSON_PROPERTY_PRIORITY = "priority";
  private AlertEventCustomAttributesPriority priority =
      AlertEventCustomAttributesPriority.PRIORITY_FIVE;

  public static final String JSON_PROPERTY_STATUS = "status";
  private AlertEventCustomAttributesStatus status;

  public AlertEventCustomAttributes() {}

  @JsonCreator
  public AlertEventCustomAttributes(
      @JsonProperty(required = true, value = JSON_PROPERTY_STATUS)
          AlertEventCustomAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
  }

  public AlertEventCustomAttributes custom(Map<String, Object> custom) {
    this.custom = custom;
    return this;
  }

  public AlertEventCustomAttributes putCustomItem(String key, Object customItem) {
    if (this.custom == null) {
      this.custom = new HashMap<>();
    }
    this.custom.put(key, customItem);
    return this;
  }

  /**
   * Free form JSON object for arbitrary data. Supports up to 100 properties per object and a
   * maximum nesting depth of 10 levels.
   *
   * @return custom
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CUSTOM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getCustom() {
    return custom;
  }

  public void setCustom(Map<String, Object> custom) {
    this.custom = custom;
  }

  public AlertEventCustomAttributes links(List<AlertEventCustomAttributesLinksItems> links) {
    this.links = links;
    for (AlertEventCustomAttributesLinksItems item : links) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public AlertEventCustomAttributes addLinksItem(AlertEventCustomAttributesLinksItems linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<>();
    }
    this.links.add(linksItem);
    this.unparsed |= linksItem.unparsed;
    return this;
  }

  /**
   * The links related to the event. Maximum of 20 links allowed.
   *
   * @return links
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AlertEventCustomAttributesLinksItems> getLinks() {
    return links;
  }

  public void setLinks(List<AlertEventCustomAttributesLinksItems> links) {
    this.links = links;
  }

  public AlertEventCustomAttributes priority(AlertEventCustomAttributesPriority priority) {
    this.priority = priority;
    this.unparsed |= !priority.isValid();
    return this;
  }

  /**
   * The priority of the alert.
   *
   * @return priority
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PRIORITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AlertEventCustomAttributesPriority getPriority() {
    return priority;
  }

  public void setPriority(AlertEventCustomAttributesPriority priority) {
    if (!priority.isValid()) {
      this.unparsed = true;
    }
    this.priority = priority;
  }

  public AlertEventCustomAttributes status(AlertEventCustomAttributesStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * The status of the alert.
   *
   * @return status
   */
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public AlertEventCustomAttributesStatus getStatus() {
    return status;
  }

  public void setStatus(AlertEventCustomAttributesStatus status) {
    if (!status.isValid()) {
      this.unparsed = true;
    }
    this.status = status;
  }

  /** Return true if this AlertEventCustomAttributes object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlertEventCustomAttributes alertEventCustomAttributes = (AlertEventCustomAttributes) o;
    return Objects.equals(this.custom, alertEventCustomAttributes.custom)
        && Objects.equals(this.links, alertEventCustomAttributes.links)
        && Objects.equals(this.priority, alertEventCustomAttributes.priority)
        && Objects.equals(this.status, alertEventCustomAttributes.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custom, links, priority, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlertEventCustomAttributes {\n");
    sb.append("    custom: ").append(toIndentedString(custom)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
