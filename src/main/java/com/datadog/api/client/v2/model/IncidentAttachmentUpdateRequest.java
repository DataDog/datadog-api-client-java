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

/** The update request for an incident's attachments. */
@JsonPropertyOrder({IncidentAttachmentUpdateRequest.JSON_PROPERTY_DATA})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class IncidentAttachmentUpdateRequest {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_DATA = "data";
  private List<IncidentAttachmentUpdateData> data = new ArrayList<>();

  public IncidentAttachmentUpdateRequest() {}

  @JsonCreator
  public IncidentAttachmentUpdateRequest(
      @JsonProperty(required = true, value = JSON_PROPERTY_DATA)
          List<IncidentAttachmentUpdateData> data) {
    this.data = data;
  }

  public IncidentAttachmentUpdateRequest data(List<IncidentAttachmentUpdateData> data) {
    this.data = data;
    for (IncidentAttachmentUpdateData item : data) {
      this.unparsed |= item.unparsed;
    }
    return this;
  }

  public IncidentAttachmentUpdateRequest addDataItem(IncidentAttachmentUpdateData dataItem) {
    this.data.add(dataItem);
    this.unparsed |= dataItem.unparsed;
    return this;
  }

  /**
   * An array of incident attachments. An attachment object without an "id" key indicates that you
   * want to create that attachment. An attachment object without an "attributes" key indicates that
   * you want to delete that attachment. An attachment object with both the "id" key and a populated
   * "attributes" object indicates that you want to update that attachment.
   *
   * @return data
   */
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public List<IncidentAttachmentUpdateData> getData() {
    return data;
  }

  public void setData(List<IncidentAttachmentUpdateData> data) {
    this.data = data;
  }

  /** Return true if this IncidentAttachmentUpdateRequest object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IncidentAttachmentUpdateRequest incidentAttachmentUpdateRequest =
        (IncidentAttachmentUpdateRequest) o;
    return Objects.equals(this.data, incidentAttachmentUpdateRequest.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IncidentAttachmentUpdateRequest {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
