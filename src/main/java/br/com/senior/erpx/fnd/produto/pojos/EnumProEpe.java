/*
 * Produto
 * Serviço de Produto do ERPX
 *
 * OpenAPI spec version: 1.10.0
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.erpx.fnd.produto.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets enumProEpe
 */
@JsonAdapter(EnumProEpe.Adapter.class)
public enum EnumProEpe {
  
  V0("V0"),
  
  V1("V1"),
  
  V2("V2"),
  
  V3("V3"),
  
  V4("V4"),
  
  V5("V5"),
  
  V9("V9");

  private String value;

  EnumProEpe(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumProEpe fromValue(String text) {
    for (EnumProEpe b : EnumProEpe.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EnumProEpe> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumProEpe enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumProEpe read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumProEpe.fromValue(String.valueOf(value));
    }
  }
}

