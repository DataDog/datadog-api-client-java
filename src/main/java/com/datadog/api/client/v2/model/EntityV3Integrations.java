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
   * <p>A base schema for defining third-party integrations.</p>
 */
@JsonPropertyOrder({
  EntityV3Integrations.JSON_PROPERTY_OPSGENIE,
  EntityV3Integrations.JSON_PROPERTY_PAGERDUTY
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3Integrations {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_OPSGENIE = "opsgenie";
  private EntityV3DatadogIntegrationOpsgenie opsgenie;

  public static final String JSON_PROPERTY_PAGERDUTY = "pagerduty";
  private EntityV3DatadogIntegrationPagerduty pagerduty;

  public EntityV3Integrations opsgenie(EntityV3DatadogIntegrationOpsgenie opsgenie) {
    this.opsgenie = opsgenie;
    this.unparsed |= opsgenie.unparsed;
    return this;
  }

  /**
   * <p>An Opsgenie integration schema.</p>
   * @return opsgenie
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_OPSGENIE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EntityV3DatadogIntegrationOpsgenie getOpsgenie() {
        return opsgenie;
      }
  public void setOpsgenie(EntityV3DatadogIntegrationOpsgenie opsgenie) {
    this.opsgenie = opsgenie;
  }
  public EntityV3Integrations pagerduty(EntityV3DatadogIntegrationPagerduty pagerduty) {
    this.pagerduty = pagerduty;
    this.unparsed |= pagerduty.unparsed;
    return this;
  }

  /**
   * <p>A PagerDuty integration schema.</p>
   * @return pagerduty
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGERDUTY)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public EntityV3DatadogIntegrationPagerduty getPagerduty() {
        return pagerduty;
      }
  public void setPagerduty(EntityV3DatadogIntegrationPagerduty pagerduty) {
    this.pagerduty = pagerduty;
  }

  /**
   * Return true if this EntityV3Integrations object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3Integrations entityV3Integrations = (EntityV3Integrations) o;
    return Objects.equals(this.opsgenie, entityV3Integrations.opsgenie) && Objects.equals(this.pagerduty, entityV3Integrations.pagerduty);
  }


  @Override
  public int hashCode() {
    return Objects.hash(opsgenie,pagerduty);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3Integrations {\n");
    sb.append("    opsgenie: ").append(toIndentedString(opsgenie)).append("\n");
    sb.append("    pagerduty: ").append(toIndentedString(pagerduty)).append("\n");
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
