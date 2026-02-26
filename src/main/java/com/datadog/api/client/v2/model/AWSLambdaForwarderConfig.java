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
   * <p>Log Autosubscription configuration for Datadog Forwarder Lambda functions.
   * Automatically set up triggers for existing and new logs for some services,
   * ensuring no logs from new resources are missed and saving time spent on manual configuration.</p>
 */
@JsonPropertyOrder({
  AWSLambdaForwarderConfig.JSON_PROPERTY_LAMBDAS,
  AWSLambdaForwarderConfig.JSON_PROPERTY_LOG_SOURCE_CONFIG,
  AWSLambdaForwarderConfig.JSON_PROPERTY_SOURCES
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class AWSLambdaForwarderConfig {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_LAMBDAS = "lambdas";
  private List<String> lambdas = null;

  public static final String JSON_PROPERTY_LOG_SOURCE_CONFIG = "log_source_config";
  private AWSLambdaForwarderConfigLogSourceConfig logSourceConfig;

  public static final String JSON_PROPERTY_SOURCES = "sources";
  private List<String> sources = null;

  public AWSLambdaForwarderConfig lambdas(List<String> lambdas) {
    this.lambdas = lambdas;
    return this;
  }
  public AWSLambdaForwarderConfig addLambdasItem(String lambdasItem) {
    if (this.lambdas == null) {
      this.lambdas = new ArrayList<>();
    }
    this.lambdas.add(lambdasItem);
    return this;
  }

  /**
   * <p>List of Datadog Lambda Log Forwarder ARNs in your AWS account. Defaults to <code>[]</code>.</p>
   * @return lambdas
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LAMBDAS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getLambdas() {
        return lambdas;
      }
  public void setLambdas(List<String> lambdas) {
    this.lambdas = lambdas;
  }
  public AWSLambdaForwarderConfig logSourceConfig(AWSLambdaForwarderConfigLogSourceConfig logSourceConfig) {
    this.logSourceConfig = logSourceConfig;
    this.unparsed |= logSourceConfig.unparsed;
    return this;
  }

  /**
   * <p>Log source configuration.</p>
   * @return logSourceConfig
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_LOG_SOURCE_CONFIG)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public AWSLambdaForwarderConfigLogSourceConfig getLogSourceConfig() {
        return logSourceConfig;
      }
  public void setLogSourceConfig(AWSLambdaForwarderConfigLogSourceConfig logSourceConfig) {
    this.logSourceConfig = logSourceConfig;
  }
  public AWSLambdaForwarderConfig sources(List<String> sources) {
    this.sources = sources;
    return this;
  }
  public AWSLambdaForwarderConfig addSourcesItem(String sourcesItem) {
    if (this.sources == null) {
      this.sources = new ArrayList<>();
    }
    this.sources.add(sourcesItem);
    return this;
  }

  /**
   * <p>List of service IDs set to enable automatic log collection.
   * Discover the list of available services with the
   * <a href="https://docs.datadoghq.com/api/latest/aws-logs-integration/#get-list-of-aws-log-ready-services">Get list of AWS log ready services</a>
   * endpoint.</p>
   * @return sources
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_SOURCES)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<String> getSources() {
        return sources;
      }
  public void setSources(List<String> sources) {
    this.sources = sources;
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
   * @return AWSLambdaForwarderConfig
   */
  @JsonAnySetter
  public AWSLambdaForwarderConfig putAdditionalProperty(String key, Object value) {
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
   * Return true if this AWSLambdaForwarderConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AWSLambdaForwarderConfig awsLambdaForwarderConfig = (AWSLambdaForwarderConfig) o;
    return Objects.equals(this.lambdas, awsLambdaForwarderConfig.lambdas) && Objects.equals(this.logSourceConfig, awsLambdaForwarderConfig.logSourceConfig) && Objects.equals(this.sources, awsLambdaForwarderConfig.sources) && Objects.equals(this.additionalProperties, awsLambdaForwarderConfig.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(lambdas,logSourceConfig,sources, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AWSLambdaForwarderConfig {\n");
    sb.append("    lambdas: ").append(toIndentedString(lambdas)).append("\n");
    sb.append("    logSourceConfig: ").append(toIndentedString(logSourceConfig)).append("\n");
    sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
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
