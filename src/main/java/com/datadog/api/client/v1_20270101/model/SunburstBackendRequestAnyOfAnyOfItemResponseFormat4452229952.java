/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using =
        SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952
            .SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952Serializer.class)
public class SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952
    extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("scalar"));

  public static final SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952 SCALAR =
      new SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952("scalar");

  SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952(String value) {
    super(value, allowedValues);
  }

  public static class SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952Serializer
      extends StdSerializer<SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952> {
    public SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952Serializer(
        Class<SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952> t) {
      super(t);
    }

    public SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952 fromValue(
      String value) {
    return new SunburstBackendRequestAnyOfAnyOfItemResponseFormat4452229952(value);
  }
}
