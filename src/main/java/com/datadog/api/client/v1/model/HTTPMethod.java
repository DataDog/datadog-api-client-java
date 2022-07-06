/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The HTTP method. */
@JsonSerialize(using = HTTPMethod.HTTPMethodSerializer.class)
public class HTTPMethod {

  public static final HTTPMethod GET = new HTTPMethod("GET");
  public static final HTTPMethod POST = new HTTPMethod("POST");
  public static final HTTPMethod PATCH = new HTTPMethod("PATCH");
  public static final HTTPMethod PUT = new HTTPMethod("PUT");
  public static final HTTPMethod DELETE = new HTTPMethod("DELETE");
  public static final HTTPMethod HEAD = new HTTPMethod("HEAD");
  public static final HTTPMethod OPTIONS = new HTTPMethod("OPTIONS");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("GET", "POST", "PATCH", "PUT", "DELETE", "HEAD", "OPTIONS"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  HTTPMethod(String value) {
    this.value = value;
  }

  public static class HTTPMethodSerializer extends StdSerializer<HTTPMethod> {
    public HTTPMethodSerializer(Class<HTTPMethod> t) {
      super(t);
    }

    public HTTPMethodSerializer() {
      this(null);
    }

    @Override
    public void serialize(HTTPMethod value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this HTTPMethod object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((HTTPMethod) o).value);
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
  public static HTTPMethod fromValue(String value) {
    return new HTTPMethod(value);
  }
}
