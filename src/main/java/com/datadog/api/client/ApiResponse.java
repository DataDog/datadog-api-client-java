/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client;

import java.util.List;
import java.util.Map;

/**
 * API response returned by API call.
 *
 * @param <T> The type of data that is deserialized from response body
 */
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class ApiResponse<T> {
  private final int statusCode;
  private final Map<String, List<String>> headers;
  private final T data;

  /**
   * @param statusCode The status code of HTTP response
   * @param headers The headers of HTTP response
   */
  public ApiResponse(int statusCode, Map<String, List<String>> headers) {
    this(statusCode, headers, null);
  }

  /**
   * @param statusCode The status code of HTTP response
   * @param headers The headers of HTTP response
   * @param data The object deserialized from response bod
   */
  public ApiResponse(int statusCode, Map<String, List<String>> headers, T data) {
    this.statusCode = statusCode;
    this.headers = headers;
    this.data = data;
  }

  /**
   * Get the status code
   *
   * @return status code
   */
  public int getStatusCode() {
    return statusCode;
  }

  /**
   * Get the headers
   *
   * @return map of headers
   */
  public Map<String, List<String>> getHeaders() {
    return headers;
  }

  /**
   * Get the data
   *
   * @return data
   */
  public T getData() {
    return data;
  }
}
