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

/** The definition of ListServiceAccountApplicationKeysInclude object. */
@JsonSerialize(
    using =
        ListServiceAccountApplicationKeysInclude.ListServiceAccountApplicationKeysIncludeSerializer
            .class)
public class ListServiceAccountApplicationKeysInclude extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("leak_information", "owned_by"));

  public static final ListServiceAccountApplicationKeysInclude LEAK_INFORMATION =
      new ListServiceAccountApplicationKeysInclude("leak_information");
  public static final ListServiceAccountApplicationKeysInclude OWNED_BY =
      new ListServiceAccountApplicationKeysInclude("owned_by");

  ListServiceAccountApplicationKeysInclude(String value) {
    super(value, allowedValues);
  }

  public static class ListServiceAccountApplicationKeysIncludeSerializer
      extends StdSerializer<ListServiceAccountApplicationKeysInclude> {
    public ListServiceAccountApplicationKeysIncludeSerializer(
        Class<ListServiceAccountApplicationKeysInclude> t) {
      super(t);
    }

    public ListServiceAccountApplicationKeysIncludeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ListServiceAccountApplicationKeysInclude value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ListServiceAccountApplicationKeysInclude fromValue(String value) {
    return new ListServiceAccountApplicationKeysInclude(value);
  }
}
