/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** Details of the response received during the test execution. */
@JsonPropertyOrder({
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_BODY,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_BODY_COMPRESSED,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_BODY_HASHES,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_BODY_SIZE,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_CACHE_HEADERS,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_CDN,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_CLOSE,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_COMPRESSED_MESSAGE,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_HEADERS,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_HEALTHCHECK,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_HTTP_VERSION,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_IS_BODY_TRUNCATED,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_IS_MESSAGE_TRUNCATED,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_MESSAGE,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_METADATA,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_RECORDS,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_REDIRECTS,
  SyntheticsTestResultResponseInfo.JSON_PROPERTY_STATUS_CODE
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SyntheticsTestResultResponseInfo {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_BODY = "body";
  private String body;

  public static final String JSON_PROPERTY_BODY_COMPRESSED = "body_compressed";
  private String bodyCompressed;

  public static final String JSON_PROPERTY_BODY_HASHES = "body_hashes";
  private String bodyHashes;

  public static final String JSON_PROPERTY_BODY_SIZE = "body_size";
  private Long bodySize;

  public static final String JSON_PROPERTY_CACHE_HEADERS = "cache_headers";
  private Map<String, String> cacheHeaders = null;

  public static final String JSON_PROPERTY_CDN = "cdn";
  private SyntheticsTestResultCdnProviderInfo cdn;

  public static final String JSON_PROPERTY_CLOSE = "close";
  private SyntheticsTestResultWebSocketClose close;

  public static final String JSON_PROPERTY_COMPRESSED_MESSAGE = "compressed_message";
  private String compressedMessage;

  public static final String JSON_PROPERTY_HEADERS = "headers";
  private Map<String, Object> headers = null;

  public static final String JSON_PROPERTY_HEALTHCHECK = "healthcheck";
  private SyntheticsTestResultHealthCheck healthcheck;

  public static final String JSON_PROPERTY_HTTP_VERSION = "http_version";
  private String httpVersion;

  public static final String JSON_PROPERTY_IS_BODY_TRUNCATED = "is_body_truncated";
  private Boolean isBodyTruncated;

  public static final String JSON_PROPERTY_IS_MESSAGE_TRUNCATED = "is_message_truncated";
  private Boolean isMessageTruncated;

  public static final String JSON_PROPERTY_MESSAGE = "message";
  private String message;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Map<String, String> metadata = null;

  public static final String JSON_PROPERTY_RECORDS = "records";
  private List<SyntheticsTestResultDnsRecord> records = null;

  public static final String JSON_PROPERTY_REDIRECTS = "redirects";
  private List<SyntheticsTestResultRedirect> redirects = null;

  public static final String JSON_PROPERTY_STATUS_CODE = "status_code";
  private Long statusCode;

  public SyntheticsTestResultResponseInfo body(String body) {
    this.body = body;
    return this;
  }

  /**
   * Body of the response.
   *
   * @return body
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public SyntheticsTestResultResponseInfo bodyCompressed(String bodyCompressed) {
    this.bodyCompressed = bodyCompressed;
    return this;
  }

  /**
   * Compressed representation of the response body.
   *
   * @return bodyCompressed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY_COMPRESSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBodyCompressed() {
    return bodyCompressed;
  }

  public void setBodyCompressed(String bodyCompressed) {
    this.bodyCompressed = bodyCompressed;
  }

  public SyntheticsTestResultResponseInfo bodyHashes(String bodyHashes) {
    this.bodyHashes = bodyHashes;
    return this;
  }

  /**
   * Hashes computed over the response body.
   *
   * @return bodyHashes
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY_HASHES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getBodyHashes() {
    return bodyHashes;
  }

  public void setBodyHashes(String bodyHashes) {
    this.bodyHashes = bodyHashes;
  }

  public SyntheticsTestResultResponseInfo bodySize(Long bodySize) {
    this.bodySize = bodySize;
    return this;
  }

  /**
   * Size of the response body in bytes.
   *
   * @return bodySize
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_BODY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getBodySize() {
    return bodySize;
  }

  public void setBodySize(Long bodySize) {
    this.bodySize = bodySize;
  }

  public SyntheticsTestResultResponseInfo cacheHeaders(Map<String, String> cacheHeaders) {
    this.cacheHeaders = cacheHeaders;
    return this;
  }

  public SyntheticsTestResultResponseInfo putCacheHeadersItem(String key, String cacheHeadersItem) {
    if (this.cacheHeaders == null) {
      this.cacheHeaders = new HashMap<>();
    }
    this.cacheHeaders.put(key, cacheHeadersItem);
    return this;
  }

  /**
   * Cache-related response headers.
   *
   * @return cacheHeaders
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CACHE_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getCacheHeaders() {
    return cacheHeaders;
  }

  public void setCacheHeaders(Map<String, String> cacheHeaders) {
    this.cacheHeaders = cacheHeaders;
  }

  public SyntheticsTestResultResponseInfo cdn(SyntheticsTestResultCdnProviderInfo cdn) {
    this.cdn = cdn;
    this.unparsed |= cdn.unparsed;
    return this;
  }

  /**
   * CDN provider details inferred from response headers.
   *
   * @return cdn
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CDN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultCdnProviderInfo getCdn() {
    return cdn;
  }

  public void setCdn(SyntheticsTestResultCdnProviderInfo cdn) {
    this.cdn = cdn;
  }

  public SyntheticsTestResultResponseInfo close(SyntheticsTestResultWebSocketClose close) {
    this.close = close;
    this.unparsed |= close.unparsed;
    return this;
  }

  /**
   * WebSocket close frame information for WebSocket test responses.
   *
   * @return close
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CLOSE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultWebSocketClose getClose() {
    return close;
  }

  public void setClose(SyntheticsTestResultWebSocketClose close) {
    this.close = close;
  }

  public SyntheticsTestResultResponseInfo compressedMessage(String compressedMessage) {
    this.compressedMessage = compressedMessage;
    return this;
  }

  /**
   * Compressed representation of the response message.
   *
   * @return compressedMessage
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_COMPRESSED_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCompressedMessage() {
    return compressedMessage;
  }

  public void setCompressedMessage(String compressedMessage) {
    this.compressedMessage = compressedMessage;
  }

  public SyntheticsTestResultResponseInfo headers(Map<String, Object> headers) {
    this.headers = headers;
    return this;
  }

  public SyntheticsTestResultResponseInfo putHeadersItem(String key, Object headersItem) {
    if (this.headers == null) {
      this.headers = new HashMap<>();
    }
    this.headers.put(key, headersItem);
    return this;
  }

  /**
   * Response headers.
   *
   * @return headers
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEADERS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, Object> getHeaders() {
    return headers;
  }

  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  public SyntheticsTestResultResponseInfo healthcheck(SyntheticsTestResultHealthCheck healthcheck) {
    this.healthcheck = healthcheck;
    this.unparsed |= healthcheck.unparsed;
    return this;
  }

  /**
   * Health check information returned from a gRPC health check call.
   *
   * @return healthcheck
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HEALTHCHECK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public SyntheticsTestResultHealthCheck getHealthcheck() {
    return healthcheck;
  }

  public void setHealthcheck(SyntheticsTestResultHealthCheck healthcheck) {
    this.healthcheck = healthcheck;
  }

  public SyntheticsTestResultResponseInfo httpVersion(String httpVersion) {
    this.httpVersion = httpVersion;
    return this;
  }

  /**
   * HTTP version of the response.
   *
   * @return httpVersion
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_HTTP_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getHttpVersion() {
    return httpVersion;
  }

  public void setHttpVersion(String httpVersion) {
    this.httpVersion = httpVersion;
  }

  public SyntheticsTestResultResponseInfo isBodyTruncated(Boolean isBodyTruncated) {
    this.isBodyTruncated = isBodyTruncated;
    return this;
  }

  /**
   * Whether the response body was truncated.
   *
   * @return isBodyTruncated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_BODY_TRUNCATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsBodyTruncated() {
    return isBodyTruncated;
  }

  public void setIsBodyTruncated(Boolean isBodyTruncated) {
    this.isBodyTruncated = isBodyTruncated;
  }

  public SyntheticsTestResultResponseInfo isMessageTruncated(Boolean isMessageTruncated) {
    this.isMessageTruncated = isMessageTruncated;
    return this;
  }

  /**
   * Whether the response message was truncated.
   *
   * @return isMessageTruncated
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_MESSAGE_TRUNCATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getIsMessageTruncated() {
    return isMessageTruncated;
  }

  public void setIsMessageTruncated(Boolean isMessageTruncated) {
    this.isMessageTruncated = isMessageTruncated;
  }

  public SyntheticsTestResultResponseInfo message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Message received in the response (for WebSocket/TCP/UDP tests).
   *
   * @return message
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public SyntheticsTestResultResponseInfo metadata(Map<String, String> metadata) {
    this.metadata = metadata;
    return this;
  }

  public SyntheticsTestResultResponseInfo putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null) {
      this.metadata = new HashMap<>();
    }
    this.metadata.put(key, metadataItem);
    return this;
  }

  /**
   * Additional metadata returned with the response.
   *
   * @return metadata
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getMetadata() {
    return metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = metadata;
  }

  public SyntheticsTestResultResponseInfo records(List<SyntheticsTestResultDnsRecord> records) {
    this.records = records;
    for (SyntheticsTestResultDnsRecord item : records) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultResponseInfo addRecordsItem(
      SyntheticsTestResultDnsRecord recordsItem) {
    if (this.records == null) {
      this.records = new ArrayList<>();
    }
    this.records.add(recordsItem);
    this.unparsed |= recordsItem.unparsed;
    return this;
  }

  /**
   * DNS records returned in the response (DNS tests only).
   *
   * @return records
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_RECORDS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultDnsRecord> getRecords() {
    return records;
  }

  public void setRecords(List<SyntheticsTestResultDnsRecord> records) {
    this.records = records;
  }

  public SyntheticsTestResultResponseInfo redirects(List<SyntheticsTestResultRedirect> redirects) {
    this.redirects = redirects;
    for (SyntheticsTestResultRedirect item : redirects) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public SyntheticsTestResultResponseInfo addRedirectsItem(
      SyntheticsTestResultRedirect redirectsItem) {
    if (this.redirects == null) {
      this.redirects = new ArrayList<>();
    }
    this.redirects.add(redirectsItem);
    this.unparsed |= redirectsItem.unparsed;
    return this;
  }

  /**
   * Redirect hops encountered while performing the request.
   *
   * @return redirects
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REDIRECTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<SyntheticsTestResultRedirect> getRedirects() {
    return redirects;
  }

  public void setRedirects(List<SyntheticsTestResultRedirect> redirects) {
    this.redirects = redirects;
  }

  public SyntheticsTestResultResponseInfo statusCode(Long statusCode) {
    this.statusCode = statusCode;
    return this;
  }

  /**
   * HTTP status code of the response.
   *
   * @return statusCode
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getStatusCode() {
    return statusCode;
  }

  public void setStatusCode(Long statusCode) {
    this.statusCode = statusCode;
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
   * @return SyntheticsTestResultResponseInfo
   */
  @JsonAnySetter
  public SyntheticsTestResultResponseInfo putAdditionalProperty(String key, Object value) {
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

  /** Return true if this SyntheticsTestResultResponseInfo object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SyntheticsTestResultResponseInfo syntheticsTestResultResponseInfo =
        (SyntheticsTestResultResponseInfo) o;
    return Objects.equals(this.body, syntheticsTestResultResponseInfo.body)
        && Objects.equals(this.bodyCompressed, syntheticsTestResultResponseInfo.bodyCompressed)
        && Objects.equals(this.bodyHashes, syntheticsTestResultResponseInfo.bodyHashes)
        && Objects.equals(this.bodySize, syntheticsTestResultResponseInfo.bodySize)
        && Objects.equals(this.cacheHeaders, syntheticsTestResultResponseInfo.cacheHeaders)
        && Objects.equals(this.cdn, syntheticsTestResultResponseInfo.cdn)
        && Objects.equals(this.close, syntheticsTestResultResponseInfo.close)
        && Objects.equals(
            this.compressedMessage, syntheticsTestResultResponseInfo.compressedMessage)
        && Objects.equals(this.headers, syntheticsTestResultResponseInfo.headers)
        && Objects.equals(this.healthcheck, syntheticsTestResultResponseInfo.healthcheck)
        && Objects.equals(this.httpVersion, syntheticsTestResultResponseInfo.httpVersion)
        && Objects.equals(this.isBodyTruncated, syntheticsTestResultResponseInfo.isBodyTruncated)
        && Objects.equals(
            this.isMessageTruncated, syntheticsTestResultResponseInfo.isMessageTruncated)
        && Objects.equals(this.message, syntheticsTestResultResponseInfo.message)
        && Objects.equals(this.metadata, syntheticsTestResultResponseInfo.metadata)
        && Objects.equals(this.records, syntheticsTestResultResponseInfo.records)
        && Objects.equals(this.redirects, syntheticsTestResultResponseInfo.redirects)
        && Objects.equals(this.statusCode, syntheticsTestResultResponseInfo.statusCode)
        && Objects.equals(
            this.additionalProperties, syntheticsTestResultResponseInfo.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        body,
        bodyCompressed,
        bodyHashes,
        bodySize,
        cacheHeaders,
        cdn,
        close,
        compressedMessage,
        headers,
        healthcheck,
        httpVersion,
        isBodyTruncated,
        isMessageTruncated,
        message,
        metadata,
        records,
        redirects,
        statusCode,
        additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SyntheticsTestResultResponseInfo {\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    bodyCompressed: ").append(toIndentedString(bodyCompressed)).append("\n");
    sb.append("    bodyHashes: ").append(toIndentedString(bodyHashes)).append("\n");
    sb.append("    bodySize: ").append(toIndentedString(bodySize)).append("\n");
    sb.append("    cacheHeaders: ").append(toIndentedString(cacheHeaders)).append("\n");
    sb.append("    cdn: ").append(toIndentedString(cdn)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
    sb.append("    compressedMessage: ").append(toIndentedString(compressedMessage)).append("\n");
    sb.append("    headers: ").append(toIndentedString(headers)).append("\n");
    sb.append("    healthcheck: ").append(toIndentedString(healthcheck)).append("\n");
    sb.append("    httpVersion: ").append(toIndentedString(httpVersion)).append("\n");
    sb.append("    isBodyTruncated: ").append(toIndentedString(isBodyTruncated)).append("\n");
    sb.append("    isMessageTruncated: ").append(toIndentedString(isMessageTruncated)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    records: ").append(toIndentedString(records)).append("\n");
    sb.append("    redirects: ").append(toIndentedString(redirects)).append("\n");
    sb.append("    statusCode: ").append(toIndentedString(statusCode)).append("\n");
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
