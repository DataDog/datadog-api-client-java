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
@JsonSerialize(using = OrderByOptions.OrderByOptionsSerializer.class)
public class OrderByOptions extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("change", "name", "present", "past"));

  public static final OrderByOptions CHANGE = new OrderByOptions("change");
  public static final OrderByOptions NAME = new OrderByOptions("name");
  public static final OrderByOptions PRESENT = new OrderByOptions("present");
  public static final OrderByOptions PAST = new OrderByOptions("past");

  OrderByOptions(String value) {
    super(value, allowedValues);
  }

  public static class OrderByOptionsSerializer extends StdSerializer<OrderByOptions> {
    public OrderByOptionsSerializer(Class<OrderByOptions> t) {
      super(t);
    }

    public OrderByOptionsSerializer() {
      this(null);
    }

    @Override
    public void serialize(OrderByOptions value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OrderByOptions fromValue(String value) {
    return new OrderByOptions(value);
  }
}
