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

/** The definition of <code>ConnectionEnvEnv</code> object. */
@JsonSerialize(using = ConnectionEnvEnv.ConnectionEnvEnvSerializer.class)
public class ConnectionEnvEnv extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("default"));

  public static final ConnectionEnvEnv DEFAULT = new ConnectionEnvEnv("default");

  ConnectionEnvEnv(String value) {
    super(value, allowedValues);
  }

  public static class ConnectionEnvEnvSerializer extends StdSerializer<ConnectionEnvEnv> {
    public ConnectionEnvEnvSerializer(Class<ConnectionEnvEnv> t) {
      super(t);
    }

    public ConnectionEnvEnvSerializer() {
      this(null);
    }

    @Override
    public void serialize(ConnectionEnvEnv value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ConnectionEnvEnv fromValue(String value) {
    return new ConnectionEnvEnv(value);
  }
}
