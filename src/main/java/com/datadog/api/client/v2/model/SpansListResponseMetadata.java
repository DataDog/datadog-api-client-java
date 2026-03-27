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
   * <p>The metadata associated with a request.</p>
 */
@JsonPropertyOrder({
  SpansListResponseMetadata.JSON_PROPERTY_ELAPSED,
  SpansListResponseMetadata.JSON_PROPERTY_PAGE,
  SpansListResponseMetadata.JSON_PROPERTY_REQUEST_ID,
  SpansListResponseMetadata.JSON_PROPERTY_STATUS,
  SpansListResponseMetadata.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class SpansListResponseMetadata {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_ELAPSED = "elapsed";
  private Long elapsed;

  public static final String JSON_PROPERTY_PAGE = "page";
  private SpansResponseMetadataPage page;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private SpansAggregateResponseStatus status;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<SpansWarning> warnings = null;

  public SpansListResponseMetadata elapsed(Long elapsed) {
    this.elapsed = elapsed;
    return this;
  }

  /**
   * <p>The time elapsed in milliseconds.</p>
   * @return elapsed
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_ELAPSED)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public Long getElapsed() {
        return elapsed;
      }
  public void setElapsed(Long elapsed) {
    this.elapsed = elapsed;
  }
  public SpansListResponseMetadata page(SpansResponseMetadataPage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * <p>Paging attributes.</p>
   * @return page
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_PAGE)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SpansResponseMetadataPage getPage() {
        return page;
      }
  public void setPage(SpansResponseMetadataPage page) {
    this.page = page;
  }
  public SpansListResponseMetadata requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * <p>The identifier of the request.</p>
   * @return requestId
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_REQUEST_ID)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public String getRequestId() {
        return requestId;
      }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }
  public SpansListResponseMetadata status(SpansAggregateResponseStatus status) {
    this.status = status;
    this.unparsed |= !status.isValid();
    return this;
  }

  /**
   * <p>The status of the response.</p>
   * @return status
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_STATUS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public SpansAggregateResponseStatus getStatus() {
        return status;
      }
  public void setStatus(SpansAggregateResponseStatus status) {
    if (!status.isValid()) {
        this.unparsed = true;
    }
    this.status = status;
  }
  public SpansListResponseMetadata warnings(List<SpansWarning> warnings) {
    this.warnings = warnings;
    for (SpansWarning item : warnings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }
  public SpansListResponseMetadata addWarningsItem(SpansWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    this.unparsed |= warningsItem.unparsed;
    return this;
  }

  /**
   * <p>A list of warnings (non fatal errors) encountered, partial results might be returned if
   * warnings are present in the response.</p>
   * @return warnings
  **/
      @jakarta.annotation.Nullable
      @JsonProperty(JSON_PROPERTY_WARNINGS)
      @JsonInclude(
        value = JsonInclude.Include.USE_DEFAULTS)
      public List<SpansWarning> getWarnings() {
        return warnings;
      }
  public void setWarnings(List<SpansWarning> warnings) {
    this.warnings = warnings;
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
   * @return SpansListResponseMetadata
   */
  @JsonAnySetter
  public SpansListResponseMetadata putAdditionalProperty(String key, Object value) {
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
   * Return true if this SpansListResponseMetadata object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpansListResponseMetadata spansListResponseMetadata = (SpansListResponseMetadata) o;
    return Objects.equals(this.elapsed, spansListResponseMetadata.elapsed) && Objects.equals(this.page, spansListResponseMetadata.page) && Objects.equals(this.requestId, spansListResponseMetadata.requestId) && Objects.equals(this.status, spansListResponseMetadata.status) && Objects.equals(this.warnings, spansListResponseMetadata.warnings) && Objects.equals(this.additionalProperties, spansListResponseMetadata.additionalProperties);
  }


  @Override
  public int hashCode() {
    return Objects.hash(elapsed,page,requestId,status,warnings, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpansListResponseMetadata {\n");
    sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
