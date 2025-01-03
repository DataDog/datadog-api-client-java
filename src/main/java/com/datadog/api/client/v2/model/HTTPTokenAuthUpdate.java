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

/** The definition of <code>HTTPTokenAuthUpdate</code> object. */
@JsonPropertyOrder({
  HTTPTokenAuthUpdate.JSON_PROPERTY_BODY,
  HTTPTokenAuthUpdate.JSON_PROPERTY_HEADERS,
  HTTPTokenAuthUpdate.JSON_PROPERTY_TOKENS,
  HTTPTokenAuthUpdate.JSON_PROPERTY_TYPE,
  HTTPTokenAuthUpdate.JSON_PROPERTY_URL_PARAMETERS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class HTTPTokenAuthUpdate {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BODY = "body";
  private HTTPBody body;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private List<HTTPHeaderUpdate> headers = null;

  public static final String JSON_PROPERTY_TOKENS = "tokens";
  private List<HTTPTokenUpdate> tokens = null;

  public static final String JSON_PROPERTY_TYPE = "type";
  private HTTPTokenAuthType type;

  public static final String JSON_PROPERTY_URL_PARAMETERS = "url_parameters";
  private List<UrlParamUpdate> urlParameters = null;

  public HTTPTokenAuthUpdate() {}

  @JsonCreator
  public HTTPTokenAuthUpdate(
      @JsonProperty(required = true, value = JSON_PROPERTY_TYPE) HTTPTokenAuthType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
  }

  public HTTPTokenAuthUpdate body(HTTPBody body) {
    this.body = body;
    this.unparsed |= body.unparsed;
    return this;
  }

  /**
   * The definition of <code>HTTPBody</code> object.
   *
   * @return body
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HTTPBody getBody() {
    return body;
  }

  public void setBody(HTTPBody body) {
    this.body = body;
  }

  public HTTPTokenAuthUpdate headers(List<HTTPHeaderUpdate> headers) {
    this.headers = headers;
    for (HTTPHeaderUpdate item : headers) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HTTPTokenAuthUpdate addHeadersItem(HTTPHeaderUpdate headersItem) {
    if (this.headers == null) {
      this.headers = new ArrayList<>();
    }
    this.headers.add(headersItem);
    this.unparsed |= headersItem.unparsed;
    return this;
  }

  /**
   * The <code>HTTPTokenAuthUpdate</code> <code>headers</code>.
   *
   * @return headers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<HTTPHeaderUpdate> getHeaders() {
    return headers;
  }

  public void setHeaders(List<HTTPHeaderUpdate> headers) {
    this.headers = headers;
  }

  public HTTPTokenAuthUpdate tokens(List<HTTPTokenUpdate> tokens) {
    this.tokens = tokens;
    for (HTTPTokenUpdate item : tokens) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HTTPTokenAuthUpdate addTokensItem(HTTPTokenUpdate tokensItem) {
    if (this.tokens == null) {
      this.tokens = new ArrayList<>();
    }
    this.tokens.add(tokensItem);
    this.unparsed |= tokensItem.unparsed;
    return this;
  }

  /**
   * The <code>HTTPTokenAuthUpdate</code> <code>tokens</code>.
   *
   * @return tokens
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TOKENS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<HTTPTokenUpdate> getTokens() {
    return tokens;
  }

  public void setTokens(List<HTTPTokenUpdate> tokens) {
    this.tokens = tokens;
  }

  public HTTPTokenAuthUpdate type(HTTPTokenAuthType type) {
    this.type = type;
    this.unparsed |= !type.isValid();
    return this;
  }

  /**
   * The definition of <code>HTTPTokenAuthType</code> object.
   *
   * @return type
   */
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public HTTPTokenAuthType getType() {
    return type;
  }

  public void setType(HTTPTokenAuthType type) {
    if (!type.isValid()) {
      this.unparsed = true;
    }
    this.type = type;
  }

  public HTTPTokenAuthUpdate urlParameters(List<UrlParamUpdate> urlParameters) {
    this.urlParameters = urlParameters;
    for (UrlParamUpdate item : urlParameters) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public HTTPTokenAuthUpdate addUrlParametersItem(UrlParamUpdate urlParametersItem) {
    if (this.urlParameters == null) {
      this.urlParameters = new ArrayList<>();
    }
    this.urlParameters.add(urlParametersItem);
    this.unparsed |= urlParametersItem.unparsed;
    return this;
  }

  /**
   * The <code>HTTPTokenAuthUpdate</code> <code>url_parameters</code>.
   *
   * @return urlParameters
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_URL_PARAMETERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<UrlParamUpdate> getUrlParameters() {
    return urlParameters;
  }

  public void setUrlParameters(List<UrlParamUpdate> urlParameters) {
    this.urlParameters = urlParameters;
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
   * @return HTTPTokenAuthUpdate
   */
  @JsonAnySetter
  public HTTPTokenAuthUpdate putAdditionalProperty(String key, Object value) {
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

  /** Return true if this HTTPTokenAuthUpdate object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HTTPTokenAuthUpdate httpTokenAuthUpdate = (HTTPTokenAuthUpdate) o;
    return Objects.equals(this.body, httpTokenAuthUpdate.body)
        && Objects.equals(this.headers, httpTokenAuthUpdate.headers)
        && Objects.equals(this.tokens, httpTokenAuthUpdate.tokens)
        && Objects.equals(this.type, httpTokenAuthUpdate.type)
        && Objects.equals(this.urlParameters, httpTokenAuthUpdate.urlParameters)
        && Objects.equals(this.additionalProperties, httpTokenAuthUpdate.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(body, headers, tokens, type, urlParameters, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HTTPTokenAuthUpdate {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    tokens: ").append(toIndentedString(tokens)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    urlParameters: ").append(toIndentedString(urlParameters)).append("\n");
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
