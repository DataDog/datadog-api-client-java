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
@JsonSerialize(using = CIAppSortOrder.CIAppSortOrderSerializer.class)
public class CIAppSortOrder extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("asc", "desc"));

  public static final CIAppSortOrder ASCENDING = new CIAppSortOrder("asc");
  public static final CIAppSortOrder DESCENDING = new CIAppSortOrder("desc");

  CIAppSortOrder(String value) {
    super(value, allowedValues);
  }

  public static class CIAppSortOrderSerializer extends StdSerializer<CIAppSortOrder> {
    public CIAppSortOrderSerializer(Class<CIAppSortOrder> t) {
      super(t);
    }

    public CIAppSortOrderSerializer() {
      this(null);
    }

    @Override
    public void serialize(CIAppSortOrder value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CIAppSortOrder fromValue(String value) {
    return new CIAppSortOrder(value);
  }
}
