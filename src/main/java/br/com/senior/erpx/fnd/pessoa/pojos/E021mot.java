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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumAplMot;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * E021mot
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-10-19T21:06:00.977Z")



public class E021mot {
  @SerializedName("codMot")
  private Integer codMot = null;

  @SerializedName("usualt")
  private String usualt = null;

  @SerializedName("excluido")
  private Boolean excluido = null;

  @SerializedName("dthger")
  private OffsetDateTime dthger = null;

  @SerializedName("aplMot")
  private EnumAplMot aplMot = null;

  @SerializedName("desMot")
  private String desMot = null;

  @SerializedName("dthalt")
  private OffsetDateTime dthalt = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("usuger")
  private String usuger = null;

  public E021mot codMot(Integer codMot) {
    this.codMot = codMot;
    return this;
  }

   /**
   * Motivo
   * @return codMot
  **/
  @ApiModelProperty(value = "Motivo")
  public Integer getCodMot() {
    return codMot;
  }

  public void setCodMot(Integer codMot) {
    this.codMot = codMot;
  }

  public E021mot usualt(String usualt) {
    this.usualt = usualt;
    return this;
  }

   /**
   * 
   * @return usualt
  **/
  @ApiModelProperty(value = "")
  public String getUsualt() {
    return usualt;
  }

  public void setUsualt(String usualt) {
    this.usualt = usualt;
  }

  public E021mot excluido(Boolean excluido) {
    this.excluido = excluido;
    return this;
  }

   /**
   * Indica se o registro foi excluído
   * @return excluido
  **/
  @ApiModelProperty(value = "Indica se o registro foi excluído")
  public Boolean isExcluido() {
    return excluido;
  }

  public void setExcluido(Boolean excluido) {
    this.excluido = excluido;
  }

  public E021mot dthger(OffsetDateTime dthger) {
    this.dthger = dthger;
    return this;
  }

   /**
   * 
   * @return dthger
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDthger() {
    return dthger;
  }

  public void setDthger(OffsetDateTime dthger) {
    this.dthger = dthger;
  }

  public E021mot aplMot(EnumAplMot aplMot) {
    this.aplMot = aplMot;
    return this;
  }

   /**
   * Get aplMot
   * @return aplMot
  **/
  @ApiModelProperty(value = "")
  public EnumAplMot getAplMot() {
    return aplMot;
  }

  public void setAplMot(EnumAplMot aplMot) {
    this.aplMot = aplMot;
  }

  public E021mot desMot(String desMot) {
    this.desMot = desMot;
    return this;
  }

   /**
   * Descrição
   * @return desMot
  **/
  @ApiModelProperty(value = "Descrição")
  public String getDesMot() {
    return desMot;
  }

  public void setDesMot(String desMot) {
    this.desMot = desMot;
  }

  public E021mot dthalt(OffsetDateTime dthalt) {
    this.dthalt = dthalt;
    return this;
  }

   /**
   * 
   * @return dthalt
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getDthalt() {
    return dthalt;
  }

  public void setDthalt(OffsetDateTime dthalt) {
    this.dthalt = dthalt;
  }

  public E021mot id(UUID id) {
    this.id = id;
    return this;
  }

   /**
   * 
   * @return id
  **/
  @ApiModelProperty(value = "")
  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public E021mot usuger(String usuger) {
    this.usuger = usuger;
    return this;
  }

   /**
   * 
   * @return usuger
  **/
  @ApiModelProperty(value = "")
  public String getUsuger() {
    return usuger;
  }

  public void setUsuger(String usuger) {
    this.usuger = usuger;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    E021mot e021mot = (E021mot) o;
    return Objects.equals(this.codMot, e021mot.codMot) &&
        Objects.equals(this.usualt, e021mot.usualt) &&
        Objects.equals(this.excluido, e021mot.excluido) &&
        Objects.equals(this.dthger, e021mot.dthger) &&
        Objects.equals(this.aplMot, e021mot.aplMot) &&
        Objects.equals(this.desMot, e021mot.desMot) &&
        Objects.equals(this.dthalt, e021mot.dthalt) &&
        Objects.equals(this.id, e021mot.id) &&
        Objects.equals(this.usuger, e021mot.usuger);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codMot, usualt, excluido, dthger, aplMot, desMot, dthalt, id, usuger);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class E021mot {\n");
    
    sb.append("    codMot: ").append(toIndentedString(codMot)).append("\n");
    sb.append("    usualt: ").append(toIndentedString(usualt)).append("\n");
    sb.append("    excluido: ").append(toIndentedString(excluido)).append("\n");
    sb.append("    dthger: ").append(toIndentedString(dthger)).append("\n");
    sb.append("    aplMot: ").append(toIndentedString(aplMot)).append("\n");
    sb.append("    desMot: ").append(toIndentedString(desMot)).append("\n");
    sb.append("    dthalt: ").append(toIndentedString(dthalt)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    usuger: ").append(toIndentedString(usuger)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

