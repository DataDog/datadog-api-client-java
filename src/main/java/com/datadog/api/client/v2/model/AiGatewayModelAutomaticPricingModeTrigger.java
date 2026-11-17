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

/** Request fields that select a priced mode. */
@JsonPropertyOrder({
  AiGatewayModelAutomaticPricingModeTrigger.JSON_PROPERTY_BODY,
  AiGatewayModelAutomaticPricingModeTrigger.JSON_PROPERTY_HEADERS,
  AiGatewayModelAutomaticPricingModeTrigger.JSON_PROPERTY_MODE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AiGatewayModelAutomaticPricingModeTrigger {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BODY = "body";
  private List<AiGatewayModelAutomaticPricingFieldMatch> body = null;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private List<AiGatewayModelAutomaticPricingFieldMatch> headers = null;

  public static final String JSON_PROPERTY_MODE = "mode";
  private String mode;

  public AiGatewayModelAutomaticPricingModeTrigger() {}

  @JsonCreator
  public AiGatewayModelAutomaticPricingModeTrigger(
      @JsonProperty(required = true, value = JSON_PROPERTY_MODE) String mode) {
    this.mode = mode;
  }

  public AiGatewayModelAutomaticPricingModeTrigger body(
      List<AiGatewayModelAutomaticPricingFieldMatch> body) {
    this.body = body;
    if (body != null) {
      for (AiGatewayModelAutomaticPricingFieldMatch item : body) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AiGatewayModelAutomaticPricingModeTrigger addBodyItem(
      AiGatewayModelAutomaticPricingFieldMatch bodyItem) {
    if (this.body == null) {
      this.body = new ArrayList<>();
    }
    this.body.add(bodyItem);
    this.unparsed |= bodyItem.unparsed;
    return this;
  }

  /**
   * Request body fields that must match.
   *
   * @return body
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AiGatewayModelAutomaticPricingFieldMatch> getBody() {
    return body;
  }

  public void setBody(List<AiGatewayModelAutomaticPricingFieldMatch> body) {
    this.body = body;
    if (body != null) {
      for (AiGatewayModelAutomaticPricingFieldMatch item : body) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AiGatewayModelAutomaticPricingModeTrigger headers(
      List<AiGatewayModelAutomaticPricingFieldMatch> headers) {
    this.headers = headers;
    if (headers != null) {
      for (AiGatewayModelAutomaticPricingFieldMatch item : headers) {
        this.unparsed |= item.unparsed;
      }
    }
    return this;
  }

  public AiGatewayModelAutomaticPricingModeTrigger addHeadersItem(
      AiGatewayModelAutomaticPricingFieldMatch headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    this.unparsed |= headersItem.unparsed;
    return this;
  }

  /**
   * Request headers that must match.
   *
   * @return headers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<AiGatewayModelAutomaticPricingFieldMatch> getHeaders() {
    return headers;
  }

  public void setHeaders(List<AiGatewayModelAutomaticPricingFieldMatch> headers) {
    this.headers = headers;
    if (headers != null) {
      for (AiGatewayModelAutomaticPricingFieldMatch item : headers) {
        this.unparsed |= item.unparsed;
      }
    }
  }

  public AiGatewayModelAutomaticPricingModeTrigger mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Priced mode selected by the fields.
   *
   * @return mode
   */
  @JsonProperty(JSON_PROPERTY_MODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
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
   * @return AiGatewayModelAutomaticPricingModeTrigger
   */
  @JsonAnySetter
  public AiGatewayModelAutomaticPricingModeTrigger putAdditionalProperty(String key, Object value) {
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

  /** Return true if this AiGatewayModelAutomaticPricingModeTrigger object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AiGatewayModelAutomaticPricingModeTrigger aiGatewayModelAutomaticPricingModeTrigger =
        (AiGatewayModelAutomaticPricingModeTrigger) o;
    return Objects.equals(this.body, aiGatewayModelAutomaticPricingModeTrigger.body)
        && Objects.equals(this.headers, aiGatewayModelAutomaticPricingModeTrigger.headers)
        && Objects.equals(this.mode, aiGatewayModelAutomaticPricingModeTrigger.mode)
        && Objects.equals(
            this.additionalProperties,
            aiGatewayModelAutomaticPricingModeTrigger.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, headers, mode, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AiGatewayModelAutomaticPricingModeTrigger {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
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
