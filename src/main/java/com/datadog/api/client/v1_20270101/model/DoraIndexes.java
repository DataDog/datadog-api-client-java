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
@JsonSerialize(using = DoraIndexes.DoraIndexesSerializer.class)
public class DoraIndexes extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("commit", "failure", "deployment", "pull_request"));

  public static final DoraIndexes COMMIT = new DoraIndexes("commit");
  public static final DoraIndexes FAILURE = new DoraIndexes("failure");
  public static final DoraIndexes DEPLOYMENT = new DoraIndexes("deployment");
  public static final DoraIndexes PULL_REQUEST = new DoraIndexes("pull_request");

  DoraIndexes(String value) {
    super(value, allowedValues);
  }

  public static class DoraIndexesSerializer extends StdSerializer<DoraIndexes> {
    public DoraIndexesSerializer(Class<DoraIndexes> t) {
      super(t);
    }

    public DoraIndexesSerializer() {
      this(null);
    }

    @Override
    public void serialize(DoraIndexes value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DoraIndexes fromValue(String value) {
    return new DoraIndexes(value);
  }
}
