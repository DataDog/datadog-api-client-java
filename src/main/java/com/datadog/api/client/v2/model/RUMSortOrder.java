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

/** The order to use, ascending or descending. */
@JsonSerialize(using = RUMSortOrder.RUMSortOrderSerializer.class)
public class RUMSortOrder extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("asc", "desc"));

  public static final RUMSortOrder ASCENDING = new RUMSortOrder("asc");
  public static final RUMSortOrder DESCENDING = new RUMSortOrder("desc");

  RUMSortOrder(String value) {
    super(value, allowedValues);
  }

  public static class RUMSortOrderSerializer extends StdSerializer<RUMSortOrder> {
    public RUMSortOrderSerializer(Class<RUMSortOrder> t) {
      super(t);
    }

    public RUMSortOrderSerializer() {
      this(null);
    }

    @Override
    public void serialize(RUMSortOrder value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMSortOrder fromValue(String value) {
    return new RUMSortOrder(value);
  }
}
