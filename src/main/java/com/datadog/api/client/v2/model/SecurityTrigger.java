/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.Objects;

/**
 * Trigger a workflow VIA a Security Signal or Finding. For automatic triggering a handle must be
 * configured and the workflow must be published.
 */
@JsonPropertyOrder({SecurityTrigger.JSON_PROPERTY_RATE_LIMIT})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SecurityTrigger {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_RATE_LIMIT = "rateLimit";
  private TriggerRateLimit rateLimit;

  public SecurityTrigger rateLimit(TriggerRateLimit rateLimit) {
    this.rateLimit = rateLimit;
    this.unparsed |= rateLimit.unparsed;
    return this;
  }

  /**
   * Defines a rate limit for a trigger.
   *
   * @return rateLimit
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RATE_LIMIT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public TriggerRateLimit getRateLimit() {
    return rateLimit;
  }

  public void setRateLimit(TriggerRateLimit rateLimit) {
    this.rateLimit = rateLimit;
  }

  /** Return true if this SecurityTrigger object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecurityTrigger securityTrigger = (SecurityTrigger) o;
    return Objects.equals(this.rateLimit, securityTrigger.rateLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rateLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecurityTrigger {\n");
    sb.append("    rateLimit: ").append(toIndentedString(rateLimit)).append("\n");
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
