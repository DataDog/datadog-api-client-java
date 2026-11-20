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
        SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072
            .SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072Serializer.class)
public class SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("local_dataset"));

  public static final SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072 LOCAL_DATASET =
      new SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072("local_dataset");

  SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072(String value) {
    super(value, allowedValues);
  }

  public static class SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072Serializer
      extends StdSerializer<SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072> {
    public SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072Serializer(
        Class<SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072> t) {
      super(t);
    }

    public SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072 fromValue(String value) {
    return new SunburstBackendRequestAnyOfAnyOfItemRequestType4452231072(value);
  }
}
