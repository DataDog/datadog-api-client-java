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

/** API Keys resource type. */
@JsonSerialize(using = APIKeysType.APIKeysTypeSerializer.class)
public class APIKeysType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("api_keys"));

  public static final APIKeysType API_KEYS = new APIKeysType("api_keys");

  APIKeysType(String value) {
    super(value, allowedValues);
  }

  public static class APIKeysTypeSerializer extends StdSerializer<APIKeysType> {
    public APIKeysTypeSerializer(Class<APIKeysType> t) {
      super(t);
    }

    public APIKeysTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(APIKeysType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static APIKeysType fromValue(String value) {
    return new APIKeysType(value);
  }
}
