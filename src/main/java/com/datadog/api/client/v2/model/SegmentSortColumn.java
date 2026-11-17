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

/** Column to sort segments by. */
@JsonSerialize(using = SegmentSortColumn.SegmentSortColumnSerializer.class)
public class SegmentSortColumn extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "name",
              "description",
              "created_by",
              "created_at",
              "modified_by",
              "modified_at",
              "disabled_by",
              "disabled_at",
              "uuid"));

  public static final SegmentSortColumn NAME = new SegmentSortColumn("name");
  public static final SegmentSortColumn DESCRIPTION = new SegmentSortColumn("description");
  public static final SegmentSortColumn CREATED_BY = new SegmentSortColumn("created_by");
  public static final SegmentSortColumn CREATED_AT = new SegmentSortColumn("created_at");
  public static final SegmentSortColumn MODIFIED_BY = new SegmentSortColumn("modified_by");
  public static final SegmentSortColumn MODIFIED_AT = new SegmentSortColumn("modified_at");
  public static final SegmentSortColumn DISABLED_BY = new SegmentSortColumn("disabled_by");
  public static final SegmentSortColumn DISABLED_AT = new SegmentSortColumn("disabled_at");
  public static final SegmentSortColumn UUID = new SegmentSortColumn("uuid");

  SegmentSortColumn(String value) {
    super(value, allowedValues);
  }

  public static class SegmentSortColumnSerializer extends StdSerializer<SegmentSortColumn> {
    public SegmentSortColumnSerializer(Class<SegmentSortColumn> t) {
      super(t);
    }

    public SegmentSortColumnSerializer() {
      this(null);
    }

    @Override
    public void serialize(SegmentSortColumn value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SegmentSortColumn fromValue(String value) {
    return new SegmentSortColumn(value);
  }
}
