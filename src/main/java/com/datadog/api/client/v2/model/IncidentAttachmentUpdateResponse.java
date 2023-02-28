/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** The response object containing the created or updated incident attachments. */
@JsonPropertyOrder({
  IncidentAttachmentUpdateResponse.JSON_PROPERTY_DATA,
  IncidentAttachmentUpdateResponse.JSON_PROPERTY_INCLUDED
})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentAttachmentUpdateResponse {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<IncidentAttachmentData> data = new ArrayList<>();

  public static final String JSON_PROPERTY_INCLUDED = "included";
  private List<IncidentAttachmentsResponseIncludedItem> included = null;

  public IncidentAttachmentUpdateResponse() {}

  @JsonCreator
  public IncidentAttachmentUpdateResponse(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<IncidentAttachmentData> data) {
    this.data = data;
  }

  public IncidentAttachmentUpdateResponse data(List<IncidentAttachmentData> data) {
    this.data = data;
    for (IncidentAttachmentData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentAttachmentUpdateResponse addDataItem(IncidentAttachmentData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * An array of incident attachments. Only the attachments that were created or updated by the
   * request are returned.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IncidentAttachmentData> getData() {
    return data;
  }

  public void setData(List<IncidentAttachmentData> data) {
    this.data = data;
  }

  public IncidentAttachmentUpdateResponse included(
      List<IncidentAttachmentsResponseIncludedItem> included) {
    this.included = included;
    for (IncidentAttachmentsResponseIncludedItem item : included) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentAttachmentUpdateResponse addIncludedItem(
      IncidentAttachmentsResponseIncludedItem includedItem) {
    if (this.included == null) {
      this.included = new ArrayList<>();
    }
    this.included.add(includedItem);
    this.unparsed |= includedItem.unparsed;
    return this;
  }

  /**
   * Included related resources that the user requested.
   *
   * @return included
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_INCLUDED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<IncidentAttachmentsResponseIncludedItem> getIncluded() {
    return included;
  }

  public void setIncluded(List<IncidentAttachmentsResponseIncludedItem> included) {
    this.included = included;
  }

  /** Return true if this IncidentAttachmentUpdateResponse object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentAttachmentUpdateResponse incidentAttachmentUpdateResponse =
        (IncidentAttachmentUpdateResponse) o;
    return Objects.equals(this.data, incidentAttachmentUpdateResponse.data)
        && Objects.equals(this.included, incidentAttachmentUpdateResponse.included);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, included);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentAttachmentUpdateResponse {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
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
