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
   * <p>Local file metadata for create requests using the upload ID.</p>
 */
@JsonPropertyOrder({
  CreateTableRequestDataAttributesFileMetadataLocalFile.JSON_PROPERTY_UPLOAD_ID
})
@jakarta.annotation.Generated(value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class CreateTableRequestDataAttributesFileMetadataLocalFile {
  @JsonIgnore
  public boolean unparsed = false;
  public static final String JSON_PROPERTY_UPLOAD_ID = "upload_id";
  private String uploadId;

  public CreateTableRequestDataAttributesFileMetadataLocalFile() {}

  @JsonCreator
  public CreateTableRequestDataAttributesFileMetadataLocalFile(
            @JsonProperty(required=true, value=JSON_PROPERTY_UPLOAD_ID)String uploadId) {
        this.uploadId = uploadId;
  }
  public CreateTableRequestDataAttributesFileMetadataLocalFile uploadId(String uploadId) {
    this.uploadId = uploadId;
    return this;
  }

  /**
   * <p>The upload ID.</p>
   * @return uploadId
  **/
      @JsonProperty(JSON_PROPERTY_UPLOAD_ID)
      @JsonInclude(
        value = JsonInclude.Include.ALWAYS)
      public String getUploadId() {
        return uploadId;
      }
  public void setUploadId(String uploadId) {
    this.uploadId = uploadId;
  }

  /**
   * Return true if this CreateTableRequestDataAttributesFileMetadataLocalFile object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateTableRequestDataAttributesFileMetadataLocalFile createTableRequestDataAttributesFileMetadataLocalFile = (CreateTableRequestDataAttributesFileMetadataLocalFile) o;
    return Objects.equals(this.uploadId, createTableRequestDataAttributesFileMetadataLocalFile.uploadId);
  }


  @Override
  public int hashCode() {
    return Objects.hash(uploadId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateTableRequestDataAttributesFileMetadataLocalFile {\n");
    sb.append("    uploadId: ").append(toIndentedString(uploadId)).append("\n");
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
