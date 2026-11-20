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
@JsonSerialize(using = IssueStreamColumnName.IssueStreamColumnNameSerializer.class)
public class IssueStreamColumnName extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "service",
              "count",
              "volume",
              "resources",
              "error_type",
              "error_message",
              "file_path",
              "last_seen",
              "first_seen",
              "language",
              "platform",
              "details",
              "impacted_sessions",
              "impacted_users"));

  public static final IssueStreamColumnName SERVICE = new IssueStreamColumnName("service");
  public static final IssueStreamColumnName COUNT = new IssueStreamColumnName("count");
  public static final IssueStreamColumnName VOLUME = new IssueStreamColumnName("volume");
  public static final IssueStreamColumnName RESOURCES = new IssueStreamColumnName("resources");
  public static final IssueStreamColumnName ERROR_TYPE = new IssueStreamColumnName("error_type");
  public static final IssueStreamColumnName ERROR_MESSAGE =
      new IssueStreamColumnName("error_message");
  public static final IssueStreamColumnName FILE_PATH = new IssueStreamColumnName("file_path");
  public static final IssueStreamColumnName LAST_SEEN = new IssueStreamColumnName("last_seen");
  public static final IssueStreamColumnName FIRST_SEEN = new IssueStreamColumnName("first_seen");
  public static final IssueStreamColumnName LANGUAGE = new IssueStreamColumnName("language");
  public static final IssueStreamColumnName PLATFORM = new IssueStreamColumnName("platform");
  public static final IssueStreamColumnName DETAILS = new IssueStreamColumnName("details");
  public static final IssueStreamColumnName IMPACTED_SESSIONS =
      new IssueStreamColumnName("impacted_sessions");
  public static final IssueStreamColumnName IMPACTED_USERS =
      new IssueStreamColumnName("impacted_users");

  IssueStreamColumnName(String value) {
    super(value, allowedValues);
  }

  public static class IssueStreamColumnNameSerializer extends StdSerializer<IssueStreamColumnName> {
    public IssueStreamColumnNameSerializer(Class<IssueStreamColumnName> t) {
      super(t);
    }

    public IssueStreamColumnNameSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IssueStreamColumnName value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IssueStreamColumnName fromValue(String value) {
    return new IssueStreamColumnName(value);
  }
}
