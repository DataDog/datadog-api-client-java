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

/** The <code>http_client</code> source scrapes logs from HTTP endpoints at regular intervals. */
@JsonPropertyOrder({
  ObservabilityPipelineHttpClientSource.JSON_PROPERTY_AUTH_STRATEGY,
  ObservabilityPipelineHttpClientSource.JSON_PROPERTY_DECODING,
  ObservabilityPipelineHttpClientSource.JSON_PROPERTY_ID,
  ObservabilityPipelineHttpClientSource.JSON_PROPERTY_SCRAPE_INTERVAL_SECS,
  ObservabilityPipelineHttpClientSource.JSON_PROPERTY_SCRAPE_TIMEOUT_SECS,
  ObservabilityPipelineHttpClientSource.JSON_PROPERTY_TLS,
  ObservabilityPipelineHttpClientSource.JSON_PROPERTY_TYPE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ObservabilityPipelineHttpClientSource {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_AUTH_STRATEGY = "auth_strategy";
  private ObservabilityPipelineHttpClientSourceAuthStrategy authStrategy;

  public static final String JSON_PROPERTY_DECODING = "decoding";
  private ObservabilityPipelineDecoding decoding;

  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_SCRAPE_INTERVAL_SECS = "scrape_interval_secs";
  private Long scrapeIntervalSecs;

  public static final String JSON_PROPERTY_SCRAPE_TIMEOUT_SECS = "scrape_timeout_secs";
  private Long scrapeTimeoutSecs;

  public static final String JSON_PROPERTY_TLS = "tls";
  private ObservabilityPipelineTls tls;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ObservabilityPipelineHttpClientSourceType type =
      ObservabilityPipelineHttpClientSourceType.HTTP_CLIENT;

  public ObservabilityPipelineHttpClientSource() {}

  @JsonCreator
  public ObservabilityPipelineHttpClientSource(
      @JsonProperty(required = true, value = JSON_PROPERTY_DECODING)
          ObservabilityPipelineDecoding decoding,
      @JsonProperty(required = true, value = JSON_PROPERTY_ID) String id,
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE)
          ObservabilityPipelineHttpClientSourceType type) {
    this.decoding = decoding;
    this.unparsed |= !decoding.isValid();
    this.id = id;
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public ObservabilityPipelineHttpClientSource authStrategy(
      ObservabilityPipelineHttpClientSourceAuthStrategy authStrategy) {
    this.authStrategy = authStrategy;
    this.unparsed |= !authStrategy.isValid();
    return this;
  }

  /**
   * Optional authentication strategy for HTTP requests.
   *
   * @return authStrategy
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_AUTH_STRATEGY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineHttpClientSourceAuthStrategy getAuthStrategy() {
    return authStrategy;
  }

  public void setAuthStrategy(ObservabilityPipelineHttpClientSourceAuthStrategy authStrategy) {
    if (!authStrategy.isValid()) {
      this.unparsed = true;
    }
    this.authStrategy = authStrategy;
  }

  public ObservabilityPipelineHttpClientSource decoding(ObservabilityPipelineDecoding decoding) {
    this.decoding = decoding;
    this.unparsed |= !decoding.isValid();
    return this;
  }

  /**
   * The decoding format used to interpret incoming logs.
   *
   * @return decoding
   */
  @JsonProperty(JSON_PROPERTY_DECODING)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineDecoding getDecoding() {
    return decoding;
  }

  public void setDecoding(ObservabilityPipelineDecoding decoding) {
    if (!decoding.isValid()) {
      this.unparsed = true;
    }
    this.decoding = decoding;
  }

  public ObservabilityPipelineHttpClientSource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for this component. Used to reference this component in other parts of
   * the pipeline (e.g., as input to downstream components).
   *
   * @return id
   */
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ObservabilityPipelineHttpClientSource scrapeIntervalSecs(Long scrapeIntervalSecs) {
    this.scrapeIntervalSecs = scrapeIntervalSecs;
    return this;
  }

  /**
   * The interval (in seconds) between HTTP scrape requests.
   *
   * @return scrapeIntervalSecs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCRAPE_INTERVAL_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getScrapeIntervalSecs() {
    return scrapeIntervalSecs;
  }

  public void setScrapeIntervalSecs(Long scrapeIntervalSecs) {
    this.scrapeIntervalSecs = scrapeIntervalSecs;
  }

  public ObservabilityPipelineHttpClientSource scrapeTimeoutSecs(Long scrapeTimeoutSecs) {
    this.scrapeTimeoutSecs = scrapeTimeoutSecs;
    return this;
  }

  /**
   * The timeout (in seconds) for each scrape request.
   *
   * @return scrapeTimeoutSecs
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SCRAPE_TIMEOUT_SECS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getScrapeTimeoutSecs() {
    return scrapeTimeoutSecs;
  }

  public void setScrapeTimeoutSecs(Long scrapeTimeoutSecs) {
    this.scrapeTimeoutSecs = scrapeTimeoutSecs;
  }

  public ObservabilityPipelineHttpClientSource tls(ObservabilityPipelineTls tls) {
    this.tls = tls;
    this.unparsed |= tls.unparsed;
    return this;
  }

  /**
   * Configuration for enabling TLS encryption between the pipeline component and external services.
   *
   * @return tls
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TLS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public ObservabilityPipelineTls getTls() {
    return tls;
  }

  public void setTls(ObservabilityPipelineTls tls) {
    this.tls = tls;
  }

  public ObservabilityPipelineHttpClientSource type(
      ObservabilityPipelineHttpClientSourceType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The source type. The value should always be <code>http_client</code>.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public ObservabilityPipelineHttpClientSourceType getType() {
    return type;
  }

  public void setType(ObservabilityPipelineHttpClientSourceType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
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
   * @return ObservabilityPipelineHttpClientSource
   */
  @JsonAnySetter
  public ObservabilityPipelineHttpClientSource putAdditionalProperty(String key, Object value) {
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

  /** Return true if this ObservabilityPipelineHttpClientSource object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObservabilityPipelineHttpClientSource observabilityPipelineHttpClientSource =
        (ObservabilityPipelineHttpClientSource) o;
    return Objects.equals(this.authStrategy, observabilityPipelineHttpClientSource.authStrategy)
        && Objects.equals(this.decoding, observabilityPipelineHttpClientSource.decoding)
        && Objects.equals(this.id, observabilityPipelineHttpClientSource.id)
        && Objects.equals(
            this.scrapeIntervalSecs, observabilityPipelineHttpClientSource.scrapeIntervalSecs)
        && Objects.equals(
            this.scrapeTimeoutSecs, observabilityPipelineHttpClientSource.scrapeTimeoutSecs)
        && Objects.equals(this.tls, observabilityPipelineHttpClientSource.tls)
        && Objects.equals(this.type, observabilityPipelineHttpClientSource.type)
        && Objects.equals(
            this.additionalProperties, observabilityPipelineHttpClientSource.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        authStrategy,
        decoding,
        id,
        scrapeIntervalSecs,
        scrapeTimeoutSecs,
        tls,
        type,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObservabilityPipelineHttpClientSource {\n");
    sb.append("    authStrategy: ").append(toIndentedString(authStrategy)).append("\n");
    sb.append("    decoding: ").append(toIndentedString(decoding)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    scrapeIntervalSecs: ").append(toIndentedString(scrapeIntervalSecs)).append("\n");
    sb.append("    scrapeTimeoutSecs: ").append(toIndentedString(scrapeTimeoutSecs)).append("\n");
    sb.append("    tls: ").append(toIndentedString(tls)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
