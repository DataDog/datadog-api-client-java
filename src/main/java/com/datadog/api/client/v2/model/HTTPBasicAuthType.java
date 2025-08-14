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

/** The definition of the <code>HTTPBasicAuth</code> object. */
@JsonSerialize(using = HTTPBasicAuthType.HTTPBasicAuthTypeSerializer.class)
public class HTTPBasicAuthType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("HTTPBasicAuth"));

  public static final HTTPBasicAuthType HTTPBASICAUTH = new HTTPBasicAuthType("HTTPBasicAuth");

  HTTPBasicAuthType(String value) {
    super(value, allowedValues);
  }

  public static class HTTPBasicAuthTypeSerializer extends StdSerializer<HTTPBasicAuthType> {
    public HTTPBasicAuthTypeSerializer(Class<HTTPBasicAuthType> t) {
      super(t);
    }

    public HTTPBasicAuthTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(HTTPBasicAuthType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HTTPBasicAuthType fromValue(String value) {
    return new HTTPBasicAuthType(value);
  }
}
