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
@JsonSerialize(using = QueryTableTimestampFormat.QueryTableTimestampFormatSerializer.class)
public class QueryTableTimestampFormat extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "MMM dd yyyy HH:mm",
              "MMM dd yyyy HH:mm:ss",
              "MMM dd yyyy h:mm a",
              "MMM dd yyyy h:mm:ss a",
              "MMM d HH:mm",
              "MMM d HH:mm:ss",
              "MMM d h:mm a",
              "MMM d h:mm:ss a",
              "MMM d, yyyy HH:mm",
              "MMM d, yyyy HH:mm:ss",
              "MMM d, yyyy h:mm a",
              "MMM d, yyyy h:mm:ss a",
              "MM/dd/yyyy HH:mm",
              "MM/dd/yyyy HH:mm:ss",
              "MM/dd/yyyy h:mm a",
              "MM/dd/yyyy h:mm:ss a",
              "dd/MM/yyyy HH:mm",
              "dd/MM/yyyy HH:mm:ss",
              "dd/MM/yyyy h:mm a",
              "dd/MM/yyyy h:mm:ss a",
              "MMMM d, yyyy HH:mm",
              "MMMM d, yyyy HH:mm:ss",
              "MMMM d, yyyy h:mm a",
              "MMMM d, yyyy h:mm:ss a"));

  public static final QueryTableTimestampFormat MMM_DD_YYYY_HH_MM =
      new QueryTableTimestampFormat("MMM dd yyyy HH:mm");
  public static final QueryTableTimestampFormat MMM_DD_YYYY_HH_MM_SS =
      new QueryTableTimestampFormat("MMM dd yyyy HH:mm:ss");
  public static final QueryTableTimestampFormat MMM_DD_YYYY_H_MM_A =
      new QueryTableTimestampFormat("MMM dd yyyy h:mm a");
  public static final QueryTableTimestampFormat MMM_DD_YYYY_H_MM_SS_A =
      new QueryTableTimestampFormat("MMM dd yyyy h:mm:ss a");
  public static final QueryTableTimestampFormat MMM_D_HH_MM =
      new QueryTableTimestampFormat("MMM d HH:mm");
  public static final QueryTableTimestampFormat MMM_D_HH_MM_SS =
      new QueryTableTimestampFormat("MMM d HH:mm:ss");
  public static final QueryTableTimestampFormat MMM_D_H_MM_A =
      new QueryTableTimestampFormat("MMM d h:mm a");
  public static final QueryTableTimestampFormat MMM_D_H_MM_SS_A =
      new QueryTableTimestampFormat("MMM d h:mm:ss a");
  public static final QueryTableTimestampFormat MMM_D__YYYY_HH_MM =
      new QueryTableTimestampFormat("MMM d, yyyy HH:mm");
  public static final QueryTableTimestampFormat MMM_D__YYYY_HH_MM_SS =
      new QueryTableTimestampFormat("MMM d, yyyy HH:mm:ss");
  public static final QueryTableTimestampFormat MMM_D__YYYY_H_MM_A =
      new QueryTableTimestampFormat("MMM d, yyyy h:mm a");
  public static final QueryTableTimestampFormat MMM_D__YYYY_H_MM_SS_A =
      new QueryTableTimestampFormat("MMM d, yyyy h:mm:ss a");
  public static final QueryTableTimestampFormat MM_DD_YYYY_HH_MM =
      new QueryTableTimestampFormat("MM/dd/yyyy HH:mm");
  public static final QueryTableTimestampFormat MM_DD_YYYY_HH_MM_SS =
      new QueryTableTimestampFormat("MM/dd/yyyy HH:mm:ss");
  public static final QueryTableTimestampFormat MM_DD_YYYY_H_MM_A =
      new QueryTableTimestampFormat("MM/dd/yyyy h:mm a");
  public static final QueryTableTimestampFormat MM_DD_YYYY_H_MM_SS_A =
      new QueryTableTimestampFormat("MM/dd/yyyy h:mm:ss a");
  public static final QueryTableTimestampFormat DD_MM_YYYY_HH_MM =
      new QueryTableTimestampFormat("dd/MM/yyyy HH:mm");
  public static final QueryTableTimestampFormat DD_MM_YYYY_HH_MM_SS =
      new QueryTableTimestampFormat("dd/MM/yyyy HH:mm:ss");
  public static final QueryTableTimestampFormat DD_MM_YYYY_H_MM_A =
      new QueryTableTimestampFormat("dd/MM/yyyy h:mm a");
  public static final QueryTableTimestampFormat DD_MM_YYYY_H_MM_SS_A =
      new QueryTableTimestampFormat("dd/MM/yyyy h:mm:ss a");
  public static final QueryTableTimestampFormat MMMM_D__YYYY_HH_MM =
      new QueryTableTimestampFormat("MMMM d, yyyy HH:mm");
  public static final QueryTableTimestampFormat MMMM_D__YYYY_HH_MM_SS =
      new QueryTableTimestampFormat("MMMM d, yyyy HH:mm:ss");
  public static final QueryTableTimestampFormat MMMM_D__YYYY_H_MM_A =
      new QueryTableTimestampFormat("MMMM d, yyyy h:mm a");
  public static final QueryTableTimestampFormat MMMM_D__YYYY_H_MM_SS_A =
      new QueryTableTimestampFormat("MMMM d, yyyy h:mm:ss a");

  QueryTableTimestampFormat(String value) {
    super(value, allowedValues);
  }

  public static class QueryTableTimestampFormatSerializer
      extends StdSerializer<QueryTableTimestampFormat> {
    public QueryTableTimestampFormatSerializer(Class<QueryTableTimestampFormat> t) {
      super(t);
    }

    public QueryTableTimestampFormatSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        QueryTableTimestampFormat value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static QueryTableTimestampFormat fromValue(String value) {
    return new QueryTableTimestampFormat(value);
  }
}
