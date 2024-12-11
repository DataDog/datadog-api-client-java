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

/** The sort direction for results. */
@JsonSerialize(using = OrderDirection.OrderDirectionSerializer.class)
public class OrderDirection extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("asc", "desc"));

  public static final OrderDirection ASC = new OrderDirection("asc");
  public static final OrderDirection DESC = new OrderDirection("desc");

  OrderDirection(String value) {
    super(value, allowedValues);
  }

  public static class OrderDirectionSerializer extends StdSerializer<OrderDirection> {
    public OrderDirectionSerializer(Class<OrderDirection> t) {
      super(t);
    }

    public OrderDirectionSerializer() {
      this(null);
    }

    @Override
    public void serialize(OrderDirection value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OrderDirection fromValue(String value) {
    return new OrderDirection(value);
  }
}
