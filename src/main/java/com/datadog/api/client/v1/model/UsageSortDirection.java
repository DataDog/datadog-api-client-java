/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The direction to sort by. */
@JsonSerialize(using = UsageSortDirection.UsageSortDirectionSerializer.class)
public class UsageSortDirection extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("desc", "asc"));

  public static final UsageSortDirection DESC = new UsageSortDirection("desc");
  public static final UsageSortDirection ASC = new UsageSortDirection("asc");

  UsageSortDirection(String value) {
    super(value, allowedValues);
  }

  public static class UsageSortDirectionSerializer extends StdSerializer<UsageSortDirection> {
    public UsageSortDirectionSerializer(Class<UsageSortDirection> t) {
      super(t);
    }

    public UsageSortDirectionSerializer() {
      this(null);
    }

    @Override
    public void serialize(UsageSortDirection value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UsageSortDirection fromValue(String value) {
    return new UsageSortDirection(value);
  }
}
