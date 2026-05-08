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

/**
 * Controls the default data visibility for the product type. <code>standard</code> makes data
 * visible to all users with appropriate product access. <code>default_hide</code> hides data by
 * default and requires explicit grants for each dataset.
 */
@JsonSerialize(
    using = DatasetRestrictionRestrictionMode.DatasetRestrictionRestrictionModeSerializer.class)
public class DatasetRestrictionRestrictionMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("standard", "default_hide"));

  public static final DatasetRestrictionRestrictionMode STANDARD =
      new DatasetRestrictionRestrictionMode("standard");
  public static final DatasetRestrictionRestrictionMode DEFAULT_HIDE =
      new DatasetRestrictionRestrictionMode("default_hide");

  DatasetRestrictionRestrictionMode(String value) {
    super(value, allowedValues);
  }

  public static class DatasetRestrictionRestrictionModeSerializer
      extends StdSerializer<DatasetRestrictionRestrictionMode> {
    public DatasetRestrictionRestrictionModeSerializer(Class<DatasetRestrictionRestrictionMode> t) {
      super(t);
    }

    public DatasetRestrictionRestrictionModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DatasetRestrictionRestrictionMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DatasetRestrictionRestrictionMode fromValue(String value) {
    return new DatasetRestrictionRestrictionMode(value);
  }
}
