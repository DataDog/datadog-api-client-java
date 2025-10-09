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
 * The source type for reference table data. Includes all possible source types that can appear in
 * responses.
 */
@JsonSerialize(using = ReferenceTableSourceType.ReferenceTableSourceTypeSerializer.class)
public class ReferenceTableSourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "LOCAL_FILE",
              "S3",
              "GCS",
              "AZURE",
              "SERVICENOW",
              "SALESFORCE",
              "DATABRICKS",
              "SNOWFLAKE"));

  public static final ReferenceTableSourceType LOCAL_FILE =
      new ReferenceTableSourceType("LOCAL_FILE");
  public static final ReferenceTableSourceType S3 = new ReferenceTableSourceType("S3");
  public static final ReferenceTableSourceType GCS = new ReferenceTableSourceType("GCS");
  public static final ReferenceTableSourceType AZURE = new ReferenceTableSourceType("AZURE");
  public static final ReferenceTableSourceType SERVICENOW =
      new ReferenceTableSourceType("SERVICENOW");
  public static final ReferenceTableSourceType SALESFORCE =
      new ReferenceTableSourceType("SALESFORCE");
  public static final ReferenceTableSourceType DATABRICKS =
      new ReferenceTableSourceType("DATABRICKS");
  public static final ReferenceTableSourceType SNOWFLAKE =
      new ReferenceTableSourceType("SNOWFLAKE");

  ReferenceTableSourceType(String value) {
    super(value, allowedValues);
  }

  public static class ReferenceTableSourceTypeSerializer
      extends StdSerializer<ReferenceTableSourceType> {
    public ReferenceTableSourceTypeSerializer(Class<ReferenceTableSourceType> t) {
      super(t);
    }

    public ReferenceTableSourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ReferenceTableSourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ReferenceTableSourceType fromValue(String value) {
    return new ReferenceTableSourceType(value);
  }
}
