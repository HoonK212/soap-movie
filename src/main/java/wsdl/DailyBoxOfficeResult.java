
package wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>dailyBoxOfficeResult complex type에 대한 Java 클래스입니다.
 * 
 * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
 * 
 * <pre>
 * &lt;complexType name="dailyBoxOfficeResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="boxofficeType" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="showRange" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="dailyBoxOfficeList" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.kobis.or.kr/kobisopenapi}dailyBoxOffice" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dailyBoxOfficeResult", propOrder = {
    "boxofficeType",
    "showRange",
    "dailyBoxOfficeList"
})
public class DailyBoxOfficeResult {

    protected String boxofficeType;
    protected String showRange;
    protected DailyBoxOfficeResult.DailyBoxOfficeList dailyBoxOfficeList;

    /**
     * boxofficeType 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoxofficeType() {
        return boxofficeType;
    }

    /**
     * boxofficeType 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoxofficeType(String value) {
        this.boxofficeType = value;
    }

    /**
     * showRange 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShowRange() {
        return showRange;
    }

    /**
     * showRange 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShowRange(String value) {
        this.showRange = value;
    }

    /**
     * dailyBoxOfficeList 속성의 값을 가져옵니다.
     * 
     * @return
     *     possible object is
     *     {@link DailyBoxOfficeResult.DailyBoxOfficeList }
     *     
     */
    public DailyBoxOfficeResult.DailyBoxOfficeList getDailyBoxOfficeList() {
        return dailyBoxOfficeList;
    }

    /**
     * dailyBoxOfficeList 속성의 값을 설정합니다.
     * 
     * @param value
     *     allowed object is
     *     {@link DailyBoxOfficeResult.DailyBoxOfficeList }
     *     
     */
    public void setDailyBoxOfficeList(DailyBoxOfficeResult.DailyBoxOfficeList value) {
        this.dailyBoxOfficeList = value;
    }


    /**
     * <p>anonymous complex type에 대한 Java 클래스입니다.
     * 
     * <p>다음 스키마 단편이 이 클래스에 포함되는 필요한 콘텐츠를 지정합니다.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.kobis.or.kr/kobisopenapi}dailyBoxOffice" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dailyBoxOffice"
    })
    public static class DailyBoxOfficeList {

        @XmlElement(namespace = "http://www.kobis.or.kr/kobisopenapi")
        protected List<DailyBoxOffice> dailyBoxOffice;

        /**
         * Gets the value of the dailyBoxOffice property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dailyBoxOffice property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDailyBoxOffice().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DailyBoxOffice }
         * 
         * 
         */
        public List<DailyBoxOffice> getDailyBoxOffice() {
            if (dailyBoxOffice == null) {
                dailyBoxOffice = new ArrayList<DailyBoxOffice>();
            }
            return this.dailyBoxOffice;
        }

    }

}
