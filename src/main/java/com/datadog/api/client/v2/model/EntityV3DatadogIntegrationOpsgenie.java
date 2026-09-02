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
import java.util.Objects;

/** An Opsgenie integration schema. */
@JsonPropertyOrder({
  EntityV3DatadogIntegrationOpsgenie.JSON_PROPERTY_REGION,
  EntityV3DatadogIntegrationOpsgenie.JSON_PROPERTY_SERVICE_URL
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3DatadogIntegrationOpsgenie {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_REGION = "region";
  private String region;

  public static final String JSON_PROPERTY_SERVICE_URL = "serviceURL";
  private String serviceUrl;

  public EntityV3DatadogIntegrationOpsgenie() {}

  @JsonCreator
  public EntityV3DatadogIntegrationOpsgenie(
      @JsonProperty(required = true, value = JSON_PROPERTY_SERVICE_URL) String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }

  public EntityV3DatadogIntegrationOpsgenie region(String region) {
    this.region = region;
    return this;
  }

  /**
   * The region for the Opsgenie integration.
   *
   * @return region
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REGION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRegion() {
    return region;
  }

  public void setRegion(String region) {
    this.region = region;
  }

  public EntityV3DatadogIntegrationOpsgenie serviceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
    return this;
  }

  /**
   * The service URL for the Opsgenie integration.
   *
   * @return serviceUrl
   */
  @JsonProperty(JSON_PROPERTY_SERVICE_URL)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getServiceUrl() {
    return serviceUrl;
  }

  public void setServiceUrl(String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }

  /** Return true if this EntityV3DatadogIntegrationOpsgenie object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3DatadogIntegrationOpsgenie entityV3DatadogIntegrationOpsgenie =
        (EntityV3DatadogIntegrationOpsgenie) o;
    return Objects.equals(this.region, entityV3DatadogIntegrationOpsgenie.region)
        && Objects.equals(this.serviceUrl, entityV3DatadogIntegrationOpsgenie.serviceUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(region, serviceUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3DatadogIntegrationOpsgenie {\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    serviceUrl: ").append(toIndentedString(serviceUrl)).append("\n");
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
