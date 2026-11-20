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
@JsonSerialize(using = DashboardInlineSchema39.DashboardInlineSchema39Serializer.class)
public class DashboardInlineSchema39 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "sum",
              "min",
              "max",
              "avg",
              "count",
              "cardinality",
              "median",
              "delta",
              "latest",
              "earliest",
              "most_frequent",
              "any"));

  public static final DashboardInlineSchema39 SUM = new DashboardInlineSchema39("sum");
  public static final DashboardInlineSchema39 MIN = new DashboardInlineSchema39("min");
  public static final DashboardInlineSchema39 MAX = new DashboardInlineSchema39("max");
  public static final DashboardInlineSchema39 AVG = new DashboardInlineSchema39("avg");
  public static final DashboardInlineSchema39 COUNT = new DashboardInlineSchema39("count");
  public static final DashboardInlineSchema39 CARDINALITY =
      new DashboardInlineSchema39("cardinality");
  public static final DashboardInlineSchema39 MEDIAN = new DashboardInlineSchema39("median");
  public static final DashboardInlineSchema39 DELTA = new DashboardInlineSchema39("delta");
  public static final DashboardInlineSchema39 LATEST = new DashboardInlineSchema39("latest");
  public static final DashboardInlineSchema39 EARLIEST = new DashboardInlineSchema39("earliest");
  public static final DashboardInlineSchema39 MOST_FREQUENT =
      new DashboardInlineSchema39("most_frequent");
  public static final DashboardInlineSchema39 ANY = new DashboardInlineSchema39("any");

  DashboardInlineSchema39(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema39Serializer
      extends StdSerializer<DashboardInlineSchema39> {
    public DashboardInlineSchema39Serializer(Class<DashboardInlineSchema39> t) {
      super(t);
    }

    public DashboardInlineSchema39Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema39 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema39 fromValue(String value) {
    return new DashboardInlineSchema39(value);
  }
}
