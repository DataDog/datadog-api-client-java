/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/** The HTTP destination basic auth type. */
@JsonSerialize(using = HttpDestinationBasicAuthType.HttpDestinationBasicAuthTypeSerializer.class)
public class HttpDestinationBasicAuthType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("basic"));

  public static final HttpDestinationBasicAuthType BASIC =
      new HttpDestinationBasicAuthType("basic");

  HttpDestinationBasicAuthType(String value) {
    super(value, allowedValues);
  }

  public static class HttpDestinationBasicAuthTypeSerializer
      extends StdSerializer<HttpDestinationBasicAuthType> {
    public HttpDestinationBasicAuthTypeSerializer(Class<HttpDestinationBasicAuthType> t) {
      super(t);
    }

    public HttpDestinationBasicAuthTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HttpDestinationBasicAuthType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HttpDestinationBasicAuthType fromValue(String value) {
    return new HttpDestinationBasicAuthType(value);
  }
}
