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
@JsonSerialize(using = HasSearchBar.HasSearchBarSerializer.class)
public class HasSearchBar extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "always", "never"));

  public static final HasSearchBar AUTO = new HasSearchBar("auto");
  public static final HasSearchBar ALWAYS = new HasSearchBar("always");
  public static final HasSearchBar NEVER = new HasSearchBar("never");

  HasSearchBar(String value) {
    super(value, allowedValues);
  }

  public static class HasSearchBarSerializer extends StdSerializer<HasSearchBar> {
    public HasSearchBarSerializer(Class<HasSearchBar> t) {
      super(t);
    }

    public HasSearchBarSerializer() {
      this(null);
    }

    @Override
    public void serialize(HasSearchBar value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HasSearchBar fromValue(String value) {
    return new HasSearchBar(value);
  }
}
