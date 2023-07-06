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

/** Sort parameters when querying events. */
@JsonSerialize(using = RUMSort.RUMSortSerializer.class)
public class RUMSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("timestamp", "-timestamp"));

  public static final RUMSort TIMESTAMP_ASCENDING = new RUMSort("timestamp");
  public static final RUMSort TIMESTAMP_DESCENDING = new RUMSort("-timestamp");

  RUMSort(String value) {
    super(value, allowedValues);
  }

  public static class RUMSortSerializer extends StdSerializer<RUMSort> {
    public RUMSortSerializer(Class<RUMSort> t) {
      super(t);
    }

    public RUMSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(RUMSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RUMSort fromValue(String value) {
    return new RUMSort(value);
  }
}
