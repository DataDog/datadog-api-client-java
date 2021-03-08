/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.datadog.api.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.datadog.api.v2.client.model.SecurityMonitoringRuleSeverity;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.datadog.api.v2.client.JSON;


/**
 * Case when signal is generated.
 */
@ApiModel(description = "Case when signal is generated.")
@JsonPropertyOrder({
  SecurityMonitoringRuleCaseCreate.JSON_PROPERTY_CONDITION,
  SecurityMonitoringRuleCaseCreate.JSON_PROPERTY_NAME,
  SecurityMonitoringRuleCaseCreate.JSON_PROPERTY_NOTIFICATIONS,
  SecurityMonitoringRuleCaseCreate.JSON_PROPERTY_STATUS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SecurityMonitoringRuleCaseCreate {
  public static final String JSON_PROPERTY_CONDITION = "condition";
  private String condition;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_NOTIFICATIONS = "notifications";
  private List<String> notifications = null;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SecurityMonitoringRuleSeverity status;


  public SecurityMonitoringRuleCaseCreate condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * A rule case contains logical operations (&#x60;&gt;&#x60;,&#x60;&gt;&#x3D;&#x60;, &#x60;&amp;&amp;&#x60;, &#x60;||&#x60;) to determine if a signal should be generated based on the event counts in the previously defined queries.
   * @return condition
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A rule case contains logical operations (`>`,`>=`, `&&`, `||`) to determine if a signal should be generated based on the event counts in the previously defined queries.")
  @JsonProperty(JSON_PROPERTY_CONDITION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCondition() {
    return condition;
  }


  public void setCondition(String condition) {
    this.condition = condition;
  }


  public SecurityMonitoringRuleCaseCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the case.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the case.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public SecurityMonitoringRuleCaseCreate notifications(List<String> notifications) {
    this.notifications = notifications;
    return this;
  }

  public SecurityMonitoringRuleCaseCreate addNotificationsItem(String notificationsItem) {
    if (this.notifications == null) {
      this.notifications = new ArrayList<>();
    }
    this.notifications.add(notificationsItem);
    return this;
  }

   /**
   * Notification targets for each rule case.
   * @return notifications
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Notification targets for each rule case.")
  @JsonProperty(JSON_PROPERTY_NOTIFICATIONS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<String> getNotifications() {
    return notifications;
  }


  public void setNotifications(List<String> notifications) {
    this.notifications = notifications;
  }


  public SecurityMonitoringRuleCaseCreate status(SecurityMonitoringRuleSeverity status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public SecurityMonitoringRuleSeverity getStatus() {
    return status;
  }


  public void setStatus(SecurityMonitoringRuleSeverity status) {
    this.status = status;
  }


  /**
   * Return true if this SecurityMonitoringRuleCaseCreate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleCaseCreate securityMonitoringRuleCaseCreate = (SecurityMonitoringRuleCaseCreate) o;
    return Objects.equals(this.condition, securityMonitoringRuleCaseCreate.condition) &&
        Objects.equals(this.name, securityMonitoringRuleCaseCreate.name) &&
        Objects.equals(this.notifications, securityMonitoringRuleCaseCreate.notifications) &&
        Objects.equals(this.status, securityMonitoringRuleCaseCreate.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, name, notifications, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleCaseCreate {\n");
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

