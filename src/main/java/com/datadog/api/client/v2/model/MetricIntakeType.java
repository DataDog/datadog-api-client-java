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
 * The type of metric. The available types are <code>0</code> (unspecified), <code>1</code> (count),
 * <code>2</code> (rate), and <code>3</code> (gauge).
 */
@JsonSerialize(using = MetricIntakeType.MetricIntakeTypeSerializer.class)
public class MetricIntakeType extends ModelEnum<Integer> {

  private static final Set<Integer> allowedValues = new HashSet<Integer>(Arrays.asList(0, 1, 2, 3));

  public static final MetricIntakeType UNSPECIFIED = new MetricIntakeType(0);
  public static final MetricIntakeType COUNT = new MetricIntakeType(1);
  public static final MetricIntakeType RATE = new MetricIntakeType(2);
  public static final MetricIntakeType GAUGE = new MetricIntakeType(3);

  MetricIntakeType(Integer value) {
    super(value, allowedValues);
  }

  public static class MetricIntakeTypeSerializer extends StdSerializer<MetricIntakeType> {
    public MetricIntakeTypeSerializer(Class<MetricIntakeType> t) {
      super(t);
    }

    public MetricIntakeTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(MetricIntakeType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static MetricIntakeType fromValue(Integer value) {
    return new MetricIntakeType(value);
  }
}
