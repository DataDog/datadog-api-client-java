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

/** Test run level. */
@JsonSerialize(using = CIAppTestLevel.CIAppTestLevelSerializer.class)
public class CIAppTestLevel extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("session", "module", "suite", "test"));

  public static final CIAppTestLevel SESSION = new CIAppTestLevel("session");
  public static final CIAppTestLevel MODULE = new CIAppTestLevel("module");
  public static final CIAppTestLevel SUITE = new CIAppTestLevel("suite");
  public static final CIAppTestLevel TEST = new CIAppTestLevel("test");

  CIAppTestLevel(String value) {
    super(value, allowedValues);
  }

  public static class CIAppTestLevelSerializer extends StdSerializer<CIAppTestLevel> {
    public CIAppTestLevelSerializer(Class<CIAppTestLevel> t) {
      super(t);
    }

    public CIAppTestLevelSerializer() {
      this(null);
    }

    @Override
    public void serialize(CIAppTestLevel value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CIAppTestLevel fromValue(String value) {
    return new CIAppTestLevel(value);
  }
}
