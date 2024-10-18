/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** The definition of <code>SyntheticsMobileTestBindingRelation</code> object. */
@JsonSerialize(
    using = SyntheticsMobileTestBindingRelation.SyntheticsMobileTestBindingRelationSerializer.class)
public class SyntheticsMobileTestBindingRelation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("editor", "viewer"));

  public static final SyntheticsMobileTestBindingRelation EDITOR =
      new SyntheticsMobileTestBindingRelation("editor");
  public static final SyntheticsMobileTestBindingRelation VIEWER =
      new SyntheticsMobileTestBindingRelation("viewer");

  SyntheticsMobileTestBindingRelation(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsMobileTestBindingRelationSerializer
      extends StdSerializer<SyntheticsMobileTestBindingRelation> {
    public SyntheticsMobileTestBindingRelationSerializer(
        Class<SyntheticsMobileTestBindingRelation> t) {
      super(t);
    }

    public SyntheticsMobileTestBindingRelationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsMobileTestBindingRelation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsMobileTestBindingRelation fromValue(String value) {
    return new SyntheticsMobileTestBindingRelation(value);
  }
}
