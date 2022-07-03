/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** HTTP header used to compress the media-type. */
@JsonSerialize(using = ContentEncoding.ContentEncodingSerializer.class)
public class ContentEncoding {

  public static final ContentEncoding GZIP = new ContentEncoding("gzip");
  public static final ContentEncoding DEFLATE = new ContentEncoding("deflate");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("gzip", "deflate"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  ContentEncoding(String value) {
    this.value = value;
  }

  public static class ContentEncodingSerializer extends StdSerializer<ContentEncoding> {
    public ContentEncodingSerializer(Class<ContentEncoding> t) {
      super(t);
    }

    public ContentEncodingSerializer() {
      this(null);
    }

    @Override
    public void serialize(ContentEncoding value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this ContentEncoding object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((ContentEncoding) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ContentEncoding fromValue(String value) {
    return new ContentEncoding(value);
  }
}
