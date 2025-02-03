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
import java.util.Objects;

/** The definition of <code>EntityV3APISpecInterfaceFileRef</code> object. */
@JsonPropertyOrder({EntityV3APISpecInterfaceFileRef.JSON_PROPERTY_FILE_REF})
@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
public class EntityV3APISpecInterfaceFileRef {
  @JsonIgnore public boolean unparsed = false;
  public static final String JSON_PROPERTY_FILE_REF = "fileRef";
  private String fileRef;

  public EntityV3APISpecInterfaceFileRef fileRef(String fileRef) {
    this.fileRef = fileRef;
    return this;
  }

  /**
   * The reference to the API definition file.
   *
   * @return fileRef
   */
  @jakarta.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_FILE_REF)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFileRef() {
    return fileRef;
  }

  public void setFileRef(String fileRef) {
    this.fileRef = fileRef;
  }

  /** Return true if this EntityV3APISpecInterfaceFileRef object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityV3APISpecInterfaceFileRef entityV3ApiSpecInterfaceFileRef =
        (EntityV3APISpecInterfaceFileRef) o;
    return Objects.equals(this.fileRef, entityV3ApiSpecInterfaceFileRef.fileRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileRef);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityV3APISpecInterfaceFileRef {\n");
    sb.append("    fileRef: ").append(toIndentedString(fileRef)).append("\n");
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
