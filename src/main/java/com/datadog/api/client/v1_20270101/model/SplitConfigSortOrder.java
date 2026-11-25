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
@JsonSerialize(using = SplitConfigSortOrder.SplitConfigSortOrderSerializer.class)
public class SplitConfigSortOrder extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("desc", "asc"));

  public static final SplitConfigSortOrder DESC = new SplitConfigSortOrder("desc");
  public static final SplitConfigSortOrder ASC = new SplitConfigSortOrder("asc");

  SplitConfigSortOrder(String value) {
    super(value, allowedValues);
  }

  public static class SplitConfigSortOrderSerializer extends StdSerializer<SplitConfigSortOrder> {
    public SplitConfigSortOrderSerializer(Class<SplitConfigSortOrder> t) {
      super(t);
    }

    public SplitConfigSortOrderSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SplitConfigSortOrder value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SplitConfigSortOrder fromValue(String value) {
    return new SplitConfigSortOrder(value);
  }
}
