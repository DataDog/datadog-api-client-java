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

/** The type of resource. The value should always be search_request. */
@JsonSerialize(using = SpansListRequestType.SpansListRequestTypeSerializer.class)
public class SpansListRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("search_request"));

  public static final SpansListRequestType SEARCH_REQUEST =
      new SpansListRequestType("search_request");

  SpansListRequestType(String value) {
    super(value, allowedValues);
  }

  public static class SpansListRequestTypeSerializer extends StdSerializer<SpansListRequestType> {
    public SpansListRequestTypeSerializer(Class<SpansListRequestType> t) {
      super(t);
    }

    public SpansListRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SpansListRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SpansListRequestType fromValue(String value) {
    return new SpansListRequestType(value);
  }
}
