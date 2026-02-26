/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;


/**
   * <p>Options on third party detection method.</p>
 */
@JsonPropertyOrder({
  SecurityMonitoringRuleThirdPartyOptions.JSON_PROPERTY_DEFAULT_NOTIFICATIONS,
  SecurityMonitoringRuleThirdPartyOptions.JSON_PROPERTY_DEFAULT_STATUS,
  SecurityMonitoringRuleThirdPartyOptions.JSON_PROPERTY_ROOT_QUERIES,
  SecurityMonitoringRuleThirdPartyOptions.JSON_PROPERTY_SIGNAL_TITLE_TEMPLATE
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityMonitoringRuleThirdPartyOptions {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_DEFAULT_NOTIFICATIONS = "defaultNotifications";
  private List<String> defaultNotifications = null;

  public static final String JSON_PROPERTY_DEFAULT_STATUS = "defaultStatus";
  private SecurityMonitoringRuleSeverity defaultStatus;

  public static final String JSON_PROPERTY_ROOT_QUERIES = "rootQueries";
  private List<SecurityMonitoringThirdPartyRootQuery> rootQueries = null;

  public static final String JSON_PROPERTY_SIGNAL_TITLE_TEMPLATE = "signalTitleTemplate";
  private String signalTitleTemplate;

  public SecurityMonitoringRuleThirdPartyOptions defaultNotifications(List<String> defaultNotifications) {
    this.defaultNotifications = defaultNotifications;
    return this;
  }
  public SecurityMonitoringRuleThirdPartyOptions addDefaultNotificationsItem(String defaultNotificationsItem) {
    if (this.defaultNotifications == null) {
      this.defaultNotifications = new ArrayList<>();
    }
    this.defaultNotifications.add(defaultNotificationsItem);
    return this;
  }

  /**
   * <p>Notification targets for the logs that do not correspond to any of the cases.</p>
   * @return defaultNotifications
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEFAULT_NOTIFICATIONS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getDefaultNotifications() {
        return defaultNotifications;
      }
  public void setDefaultNotifications(List<String> defaultNotifications) {
    this.defaultNotifications = defaultNotifications;
  }
  public SecurityMonitoringRuleThirdPartyOptions defaultStatus(SecurityMonitoringRuleSeverity defaultStatus) {
    this.defaultStatus = defaultStatus;
    this.unparsed |= !defaultStatus.isValid();
    return this;
  }

  /**
   * <p>Severity of the Security Signal.</p>
   * @return defaultStatus
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_DEFAULT_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SecurityMonitoringRuleSeverity getDefaultStatus() {
        return defaultStatus;
      }
  public void setDefaultStatus(SecurityMonitoringRuleSeverity defaultStatus) {
    if (!defaultStatus.isValid()) {
        this.unparsed = true;
    }
    this.defaultStatus = defaultStatus;
  }
  public SecurityMonitoringRuleThirdPartyOptions rootQueries(List<SecurityMonitoringThirdPartyRootQuery> rootQueries) {
    this.rootQueries = rootQueries;
    for (SecurityMonitoringThirdPartyRootQuery item : rootQueries) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SecurityMonitoringRuleThirdPartyOptions addRootQueriesItem(SecurityMonitoringThirdPartyRootQuery rootQueriesItem) {
    if (this.rootQueries == null) {
      this.rootQueries = new ArrayList<>();
    }
    this.rootQueries.add(rootQueriesItem);
    this.unparsed |= rootQueriesItem.unparsed;
    return this;
  }

  /**
   * <p>Queries to be combined with third party case queries. Each of them can have different group by fields, to aggregate differently based on the type of alert.</p>
   * @return rootQueries
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ROOT_QUERIES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SecurityMonitoringThirdPartyRootQuery> getRootQueries() {
        return rootQueries;
      }
  public void setRootQueries(List<SecurityMonitoringThirdPartyRootQuery> rootQueries) {
    this.rootQueries = rootQueries;
  }
  public SecurityMonitoringRuleThirdPartyOptions signalTitleTemplate(String signalTitleTemplate) {
    this.signalTitleTemplate = signalTitleTemplate;
    return this;
  }

  /**
   * <p>A template for the signal title; if omitted, the title is generated based on the case name.</p>
   * @return signalTitleTemplate
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SIGNAL_TITLE_TEMPLATE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getSignalTitleTemplate() {
        return signalTitleTemplate;
      }
  public void setSignalTitleTemplate(String signalTitleTemplate) {
    this.signalTitleTemplate = signalTitleTemplate;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key The arbitrary key to set
   * @param value The associated value
   * @return SecurityMonitoringRuleThirdPartyOptions
   */
  @JsonAnySetter
  public SecurityMonitoringRuleThirdPartyOptions putAdditionalProperty(String key, Object value) {
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

  /**
   * Return true if this SecurityMonitoringRuleThirdPartyOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityMonitoringRuleThirdPartyOptions securityMonitoringRuleThirdPartyOptions = (SecurityMonitoringRuleThirdPartyOptions) o;
    return Objects.equals(this.defaultNotifications, securityMonitoringRuleThirdPartyOptions.defaultNotifications) && Objects.equals(this.defaultStatus, securityMonitoringRuleThirdPartyOptions.defaultStatus) && Objects.equals(this.rootQueries, securityMonitoringRuleThirdPartyOptions.rootQueries) && Objects.equals(this.signalTitleTemplate, securityMonitoringRuleThirdPartyOptions.signalTitleTemplate) && Objects.equals(this.additionalProperties, securityMonitoringRuleThirdPartyOptions.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(defaultNotifications,defaultStatus,rootQueries,signalTitleTemplate, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityMonitoringRuleThirdPartyOptions {\n");
    sb.append("    defaultNotifications: ").append(toIndentedString(defaultNotifications)).append("\n");
    sb.append("    defaultStatus: ").append(toIndentedString(defaultStatus)).append("\n");
    sb.append("    rootQueries: ").append(toIndentedString(rootQueries)).append("\n");
    sb.append("    signalTitleTemplate: ").append(toIndentedString(signalTitleTemplate)).append("\n");
    sb.append("    additionalProperties: ")
        .append(toIndentedString(additionalProperties))
        .append("\n");
    sb.append('}');
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
