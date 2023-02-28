/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Datadog product onto which Sensitive Data Scanner can be activated. */
@JsonSerialize(using = SensitiveDataScannerProduct.SensitiveDataScannerProductSerializer.class)
public class SensitiveDataScannerProduct {

  public static final SensitiveDataScannerProduct LOGS = new SensitiveDataScannerProduct("logs");
  public static final SensitiveDataScannerProduct RUM = new SensitiveDataScannerProduct("rum");
  public static final SensitiveDataScannerProduct EVENTS =
      new SensitiveDataScannerProduct("events");
  public static final SensitiveDataScannerProduct APM = new SensitiveDataScannerProduct("apm");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("logs", "rum", "events", "apm"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  SensitiveDataScannerProduct(String value) {
    this.value = value;
  }

  public static class SensitiveDataScannerProductSerializer
      extends StdSerializer<SensitiveDataScannerProduct> {
    public SensitiveDataScannerProductSerializer(Class<SensitiveDataScannerProduct> t) {
      super(t);
    }

    public SensitiveDataScannerProductSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SensitiveDataScannerProduct value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this SensitiveDataScannerProduct object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((SensitiveDataScannerProduct) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static SensitiveDataScannerProduct fromValue(String value) {
    return new SensitiveDataScannerProduct(value);
  }
}
