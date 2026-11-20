/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

import com.datadog.api.client.AbstractOpenApiSchema;
import com.datadog.api.client.JSON;
import com.datadog.api.client.UnparsedObject;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import jakarta.ws.rs.core.GenericType;
import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

@jakarta.annotation.Generated(
    value = "https://github.com/DataDog/datadog-api-client-java/blob/master/.generator")
@JsonDeserialize(using = DistributionBackendRequest.DistributionBackendRequestDeserializer.class)
@JsonSerialize(using = DistributionBackendRequest.DistributionBackendRequestSerializer.class)
public class DistributionBackendRequest extends AbstractOpenApiSchema {
  private static final Logger log = Logger.getLogger(DistributionBackendRequest.class.getName());

  @JsonIgnore public boolean unparsed = false;

  public static class DistributionBackendRequestSerializer
      extends StdSerializer<DistributionBackendRequest> {
    public DistributionBackendRequestSerializer(Class<DistributionBackendRequest> t) {
      super(t);
    }

    public DistributionBackendRequestSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DistributionBackendRequest value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.getActualInstance());
    }
  }

  public static class DistributionBackendRequestDeserializer
      extends StdDeserializer<DistributionBackendRequest> {
    public DistributionBackendRequestDeserializer() {
      this(DistributionBackendRequest.class);
    }

    public DistributionBackendRequestDeserializer(Class<?> vc) {
      super(vc);
    }

    @Override
    public DistributionBackendRequest deserialize(JsonParser jp, DeserializationContext ctxt)
        throws IOException, JsonProcessingException {
      JsonNode tree = jp.readValueAsTree();
      Object deserialized = null;
      Object tmp = null;
      boolean typeCoercion = ctxt.isEnabled(MapperFeature.ALLOW_COERCION_OF_SCALARS);
      int match = 0;
      JsonToken token = tree.traverse(jp.getCodec()).nextToken();
      // deserialize DistributionBackendRequest20270101OneOf
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf.class.equals(Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf.class.equals(Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER, "Input data matches schema 'DistributionBackendRequest20270101OneOf'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455761856
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455761856.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455761856.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455761856.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455761856.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455761856.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455761856.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455761856.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455761856.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455761856.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455761856.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455761856.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455761856.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455761856.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455761856) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455761856'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455761856'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455763296
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455763296.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455763296.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455763296.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455763296.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455763296.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455763296.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455763296.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455763296.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455763296.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455763296.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455763296.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455763296.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455763296.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455763296) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455763296'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455763296'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455763936
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455763936.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455763936.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455763936.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455763936.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455763936.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455763936.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455763936.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455763936.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455763936.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455763936.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455763936.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455763936.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455763936.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455763936) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455763936'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455763936'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455764576
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455764576.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455764576.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455764576.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455764576.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455764576.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455764576.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455764576.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455764576.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455764576.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455764576.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455764576.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455764576.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455764576.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455764576) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455764576'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455764576'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455765216
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455765216.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455765216.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455765216.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455765216.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455765216.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455765216.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455765216.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455765216.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455765216.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455765216.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455765216.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455765216.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455765216.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455765216) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455765216'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455765216'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455765856
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455765856.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455765856.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455765856.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455765856.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455765856.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455765856.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455765856.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455765856.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455765856.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455765856.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455765856.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455765856.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455765856.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455765856) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455765856'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455765856'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455766496
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455766496.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455766496.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455766496.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455766496.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455766496.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455766496.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455766496.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455766496.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455766496.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455766496.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455766496.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455766496.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455766496.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455766496) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455766496'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455766496'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455767136
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455767136.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455767136.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455767136.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455767136.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455767136.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455767136.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455767136.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455767136.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455767136.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455767136.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455767136.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455767136.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455767136.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455767136) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455767136'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455767136'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455767776
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455767776.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455767776.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455767776.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455767776.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455767776.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455767776.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455767776.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455767776.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455767776.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455767776.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455767776.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455767776.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455767776.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455767776) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455767776'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455767776'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455768416
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455768416.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455768416.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455768416.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455768416.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455768416.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455768416.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455768416.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455768416.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455768416.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455768416.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455768416.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455768416.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455768416.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455768416) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455768416'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455768416'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455769056
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455769056.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455769056.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455769056.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455769056.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455769056.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455769056.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455769056.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455769056.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455769056.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455769056.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455769056.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455769056.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455769056.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455769056) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455769056'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455769056'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455769696
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455769696.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455769696.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455769696.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455769696.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455769696.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455769696.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455769696.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455769696.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455769696.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455769696.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455769696.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455769696.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455769696.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455769696) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455769696'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455769696'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455770336
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455770336.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455770336.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455770336.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455770336.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455770336.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455770336.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455770336.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455770336.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455770336.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455770336.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455770336.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455770336.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455770336.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455770336) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455770336'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455770336'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455770976
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455770976.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455770976.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455770976.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455770976.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455770976.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455770976.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455770976.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455770976.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455770976.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455770976.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455770976.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455770976.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455770976.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455770976) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455770976'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455770976'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455771616
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455771616.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455771616.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455771616.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455771616.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455771616.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455771616.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455771616.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455771616.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455771616.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455771616.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455771616.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455771616.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455771616.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455771616) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455771616'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455771616'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455772256
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455772256.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455772256.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455772256.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455772256.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455772256.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455772256.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455772256.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455772256.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455772256.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455772256.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455772256.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455772256.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455772256.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455772256) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455772256'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455772256'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455772896
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455772896.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455772896.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455772896.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455772896.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455772896.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455772896.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455772896.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455772896.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455772896.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455772896.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455772896.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455772896.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455772896.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455772896) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455772896'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455772896'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455773536
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455773536.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455773536.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455773536.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455773536.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455773536.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455773536.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455773536.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455773536.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455773536.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455773536.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455773536.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455773536.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455773536.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455773536) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455773536'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455773536'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455774496
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455774496.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455774496.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455774496.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455774496.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455774496.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455774496.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455774496.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455774496.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455774496.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455774496.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455774496.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455774496.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455774496.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455774496) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455774496'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455774496'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455775456
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455775456.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455775456.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455775456.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455775456.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455775456.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455775456.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455775456.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455775456.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455775456.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455775456.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455775456.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455775456.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455775456.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455775456) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455775456'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455775456'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455989472
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455989472.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455989472.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455989472.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455989472.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455989472.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455989472.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455989472.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455989472.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455989472.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455989472.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455989472.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455989472.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455989472.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455989472) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455989472'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455989472'",
            e);
      }

      // deserialize DistributionBackendRequest20270101OneOf4455990432
      try {
        boolean attemptParsing = true;
        // ensure that we respect type coercion as set on the client ObjectMapper
        if (DistributionBackendRequest20270101OneOf4455990432.class.equals(Integer.class)
            || DistributionBackendRequest20270101OneOf4455990432.class.equals(Long.class)
            || DistributionBackendRequest20270101OneOf4455990432.class.equals(Float.class)
            || DistributionBackendRequest20270101OneOf4455990432.class.equals(Double.class)
            || DistributionBackendRequest20270101OneOf4455990432.class.equals(Boolean.class)
            || DistributionBackendRequest20270101OneOf4455990432.class.equals(String.class)) {
          attemptParsing = typeCoercion;
          if (!attemptParsing) {
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455990432.class.equals(Integer.class)
                        || DistributionBackendRequest20270101OneOf4455990432.class.equals(
                            Long.class))
                    && token == JsonToken.VALUE_NUMBER_INT);
            attemptParsing |=
                ((DistributionBackendRequest20270101OneOf4455990432.class.equals(Float.class)
                        || DistributionBackendRequest20270101OneOf4455990432.class.equals(
                            Double.class))
                    && (token == JsonToken.VALUE_NUMBER_FLOAT
                        || token == JsonToken.VALUE_NUMBER_INT));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455990432.class.equals(Boolean.class)
                    && (token == JsonToken.VALUE_FALSE || token == JsonToken.VALUE_TRUE));
            attemptParsing |=
                (DistributionBackendRequest20270101OneOf4455990432.class.equals(String.class)
                    && token == JsonToken.VALUE_STRING);
          }
        }
        if (attemptParsing) {
          tmp =
              tree.traverse(jp.getCodec())
                  .readValueAs(DistributionBackendRequest20270101OneOf4455990432.class);
          // TODO: there is no validation against JSON schema constraints
          // (min, max, enum, pattern...), this does not perform a strict JSON
          // validation, which means the 'match' count may be higher than it should be.
          if (!((DistributionBackendRequest20270101OneOf4455990432) tmp).unparsed) {
            deserialized = tmp;
            match++;
          }
          log.log(
              Level.FINER,
              "Input data matches schema 'DistributionBackendRequest20270101OneOf4455990432'");
        }
      } catch (Exception e) {
        // deserialization failed, continue
        log.log(
            Level.FINER,
            "Input data does not match schema 'DistributionBackendRequest20270101OneOf4455990432'",
            e);
      }

      DistributionBackendRequest ret = new DistributionBackendRequest();
      if (match == 1) {
        ret.setActualInstance(deserialized);
      } else {
        Map<String, Object> res =
            new ObjectMapper()
                .readValue(
                    tree.traverse(jp.getCodec()).readValueAsTree().toString(),
                    new TypeReference<Map<String, Object>>() {});
        ret.setActualInstance(new UnparsedObject(res));
      }
      return ret;
    }

    /** Handle deserialization of the 'null' value. */
    @Override
    public DistributionBackendRequest getNullValue(DeserializationContext ctxt)
        throws JsonMappingException {
      throw new JsonMappingException(ctxt.getParser(), "DistributionBackendRequest cannot be null");
    }
  }

  // store a list of schema names defined in oneOf
  public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

  public DistributionBackendRequest() {
    super("oneOf", Boolean.FALSE);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455761856 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455763296 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455763936 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455764576 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455765216 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455765856 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455766496 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455767136 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455767776 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455768416 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455769056 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455769696 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455770336 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455770976 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455771616 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455772256 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455772896 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455773536 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455774496 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455775456 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455989472 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  public DistributionBackendRequest(DistributionBackendRequest20270101OneOf4455990432 o) {
    super("oneOf", Boolean.FALSE);
    setActualInstance(o);
  }

  static {
    schemas.put(
        "DistributionBackendRequest20270101OneOf",
        new GenericType<DistributionBackendRequest20270101OneOf>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455761856",
        new GenericType<DistributionBackendRequest20270101OneOf4455761856>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455763296",
        new GenericType<DistributionBackendRequest20270101OneOf4455763296>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455763936",
        new GenericType<DistributionBackendRequest20270101OneOf4455763936>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455764576",
        new GenericType<DistributionBackendRequest20270101OneOf4455764576>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455765216",
        new GenericType<DistributionBackendRequest20270101OneOf4455765216>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455765856",
        new GenericType<DistributionBackendRequest20270101OneOf4455765856>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455766496",
        new GenericType<DistributionBackendRequest20270101OneOf4455766496>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455767136",
        new GenericType<DistributionBackendRequest20270101OneOf4455767136>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455767776",
        new GenericType<DistributionBackendRequest20270101OneOf4455767776>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455768416",
        new GenericType<DistributionBackendRequest20270101OneOf4455768416>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455769056",
        new GenericType<DistributionBackendRequest20270101OneOf4455769056>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455769696",
        new GenericType<DistributionBackendRequest20270101OneOf4455769696>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455770336",
        new GenericType<DistributionBackendRequest20270101OneOf4455770336>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455770976",
        new GenericType<DistributionBackendRequest20270101OneOf4455770976>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455771616",
        new GenericType<DistributionBackendRequest20270101OneOf4455771616>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455772256",
        new GenericType<DistributionBackendRequest20270101OneOf4455772256>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455772896",
        new GenericType<DistributionBackendRequest20270101OneOf4455772896>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455773536",
        new GenericType<DistributionBackendRequest20270101OneOf4455773536>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455774496",
        new GenericType<DistributionBackendRequest20270101OneOf4455774496>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455775456",
        new GenericType<DistributionBackendRequest20270101OneOf4455775456>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455989472",
        new GenericType<DistributionBackendRequest20270101OneOf4455989472>() {});
    schemas.put(
        "DistributionBackendRequest20270101OneOf4455990432",
        new GenericType<DistributionBackendRequest20270101OneOf4455990432>() {});
    JSON.registerDescendants(
        DistributionBackendRequest.class, Collections.unmodifiableMap(schemas));
  }

  @Override
  public Map<String, GenericType> getSchemas() {
    return DistributionBackendRequest.schemas;
  }

  /**
   * Set the instance that matches the oneOf child schema, check the instance parameter is valid
   * against the oneOf child schemas: DistributionBackendRequest20270101OneOf,
   * DistributionBackendRequest20270101OneOf4455761856,
   * DistributionBackendRequest20270101OneOf4455763296,
   * DistributionBackendRequest20270101OneOf4455763936,
   * DistributionBackendRequest20270101OneOf4455764576,
   * DistributionBackendRequest20270101OneOf4455765216,
   * DistributionBackendRequest20270101OneOf4455765856,
   * DistributionBackendRequest20270101OneOf4455766496,
   * DistributionBackendRequest20270101OneOf4455767136,
   * DistributionBackendRequest20270101OneOf4455767776,
   * DistributionBackendRequest20270101OneOf4455768416,
   * DistributionBackendRequest20270101OneOf4455769056,
   * DistributionBackendRequest20270101OneOf4455769696,
   * DistributionBackendRequest20270101OneOf4455770336,
   * DistributionBackendRequest20270101OneOf4455770976,
   * DistributionBackendRequest20270101OneOf4455771616,
   * DistributionBackendRequest20270101OneOf4455772256,
   * DistributionBackendRequest20270101OneOf4455772896,
   * DistributionBackendRequest20270101OneOf4455773536,
   * DistributionBackendRequest20270101OneOf4455774496,
   * DistributionBackendRequest20270101OneOf4455775456,
   * DistributionBackendRequest20270101OneOf4455989472,
   * DistributionBackendRequest20270101OneOf4455990432
   *
   * <p>It could be an instance of the 'oneOf' schemas. The oneOf child schemas may themselves be a
   * composed schema (allOf, anyOf, oneOf).
   */
  @Override
  public void setActualInstance(Object instance) {
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455761856.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455763296.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455763936.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455764576.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455765216.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455765856.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455766496.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455767136.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455767776.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455768416.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455769056.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455769696.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455770336.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455770976.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455771616.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455772256.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455772896.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455773536.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455774496.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455775456.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455989472.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    if (JSON.isInstanceOf(
        DistributionBackendRequest20270101OneOf4455990432.class,
        instance,
        new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }

    if (JSON.isInstanceOf(UnparsedObject.class, instance, new HashSet<Class<?>>())) {
      super.setActualInstance(instance);
      return;
    }
    throw new RuntimeException(
        "Invalid instance type. Must be DistributionBackendRequest20270101OneOf,"
            + " DistributionBackendRequest20270101OneOf4455761856,"
            + " DistributionBackendRequest20270101OneOf4455763296,"
            + " DistributionBackendRequest20270101OneOf4455763936,"
            + " DistributionBackendRequest20270101OneOf4455764576,"
            + " DistributionBackendRequest20270101OneOf4455765216,"
            + " DistributionBackendRequest20270101OneOf4455765856,"
            + " DistributionBackendRequest20270101OneOf4455766496,"
            + " DistributionBackendRequest20270101OneOf4455767136,"
            + " DistributionBackendRequest20270101OneOf4455767776,"
            + " DistributionBackendRequest20270101OneOf4455768416,"
            + " DistributionBackendRequest20270101OneOf4455769056,"
            + " DistributionBackendRequest20270101OneOf4455769696,"
            + " DistributionBackendRequest20270101OneOf4455770336,"
            + " DistributionBackendRequest20270101OneOf4455770976,"
            + " DistributionBackendRequest20270101OneOf4455771616,"
            + " DistributionBackendRequest20270101OneOf4455772256,"
            + " DistributionBackendRequest20270101OneOf4455772896,"
            + " DistributionBackendRequest20270101OneOf4455773536,"
            + " DistributionBackendRequest20270101OneOf4455774496,"
            + " DistributionBackendRequest20270101OneOf4455775456,"
            + " DistributionBackendRequest20270101OneOf4455989472,"
            + " DistributionBackendRequest20270101OneOf4455990432");
  }

  /**
   * Get the actual instance, which can be the following: DistributionBackendRequest20270101OneOf,
   * DistributionBackendRequest20270101OneOf4455761856,
   * DistributionBackendRequest20270101OneOf4455763296,
   * DistributionBackendRequest20270101OneOf4455763936,
   * DistributionBackendRequest20270101OneOf4455764576,
   * DistributionBackendRequest20270101OneOf4455765216,
   * DistributionBackendRequest20270101OneOf4455765856,
   * DistributionBackendRequest20270101OneOf4455766496,
   * DistributionBackendRequest20270101OneOf4455767136,
   * DistributionBackendRequest20270101OneOf4455767776,
   * DistributionBackendRequest20270101OneOf4455768416,
   * DistributionBackendRequest20270101OneOf4455769056,
   * DistributionBackendRequest20270101OneOf4455769696,
   * DistributionBackendRequest20270101OneOf4455770336,
   * DistributionBackendRequest20270101OneOf4455770976,
   * DistributionBackendRequest20270101OneOf4455771616,
   * DistributionBackendRequest20270101OneOf4455772256,
   * DistributionBackendRequest20270101OneOf4455772896,
   * DistributionBackendRequest20270101OneOf4455773536,
   * DistributionBackendRequest20270101OneOf4455774496,
   * DistributionBackendRequest20270101OneOf4455775456,
   * DistributionBackendRequest20270101OneOf4455989472,
   * DistributionBackendRequest20270101OneOf4455990432
   *
   * @return The actual instance (DistributionBackendRequest20270101OneOf,
   *     DistributionBackendRequest20270101OneOf4455761856,
   *     DistributionBackendRequest20270101OneOf4455763296,
   *     DistributionBackendRequest20270101OneOf4455763936,
   *     DistributionBackendRequest20270101OneOf4455764576,
   *     DistributionBackendRequest20270101OneOf4455765216,
   *     DistributionBackendRequest20270101OneOf4455765856,
   *     DistributionBackendRequest20270101OneOf4455766496,
   *     DistributionBackendRequest20270101OneOf4455767136,
   *     DistributionBackendRequest20270101OneOf4455767776,
   *     DistributionBackendRequest20270101OneOf4455768416,
   *     DistributionBackendRequest20270101OneOf4455769056,
   *     DistributionBackendRequest20270101OneOf4455769696,
   *     DistributionBackendRequest20270101OneOf4455770336,
   *     DistributionBackendRequest20270101OneOf4455770976,
   *     DistributionBackendRequest20270101OneOf4455771616,
   *     DistributionBackendRequest20270101OneOf4455772256,
   *     DistributionBackendRequest20270101OneOf4455772896,
   *     DistributionBackendRequest20270101OneOf4455773536,
   *     DistributionBackendRequest20270101OneOf4455774496,
   *     DistributionBackendRequest20270101OneOf4455775456,
   *     DistributionBackendRequest20270101OneOf4455989472,
   *     DistributionBackendRequest20270101OneOf4455990432)
   */
  @Override
  public Object getActualInstance() {
    return super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf`. If the actual instance is
   * not `DistributionBackendRequest20270101OneOf`, the ClassCastException will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf`
   * @throws ClassCastException if the instance is not `DistributionBackendRequest20270101OneOf`
   */
  public DistributionBackendRequest20270101OneOf getDistributionBackendRequest20270101OneOf()
      throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455761856`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455761856`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455761856`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455761856`
   */
  public DistributionBackendRequest20270101OneOf4455761856
      getDistributionBackendRequest20270101OneOf4455761856() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455761856) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455763296`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455763296`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455763296`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455763296`
   */
  public DistributionBackendRequest20270101OneOf4455763296
      getDistributionBackendRequest20270101OneOf4455763296() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455763296) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455763936`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455763936`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455763936`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455763936`
   */
  public DistributionBackendRequest20270101OneOf4455763936
      getDistributionBackendRequest20270101OneOf4455763936() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455763936) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455764576`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455764576`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455764576`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455764576`
   */
  public DistributionBackendRequest20270101OneOf4455764576
      getDistributionBackendRequest20270101OneOf4455764576() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455764576) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455765216`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455765216`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455765216`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455765216`
   */
  public DistributionBackendRequest20270101OneOf4455765216
      getDistributionBackendRequest20270101OneOf4455765216() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455765216) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455765856`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455765856`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455765856`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455765856`
   */
  public DistributionBackendRequest20270101OneOf4455765856
      getDistributionBackendRequest20270101OneOf4455765856() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455765856) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455766496`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455766496`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455766496`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455766496`
   */
  public DistributionBackendRequest20270101OneOf4455766496
      getDistributionBackendRequest20270101OneOf4455766496() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455766496) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455767136`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455767136`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455767136`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455767136`
   */
  public DistributionBackendRequest20270101OneOf4455767136
      getDistributionBackendRequest20270101OneOf4455767136() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455767136) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455767776`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455767776`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455767776`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455767776`
   */
  public DistributionBackendRequest20270101OneOf4455767776
      getDistributionBackendRequest20270101OneOf4455767776() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455767776) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455768416`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455768416`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455768416`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455768416`
   */
  public DistributionBackendRequest20270101OneOf4455768416
      getDistributionBackendRequest20270101OneOf4455768416() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455768416) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455769056`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455769056`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455769056`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455769056`
   */
  public DistributionBackendRequest20270101OneOf4455769056
      getDistributionBackendRequest20270101OneOf4455769056() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455769056) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455769696`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455769696`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455769696`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455769696`
   */
  public DistributionBackendRequest20270101OneOf4455769696
      getDistributionBackendRequest20270101OneOf4455769696() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455769696) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455770336`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455770336`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455770336`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455770336`
   */
  public DistributionBackendRequest20270101OneOf4455770336
      getDistributionBackendRequest20270101OneOf4455770336() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455770336) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455770976`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455770976`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455770976`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455770976`
   */
  public DistributionBackendRequest20270101OneOf4455770976
      getDistributionBackendRequest20270101OneOf4455770976() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455770976) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455771616`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455771616`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455771616`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455771616`
   */
  public DistributionBackendRequest20270101OneOf4455771616
      getDistributionBackendRequest20270101OneOf4455771616() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455771616) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455772256`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455772256`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455772256`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455772256`
   */
  public DistributionBackendRequest20270101OneOf4455772256
      getDistributionBackendRequest20270101OneOf4455772256() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455772256) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455772896`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455772896`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455772896`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455772896`
   */
  public DistributionBackendRequest20270101OneOf4455772896
      getDistributionBackendRequest20270101OneOf4455772896() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455772896) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455773536`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455773536`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455773536`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455773536`
   */
  public DistributionBackendRequest20270101OneOf4455773536
      getDistributionBackendRequest20270101OneOf4455773536() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455773536) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455774496`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455774496`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455774496`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455774496`
   */
  public DistributionBackendRequest20270101OneOf4455774496
      getDistributionBackendRequest20270101OneOf4455774496() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455774496) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455775456`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455775456`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455775456`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455775456`
   */
  public DistributionBackendRequest20270101OneOf4455775456
      getDistributionBackendRequest20270101OneOf4455775456() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455775456) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455989472`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455989472`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455989472`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455989472`
   */
  public DistributionBackendRequest20270101OneOf4455989472
      getDistributionBackendRequest20270101OneOf4455989472() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455989472) super.getActualInstance();
  }

  /**
   * Get the actual instance of `DistributionBackendRequest20270101OneOf4455990432`. If the actual
   * instance is not `DistributionBackendRequest20270101OneOf4455990432`, the ClassCastException
   * will be thrown.
   *
   * @return The actual instance of `DistributionBackendRequest20270101OneOf4455990432`
   * @throws ClassCastException if the instance is not
   *     `DistributionBackendRequest20270101OneOf4455990432`
   */
  public DistributionBackendRequest20270101OneOf4455990432
      getDistributionBackendRequest20270101OneOf4455990432() throws ClassCastException {
    return (DistributionBackendRequest20270101OneOf4455990432) super.getActualInstance();
  }
}
