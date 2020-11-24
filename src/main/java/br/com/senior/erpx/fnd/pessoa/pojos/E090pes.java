/*
 * Pessoa
 * Serviço de Gestão de Pessoas do ERPX
 *
 *
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
import br.com.senior.erpx.fnd.pessoa.pojos.E001pes;
import br.com.senior.erpx.fnd.pessoa.pojos.E021mot;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumFpgCom;
import br.com.senior.erpx.fnd.pessoa.pojos.EnumSitReg;
import java.io.IOException;
import java.util.UUID;
import org.threeten.bp.OffsetDateTime;

/**
 * E090pes
 */




public class E090pes {
  @SerializedName("usualt")
  private String usualt = null;

  @SerializedName("excluido")
  private Boolean excluido = null;

  @SerializedName("dthger")
  private OffsetDateTime dthger = null;

  @SerializedName("e001pes")
  private E001pes e001pes = null;

  @SerializedName("dthalt")
  private OffsetDateTime dthalt = null;

  @SerializedName("usuMot")
  private String usuMot = null;

  @SerializedName("gerTit")
  private EnumFpgCom gerTit = null;

  @SerializedName("sitReg")
  private EnumSitReg sitReg = null;

  @SerializedName("dthMot")
  private OffsetDateTime dthMot = null;

  @SerializedName("usuger")
  private String usuger = null;

  @SerializedName("obsMot")
  private String obsMot = null;

  @SerializedName("id")
  private UUID id = null;

  @SerializedName("e021mot")
  private E021mot e021mot = null;

  public E090pes usualt(String usualt) {
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

  public E090pes excluido(Boolean excluido) {
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

  public E090pes dthger(OffsetDateTime dthger) {
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

  public E090pes e001pes(E001pes e001pes) {
    this.e001pes = e001pes;
    return this;
  }

   /**
   * Get e001pes
   * @return e001pes
  **/
  @ApiModelProperty(value = "")
  public E001pes getE001pes() {
    return e001pes;
  }

  public void setE001pes(E001pes e001pes) {
    this.e001pes = e001pes;
  }

  public E090pes dthalt(OffsetDateTime dthalt) {
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

  public E090pes usuMot(String usuMot) {
    this.usuMot = usuMot;
    return this;
  }

   /**
   * Usuário da alteração do motivo
   * @return usuMot
  **/
  @ApiModelProperty(value = "Usuário da alteração do motivo")
  public String getUsuMot() {
    return usuMot;
  }

  public void setUsuMot(String usuMot) {
    this.usuMot = usuMot;
  }

  public E090pes gerTit(EnumFpgCom gerTit) {
    this.gerTit = gerTit;
    return this;
  }

   /**
   * Get gerTit
   * @return gerTit
  **/
  @ApiModelProperty(value = "")
  public EnumFpgCom getGerTit() {
    return gerTit;
  }

  public void setGerTit(EnumFpgCom gerTit) {
    this.gerTit = gerTit;
  }

  public E090pes sitReg(EnumSitReg sitReg) {
    this.sitReg = sitReg;
    return this;
  }

   /**
   * Get sitReg
   * @return sitReg
  **/
  @ApiModelProperty(value = "")
  public EnumSitReg getSitReg() {
    return sitReg;
  }

  public void setSitReg(EnumSitReg sitReg) {
    this.sitReg = sitReg;
  }

  public E090pes dthMot(OffsetDateTime dthMot) {
    this.dthMot = dthMot;
    return this;
  }

   /**
   * Data da alteração do motivo
   * @return dthMot
  **/
  @ApiModelProperty(value = "Data da alteração do motivo")
  public OffsetDateTime getDthMot() {
    return dthMot;
  }

  public void setDthMot(OffsetDateTime dthMot) {
    this.dthMot = dthMot;
  }

  public E090pes usuger(String usuger) {
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

  public E090pes obsMot(String obsMot) {
    this.obsMot = obsMot;
    return this;
  }

   /**
   * Observação do motivo
   * @return obsMot
  **/
  @ApiModelProperty(value = "Observação do motivo")
  public String getObsMot() {
    return obsMot;
  }

  public void setObsMot(String obsMot) {
    this.obsMot = obsMot;
  }

  public E090pes id(UUID id) {
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

  public E090pes e021mot(E021mot e021mot) {
    this.e021mot = e021mot;
    return this;
  }

   /**
   * Get e021mot
   * @return e021mot
  **/
  @ApiModelProperty(value = "")
  public E021mot getE021mot() {
    return e021mot;
  }

  public void setE021mot(E021mot e021mot) {
    this.e021mot = e021mot;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    E090pes e090pes = (E090pes) o;
    return Objects.equals(this.usualt, e090pes.usualt) &&
        Objects.equals(this.excluido, e090pes.excluido) &&
        Objects.equals(this.dthger, e090pes.dthger) &&
        Objects.equals(this.e001pes, e090pes.e001pes) &&
        Objects.equals(this.dthalt, e090pes.dthalt) &&
        Objects.equals(this.usuMot, e090pes.usuMot) &&
        Objects.equals(this.gerTit, e090pes.gerTit) &&
        Objects.equals(this.sitReg, e090pes.sitReg) &&
        Objects.equals(this.dthMot, e090pes.dthMot) &&
        Objects.equals(this.usuger, e090pes.usuger) &&
        Objects.equals(this.obsMot, e090pes.obsMot) &&
        Objects.equals(this.id, e090pes.id) &&
        Objects.equals(this.e021mot, e090pes.e021mot);
  }

  @Override
  public int hashCode() {
    return Objects.hash(usualt, excluido, dthger, e001pes, dthalt, usuMot, gerTit, sitReg, dthMot, usuger, obsMot, id, e021mot);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class E090pes {\n");
    
    sb.append("    usualt: ").append(toIndentedString(usualt)).append("\n");
    sb.append("    excluido: ").append(toIndentedString(excluido)).append("\n");
    sb.append("    dthger: ").append(toIndentedString(dthger)).append("\n");
    sb.append("    e001pes: ").append(toIndentedString(e001pes)).append("\n");
    sb.append("    dthalt: ").append(toIndentedString(dthalt)).append("\n");
    sb.append("    usuMot: ").append(toIndentedString(usuMot)).append("\n");
    sb.append("    gerTit: ").append(toIndentedString(gerTit)).append("\n");
    sb.append("    sitReg: ").append(toIndentedString(sitReg)).append("\n");
    sb.append("    dthMot: ").append(toIndentedString(dthMot)).append("\n");
    sb.append("    usuger: ").append(toIndentedString(usuger)).append("\n");
    sb.append("    obsMot: ").append(toIndentedString(obsMot)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    e021mot: ").append(toIndentedString(e021mot)).append("\n");
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

