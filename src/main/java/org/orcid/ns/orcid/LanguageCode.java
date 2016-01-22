/**
 * This file is part of huborcid.
 *
 * huborcid is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * huborcid is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with huborcid.  If not, see <http://www.gnu.org/licenses/>.
 */
//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.8-b130911.1802 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2016.01.16 alle 12:48:36 PM CET 
//


package org.orcid.ns.orcid;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per language-code.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <p>
 * <pre>
 * &lt;simpleType name="language-code">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="en"/>
 *     &lt;enumeration value="ab"/>
 *     &lt;enumeration value="aa"/>
 *     &lt;enumeration value="af"/>
 *     &lt;enumeration value="ak"/>
 *     &lt;enumeration value="sq"/>
 *     &lt;enumeration value="am"/>
 *     &lt;enumeration value="ar"/>
 *     &lt;enumeration value="an"/>
 *     &lt;enumeration value="hy"/>
 *     &lt;enumeration value="as"/>
 *     &lt;enumeration value="av"/>
 *     &lt;enumeration value="ae"/>
 *     &lt;enumeration value="ay"/>
 *     &lt;enumeration value="az"/>
 *     &lt;enumeration value="bm"/>
 *     &lt;enumeration value="ba"/>
 *     &lt;enumeration value="eu"/>
 *     &lt;enumeration value="be"/>
 *     &lt;enumeration value="bn"/>
 *     &lt;enumeration value="bh"/>
 *     &lt;enumeration value="bi"/>
 *     &lt;enumeration value="bs"/>
 *     &lt;enumeration value="br"/>
 *     &lt;enumeration value="bg"/>
 *     &lt;enumeration value="my"/>
 *     &lt;enumeration value="ca"/>
 *     &lt;enumeration value="ch"/>
 *     &lt;enumeration value="ce"/>
 *     &lt;enumeration value="zh_CN"/>
 *     &lt;enumeration value="zh_TW"/>
 *     &lt;enumeration value="cu"/>
 *     &lt;enumeration value="cv"/>
 *     &lt;enumeration value="kw"/>
 *     &lt;enumeration value="co"/>
 *     &lt;enumeration value="cr"/>
 *     &lt;enumeration value="hr"/>
 *     &lt;enumeration value="cs"/>
 *     &lt;enumeration value="da"/>
 *     &lt;enumeration value="dv"/>
 *     &lt;enumeration value="nl"/>
 *     &lt;enumeration value="dz"/>
 *     &lt;enumeration value="en"/>
 *     &lt;enumeration value="eo"/>
 *     &lt;enumeration value="et"/>
 *     &lt;enumeration value="ee"/>
 *     &lt;enumeration value="fo"/>
 *     &lt;enumeration value="fj"/>
 *     &lt;enumeration value="fi"/>
 *     &lt;enumeration value="fr"/>
 *     &lt;enumeration value="fy"/>
 *     &lt;enumeration value="ff"/>
 *     &lt;enumeration value="gl"/>
 *     &lt;enumeration value="lg"/>
 *     &lt;enumeration value="ka"/>
 *     &lt;enumeration value="de"/>
 *     &lt;enumeration value="el"/>
 *     &lt;enumeration value="kl"/>
 *     &lt;enumeration value="gn"/>
 *     &lt;enumeration value="gu"/>
 *     &lt;enumeration value="ht"/>
 *     &lt;enumeration value="ha"/>
 *     &lt;enumeration value="iw"/>
 *     &lt;enumeration value="hz"/>
 *     &lt;enumeration value="hi"/>
 *     &lt;enumeration value="ho"/>
 *     &lt;enumeration value="hu"/>
 *     &lt;enumeration value="is"/>
 *     &lt;enumeration value="io"/>
 *     &lt;enumeration value="ig"/>
 *     &lt;enumeration value="in"/>
 *     &lt;enumeration value="ia"/>
 *     &lt;enumeration value="ie"/>
 *     &lt;enumeration value="iu"/>
 *     &lt;enumeration value="ik"/>
 *     &lt;enumeration value="ga"/>
 *     &lt;enumeration value="it"/>
 *     &lt;enumeration value="ja"/>
 *     &lt;enumeration value="jv"/>
 *     &lt;enumeration value="kn"/>
 *     &lt;enumeration value="kr"/>
 *     &lt;enumeration value="ks"/>
 *     &lt;enumeration value="kk"/>
 *     &lt;enumeration value="km"/>
 *     &lt;enumeration value="ki"/>
 *     &lt;enumeration value="rw"/>
 *     &lt;enumeration value="ky"/>
 *     &lt;enumeration value="kv"/>
 *     &lt;enumeration value="kg"/>
 *     &lt;enumeration value="ko"/>
 *     &lt;enumeration value="ku"/>
 *     &lt;enumeration value="kj"/>
 *     &lt;enumeration value="lo"/>
 *     &lt;enumeration value="la"/>
 *     &lt;enumeration value="lv"/>
 *     &lt;enumeration value="li"/>
 *     &lt;enumeration value="ln"/>
 *     &lt;enumeration value="lt"/>
 *     &lt;enumeration value="lu"/>
 *     &lt;enumeration value="lb"/>
 *     &lt;enumeration value="mk"/>
 *     &lt;enumeration value="mg"/>
 *     &lt;enumeration value="ms"/>
 *     &lt;enumeration value="ml"/>
 *     &lt;enumeration value="mt"/>
 *     &lt;enumeration value="gv"/>
 *     &lt;enumeration value="mi"/>
 *     &lt;enumeration value="mr"/>
 *     &lt;enumeration value="mh"/>
 *     &lt;enumeration value="mo"/>
 *     &lt;enumeration value="mn"/>
 *     &lt;enumeration value="na"/>
 *     &lt;enumeration value="nv"/>
 *     &lt;enumeration value="ng"/>
 *     &lt;enumeration value="ne"/>
 *     &lt;enumeration value="nd"/>
 *     &lt;enumeration value="se"/>
 *     &lt;enumeration value="no"/>
 *     &lt;enumeration value="nb"/>
 *     &lt;enumeration value="nn"/>
 *     &lt;enumeration value="ny"/>
 *     &lt;enumeration value="oc"/>
 *     &lt;enumeration value="oj"/>
 *     &lt;enumeration value="or"/>
 *     &lt;enumeration value="om"/>
 *     &lt;enumeration value="os"/>
 *     &lt;enumeration value="pi"/>
 *     &lt;enumeration value="pa"/>
 *     &lt;enumeration value="fa"/>
 *     &lt;enumeration value="pl"/>
 *     &lt;enumeration value="pt"/>
 *     &lt;enumeration value="ps"/>
 *     &lt;enumeration value="qu"/>
 *     &lt;enumeration value="rm"/>
 *     &lt;enumeration value="ro"/>
 *     &lt;enumeration value="rn"/>
 *     &lt;enumeration value="ru"/>
 *     &lt;enumeration value="sm"/>
 *     &lt;enumeration value="sg"/>
 *     &lt;enumeration value="sa"/>
 *     &lt;enumeration value="sc"/>
 *     &lt;enumeration value="gd"/>
 *     &lt;enumeration value="sr"/>
 *     &lt;enumeration value="sn"/>
 *     &lt;enumeration value="ii"/>
 *     &lt;enumeration value="sd"/>
 *     &lt;enumeration value="si"/>
 *     &lt;enumeration value="sk"/>
 *     &lt;enumeration value="sl"/>
 *     &lt;enumeration value="so"/>
 *     &lt;enumeration value="nr"/>
 *     &lt;enumeration value="st"/>
 *     &lt;enumeration value="es"/>
 *     &lt;enumeration value="su"/>
 *     &lt;enumeration value="sw"/>
 *     &lt;enumeration value="ss"/>
 *     &lt;enumeration value="sv"/>
 *     &lt;enumeration value="tl"/>
 *     &lt;enumeration value="ty"/>
 *     &lt;enumeration value="tg"/>
 *     &lt;enumeration value="ta"/>
 *     &lt;enumeration value="tt"/>
 *     &lt;enumeration value="te"/>
 *     &lt;enumeration value="th"/>
 *     &lt;enumeration value="bo"/>
 *     &lt;enumeration value="ti"/>
 *     &lt;enumeration value="to"/>
 *     &lt;enumeration value="ts"/>
 *     &lt;enumeration value="tn"/>
 *     &lt;enumeration value="tr"/>
 *     &lt;enumeration value="tk"/>
 *     &lt;enumeration value="tw"/>
 *     &lt;enumeration value="ug"/>
 *     &lt;enumeration value="uk"/>
 *     &lt;enumeration value="ur"/>
 *     &lt;enumeration value="uz"/>
 *     &lt;enumeration value="ve"/>
 *     &lt;enumeration value="vi"/>
 *     &lt;enumeration value="vo"/>
 *     &lt;enumeration value="wa"/>
 *     &lt;enumeration value="cy"/>
 *     &lt;enumeration value="wo"/>
 *     &lt;enumeration value="xh"/>
 *     &lt;enumeration value="ji"/>
 *     &lt;enumeration value="yo"/>
 *     &lt;enumeration value="za"/>
 *     &lt;enumeration value="zu"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "language-code")
@XmlEnum
public enum LanguageCode {

    @XmlEnumValue("en")
    EN("en"),
    @XmlEnumValue("ab")
    AB("ab"),
    @XmlEnumValue("aa")
    AA("aa"),
    @XmlEnumValue("af")
    AF("af"),
    @XmlEnumValue("ak")
    AK("ak"),
    @XmlEnumValue("sq")
    SQ("sq"),
    @XmlEnumValue("am")
    AM("am"),
    @XmlEnumValue("ar")
    AR("ar"),
    @XmlEnumValue("an")
    AN("an"),
    @XmlEnumValue("hy")
    HY("hy"),
    @XmlEnumValue("as")
    AS("as"),
    @XmlEnumValue("av")
    AV("av"),
    @XmlEnumValue("ae")
    AE("ae"),
    @XmlEnumValue("ay")
    AY("ay"),
    @XmlEnumValue("az")
    AZ("az"),
    @XmlEnumValue("bm")
    BM("bm"),
    @XmlEnumValue("ba")
    BA("ba"),
    @XmlEnumValue("eu")
    EU("eu"),
    @XmlEnumValue("be")
    BE("be"),
    @XmlEnumValue("bn")
    BN("bn"),
    @XmlEnumValue("bh")
    BH("bh"),
    @XmlEnumValue("bi")
    BI("bi"),
    @XmlEnumValue("bs")
    BS("bs"),
    @XmlEnumValue("br")
    BR("br"),
    @XmlEnumValue("bg")
    BG("bg"),
    @XmlEnumValue("my")
    MY("my"),
    @XmlEnumValue("ca")
    CA("ca"),
    @XmlEnumValue("ch")
    CH("ch"),
    @XmlEnumValue("ce")
    CE("ce"),
    @XmlEnumValue("zh_CN")
    ZH_CN("zh_CN"),
    @XmlEnumValue("zh_TW")
    ZH_TW("zh_TW"),
    @XmlEnumValue("cu")
    CU("cu"),
    @XmlEnumValue("cv")
    CV("cv"),
    @XmlEnumValue("kw")
    KW("kw"),
    @XmlEnumValue("co")
    CO("co"),
    @XmlEnumValue("cr")
    CR("cr"),
    @XmlEnumValue("hr")
    HR("hr"),
    @XmlEnumValue("cs")
    CS("cs"),
    @XmlEnumValue("da")
    DA("da"),
    @XmlEnumValue("dv")
    DV("dv"),
    @XmlEnumValue("nl")
    NL("nl"),
    @XmlEnumValue("dz")
    DZ("dz"),
    @XmlEnumValue("eo")
    EO("eo"),
    @XmlEnumValue("et")
    ET("et"),
    @XmlEnumValue("ee")
    EE("ee"),
    @XmlEnumValue("fo")
    FO("fo"),
    @XmlEnumValue("fj")
    FJ("fj"),
    @XmlEnumValue("fi")
    FI("fi"),
    @XmlEnumValue("fr")
    FR("fr"),
    @XmlEnumValue("fy")
    FY("fy"),
    @XmlEnumValue("ff")
    FF("ff"),
    @XmlEnumValue("gl")
    GL("gl"),
    @XmlEnumValue("lg")
    LG("lg"),
    @XmlEnumValue("ka")
    KA("ka"),
    @XmlEnumValue("de")
    DE("de"),
    @XmlEnumValue("el")
    EL("el"),
    @XmlEnumValue("kl")
    KL("kl"),
    @XmlEnumValue("gn")
    GN("gn"),
    @XmlEnumValue("gu")
    GU("gu"),
    @XmlEnumValue("ht")
    HT("ht"),
    @XmlEnumValue("ha")
    HA("ha"),
    @XmlEnumValue("iw")
    IW("iw"),
    @XmlEnumValue("hz")
    HZ("hz"),
    @XmlEnumValue("hi")
    HI("hi"),
    @XmlEnumValue("ho")
    HO("ho"),
    @XmlEnumValue("hu")
    HU("hu"),
    @XmlEnumValue("is")
    IS("is"),
    @XmlEnumValue("io")
    IO("io"),
    @XmlEnumValue("ig")
    IG("ig"),
    @XmlEnumValue("in")
    IN("in"),
    @XmlEnumValue("ia")
    IA("ia"),
    @XmlEnumValue("ie")
    IE("ie"),
    @XmlEnumValue("iu")
    IU("iu"),
    @XmlEnumValue("ik")
    IK("ik"),
    @XmlEnumValue("ga")
    GA("ga"),
    @XmlEnumValue("it")
    IT("it"),
    @XmlEnumValue("ja")
    JA("ja"),
    @XmlEnumValue("jv")
    JV("jv"),
    @XmlEnumValue("kn")
    KN("kn"),
    @XmlEnumValue("kr")
    KR("kr"),
    @XmlEnumValue("ks")
    KS("ks"),
    @XmlEnumValue("kk")
    KK("kk"),
    @XmlEnumValue("km")
    KM("km"),
    @XmlEnumValue("ki")
    KI("ki"),
    @XmlEnumValue("rw")
    RW("rw"),
    @XmlEnumValue("ky")
    KY("ky"),
    @XmlEnumValue("kv")
    KV("kv"),
    @XmlEnumValue("kg")
    KG("kg"),
    @XmlEnumValue("ko")
    KO("ko"),
    @XmlEnumValue("ku")
    KU("ku"),
    @XmlEnumValue("kj")
    KJ("kj"),
    @XmlEnumValue("lo")
    LO("lo"),
    @XmlEnumValue("la")
    LA("la"),
    @XmlEnumValue("lv")
    LV("lv"),
    @XmlEnumValue("li")
    LI("li"),
    @XmlEnumValue("ln")
    LN("ln"),
    @XmlEnumValue("lt")
    LT("lt"),
    @XmlEnumValue("lu")
    LU("lu"),
    @XmlEnumValue("lb")
    LB("lb"),
    @XmlEnumValue("mk")
    MK("mk"),
    @XmlEnumValue("mg")
    MG("mg"),
    @XmlEnumValue("ms")
    MS("ms"),
    @XmlEnumValue("ml")
    ML("ml"),
    @XmlEnumValue("mt")
    MT("mt"),
    @XmlEnumValue("gv")
    GV("gv"),
    @XmlEnumValue("mi")
    MI("mi"),
    @XmlEnumValue("mr")
    MR("mr"),
    @XmlEnumValue("mh")
    MH("mh"),
    @XmlEnumValue("mo")
    MO("mo"),
    @XmlEnumValue("mn")
    MN("mn"),
    @XmlEnumValue("na")
    NA("na"),
    @XmlEnumValue("nv")
    NV("nv"),
    @XmlEnumValue("ng")
    NG("ng"),
    @XmlEnumValue("ne")
    NE("ne"),
    @XmlEnumValue("nd")
    ND("nd"),
    @XmlEnumValue("se")
    SE("se"),
    @XmlEnumValue("no")
    NO("no"),
    @XmlEnumValue("nb")
    NB("nb"),
    @XmlEnumValue("nn")
    NN("nn"),
    @XmlEnumValue("ny")
    NY("ny"),
    @XmlEnumValue("oc")
    OC("oc"),
    @XmlEnumValue("oj")
    OJ("oj"),
    @XmlEnumValue("or")
    OR("or"),
    @XmlEnumValue("om")
    OM("om"),
    @XmlEnumValue("os")
    OS("os"),
    @XmlEnumValue("pi")
    PI("pi"),
    @XmlEnumValue("pa")
    PA("pa"),
    @XmlEnumValue("fa")
    FA("fa"),
    @XmlEnumValue("pl")
    PL("pl"),
    @XmlEnumValue("pt")
    PT("pt"),
    @XmlEnumValue("ps")
    PS("ps"),
    @XmlEnumValue("qu")
    QU("qu"),
    @XmlEnumValue("rm")
    RM("rm"),
    @XmlEnumValue("ro")
    RO("ro"),
    @XmlEnumValue("rn")
    RN("rn"),
    @XmlEnumValue("ru")
    RU("ru"),
    @XmlEnumValue("sm")
    SM("sm"),
    @XmlEnumValue("sg")
    SG("sg"),
    @XmlEnumValue("sa")
    SA("sa"),
    @XmlEnumValue("sc")
    SC("sc"),
    @XmlEnumValue("gd")
    GD("gd"),
    @XmlEnumValue("sr")
    SR("sr"),
    @XmlEnumValue("sn")
    SN("sn"),
    @XmlEnumValue("ii")
    II("ii"),
    @XmlEnumValue("sd")
    SD("sd"),
    @XmlEnumValue("si")
    SI("si"),
    @XmlEnumValue("sk")
    SK("sk"),
    @XmlEnumValue("sl")
    SL("sl"),
    @XmlEnumValue("so")
    SO("so"),
    @XmlEnumValue("nr")
    NR("nr"),
    @XmlEnumValue("st")
    ST("st"),
    @XmlEnumValue("es")
    ES("es"),
    @XmlEnumValue("su")
    SU("su"),
    @XmlEnumValue("sw")
    SW("sw"),
    @XmlEnumValue("ss")
    SS("ss"),
    @XmlEnumValue("sv")
    SV("sv"),
    @XmlEnumValue("tl")
    TL("tl"),
    @XmlEnumValue("ty")
    TY("ty"),
    @XmlEnumValue("tg")
    TG("tg"),
    @XmlEnumValue("ta")
    TA("ta"),
    @XmlEnumValue("tt")
    TT("tt"),
    @XmlEnumValue("te")
    TE("te"),
    @XmlEnumValue("th")
    TH("th"),
    @XmlEnumValue("bo")
    BO("bo"),
    @XmlEnumValue("ti")
    TI("ti"),
    @XmlEnumValue("to")
    TO("to"),
    @XmlEnumValue("ts")
    TS("ts"),
    @XmlEnumValue("tn")
    TN("tn"),
    @XmlEnumValue("tr")
    TR("tr"),
    @XmlEnumValue("tk")
    TK("tk"),
    @XmlEnumValue("tw")
    TW("tw"),
    @XmlEnumValue("ug")
    UG("ug"),
    @XmlEnumValue("uk")
    UK("uk"),
    @XmlEnumValue("ur")
    UR("ur"),
    @XmlEnumValue("uz")
    UZ("uz"),
    @XmlEnumValue("ve")
    VE("ve"),
    @XmlEnumValue("vi")
    VI("vi"),
    @XmlEnumValue("vo")
    VO("vo"),
    @XmlEnumValue("wa")
    WA("wa"),
    @XmlEnumValue("cy")
    CY("cy"),
    @XmlEnumValue("wo")
    WO("wo"),
    @XmlEnumValue("xh")
    XH("xh"),
    @XmlEnumValue("ji")
    JI("ji"),
    @XmlEnumValue("yo")
    YO("yo"),
    @XmlEnumValue("za")
    ZA("za"),
    @XmlEnumValue("zu")
    ZU("zu");
    private final String value;

    LanguageCode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static LanguageCode fromValue(String v) {
        for (LanguageCode c: LanguageCode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
