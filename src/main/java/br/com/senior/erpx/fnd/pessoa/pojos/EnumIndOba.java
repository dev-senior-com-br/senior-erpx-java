/*
 * Pessoa
 * Serviço de Gestão de Pessoas do ERPX
 *
 * OpenAPI spec version: 1.12.1
 * Contact: seniorx-dev@senior.com.br
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package br.com.senior.erpx.fnd.pessoa.pojos;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets enumIndOba
 */
@JsonAdapter(EnumIndOba.Adapter.class)
public enum EnumIndOba {
  
  V0("V0"),
  
  V1("V1"),
  
  V2("V2");

  private String value;

  EnumIndOba(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EnumIndOba fromValue(String text) {
    for (EnumIndOba b : EnumIndOba.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EnumIndOba> {
    @Override
    public void write(final JsonWriter jsonWriter, final EnumIndOba enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EnumIndOba read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EnumIndOba.fromValue(String.valueOf(value));
    }
  }
}

