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
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The metadata associated with a request. */
@JsonPropertyOrder({
  EventsResponseMetadata.JSON_PROPERTY_ELAPSED,
  EventsResponseMetadata.JSON_PROPERTY_PAGE,
  EventsResponseMetadata.JSON_PROPERTY_REQUEST_ID,
  EventsResponseMetadata.JSON_PROPERTY_WARNINGS
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EventsResponseMetadata {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_ELAPSED = "elapsed";
  private Long elapsed;

  public static final String JSON_PROPERTY_PAGE = "page";
  private EventsResponseMetadataPage page;

  public static final String JSON_PROPERTY_REQUEST_ID = "request_id";
  private String requestId;

  public static final String JSON_PROPERTY_WARNINGS = "warnings";
  private List<EventsWarning> warnings = null;

  public EventsResponseMetadata elapsed(Long elapsed) {
    this.elapsed = elapsed;
    return this;
  }

  /**
   * The time elapsed in milliseconds.
   *
   * @return elapsed
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ELAPSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getElapsed() {
    return elapsed;
  }

  public void setElapsed(Long elapsed) {
    this.elapsed = elapsed;
  }

  public EventsResponseMetadata page(EventsResponseMetadataPage page) {
    this.page = page;
    this.unparsed |= page.unparsed;
    return this;
  }

  /**
   * Pagination attributes.
   *
   * @return page
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public EventsResponseMetadataPage getPage() {
    return page;
  }

  public void setPage(EventsResponseMetadataPage page) {
    this.page = page;
  }

  public EventsResponseMetadata requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  /**
   * The identifier of the request.
   *
   * @return requestId
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRequestId() {
    return requestId;
  }

  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  public EventsResponseMetadata warnings(List<EventsWarning> warnings) {
    this.warnings = warnings;
    for (EventsWarning item : warnings) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public EventsResponseMetadata addWarningsItem(EventsWarning warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    this.unparsed |= warningsItem.unparsed;
    return this;
  }

  /**
   * A list of warnings (non-fatal errors) encountered. Partial results might be returned if
   * warnings are present in the response.
   *
   * @return warnings
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_WARNINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<EventsWarning> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<EventsWarning> warnings) {
    this.warnings = warnings;
  }

  /** Return true if this EventsResponseMetadata object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventsResponseMetadata eventsResponseMetadata = (EventsResponseMetadata) o;
    return Objects.equals(this.elapsed, eventsResponseMetadata.elapsed)
        && Objects.equals(this.page, eventsResponseMetadata.page)
        && Objects.equals(this.requestId, eventsResponseMetadata.requestId)
        && Objects.equals(this.warnings, eventsResponseMetadata.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(elapsed, page, requestId, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventsResponseMetadata {\n");
    sb.append("    elapsed: ").append(toIndentedString(elapsed)).append("\n");
    sb.append("    page: ").append(toIndentedString(page)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
    sb.append("}");
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
