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

/** The field to sort by. */
@JsonSerialize(using = UsageSort.UsageSortSerializer.class)
public class UsageSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("computed_on", "size", "start_date", "end_date"));

  public static final UsageSort COMPUTED_ON = new UsageSort("computed_on");
  public static final UsageSort SIZE = new UsageSort("size");
  public static final UsageSort START_DATE = new UsageSort("start_date");
  public static final UsageSort END_DATE = new UsageSort("end_date");

  UsageSort(String value) {
    super(value, allowedValues);
  }

  public static class UsageSortSerializer extends StdSerializer<UsageSort> {
    public UsageSortSerializer(Class<UsageSort> t) {
      super(t);
    }

    public UsageSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(UsageSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UsageSort fromValue(String value) {
    return new UsageSort(value);
  }
}
