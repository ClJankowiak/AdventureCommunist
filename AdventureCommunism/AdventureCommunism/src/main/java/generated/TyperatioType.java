//
// Ce fichier a été généré par l'implémentation de référence JavaTM Architecture for XML Binding (JAXB), v2.2.8-b130911.1802 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apportée à ce fichier sera perdue lors de la recompilation du schéma source. 
// Généré le : 2021.06.08 à 10:07:37 AM CEST 
//


package generated;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour typeratioType.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * <p>
 * <pre>
 * &lt;simpleType name="typeratioType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="vitesse"/>
 *     &lt;enumeration value="gain"/>
 *     &lt;enumeration value="ange"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "typeratioType")
@XmlEnum
public enum TyperatioType {

    @XmlEnumValue("vitesse")
    VITESSE("vitesse"),
    @XmlEnumValue("gain")
    GAIN("gain"),
    @XmlEnumValue("ange")
    ANGE("ange");
    private final String value;

    TyperatioType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TyperatioType fromValue(String v) {
        for (TyperatioType c: TyperatioType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
