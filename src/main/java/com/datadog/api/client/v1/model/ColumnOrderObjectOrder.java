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

/** Order object */
@JsonSerialize(using = ColumnOrderObjectOrder.ColumnOrderObjectOrderSerializer.class)
public class ColumnOrderObjectOrder extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("asc", "desc"));

  public static final ColumnOrderObjectOrder ASC = new ColumnOrderObjectOrder("asc");
  public static final ColumnOrderObjectOrder DESC = new ColumnOrderObjectOrder("desc");

  ColumnOrderObjectOrder(String value) {
    super(value, allowedValues);
  }

  public static class ColumnOrderObjectOrderSerializer
      extends StdSerializer<ColumnOrderObjectOrder> {
    public ColumnOrderObjectOrderSerializer(Class<ColumnOrderObjectOrder> t) {
      super(t);
    }

    public ColumnOrderObjectOrderSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ColumnOrderObjectOrder value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ColumnOrderObjectOrder fromValue(String value) {
    return new ColumnOrderObjectOrder(value);
  }
}
